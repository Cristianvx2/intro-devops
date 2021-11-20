package com.example.demo;

import com.example.demo.model.Docker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DockerRepository extends JpaRepository<Docker, Long> {
    
}
