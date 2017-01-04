package com.lorelib.microservice.organization.controller;

import com.lorelib.microservice.organization.adapter.UserServiceClient;
import com.lorelib.microservice.organization.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by listening on 2017/1/4.
 */
@RestController
public class UserController {
    @Autowired
    private UserServiceClient userServiceClient;

    @GetMapping("user/{id}")
    public User findById(@PathVariable Long id) {
        return userServiceClient.findById(id);
    }
}
