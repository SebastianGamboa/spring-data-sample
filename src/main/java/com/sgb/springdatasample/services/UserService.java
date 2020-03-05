package com.sgb.springdatasample.services;

import com.sgb.springdatasample.entities.User;

/**
 * UserService
 * 
 * @author Sebastián Gamboa
 */
public interface UserService {

    public Iterable<User> getAll();

    public User getByEmail(String email);

    public User save(User user);
}