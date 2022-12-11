package com.adityasinha.projects.managefinance.service;

import com.adityasinha.projects.managefinance.model.User;
import com.adityasinha.projects.managefinance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user){
        user.setId(UUID.randomUUID().toString());
        userRepository.save(user);
    }


    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
