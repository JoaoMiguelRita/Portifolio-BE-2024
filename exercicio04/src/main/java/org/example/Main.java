package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RepositorioMusical spotify = new RepositorioMusical();

        spotify.adicionarMusica("Hope", "Foo Fighters");
        spotify.adicionarMusica("Pra sempre", "Hero");
        spotify.adicionarMusica("Bota na pipokinha", "Pipokinha");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Busque por uma música: ");
        String termo = scanner.nextLine();

        try {
            Musica musicaPesquisada = spotify.buscarMusica(termo);
            System.out.println(musicaPesquisada.getNome() +  " " + musicaPesquisada.getArtista() + " encontrada!");
        } catch (RuntimeException exception){
            System.out.println(exception.getMessage());
        }
    }
}