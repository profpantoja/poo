package controller;

import model.Curso;

public class CursoController {
    Curso curso;

    public CursoController() {}

    public void createCurso(Curso c) {
        this.curso = c;
        curso.create();
    }

    public Curso getCurso() {
        return curso;
    }
}
