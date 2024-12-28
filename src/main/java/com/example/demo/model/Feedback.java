package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Feedback {
    @Id
    private Long feedbackid;
    private String order;
    private String user;
    private Double rating;
    private String comment;
}
