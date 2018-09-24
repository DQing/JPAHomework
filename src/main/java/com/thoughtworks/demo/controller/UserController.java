package com.thoughtworks.demo.controller;

import com.thoughtworks.demo.entity.User;
import com.thoughtworks.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    List<User> getUser() {
        return userRepository.findAll();
    }
}
