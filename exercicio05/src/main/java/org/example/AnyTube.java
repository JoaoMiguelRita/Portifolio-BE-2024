package org.example;

public class AnyTube implements PlataformaSocial{

    @Override
    public void compartilharPostagem(Postagem postagem) {
        System.out.println("Você compartilhou essa postagem no AnyTube.");
    }

    @Override
    public void compartilharImagem(Postagem postagem) {
        throw new UnsupportedOperationException("Ocorreu um erro ao compartilhar essa postagem no AnyTube.");
    }

    @Override
    public void compartilharVideo(Postagem postagem) {
        System.out.println("Você compartilhou esse Vídeo no AnyTube.");
    }
}
