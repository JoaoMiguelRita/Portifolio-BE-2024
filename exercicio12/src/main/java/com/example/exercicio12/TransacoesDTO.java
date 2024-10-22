package com.example.exercicio12;

public class TransacaoDTOs {

    // DTO para representar uma Conta
    public static record ContaDTO(String codigo, String cliente) {}

    // DTO para solicitação de transação
    public static record TransacaoRequestDTO(String origem, String destino, Double valor) {}

    // DTO para resposta de transação
    public static record TransacaoResponseDTO(ContaDTO origem, ContaDTO destino, Double valor) {}

}