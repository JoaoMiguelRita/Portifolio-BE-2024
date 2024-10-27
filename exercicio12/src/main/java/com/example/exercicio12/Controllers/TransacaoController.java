package com.example.exercicio12.Controllers;

import com.example.exercicio12.ContaMapper;
import com.example.exercicio12.DTO.ContaDTO;
import com.example.exercicio12.DTO.TransacaoResponseDTO;
import com.example.exercicio12.DTO.TransacaoRequestDTO;
import com.example.exercicio12.Models.Conta;
import com.example.exercicio12.Services.TransacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    private final TransacoesService transacoesService;

    @Autowired
    public TransacaoController(TransacoesService transacoesService){
        this.transacoesService = transacoesService;
    }

    @PostMapping("/gerar")
    public TransacaoResponseDTO gerarTransacao(@RequestBody TransacaoRequestDTO request) {
        // Busca a conta de origem e destino usando o código do DTO
        Conta origemConta = transacoesService.encontrarContaPorCodigo(request.getOrigem().getCodigo());
        Conta destinoConta = transacoesService.encontrarContaPorCodigo(request.getDestino().getCodigo());

        // Converte as contas para DTOs para preparar a resposta
        ContaDTO origemDTO = ContaMapper.toDTO(origemConta);
        ContaDTO destinoDTO = ContaMapper.toDTO(destinoConta);

        // Cria a resposta com a transação
        return new  TransacaoResponseDTO(origemDTO, destinoDTO, request.getValor());
    }


}
