package com.example.demo.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter


public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userid;
    private String username;
    private String email;
    private String password;
    private int loyaltyPoints;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Pizza> favoritePizza;

}
