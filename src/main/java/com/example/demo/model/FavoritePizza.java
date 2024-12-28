package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class FavoritePizza {
    @Id
    private Long favoriteId;
    private String pizza;
    private String user;
}
