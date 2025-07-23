package model;

import dao.CursoDAO;

public class Curso {
    private String nome;
    private String portaria;

    public Curso(String nome, String portaria) {
        this.nome = nome;
        this.portaria = portaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPortaria() {
        return portaria;
    }

    public void setPortaria(String portaria) {
        this.portaria = portaria;
    }

    public void imprimirInfo(){
        System.out.println("Curso [Nome: " + nome + " Portaria: " + portaria + "]");
    }

    public void create() {
        CursoDAO cdao = new CursoDAO();
        cdao.create(this);
    }
}
