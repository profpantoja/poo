package model;

public class Club {
  private String nome, cidade;

    public Club (String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return nome + "," + cidade;
    }
}
