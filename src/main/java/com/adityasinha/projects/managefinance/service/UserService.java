package com.adityasinha.projects.managefinance.service;

import com.adityasinha.projects.managefinance.model.User;
import com.adityasinha.projects.managefinance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user){
        userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User findUser(String email) {
        return userRepository.findById(email).orElse(null);
    }

    public boolean logIn(User user) {
        return userRepository.findByEmailAndPassword(user.getEmail(),user.getPassword()).isPresent();
    }
}
