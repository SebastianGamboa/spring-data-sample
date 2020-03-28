package com.sgb.springdatasample.services;

import com.sgb.springdatasample.entities.User;
import com.sgb.springdatasample.repositories.UserRepository;
import com.sgb.springdatasample.utils.exceptions.ResourceNotFoundException;

import org.springframework.stereotype.Service;

/**
 * @author Sebastián Gamboa
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

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
    public User update(String email, User newUser) throws ResourceNotFoundException {
        return userRepository.findByEmail(email)
            .map(user -> {
                user.setEmail(newUser.getEmail());
                user.setName(newUser.getName());
                return save(user);
            })
            .orElseThrow(() -> new ResourceNotFoundException("User", "email", email));
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(String email) throws ResourceNotFoundException {
        var user = userRepository.findByEmail(email);
        if (user.isPresent())
            userRepository.delete(user.get());
        else
            throw new ResourceNotFoundException("User", "email", email);
    }

}