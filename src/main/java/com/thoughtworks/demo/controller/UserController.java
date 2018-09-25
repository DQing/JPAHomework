package com.thoughtworks.demo.controller;

import com.thoughtworks.demo.entity.User;
import com.thoughtworks.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    List<User> getUser() {
        return userRepository.findAll();
    }

    @GetMapping(value = "/users", params = "name")
    User getUserByName(@RequestParam String name) {
       return userRepository.findByName(name);
    }
}
