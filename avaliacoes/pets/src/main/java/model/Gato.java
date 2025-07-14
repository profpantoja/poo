package model;

public class Gato extends Pet { // herdeiro do PET

    public Gato(String nome, String nascimento) { // construtor do gato
        super(nome, nascimento);
    }

    @Override // sobrescreve o getinfo do PET
    public String getInfo() { // getinfo do gato
        return "Gato: " + getNome() + ", Nascimento: " + getNascimento();
    }

    public void miar() { // método do mio do gato
        System.out.println("O gato " + getNome() + ": MIAUMIAU!");
    }
}