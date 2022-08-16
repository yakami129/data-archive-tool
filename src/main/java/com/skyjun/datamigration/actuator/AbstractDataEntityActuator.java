package com.skyjun.datamigration.actuator;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.google.common.collect.Lists;
import com.skyjun.datamigration.config.DatamigrationProperties;
import com.skyjun.datamigration.utils.LambdaUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by alan on 2022/8/15.
 */
@Slf4j
public abstract class AbstractDataEntityActuator<E, T> implements DataEntityActuator<E, T> {

    @Autowired
    private DatamigrationProperties datamigrationProperties;

    @Override
    public void execute() {

        log.info("[BIZ]【{}】表开始同步 >>>>>>>>>>>>>>>", getTableName());

        Integer pageSize = datamigrationProperties.getPagesize();
        Page<E> sourcePage = getSourcePage(pageSize, 1);
        Long pages = sourcePage.getPages();
        AtomicLong currentPage = new AtomicLong(sourcePage.getPages());
        Integer sourceTotal = NumberUtils.toInt(sourcePage.getTotal() + "");

        List<CompletableFuture> completableFutures = Lists.newArrayList();
        for (long i = 1; i <= pages; i++) {

            sourcePage = getSourcePage(pageSize, i);
            List<E> records = sourcePage.getRecords();
            if (CollectionUtils.isNotEmpty(records)) {

                CompletableFuture<Void> voidCompletableFuture = CompletableFuture.runAsync(() -> {
                    List<T> targetList = LambdaUtil.list2list(records, a -> convert(a, getTargetClass()));
                    insertBatchTarget(targetList);
                    log.info("[BIZ] currentThread:{} 数据表:[{}]成功插入{}条数据，剩余页数：{}", Thread.currentThread().getName(), getTableName(), records.size(), currentPage.decrementAndGet());
                });
                completableFutures.add(voidCompletableFuture);
            }
        }

        completableFutures.forEach(a -> {
            try {
                a.get();
            } catch (Exception e) {
                log.error(e.getMessage(), e);
                errorHandler(e);
            }
        });

        // 对比source与target数量是否一致
        Integer targetCount = getTargetCount();
        if (sourceTotal.equals(targetCount)) {
            log.info("[BIZ] 检查校验【{}】，source [{}] 与 target [{}] 的数据数量一致 >>>>>>>>>>>>>>>", getTableName(), sourceTotal, targetCount);
        } else {
            log.error("[BIZ] 检查校验【{}】，source [{}] 与 target [{}] 的数据数量不一致 >>>>>>>>>>>>>>>", getTableName(), sourceTotal, targetCount);
        }

        log.info("[BIZ]【{}】表完成同步 >>>>>>>>>>>>>>>", getTableName());
    }

    private Integer getTargetCount() {
        Integer targetCount;
        try {
            DynamicDataSourceContextHolder.push("target");
            targetCount = getTargetMapper().selectCount(getTargetQueryWrapper());
        } finally {
            DynamicDataSourceContextHolder.clear();
        }
        return targetCount;
    }

    private void insertBatchTarget(List<T> targetList) {
        try {
            DynamicDataSourceContextHolder.push("target");
            insertBatch(targetList);
        } finally {
            DynamicDataSourceContextHolder.clear();
        }
    }

    private Page<E> getSourcePage(Integer pageSize, long i) {
        Page<E> sourcePage;
        try {
            DynamicDataSourceContextHolder.push("source");
            sourcePage = getePage(i, pageSize);
        } finally {
            DynamicDataSourceContextHolder.clear();
        }
        return sourcePage;
    }

    protected void errorHandler(Exception e) {

    }

    private void insertBatch(List<T> targetList) {
        getTargetMapper().insertBatchSomeColumn(targetList);
    }

    protected Page<E> getePage(Long page, Integer pageSize) {
        Page<E> sourcePage = getSourceService().page(new Page<>(page, pageSize), getSourceQueryWrapper());
        return sourcePage;
    }

    protected Wrapper<E> getSourceQueryWrapper() {
        return Wrappers.emptyWrapper();
    }

    protected Wrapper<T> getTargetQueryWrapper() {
        return Wrappers.emptyWrapper();
    }

    protected T convert(E e, Class<T> clazz) {
        return BeanUtil.toBean(e, clazz);
    }

    protected abstract String getTableName();

    protected abstract Class<T> getTargetClass();
}
