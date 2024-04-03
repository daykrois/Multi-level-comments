package com.example.demo02comments.controller;

import com.example.demo02comments.entity.User;
import com.example.demo02comments.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("User")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("create")
    public User createUser(@RequestBody User user){
        return userService.addUser(user);
    }
}
