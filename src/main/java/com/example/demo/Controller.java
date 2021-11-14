package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

    @RequestMapping("/")
    public ResponseEntity<String> searchDeductible() {
        return ResponseEntity.ok().body("Hola Mundo..!! /n Introduccion a DevOps.");
    }
    
}
