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
     * 归档文件地址
     *
     * 默认为：/opt/archive
     */
    private String archiveFilePath;

    /**
     * 批量每次归档的数据数量
     */
    private String batchSize;

    /**
     * 指定每个事务的大小（行数）
     */
    private String txnSize;

    /**
     * 归档账号
     */
    private String archiveUser;

    /**
     * 归档密码
     */
    private String archivePwd;

    public String getPtArchiverPath() {
        return ptArchiverPath;
    }

    public void setPtArchiverPath(String ptArchiverPath) {
        this.ptArchiverPath = ptArchiverPath;
    }

    public String getArchiveFilePath() {
        return archiveFilePath;
    }

    public void setArchiveFilePath(String archiveFilePath) {
        this.archiveFilePath = archiveFilePath;
    }

    public String getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(String batchSize) {
        this.batchSize = batchSize;
    }

    public String getTxnSize() {
        return txnSize;
    }

    public void setTxnSize(String txnSize) {
        this.txnSize = txnSize;
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
}
