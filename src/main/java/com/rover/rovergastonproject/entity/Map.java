package com.rover.rovergastonproject.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "map")
@Data
public class Map {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "height")
    private Integer height;
    @Column(name = "width")
    private Integer width;

    public Map(String name, Integer height, Integer width) {
        this.name = name;
        this.height = height;
        this.width = width;
    }

    public Map() {}

    private static Map initializer;

    public static synchronized Map getMap() {
        if(Map.initializer == null) {
            Map.initializer = new Map();
        }
        return Map.initializer;
    }
}
