package com.rover.rovergastonproject.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "obstacle")
@Data
public class Obstacle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "posX", nullable = false)
    private Integer posX;
    @Column(name = "posY", nullable = false)
    private Integer posY;

    public Obstacle(String name, Integer posX, Integer posY) {
        this.name = name;
        this.posX = posX;
        this.posY = posY;
    }
}
