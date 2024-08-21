package org.example;

import javax.lang.model.util.Elements;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o primeiro nome: ");
            String firstName = scanner.nextLine();

            System.out.println("Digite o segundo nome: ");
            String otherName = scanner.nextLine();

            Random generateNum = new Random();
            Integer num = generateNum.nextInt();

            System.out.println(firstName + " " + otherName + " " + num);


            if (firstName == "") return;
        }
    }
}