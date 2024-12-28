package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private String user;
    private LocalDateTime orderDate = LocalDateTime.now();
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Order")
//    private List<Pizza> order;
    private Double totalPrice;
    private String status;
    private String deliveryInfo;

}
