package com.skyjun.archive.task.generate.debug;

import cn.hutool.core.io.IoUtil;
import com.skyjun.archive.enums.ArchiveModeEnum;
import com.skyjun.archive.infrastructure.config.DataArchiveProperties;
import com.skyjun.archive.infrastructure.db.entity.ArchiveConfigEntity;
import com.skyjun.archive.task.generate.GeneratePtArchiverCmd;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;


/**
 * Created by alan on 2022/8/25.
 */
class GeneratePtArchiverCmdDebugTest {

    @SneakyThrows
    @Test
    void generateCmd() {

        DataArchiveProperties dataArchiveProperties = new DataArchiveProperties();
        dataArchiveProperties.setBatchSize("1000");
        dataArchiveProperties.setTxnSize("1000");
        dataArchiveProperties.setArchiveUser("root");
        dataArchiveProperties.setArchivePwd("123qweASD");
        dataArchiveProperties.setPtArchiverPath("/opt/homebrew/bin");

        ArchiveConfigEntity archiveConfigEntity = ArchiveConfigEntity
                .builder()
                .sourceHost("192.168.3.15")
                .sourcePort(3306)
                .sourceDb("itsmboot-ht")
                .sourceTable("itsm_service_work_list")

                .destHost("192.168.3.15")
                .destPort(3306)
                .destDb("itsmboot_archive")
                .destTable("itsm_service_work_list")

                .archiveMode(ArchiveModeEnum.archive.name())
                .charset("UTF8")
                .archiveCondition("end_date<'2022-08-27'")
                .build();

        String cmd = GeneratePtArchiverCmd.generateCmd(dataArchiveProperties, archiveConfigEntity);
        System.out.println("CMD:\n" + cmd);

        Process log = Runtime.getRuntime().exec(cmd);
        try (InputStream inputStream = log.getInputStream();) {
            String read = IoUtil.read(inputStream, Charset.forName("utf-8"));
            System.out.println(read);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            log.destroy();
        }
    }

}