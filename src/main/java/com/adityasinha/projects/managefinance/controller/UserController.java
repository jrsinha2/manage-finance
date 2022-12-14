package com.adityasinha.projects.managefinance.controller;

import com.adityasinha.projects.managefinance.model.User;
import com.adityasinha.projects.managefinance.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /** saves a new user in db.
     * @param user new user's json body
     * @return response msg with new user's id
     */
    @PostMapping("/addUser")
    public String saveUser(@RequestBody User user){
        log.info("adding user {}", user);
        userService.addUser(user);
        return ResponseConstants.ADDED_USER;
    }


    /** returns list of all users.
     * @return list of users
     */
    @GetMapping("/getUsers")
    public List<User> getUsers(){
        return userService.getAllUsers();
    }


    @PostMapping("/signIn")
    public ResponseEntity<Boolean> signIn(@RequestBody User user){
        log.info("signing In", user);
        boolean isOk = userService.logIn(user);
        return new ResponseEntity<>(isOk, isOk ? HttpStatus.OK : HttpStatus.UNAUTHORIZED);
    }
}
