package com.pluralsight.conference.demo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author Ivan Kaptue (ivanokaptue@gmail.com)
 */
@Configuration
public class PersistenceConfiguration {

    @Bean
    public DataSource dataSource() {
        var builder = DataSourceBuilder.create();
        builder
            .url("jdbc:postgresql://localhost:5432/conference_app")
            .username("postgres")
            .password("root");
        System.out.println("Custom datasource has been initialized");
        return builder.build();
    }

}
