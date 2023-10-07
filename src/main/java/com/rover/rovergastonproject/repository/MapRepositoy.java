package com.rover.rovergastonproject.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.rover.rovergastonproject.entity.Map;

public interface MapRepositoy extends JpaRepository<Map, Long> {
}
