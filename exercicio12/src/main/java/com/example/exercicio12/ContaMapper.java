package com.example.exercicio12;

import com.example.exercicio12.DTO.ContaDTO;
import com.example.exercicio12.Models.Conta;

public class ContaMapper {

    public static ContaDTO toDTO(Conta conta) {
        return new ContaDTO(conta.getCodigo(), conta.getCliente());
    }

    public static Conta toModel(ContaDTO contaDTO) {
        return new Conta(contaDTO.getCodigo(), contaDTO.getCliente());
    }
}