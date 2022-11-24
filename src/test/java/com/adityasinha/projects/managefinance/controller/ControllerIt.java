package com.adityasinha.projects.managefinance.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.adityasinha.projects.managefinance.dao.PortfolioDao;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@Tag("integration")
public class ControllerIt {
    
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private PortfolioDao portfolioDao;

    @DisplayName("tests ")
    @Test
    void getDbHeathTest() throws Exception {
        mockMvc.perform(
            MockMvcRequestBuilders.get("/getDbHealth")
            .contentType(MediaType.APPLICATION_JSON)
             
        ).andExpect(MockMvcResultMatchers.status().isOk());
        Assertions.assertFalse(portfolioDao.getDatabaseHealth());
    }
}
