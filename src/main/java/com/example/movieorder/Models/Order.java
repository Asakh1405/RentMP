package com.example.movieorder.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String movieName;
    private LocalDateTime dateOfRent;
    private String time;
   

    // Getters and Setters
}
