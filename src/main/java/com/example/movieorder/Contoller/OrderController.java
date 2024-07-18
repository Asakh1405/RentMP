package com.example.movieorder.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.movieorder.Models.Order;
import com.example.movieorder.Service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        return ResponseEntity.ok(orderService.createOrder(order));
    }

    @GetMapping("/{username}")
    public ResponseEntity<List<Order>> getOrders(@PathVariable String username) {
        return ResponseEntity.ok(orderService.getOrdersByUsername(username));
    }

   
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping
    public ResponseEntity<Order> updateOrder(@RequestBody Order order) {
        return ResponseEntity.ok(orderService.updateOrder(order));
    }
}
