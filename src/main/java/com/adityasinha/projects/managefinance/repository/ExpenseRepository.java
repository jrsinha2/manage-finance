package com.adityasinha.projects.managefinance.repository;

import com.adityasinha.projects.managefinance.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepository extends MongoRepository<Expense,String> {
}
