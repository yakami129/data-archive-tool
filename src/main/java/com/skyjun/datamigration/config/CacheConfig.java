package com.skyjun.datamigration.config;

import com.skyjun.datamigration.common.PersonComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * Created by alan on 2022/8/16.
 */
@Configuration
public class CacheConfig {

    @Autowired
    private PersonComponent personComponent;

    @PostConstruct
    public void initPersonCache() {
        personComponent.initCache();
    }

}
