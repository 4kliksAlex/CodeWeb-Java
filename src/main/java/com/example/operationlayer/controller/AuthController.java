package com.example.operationlayer.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        // TODO: Implement user registration logic
        return "User registered successfully";
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody User user) {
        // TODO: Implement user login logic
        return "User logged in successfully";
    }
}