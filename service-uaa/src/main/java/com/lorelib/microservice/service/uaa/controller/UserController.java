package com.lorelib.microservice.service.uaa.controller;

import com.lorelib.microservice.service.uaa.dao.UserRepository;
import com.lorelib.microservice.service.uaa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by listening on 2017/1/3.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Value("${profiles}")
    private String profiles;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        System.out.printf("profiles: " + profiles);
        return userRepository.findOne(id);
    }
}
