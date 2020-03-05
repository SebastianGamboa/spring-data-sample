package com.sgb.springdatasample.repositories;

import java.util.Optional;

import com.sgb.springdatasample.entities.User;

import org.springframework.data.repository.CrudRepository;

/**
 * UserRepository
 * 
 * @author Sebastián Gamboa
 */
public interface UserRepository extends CrudRepository<User, Long> {

    public Optional<User> findByEmail(String email);
}