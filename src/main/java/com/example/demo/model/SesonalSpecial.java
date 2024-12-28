package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter

public class SesonalSpecial {
    @Id
    private long Specialid;
    private String discription;
    private String applicableItems;
    private Date validFrom;
    private Date validTo;
}
