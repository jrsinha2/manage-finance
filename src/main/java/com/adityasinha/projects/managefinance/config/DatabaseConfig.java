package com.adityasinha.projects.managefinance.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.concurrent.TimeUnit;

@Configuration
@EnableMongoRepositories(basePackages = "com.adityasinha.projects.managefinance")
public class DatabaseConfig extends AbstractMongoClientConfiguration {

    private final ApplicationProperties applicationProperties;

    public DatabaseConfig(@Autowired ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @Override
    public MongoClient mongoClient() {
        ConnectionString connectionString = new ConnectionString(applicationProperties.getDatabase().getUrl());
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .serverApi(ServerApi.builder()
                        .version(ServerApiVersion.V1)
                        .build())
                .applyToConnectionPoolSettings(builder ->
                        builder.maxConnectionIdleTime(60, TimeUnit.SECONDS))
                .applicationName("manage-finance")
                .build();
        return MongoClients.create(settings);
    }

    @Override
    protected String getDatabaseName() {
        return applicationProperties.getDatabase().getName();
    }
}
