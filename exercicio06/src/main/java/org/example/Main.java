package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        public static void main(String[] args) {
            Cinema cinema = new Cinema();
            adicionarFilmes(cinema);

            Scanner scanner = new Scanner(System.in);

            while (true) {
                try {
                    Cliente cliente = criarCliente(scanner);
                    Filme filme = selecionarFilme(scanner, cinema);
                    String assento = selecionarAssento(scanner);

                    Ingresso ingresso = new Ingresso(cliente, filme, assento);
                    cinema.venderIngresso(ingresso);

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                System.out.print("Deseja vender outro ingresso? (s/n): ");
                String resposta = scanner.nextLine();
                if (!resposta.equalsIgnoreCase("s")) {
                    break;
                }
            }

            scanner.close();
        }

        private static void adicionarFilmes(Cinema cinema) {
            cinema.adicionarFilme(new Filme("Aventura Espacial", 15.0, 12));
            cinema.adicionarFilme(new Filme("Terror na Cidade", 20.0, 18));
            cinema.adicionarFilme(new Filme("Comédia Romântica", 12.0, 10));
            cinema.adicionarFilme(new Filme("Drama Histórico", 18.0, 14));
            cinema.adicionarFilme(new Filme("Animação Infantil", 10.0, 0));
        }

        private static Cliente criarCliente(Scanner scanner) {
            System.out.print("Digite o nome do cliente: ");
            String nomeCliente = scanner.nextLine();
            System.out.print("Digite a idade do cliente: ");
            int idadeCliente = Integer.parseInt(scanner.nextLine());
            return new Cliente(nomeCliente, idadeCliente);
        }

        private static Filme selecionarFilme(Scanner scanner, Cinema cinema) throws Exception {
            System.out.print("Digite o nome do filme: ");
            String nomeFilme = scanner.nextLine();
            return cinema.buscarFilme(nomeFilme);
        }

        private static String selecionarAssento(Scanner scanner) {
            System.out.print("Digite o assento desejado (de A1 a F5): ");
            return scanner.nextLine();
        }

    }
}