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

    public String getArchiveUser() {
        return archiveUser;
    }

    public DataArchiveProperties setArchiveUser(String archiveUser) {
        this.archiveUser = archiveUser;
        return this;
    }

    public String getArchivePwd() {
        return archivePwd;
    }

    public DataArchiveProperties setArchivePwd(String archivePwd) {
        this.archivePwd = archivePwd;
        return this;
    }

    public String getPtArchiverPath() {
        return ptArchiverPath;
    }

    public DataArchiveProperties setPtArchiverPath(String ptArchiverPath) {
        this.ptArchiverPath = ptArchiverPath;
        return this;
    }

    public String getBatchSize() {
        return batchSize;
    }

    public DataArchiveProperties setBatchSize(String batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    public String getTxnSize() {
        return txnSize;
    }

    public DataArchiveProperties setTxnSize(String txnSize) {
        this.txnSize = txnSize;
        return this;
    }
}
