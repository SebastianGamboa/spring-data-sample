package com.sgb.springdatasample.controllers;

import javax.validation.Valid;

import com.sgb.springdatasample.entities.User;
import com.sgb.springdatasample.services.UserService;
import com.sgb.springdatasample.utils.exceptions.ResourceNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sebastián Gamboa
 */
@RestController
@RequestMapping("api")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("users/{email}")
    public User getByEmail(@PathVariable String email) throws ResourceNotFoundException {
        return userService.getByEmail(email);
    }

    @PutMapping("users/{email}")
    public User update(@PathVariable String email, @Valid @RequestBody User user) throws ResourceNotFoundException {
        return userService.update(email, user);
    }

    @PostMapping("users")
    public ResponseEntity<User> save(@Valid @RequestBody User user) {
        return new ResponseEntity<User>(userService.save(user), HttpStatus.CREATED);
    }

    @DeleteMapping("users/{email}")
    public void delete(@PathVariable String email) throws ResourceNotFoundException {
        userService.delete(email);
    }
}