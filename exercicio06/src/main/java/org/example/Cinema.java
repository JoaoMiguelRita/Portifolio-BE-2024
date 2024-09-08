package org.example;

import java.util.ArrayList;
import java.util.List;

class Cinema {
    private List<Filme> filmesDisponiveis;
    private List<Ingresso> ingressosVendidos;

    public Cinema() {
        this.filmesDisponiveis = new ArrayList<>();
        this.ingressosVendidos = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) {
        filmesDisponiveis.add(filme);
    }

    public boolean assentoDisponivel(String assento) {
        for (Ingresso ingresso : ingressosVendidos) {
            if (ingresso.getAssento().equalsIgnoreCase(assento)) {
                return false;
            }
        }
        return true;
    }

    public void venderIngresso(Ingresso ingresso) throws Exception {
        if (!assentoDisponivel(ingresso.getAssento())) {
            throw new Exception("Assento já ocupado.");
        }
        if (ingresso.getCliente().getIdade() < ingresso.getFilme().getIdadeMinima()) {
            throw new Exception("Cliente não tem idade suficiente para assistir ao filme.");
        }
        ingressosVendidos.add(ingresso);
        System.out.println("Ingresso vendido com sucesso!");
    }

    public Filme buscarFilme(String nomeFilme) throws Exception {
        for (Filme filme : filmesDisponiveis) {
            if (filme.getNome().equalsIgnoreCase(nomeFilme)) {
                return filme;
            }
        }
        throw new Exception("Filme não encontrado.");
    }

    public List<Filme> getFilmesDisponiveis() {
        return filmesDisponiveis;
    }

    public List<Ingresso> getIngressosVendidos() {
        return ingressosVendidos;
    }
}
