package com.skyjun.datamigration.actuator;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.skyjun.datamigration.config.DatamigrationProperties;
import com.skyjun.datamigration.utils.LambdaUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.concurrent.CompletableFuture;

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

        Long pages = 1L;
        Integer pageSize = datamigrationProperties.getPagesize();

        for (long i = 1; i <= pages; i++) {

            Page<E> sourcePage = getePage(i, pageSize);
            pages = sourcePage.getPages();

            List<E> records = sourcePage.getRecords();
            log.info("[BIZ] currentThread:{} 数据表:[{}]共{}条数据", Thread.currentThread().getName(), getTableName(), sourcePage.getTotal());
            if (CollectionUtils.isNotEmpty(records)) {
                CompletableFuture.runAsync(() -> {
                    List<T> targetList = LambdaUtil.list2list(records, a -> convert(a, getTargetClass()));
                    getTargetMapper().insertBatchSomeColumn(targetList);
                });
                log.info("[BIZ] currentThread:{} 数据表:[{}]成功插入{}条数据，剩余页数：{}", Thread.currentThread().getName(), getTableName(), records.size(), (pages - i));
            }
        }

        log.info("[BIZ]【{}】表完成同步 >>>>>>>>>>>>>>>", getTableName());
    }

    protected Page<E> getePage(Long page, Integer pageSize) {
        Page<E> sourcePage = getSourceService().page(new Page<>(page, pageSize));
        return sourcePage;
    }

    protected T convert(E e, Class<T> clazz) {
        return BeanUtil.toBean(e, clazz);
    }

    protected abstract String getTableName();

    protected abstract Class<T> getTargetClass();
}
