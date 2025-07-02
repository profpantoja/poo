package model;

public class Team {
    private String nome, tecnico;

    public Team(String nome, String tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
    }

    public String getNome() {
        return nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    @Override
    public String toString() {
        return nome + "," + tecnico;
    }
}