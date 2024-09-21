package com.example.exemplo_semana06.controllers;

import com.example.exemplo_semana06.Services.ExercicioServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio")
public class ExercicioController {

    @Autowired
    private ExercicioServices exercicioService;

    @GetMapping("/recomenda")
    public String recomendaFilme(@RequestParam String ambientacao, @RequestParam String genero){
        return exercicioService.recomendaFilme(ambientacao, genero);
    }
}
