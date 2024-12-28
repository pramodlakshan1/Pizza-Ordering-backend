package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Entity
@Getter
@Setter
public class Notification {
    @Id
    private long notificationID;
    private String message;
    private Date timestamp;
    private String user;


}

