package com.adityasinha.projects.managefinance.config;

import com.mongodb.assertions.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = ApplicationProperties.class)
@ActiveProfiles("local")
@EnableConfigurationProperties(ApplicationProperties.class)
public class ApplicationPropertiesTest {

    @Autowired
    private ApplicationProperties applicationProperties;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getDatabaseTest() {
        Assertions.assertNotNull(applicationProperties.getDatabase().getUrl());
    }

}