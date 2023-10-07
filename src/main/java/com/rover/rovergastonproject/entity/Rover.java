package com.rover.rovergastonproject.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "rover")
@Data
public class Rover {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "pos_x", nullable = false)
    private Integer posX;
    @Column(name = "pos_y", nullable = false)
    private Integer posY;
    @Column(name = "direction", nullable = false)
    private String direction;

    public Rover(String name, Integer posX, Integer posY) {
        this.name = name;
        this.posX = posX;
        this.posY = posY;
    }

    public Rover() {}

    private static Rover initializer;

    public static synchronized Rover getRover() {
        if(initializer == null) {
            initializer = new Rover();
        }
        return initializer;
    }

    public void moveFoward() {
        this.posX++;
    }

    public void moveBackward() {
        this.posX--;
    }
}
