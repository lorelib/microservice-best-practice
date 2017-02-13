package com.lorelib.microservice.service.uaa.controller.rest;

import com.lorelib.microservice.commons.api.AbstractController;
import com.lorelib.microservice.service.uaa.domain.model.UserRepository;
import com.lorelib.microservice.service.uaa.domain.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by listening on 2017/1/3.
 */
@RestController
@RequestMapping("/user")
public class UserController extends AbstractController {
    private final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        return userRepository.findOne(id);
    }
}
