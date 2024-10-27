package com.example.exercicio11.Services;

import com.example.exercicio11.Conta;
import com.example.exercicio11.ContaMapper;
import com.example.exercicio11.TransacaoDTOs;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TransacoesService {
    private final List<Conta> contas = new ArrayList<>();

    public TransacoesService() {
        // Inicializa duas contas
        contas.add(new Conta("500-1", "Fulano", 1000.0));
        contas.add(new Conta("320-2", "Ciclano", 500.0));
    }

    // Encontra uma conta pelo código
    public Optional<Conta> encontrarContaPorCodigo(String codigo) {
        return contas.stream().filter(c -> c.getCodigo().equals(codigo)).findFirst();
    }

    // Realiza a transação
    public TransacaoDTOs.TransacaoResponseDTO realizarTransacao(TransacaoDTOs.TransacaoRequestDTO transacaoRequest) {
        Conta origem = encontrarContaPorCodigo(transacaoRequest.origem())
                .orElseThrow(() -> new IllegalArgumentException("Conta de origem não encontrada"));
        Conta destino = encontrarContaPorCodigo(transacaoRequest.destino())
                .orElseThrow(() -> new IllegalArgumentException("Conta de destino não encontrada"));

        // Valida saldo
        if (origem.getSaldo() < transacaoRequest.valor()) {
            throw new IllegalArgumentException("Saldo insuficiente na conta de origem");
        }

        // Realiza a transação
        origem.setSaldo(origem.getSaldo() - transacaoRequest.valor());
        destino.setSaldo(destino.getSaldo() + transacaoRequest.valor());

        // Retorna o DTO da transação realizada
        return new TransacaoDTOs.TransacaoResponseDTO(
                ContaMapper.toDTO(origem),
                ContaMapper.toDTO(destino),
                transacaoRequest.valor()
        );
    }
}