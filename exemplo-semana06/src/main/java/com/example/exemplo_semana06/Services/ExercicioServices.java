package com.example.exemplo_semana06.Services;

import org.springframework.stereotype.Service;


@Service
public class ExercicioServices {

    public String recomendaFilme(String ambientacao, String genero) {
        if (ambientacao.equals("scifi") && genero.equals("comedia"))
            return "Homens de Preto";
        if (ambientacao.equals("scifi") && genero.equals("drama"))
            return "Arival";
        if (ambientacao.equals("Medieval") && genero.equals("comedia"))
            return "Sherek";
        if (ambientacao.equals("Medieval") && genero.equals("drama"))
            return "Gladiador";

        return "Nenhum filme";
    }
}
