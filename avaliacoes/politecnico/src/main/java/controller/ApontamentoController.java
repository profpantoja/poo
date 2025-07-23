package controller;

import dao.ApontamentoDAO;
import model.Apontamento;
import model.Disciplina;

import java.io.IOException;
import java.util.List;

public class ApontamentoController {
    private ApontamentoDAO dao;

    public ApontamentoController(List<Disciplina> disciplinas) {
        this.dao = new ApontamentoDAO(disciplinas);
    }

    public List<Apontamento> listarApontamentos() {
        return dao.readAll();
    }

    public boolean criarApontamento(Apontamento a) {
        try {
            return dao.create(a);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean atualizarApontamento(int id, Apontamento a) {
        try {
            return dao.update(id, a);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deletarApontamento(int id) {
        try {
            return dao.delete(id);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Apontamento buscarPorId(int id) {
        return dao.readById(id);
    }
}
