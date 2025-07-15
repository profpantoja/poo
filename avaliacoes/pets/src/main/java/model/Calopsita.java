package model;

public class Calopsita extends Pet { // herdeiro do pet

    public Calopsita(String nome, String nascimento) { // construtor da calopsita
        super(nome, nascimento);
    }

    @Override // sobrescreve o getinfo do PET
    public String getInfo() { // getinfo da calopsita
        return "Calopsita: " + getNome() + ", Nascimento: " + getNascimento();
    }

    public void piar() { // método do pio da caloptsita
        System.out.println("A calopsita " + getNome() + ": PIUPIU!");
    }
}