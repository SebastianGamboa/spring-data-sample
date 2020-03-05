package com.sgb.springdatasample.services;

import com.sgb.springdatasample.entities.User;
import com.sgb.springdatasample.repositories.UserRepository;
import com.sgb.springdatasample.utils.exceptions.ResourceNotFoundException;

import org.springframework.stereotype.Service;

/**
 * UserServiceImpl
 * 
 * @author Sebastián Gamboa
 */
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Iterable<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getByEmail(String email) throws ResourceNotFoundException {
        return userRepository.findByEmail(email)
            .orElseThrow(() -> new ResourceNotFoundException("User", "email", email));
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

}