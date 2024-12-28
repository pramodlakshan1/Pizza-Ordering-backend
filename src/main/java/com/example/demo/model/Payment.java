package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Payment {
    @Id
    private Long payment_id;
    private Double payment_amount;
    private String paymentMethod;
    private String payment_date;
    private String payment_status;

}
