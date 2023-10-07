package com.rover.rovergastonproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rover.rovergastonproject.entity.Rover;

public interface RoverInterface extends JpaRepository<Rover, Long> {
}
