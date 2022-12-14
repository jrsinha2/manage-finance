package com.adityasinha.projects.managefinance.controller;

import com.adityasinha.projects.managefinance.model.User;
import com.adityasinha.projects.managefinance.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@Tag("integration")
class UserControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    UserService userService;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void saveUser() {
    }

    @Test
    void getUsers() {
    }

    @Test
    void signIn() throws Exception {
        User user = new User();
        user.setEmail("a");
        user.setPassword("123");
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonBody = objectMapper.writeValueAsString(user);
        mockMvc.perform(post("/user/signIn")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonBody)
        ).andExpect(MockMvcResultMatchers.status().isUnauthorized());
        assertFalse(userService.logIn(user));
    }
}