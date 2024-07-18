package com.example.movieorder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movieorder.Models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    static Optional<User> findByUsername(String username) {
    
        throw new UnsupportedOperationException("Unimplemented method 'findByUsername'");
    }
}
