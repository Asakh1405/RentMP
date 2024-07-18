package com.example.movieorder.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movieorder.Models.User;
import com.example.movieorder.Repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User register(User user) {
        return userRepository.save(user);
    }

    public Optional<User> login(String username, String password) {
        return UserRepository.findByUsername(username).filter(u -> u.getPassword().equals(password));
    }
}
