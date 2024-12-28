package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class LoyaltyPrograme {
    @Id
    private Long loyaltyid;
    private String discription;
    private Integer point;
}
