package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Entity
@Getter
@Setter

public class Promotion {
    @Id
    private long promotion_id;
    private String description;
    private String discountDetails;
    private Date validFrom;
    private Date validTo;
}
