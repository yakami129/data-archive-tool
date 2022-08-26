package com.skyjun.archive.infrastructure.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by alan on 2022/8/15.
 */
@EnableConfigurationProperties
@Configuration
@ConfigurationProperties(prefix = "archive")
public class DataArchiveProperties {

    /**
     * pt-Archiver地址
     */
    private String ptArchiverPath;

    /**
     * 归档账号
     */
    private String archiveUser;

    /**
     * 归档密码
     */
    private String archivePwd;

    /**
     * 归档模式 - 归档配置
     */
    private ArchiveConfig archiveConfig;

    /**
     * 归档模式 - 归档到文件配置
     */
    private ArchiveToFileConfig archiveToFileConfig;

    /**
     * 归档模式 - 只删除不归档配置
     */
    private DeleteConfig deleteConfig;

    public String getPtArchiverPath() {
        return ptArchiverPath;
    }

    public void setPtArchiverPath(String ptArchiverPath) {
        this.ptArchiverPath = ptArchiverPath;
    }

    public String getArchiveUser() {
        return archiveUser;
    }

    public void setArchiveUser(String archiveUser) {
        this.archiveUser = archiveUser;
    }

    public String getArchivePwd() {
        return archivePwd;
    }

    public void setArchivePwd(String archivePwd) {
        this.archivePwd = archivePwd;
    }

    public ArchiveConfig getArchiveConfig() {
        return archiveConfig;
    }

    public void setArchiveConfig(ArchiveConfig archiveConfig) {
        this.archiveConfig = archiveConfig;
    }

    public ArchiveToFileConfig getArchiveToFileConfig() {
        return archiveToFileConfig;
    }

    public void setArchiveToFileConfig(ArchiveToFileConfig archiveToFileConfig) {
        this.archiveToFileConfig = archiveToFileConfig;
    }

    public DeleteConfig getDeleteConfig() {
        return deleteConfig;
    }

    public void setDeleteConfig(DeleteConfig deleteConfig) {
        this.deleteConfig = deleteConfig;
    }
}
