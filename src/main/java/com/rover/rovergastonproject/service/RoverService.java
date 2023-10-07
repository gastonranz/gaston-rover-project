package com.rover.rovergastonproject.service;

import com.rover.rovergastonproject.entity.Rover;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rover.rovergastonproject.repository.RoverInterface;

import java.util.List;

@Service
public class RoverService {
    @Autowired
    RoverInterface roverInterface;

    public List<Rover> getName() {
        return this.roverInterface.findAll();
    }
}
