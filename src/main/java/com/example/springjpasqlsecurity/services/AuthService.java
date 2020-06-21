package com.example.springjpasqlsecurity.services;

import com.example.springjpasqlsecurity.models.User;
import com.example.springjpasqlsecurity.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    UserRepository userRepository;

    public void register(User user) {
        String password = user.getPassword();
        System.out.println(password);
        String encryptedPassword = bCryptPasswordEncoder.encode(password);
        user.setPassword(encryptedPassword);
        user.setActive(true);
        user.setRoles("ROLE_USER");
        userRepository.save(user);
    }
}