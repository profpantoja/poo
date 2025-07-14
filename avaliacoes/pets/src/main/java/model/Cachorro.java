package model;

public class Cachorro extends Pet { // herdeiro do PET

    public Cachorro(String nome, String nascimento) { // construtor do cachorro
        super(nome, nascimento);
    }

    @Override // sobrescreve o getinfo do pet
    public String getInfo() { // getinfo do cachorro
        return "Cachorro: " + getNome() + ", Nascimento: " + getNascimento();
    }

    public void latir() { // método do latido do carrocho
        System.out.println("O cachorro " + getNome() + ": AUAU!");
    }
}