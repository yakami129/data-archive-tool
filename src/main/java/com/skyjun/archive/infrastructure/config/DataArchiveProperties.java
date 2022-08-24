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

    private String ptArchiverPath;

    private String batchSize;

}
