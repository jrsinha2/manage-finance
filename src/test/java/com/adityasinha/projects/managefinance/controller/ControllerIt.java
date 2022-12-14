package com.adityasinha.projects.managefinance.controller;

import com.adityasinha.projects.managefinance.dao.PortfolioDao;
import com.adityasinha.projects.managefinance.model.Expense;
import com.adityasinha.projects.managefinance.model.Investment;
import com.adityasinha.projects.managefinance.service.ExpenseService;
import com.adityasinha.projects.managefinance.service.InvestmentService;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@Tag("integration")
public class ControllerIt {
    
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private PortfolioDao portfolioDao;

    @Autowired
    private ExpenseService expenseService;

    @Autowired
    private InvestmentService investmentService;

    @DisplayName("tests ")
    @Test
    void getDbHeathTest() throws Exception {
        mockMvc.perform(
            get("/getDbHealth")
            .contentType(MediaType.APPLICATION_JSON)
             
        ).andExpect(MockMvcResultMatchers.status().isOk());
        Assertions.assertFalse(portfolioDao.getDatabaseHealth());
    }

    @Test
    void addNewExpense() throws Exception {
        Expense expense = new Expense();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonBody = objectMapper.writeValueAsString(expense);
        mockMvc.perform(post("/addNewExpense")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonBody)
        ).andExpect(MockMvcResultMatchers.status().isOk());
        Assertions.assertNull(expenseService.addNewTransaction(expense));
    }

    @Test
    void addNewInvestment() throws Exception {
        Investment investment = new Investment();
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonBody = objectMapper.writeValueAsString(investment);
        mockMvc.perform(post("/addNewInvestment")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonBody)
        ).andExpect(MockMvcResultMatchers.status().isOk());
        Assertions.assertNull(investmentService.addNewTransaction(investment));
    }


}
