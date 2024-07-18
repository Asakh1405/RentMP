package com.example.movieorder.Models;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private int age;
    private String username;
    private String password;
    private String address;
    private String email;
    private String phoneNumber;

    // Getters and Setters
}
