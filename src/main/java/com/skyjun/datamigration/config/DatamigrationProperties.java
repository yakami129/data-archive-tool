package com.skyjun.datamigration.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by alan on 2022/8/15.
 */
@EnableConfigurationProperties
@Configuration
@ConfigurationProperties(prefix = "datamigration")
public class DatamigrationProperties {

    private Integer pagesize;

    public Integer getPagesize() {
        return pagesize;
    }

    public DatamigrationProperties setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
        return this;
    }
}
