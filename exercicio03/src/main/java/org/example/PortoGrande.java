package org.example;

public class PortoGrande extends BasePorto{
    public PortoGrande(String nome, int capacidade){
        this.nome = nome;
        this.barcosAtracados = new Barco[capacidade];
        this.count = 0;
    }

    public void atracarBarco(Barco barco){
        if (count < barcosAtracados.length){
            if (barco.tamanho >= 10) {
                barcosAtracados[count] = barco;
                count++;
                System.out.println("Barco " + count + " " + barco.nome + " Atracado com sucesso no porto: " + this.nome + "!");
            } else {
                System.out.println("O barco possui um tamanho inferior à capacidade mínima");
            }
        } else {
            System.out.println("Não há espaço para atracar barcos!");
        }
    }
}
