package com.example.exercicio07;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecomendaFilme {

    @GetMapping("/recomendar")
    public String recomendaFilme(
            @RequestParam(value = "ambientacao", required = false) Integer ambientacao,
            @RequestParam(value = "tema", required = false) Integer tema) {

        if (ambientacao == null || tema == null) {
            return "Por favor, forneça os parâmetros 'ambientacao' e 'tema'.";
        }

        // Recomendação baseada na combinação de ambientação e tema
        if (ambientacao == 1 && tema == 1) {
            return "Recomendação de Filme: O Mundo Depois de Nós (Moderno, Suspense)";
        } else if (ambientacao == 1 && tema == 2) {
            return "Recomendação de Filme: Bad Boys 4 (Moderno, Ação)";
        } else if (ambientacao == 2 && tema == 1) {
            return "Recomendação de Filme: Interestelar (Ficção Científica, Suspense)";
        } else if (ambientacao == 2 && tema == 2) {
            return "Recomendação de Filme: Lucy (Ficção Científica, Ação)";
        } else {
            return "Opção inválida. Escolha 1 ou 2 para cada parâmetro.";
        }
    }
}
