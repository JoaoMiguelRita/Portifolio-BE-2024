package org.example;

public class Main {
    public static void main(String[] args) {
        Personagem jogador = new Personagem();

        jogador.nome = "Jorge";
        jogador.vida = 100;

        Personagem inimigo = new Personagem();
        inimigo.nome = "Roberto";

        System.out.println(jogador.nome + " / " + jogador.vida);
        System.out.println(inimigo.nome + " / " + inimigo.vida);

        jogador.atacar(inimigo);

        System.out.println(jogador.nome + " / " + jogador.vida);
        System.out.println(inimigo.nome + " / " + inimigo.vida);
    }
}