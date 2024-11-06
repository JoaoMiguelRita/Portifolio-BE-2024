package com.example.exercicio13.Controllers;

import com.example.exercicio13.DTO.JogadorDTO;
import com.example.exercicio13.Mapper.JogadorMapper;
import com.example.exercicio13.Modelo.Jogador;
import com.example.exercicio13.Repository.JogadorRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @Autowired
    private JogadorRepository jogadorRepository;

    // Método POST para criar um novo jogador
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // Define o status 201 Created na resposta
    public JogadorDTO adicionarJogador(@Valid @RequestBody JogadorDTO jogadorDTO) {
        Jogador jogador = JogadorMapper.toEntity(jogadorDTO); // Converte o DTO para o modelo
        jogadorRepository.save(jogador); // Salva o jogador no banco de dados
        return JogadorMapper.toDTO(jogador); // Retorna o DTO do jogador criado
    }

    // Método GET para listar todos os jogadores
    @GetMapping
    public List<JogadorDTO> listarJogadores() {
        return jogadorRepository.findAll().stream()
                .map(JogadorMapper::toDTO)
                .collect(Collectors.toList());
    }
}
