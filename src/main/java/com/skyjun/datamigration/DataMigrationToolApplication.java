package com.skyjun.datamigration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.skyjun.datamigration.source.mapper","com.skyjun.datamigration.target.mapper"})
public class DataMigrationToolApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataMigrationToolApplication.class, args);
    }

}
