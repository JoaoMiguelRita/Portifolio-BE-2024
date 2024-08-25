package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /* Parte 1 */

        Barco barco1 = new Barco("Titanic", 30);
        Barco barco2 = new Barco("Poseidon", 25);
        Barco barco3 = new Barco("Barco do menino e o tigre", 15);
        Barco barco4 = new Barco("Canoa dos 10 indiozinhos", 15);

        BasePorto porto = new BasePorto("Nova Orleans", 3);
        PortoPequeno portoPequeno = new PortoPequeno("Penha", 2);

        porto.atracarBarco(barco1);
        porto.atracarBarco(barco2);
        porto.atracarBarco(barco3);
        porto.atracarBarco(barco4);

        porto.desatracarBarco(barco2);
        porto.atracarBarco(barco4);

        /* Parte 2 */

        ArrayList<Barco> listaBarcos = new ArrayList<>();
        listaBarcos.add(new Barco("Ocean", 2));
        listaBarcos.add(new Barco("Venessa", 9));
        listaBarcos.add(new Barco("Cruzeiro do Ronaldo", 3));
        listaBarcos.add(new Barco("Titã", 29));
        listaBarcos.add(new Barco("Olimpic", 29));

        PortoPequeno portinho = new PortoPequeno("Porto de Santos", 3);
        PortoGrande portao = new PortoGrande("Porto de Rio Grande do Sul", 5);

        for (Barco barco : listaBarcos) {
            System.out.println("\nTentando atracar: " + barco.nome + " tamanho: " + barco.tamanho + "...");
            if (barco.tamanho <= 10 && portinho.count < portinho.barcosAtracados.length) {
                portinho.atracarBarco(barco);
            } else {
                portao.atracarBarco(barco);
            }
        }
    }
}