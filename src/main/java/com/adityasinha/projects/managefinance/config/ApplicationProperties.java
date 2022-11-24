package com.adityasinha.projects.managefinance.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "app")
public class ApplicationProperties {

    private DatabaseProperties database;

    @Data
    public static class DatabaseProperties {
        private String name;
        private String url;
        private String username;
        private String password;
        private String driverClassName;
    }
}
