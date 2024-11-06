package com.example.exercicio13.Mapper;

import com.example.exercicio13.DTO.JogadorDTO;
import com.example.exercicio13.Modelo.Jogador;

public class JogadorMapper {
    public static Jogador toEntity(JogadorDTO dto) {
        return new Jogador(dto.getNome(), dto.getApelido(), 100); // Atribui habilidade fixa como 100
    }

    public static JogadorDTO toDTO(Jogador jogador) {
        JogadorDTO dto = new JogadorDTO();
        dto.setNome(jogador.getNome());
        dto.setApelido(jogador.getApelido());
        dto.setHabilidade(jogador.getHabilidade()); // Adiciona o valor da habilidade ao DTO
        return dto;
    }
}