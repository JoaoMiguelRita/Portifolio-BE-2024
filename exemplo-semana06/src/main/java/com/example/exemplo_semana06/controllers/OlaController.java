package com.example.exemplo_semana06.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {

    @GetMapping("/olaMundo")
    public String olaMundo(){
        return "Salve gurizada";
    }
}
