package org.example;


public class BasePorto {
    String nome;
    Barco[] barcosAtracados;
    int count;

    public BasePorto(String nome, int capacidade){
        this.nome = nome;
        this.barcosAtracados = new Barco[capacidade];
        this.count = 0;
    }

    public BasePorto() {
    }

    public void atracarBarco(Barco barco){
        if (count < barcosAtracados.length){
            barcosAtracados[count] = barco;
            count ++;
            System.out.println("Barco " + count + " " + barco.nome + " Atracado com sucesso!");
        } else {
            System.out.println("Não há espaço para atracar barcos!");
        }
    }

    public void desatracarBarco(Barco barco){
        for (int i = 0; i < count; i++){
            if (barcosAtracados[i].equals(barco)){
                for (int j = i; j < count - 1; j++){
                    barcosAtracados[j] = barcosAtracados[j + 1];
                }
                barcosAtracados[count - 1] = null;
                count --;
                System.out.println("Barco " + count + " " + barco.nome +" destracado com sucesso!");
                return;
            }
        }
        System.out.println("Barco " + count + " " + barco.nome + " não encontrado no porto.");
    }
}
