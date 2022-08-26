package com.skyjun.archive.task.generate;

import cn.hutool.cron.pattern.CronPattern;
import com.skyjun.archive.enums.ExecStatusEnum;
import com.skyjun.archive.infrastructure.config.DataArchiveProperties;
import com.skyjun.archive.infrastructure.db.entity.ArchiveConfigEntity;
import com.skyjun.archive.infrastructure.db.entity.ArchiveTasksEntity;
import com.skyjun.archive.infrastructure.db.service.ArchiveConfigService;
import com.skyjun.archive.infrastructure.db.service.ArchiveTasksService;
import com.skyjun.archive.infrastructure.utils.LambdaUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * Created by alan on 2022/8/25.
 */
@Component
@Slf4j
public class GenerateArchiveTasksService {

    @Autowired
    private ArchiveConfigService archiveConfigService;
    @Autowired
    private ArchiveTasksService archiveTasksService;
    @Autowired
    private DataArchiveProperties dataArchiveProperties;

    @Transactional(rollbackFor = Exception.class)
    public void generateArchiveTasks() {

        // 获取当前需要生成归档任务的归档配置列表
        List<ArchiveConfigEntity> archiveConfigs = archiveConfigService.list();
        archiveConfigs = LambdaUtil.filterToList(archiveConfigs, archiveConfigEntity -> {

            // TODO TEST
            if(true){
                return true;
            }

            if (StringUtils.isBlank(archiveConfigEntity.getExecTimeWindowCron())) {
                return false;
            }
            CronPattern cronPattern = new CronPattern(archiveConfigEntity.getExecTimeWindowCron());
            return cronPattern.match(LocalDateTime.now(), false);
        });

        List<ArchiveTasksEntity> archiveTasksEntities = LambdaUtil.listMapper(archiveConfigs, archiveConfig -> buildArchiveTasksEntity(dataArchiveProperties, archiveConfig));
        if (CollectionUtils.isNotEmpty(archiveTasksEntities)) {
            archiveTasksService.saveBatch(archiveTasksEntities);
            log.info("[BIZ] >>>>>>>>>>>>>>>> 成功生成{}个归档任务", archiveTasksEntities.size());
        } else {
            log.error("[BIZ] >>>>>>>>>>>>>>>> 当前没有归档任务需要生成");
        }

    }

    private ArchiveTasksEntity buildArchiveTasksEntity(DataArchiveProperties dataArchiveProperties, ArchiveConfigEntity archiveConfig) {

        ArchiveTasksEntity archiveTasksEntity = ArchiveTasksEntity
                .builder()

                .sourceHost(archiveConfig.getSourceHost())
                .sourcePort(archiveConfig.getSourcePort())
                .sourceDb(archiveConfig.getSourceDb())
                .sourceTable(archiveConfig.getSourceTable())

                .destHost(archiveConfig.getDestHost())
                .destPort(archiveConfig.getDestPort())
                .destDb(archiveConfig.getDestDb())
                .destTable(archiveConfig.getDestTable())

                .archiveMode(archiveConfig.getArchiveMode())
                .execStatus(ExecStatusEnum.INITIAL.name())

                // 设置为当前时间
                .execStart(new Date())

                .build();

        String cmd = GeneratePtArchiverCmd.generateCmd(dataArchiveProperties, archiveConfig);
        archiveTasksEntity.setArchiveCmd(cmd);

        return archiveTasksEntity;
    }

}
