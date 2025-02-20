package com.example.dio.model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "User"  )
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long Userid;
    private String username;
    private String email;
    private String password;
    private LocalDate createdAt;
    private LocalDate lastModifiedAt;

}
