package com.adityasinha.projects.managefinance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adityasinha.projects.managefinance.dao.PortfolioDao;

@RestController
public class Controller {
    
    @Autowired
    private PortfolioDao portfolioDao;

    @GetMapping("/getDbHealth")
    public Boolean getDatabaseHealth(){
        return portfolioDao.getDatabaseHealth();
    }
}
