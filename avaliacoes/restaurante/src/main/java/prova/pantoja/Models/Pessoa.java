package prova.pantoja.Models;

public abstract class Pessoa {
    private String nome;
    private String numContribuinte;
    private Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, String numContribuinte, Endereco endereco) {
        this.nome = nome;
        this.numContribuinte = numContribuinte;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumContribuinte() {
        return numContribuinte;
    }

    public void setNumContribuinte(String numContribuinte) {
        this.numContribuinte = numContribuinte;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", numContribuinte=" + numContribuinte + ", endereco=" + endereco + "]";
    }
}