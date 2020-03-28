package com.sgb.springdatasample.services;

import com.sgb.springdatasample.entities.User;

/**
 * @author Sebastián Gamboa
 */
public interface UserService {

    public Iterable<User> getAll();

    public User getByEmail(String email);

    public User update(String email, User user);

    public User save(User user);

    public void delete(String email);
}