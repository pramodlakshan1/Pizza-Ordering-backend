package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pizzaId;

    private String pizzaName;
    private String crust;
    private String sauce;
    private String cheese;
    private Double price;



}
