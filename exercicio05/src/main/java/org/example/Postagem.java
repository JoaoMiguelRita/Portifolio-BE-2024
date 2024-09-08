package org.example;

import java.security.PublicKey;
import java.security.Signature;

public class Postagem {
    private String titulo;
    private String descricao;
    private String tipo;

    public Postagem (String titulo, String descricao, String tipo){
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    // Guetis :)
    public String getTitulo() {
        return titulo;
    }

    public String getDescricao () {
        return descricao;
    }

    public String getTipo() {
        return tipo;
    }

    // Setis :)

    public void setTitulo(String titulo){
        this.titulo = titulo;
        System.out.println("Titulo atualizado para: "+ titulo);
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
        System.out.println("Descrição atualizada para: " + descricao);
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
        System.out.println("Tipo atualizado para: " + tipo);
    }


}
