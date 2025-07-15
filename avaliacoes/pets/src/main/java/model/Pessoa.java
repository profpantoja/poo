package model;

public class Pessoa {

    private String nome; // instancia o apelido
    private String apelido; // instancia o apelido

    public Pessoa(String nome, String apelido) {
        this.nome = nome; // construtor da pessoa
        this.apelido = apelido;
    }

    public String getNome() {
        return nome; // getter do nome da pessoa
    }

    public void setNome(String nome) {
        this.nome = nome; // setter do nome da pessoa
    }

    public String getApelido() { // getter do apelido da pessoa
        return apelido;
    }

    public void setApelido(String apelido) { // setter do apelido da pessoa
        this.apelido = apelido;
    }

    public String getInfo() { // Getinfo da pessoa
        return "Nome: " + nome + ", Apelido: " + apelido;
    }
}