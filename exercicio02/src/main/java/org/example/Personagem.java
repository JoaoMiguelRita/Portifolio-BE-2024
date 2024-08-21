package org.example;

public class Personagem{
    String nome;
    Integer vida = 5;

    public void atacar(Personagem alvo){
        Integer dano = 5;
        alvo.vida  -= dano;
        System.out.println(this.nome + " Atacou " + alvo.nome + " ---- Dano causado: " + dano );
    }
}
