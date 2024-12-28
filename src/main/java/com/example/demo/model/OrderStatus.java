package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OrderStatus {
    @Id
    private long statusId;
    private String statusName;
    private String TimesTamp;
}
