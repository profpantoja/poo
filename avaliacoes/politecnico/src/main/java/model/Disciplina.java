package model;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private int ch;
    private int periodo;
    private ArrayList<Disciplina> preRequisitos;

    public Disciplina(String nome, int periodo, int ch) {
        this.nome = nome;
        this.periodo = periodo;
        this.ch = ch;
        this.preRequisitos = new ArrayList<>();
    }

    public Disciplina(String nome, int ch, int periodo, ArrayList<Disciplina> preRequisitos) {
        this.nome = nome;
        this.ch = ch;
        this.periodo = periodo;
        this.preRequisitos = preRequisitos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public ArrayList<Disciplina> getPreRequisitos() {
        return preRequisitos;
    }

    public void setPreRequisitos(ArrayList<Disciplina> preRequisitos) {
        this.preRequisitos = preRequisitos;
    }

    public void addPreReq(Disciplina disciplina) {
        this.preRequisitos.add(disciplina);
    }

    public void imprimirRequisitos() {
        System.out.println("Disciplina [Nome: " + nome + ", CH: " + ch + ", Periodo: " + periodo + "]");
        if (!preRequisitos.isEmpty()) {
            System.out.println("Pré-requisitos:");
            for (Disciplina d : preRequisitos) {
                System.out.println("- " + d.getNome());
            }
        }
    }

}
