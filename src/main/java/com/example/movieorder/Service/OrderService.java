package com.example.movieorder.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movieorder.Models.Order;
import com.example.movieorder.Repository.OrderRepository;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> getOrdersByUsername(String username) {
        return orderRepository.findByUsername(username);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

    public Order updateOrder(Order order) {
        return orderRepository.save(order);
    }
    
}
