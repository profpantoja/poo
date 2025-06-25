package pets;

import java.util.ArrayList;

public abstract class Pet {

    private String nome; // declara o nome
    private String nascimento; // declara o nascimento
    private ArrayList<Prontuario> prontuarios = new ArrayList<>(); // ArrayList contendo a lista de prontuarios de um
                                                                   // pet

    public Pet(String nome, String nascimento) { // construtor do PET
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() { // Getter do nome
        return nome;
    }

    public void setNome(String nome) { // setter do nome
        this.nome = nome;
    }

    public String getNascimento() { // getter do nascimento
        return nascimento;
    }

    public void setNascimento(String nascimento) { // setter do nascimento
        this.nascimento = nascimento;
    }

    public ArrayList<Prontuario> getProntuarios() {
        return prontuarios;
    }

    public void setProntuarios(ArrayList<Prontuario> prontuarios) {
        this.prontuarios = prontuarios;
    }

    protected abstract String getInfo(); // getinfo criado para poder ser usado no prontuário

}