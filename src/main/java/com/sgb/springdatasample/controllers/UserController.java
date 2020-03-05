package com.sgb.springdatasample.controllers;

import javax.validation.Valid;

import com.sgb.springdatasample.entities.User;
import com.sgb.springdatasample.services.UserService;
import com.sgb.springdatasample.utils.exceptions.ResourceNotFoundException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 * 
 * @author Sebastián Gamboa
 */
@RestController
@RequestMapping("api")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("user/{email}")
    public User getByEmail(@PathVariable String email) throws ResourceNotFoundException {
        return userService.getByEmail(email);
    }

    @PostMapping("user")
    public User save(@Valid @RequestBody User user) {
        return userService.save(user);
    }
}