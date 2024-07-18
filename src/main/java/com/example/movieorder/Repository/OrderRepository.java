package com.example.movieorder.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movieorder.Models.Order;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUsername(String username);
}
