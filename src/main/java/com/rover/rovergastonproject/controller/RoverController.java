package com.rover.rovergastonproject.controller;

import org.springframework.web.bind.annotation.*;
import com.rover.rovergastonproject.entity.Rover;

@RestController
@RequestMapping(value = "/rover")
public class RoverController {

    @PostMapping("/start-game")
    public String startGame(@RequestParam("go") Rover rover) {

    }

    @GetMapping("/get-wave")
    public String hiWorld() {
        return "Hi World! My name is \"ROVER\"";
    }

    @GetMapping("/secret-message")
    public String getPhrase() {
        return "This is the secret path, you've unlocked the secret of life, you'll be so smart and so intelligent by now!";
    }
}
