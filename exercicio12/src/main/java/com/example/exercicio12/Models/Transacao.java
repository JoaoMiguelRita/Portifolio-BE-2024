package com.example.exercicio12.Models;

import java.util.Date;

public class Transacao {
    private String contaCodigo;
    private Double valor;
    private Date data;

    public Transacao(String contaCodigo, Double valor, Date data){
        this.contaCodigo = contaCodigo;
        this.valor = valor;
        this.data = data;
    }

    public String getContaCodigo() {
        return contaCodigo;
    }

    public void setContaCodigo(String contaCodigo) {
        this.contaCodigo = contaCodigo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
