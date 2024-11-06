package com.example.exercicio13.Repository;

import com.example.exercicio13.Modelo.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JogadorRepository  extends JpaRepository<Jogador, UUID> {
}
