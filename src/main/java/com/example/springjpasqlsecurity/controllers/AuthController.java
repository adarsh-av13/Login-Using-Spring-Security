package com.example.springjpasqlsecurity.controllers;

import com.example.springjpasqlsecurity.models.User;
import com.example.springjpasqlsecurity.services.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    
    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        authService.register(user);
        return "Registration Successful";
    }
}