package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* <\/\> */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Que ambientação você prefere?\n" +
                           "  1. Moderno\n" +
                           "  2. Ficção Científica\n  ");
        Integer respAmbi = scanner.nextInt();

        System.out.println("Que tema de filme você prefere?\n" +
                "  1. Suspense\n" +
                "  2. Ação\n ");
        Integer respTema = scanner.nextInt();

        /*
           1 e 1 = O Mundo Depois de Nós
           1 e 2 = Bad Boys 4
           2 e 1 = Interestelar
           2 e 2 = Lucy
        */
        if (respAmbi == 1 &&  respTema == 1 ){
            System.out.println("Te indico o filme O Mundo Depois de Nós");
        } else if (respAmbi == 1 &&  respTema == 2) {
            System.out.println("Te indico o filme Bad Boys");
        } else if (respAmbi == 2 &&  respTema == 1) {
            System.out.println("Te indico o filme Interestelar");
        } else if (respAmbi == 2 &&  respTema == 2) {
            System.out.println("Te indico o filme Lucy");
        } else {
            System.out.println("Por favor, informe um número correspondente.");
        }


    }
}

