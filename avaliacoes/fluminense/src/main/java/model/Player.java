package model;

public class Player {
    private String nome, posicao;

    public Player(String nome, String posicao) {
        this.nome = nome;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public String getPosicao() {
        return posicao;
    }

    @Override
    public String toString() {
        return nome + "," + posicao;
    }
}