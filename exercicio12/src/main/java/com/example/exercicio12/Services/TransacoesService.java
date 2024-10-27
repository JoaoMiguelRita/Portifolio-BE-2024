package com.example.exercicio12.Services;

import com.example.exercicio12.Models.Conta;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransacoesService {

    private List<Conta> contas;

    public TransacoesService() {
        contas = new ArrayList<>();
        inicializarContas();
    }

    private void inicializarContas(){
        contas.add(new Conta("500-1", "Fulano"));
        contas.add(new Conta("320-2", "Ciclano"));
    }

    public Conta encontrarContaPorCodigo(String codigo) {
        return contas.stream()
                .filter(conta -> conta.getCodigo().equals(codigo))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Conta não encontrada: " + codigo));
    }

    public List<Conta> getContas(){
        return contas;
    }
}
