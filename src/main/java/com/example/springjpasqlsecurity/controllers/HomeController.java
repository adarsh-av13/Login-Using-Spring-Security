package com.example.springjpasqlsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String home(){
        return "Hello World";
    }

    @GetMapping("/users")
    public String users() {
        return "Hola User";
    }


    @GetMapping("/admin")
    public String admin() {
        return "Bonjour Admin";
    }
}