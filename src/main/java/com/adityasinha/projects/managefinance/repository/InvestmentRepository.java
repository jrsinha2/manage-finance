package com.adityasinha.projects.managefinance.repository;

import com.adityasinha.projects.managefinance.model.Investment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InvestmentRepository extends MongoRepository<Investment,String> {
}
