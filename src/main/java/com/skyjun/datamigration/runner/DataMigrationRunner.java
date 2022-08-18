package com.skyjun.datamigration.runner;

import cn.hutool.json.JSONUtil;
import com.google.common.collect.Lists;
import com.skyjun.datamigration.actuator.DataEntityActuator;
import com.skyjun.datamigration.actuator.DatamigrationCentext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Created by alan on 2022/8/15.
 * <p>
 * 数据迁移执行器
 */
@Component
@Slf4j
public class DataMigrationRunner implements CommandLineRunner {

    @Autowired
    private List<DataEntityActuator> dataEntityActuators;

    @Override
    public void run(String... args) {

        StopWatch sw = new StopWatch();
        sw.start();
        log.info("[BIZ] 数据同步开始 >>>>>>>>>>>>>>>");
        List<CompletableFuture<String>> completableFutures = Lists.newArrayList();
        for (DataEntityActuator dataEntityActuator : dataEntityActuators) {
            CompletableFuture<String> voidCompletableFuture = CompletableFuture.supplyAsync(() -> {
                dataEntityActuator.execute();
                return "OK";
            });
            completableFutures.add(voidCompletableFuture);
        }
        completableFutures.forEach(a -> {
            try {
                a.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
        sw.stop();
        log.info("[BIZ] 数据同步结束，总共耗时：{} 秒 >>>>>>>>>>>>>>>", sw.getTotalTimeSeconds());

        if (DatamigrationCentext.getErrorMap().size() != 0) {
            log.error("[BIZ] 数据同步结果，同步错误相关的表：{} >>>>>>>>>>>>>>>",JSONUtil.toJsonStr(DatamigrationCentext.getErrorMap().keys()));
        }

        if (DatamigrationCentext.getInconformity().size() != 0) {
            log.error("[BIZ] 数据同步结果，数据不一致相关的表：{} >>>>>>>>>>>>>>>",  JSONUtil.toJsonStr(DatamigrationCentext.getInconformity()));
        }

    }
}
