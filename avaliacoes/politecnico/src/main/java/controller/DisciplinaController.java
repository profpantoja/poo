package controller;

import dao.DisciplinaDAO;
import model.Disciplina;

import java.io.IOException;
import java.util.List;

public class DisciplinaController {
    private DisciplinaDAO dao;

    public DisciplinaController() {
        this.dao = new DisciplinaDAO();
    }

    public List<Disciplina> listarDisciplinas() {
        return dao.readAll();
    }

    public Disciplina buscarDisciplina(String nome) {
        return dao.readByName(nome);
    }

    public boolean criarDisciplina(Disciplina d) {
        try {
            return dao.create(d);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean atualizarDisciplina(Disciplina d) {
        try {
            return dao.update(d);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deletarDisciplina(String nome) {
        try {
            return dao.delete(nome);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
