package com.adityasinha.projects.managefinance.service;

import com.adityasinha.projects.managefinance.dao.PortfolioDao;
import com.adityasinha.projects.managefinance.model.Investment;
import com.adityasinha.projects.managefinance.model.InvestmentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvestmentService implements TransactionService{

    @Autowired
    private PortfolioDao portfolioDao;

    public Boolean addNewTransaction(Investment investment) {
        InvestmentType investmentType = investment.getType();

        return null;
    }
}
