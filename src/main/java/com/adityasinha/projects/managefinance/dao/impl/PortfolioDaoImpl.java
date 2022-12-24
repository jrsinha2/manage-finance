package com.adityasinha.projects.managefinance.dao.impl;

import com.adityasinha.projects.managefinance.config.ApplicationProperties;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.client.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.adityasinha.projects.managefinance.dao.PortfolioDao;

@Service
public class PortfolioDaoImpl implements PortfolioDao{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private ApplicationProperties applicationProperties;
    @Override
    public String getDatabaseHealth() {
        // TODO Auto-generated method stub
//        DBObject dbObject = new BasicDBObject("ping","1");
        return mongoTemplate.getDb().getName();
//        return mongoClient.getClusterDescription().getShortDescription();
    }
}
