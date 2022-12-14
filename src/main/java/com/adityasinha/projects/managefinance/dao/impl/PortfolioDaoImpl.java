package com.adityasinha.projects.managefinance.dao.impl;

import org.springframework.stereotype.Service;

import com.adityasinha.projects.managefinance.dao.PortfolioDao;

@Service
public class PortfolioDaoImpl implements PortfolioDao{

    @Override
    public Boolean getDatabaseHealth() {
        // TODO Auto-generated method stub
        return PortfolioDao.super.getDatabaseHealth();
    }
}
