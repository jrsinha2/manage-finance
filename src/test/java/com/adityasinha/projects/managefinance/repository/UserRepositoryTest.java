package com.adityasinha.projects.managefinance.repository;

import com.adityasinha.projects.managefinance.config.ApplicationProperties;
import com.adityasinha.projects.managefinance.config.DatabaseConfig;
import com.adityasinha.projects.managefinance.model.User;
import com.mongodb.assertions.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = {DatabaseConfig.class, UserRepository.class, ApplicationProperties.class})
@EnableConfigurationProperties(ApplicationProperties.class)
class UserRepositoryIT {


    @Autowired
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findByEmailAndPassword() {
        String email = "abc@gmail.com";
        String password = "12345";
        Optional<User> user = userRepository.findByEmailAndPassword(email,password);
        Assertions.assertTrue(user.isPresent());
    }

    @Test
    void testSave() {
        User user = new User();
        user.setEmail("abc@gmail.com");
        user.setPassword("12345");
        user.setFullName("ABC XYZ");
        userRepository.save(user);
    }
}