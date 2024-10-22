package com.example.exercicio12.Controllers;

import com.example.exercicio12.Services.TransacoesService;
import com.example.exercicio12.TransacaoDTOs;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/transacoes")
    public class TransacoesController {
        private TransacoesService transacoesService;

        public void TransacaoController(TransacoesService transacoesService) {
            this.transacoesService = transacoesService;
        }

        public TransacoesController(TransacoesService transacoesService) {
            this.transacoesService = transacoesService;
        }

        @PostMapping
        public ResponseEntity<TransacaoDTOs.TransacaoResponseDTO> realizarTransacao(@RequestBody TransacaoDTOs.TransacaoRequestDTO transacaoRequest) {
            try {
                TransacaoDTOs.TransacaoResponseDTO response = transacoesService.realizarTransacao(transacaoRequest);
                return new ResponseEntity<>(response, HttpStatus.OK);
            } catch (IllegalArgumentException e) {
                return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
            }
        }
    }