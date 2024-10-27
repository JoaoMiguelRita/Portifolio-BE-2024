package com.example.exercicio11;



public class ContaMapper {
    public static TransacaoDTOs.ContaDTO toDTO(Conta conta) {
        return new TransacaoDTOs.ContaDTO(conta.getCodigo(), conta.getCliente());
    }
}
