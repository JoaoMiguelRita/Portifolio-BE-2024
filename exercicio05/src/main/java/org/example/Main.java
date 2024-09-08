package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o título da postagem: ");
        String titulo = scanner.nextLine();

        System.out.println("O que desejas postar? ");
        String descricao = scanner.nextLine();

        System.out.println("Qual o tipo de postagem (texto, imagem, video): ");
        String tipo = scanner.nextLine();

        Postagem postagemUsuario = new Postagem(titulo, descricao, tipo);


        PlataformaSocial myBook = new MyBook();
        System.out.println("\nCompartilhando no MyBook...");
        myBook.compartilharPostagem(postagemUsuario);

        Fotogram fotogram = new Fotogram();
        if ("imagem".equals(tipo)) {
            System.out.println("\nCompartilhando no Fotogram...");
            fotogram.compartilharImagem(postagemUsuario);
        } else {
            try {
                fotogram.compartilharPostagem(postagemUsuario);
            } catch (UnsupportedOperationException e){
                System.out.println("Erro: " + e.getMessage());
            }
        }

        AnyTube anyTube = new AnyTube();
        if ("video".equals(tipo)){
            System.out.println("\nCompartilhando no Fotogram...");
            anyTube.compartilharVideo(postagemUsuario);
        } else {
            try {
                anyTube.compartilharPostagem(postagemUsuario);
            } catch (UnsupportedOperationException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        scanner.close();

        /* TESTES
        myBook.compartilharPostagem(postagemLivro);

        try {
            fotogram.compartilharPostagem(postagemFoto);
        } catch (UnsupportedOperationException e){
            System.out.println("Erro: " + e.getMessage());
        }
        fotogram.compartilharImagem(postagemFoto);

        try {
            anyTube.compartilharImagem(postagemVideo);
        } catch (UnsupportedOperationException e){
            System.out.println("Erro: " + e.getMessage());
        }

        anyTube.compartilharVideo(postagemVideo);


         */
    }
}