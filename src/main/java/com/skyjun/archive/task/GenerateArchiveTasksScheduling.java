package com.skyjun.archive.task;

import com.skyjun.archive.task.generate.GenerateArchiveTasksService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by alan on 2022/8/25.
 * 生成归档任务的，定时任务
 */
@Component
@Slf4j
public class GenerateArchiveTasksScheduling {

    @Autowired
    private GenerateArchiveTasksService generateArchiveTasksService;

    /**
     * 每分钟执行一次，扫描归档配置，并且生成任务
     */
    // TODO TEST
    //@Scheduled(cron = "00 * * * * ? ")
    public void running() {
        log.info("[BIZ] >>>>>>>>>>>>>>>> 开始生成归档任务");
        generateArchiveTasksService.generateArchiveTasks();
    }

}
