package org.example;

public class Fotogram implements PlataformaSocial{

    @Override
    public void compartilharPostagem(Postagem postagem) {
        throw new UnsupportedOperationException("Ocorreu um erro ao compartilhar essa postagem no Fotogram.");

    }

    @Override
    public void compartilharImagem(Postagem postagem) {
        System.out.println("Você compartilhou essa imagem no Fotogram.");
    }

    @Override
    public void compartilharVideo(Postagem postagem) {
        System.out.println("Você compartilhou esse video no Fotogram.");
    }
}
