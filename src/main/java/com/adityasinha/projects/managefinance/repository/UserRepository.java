package com.adityasinha.projects.managefinance.repository;

import com.adityasinha.projects.managefinance.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
