package com.adityasinha.projects.managefinance.controller;

import com.adityasinha.projects.managefinance.dao.PortfolioDao;
import com.adityasinha.projects.managefinance.model.Expense;
import com.adityasinha.projects.managefinance.model.Investment;
import com.adityasinha.projects.managefinance.service.ExpenseService;
import com.adityasinha.projects.managefinance.service.InvestmentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final PortfolioDao portfolioDao;

    private final ExpenseService expenseService;
    private final InvestmentService investmentService;

    public Controller(PortfolioDao portfolioDao, @Qualifier("expenseService") ExpenseService expenseService,
                      @Qualifier("investmentService") InvestmentService investmentService) {
        this.portfolioDao = portfolioDao;
        this.expenseService = expenseService;
        this.investmentService = investmentService;
    }

    @GetMapping("/getDbHealth")
    public String getDatabaseHealth(){
        return portfolioDao.getDatabaseHealth();
    }

    @PostMapping("/addNewExpense")
    public Boolean addExpense(@RequestBody Expense expense) {
        return expenseService.addNewTransaction(expense);
    }

    @PostMapping("/addNewInvestment")
    public Boolean addInvestment(@RequestBody Investment investment) {
        return investmentService.addNewTransaction(investment);
    }
}
