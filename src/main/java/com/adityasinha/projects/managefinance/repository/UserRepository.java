package com.adityasinha.projects.managefinance.repository;

import com.adityasinha.projects.managefinance.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User,String> {

    Optional<User> findByEmailAndPassword(String email, String password);
}
