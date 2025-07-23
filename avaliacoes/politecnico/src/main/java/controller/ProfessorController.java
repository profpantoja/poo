package controller;

import java.util.ArrayList;

import dao.ProfessorDAO;
import model.Politecnico;
import model.Professor;

public class ProfessorController {
    ProfessorDAO dao = new ProfessorDAO();

    public void adicionarProfessor(String nome, String apelido, String numeroFiscal, int id, int contrato, String nomePolitecnico) {
        Politecnico politecnico = new Politecnico(nomePolitecnico);
        Professor professor = new Professor(nome, apelido, numeroFiscal, id, contrato, politecnico);
        dao.create(professor);
    }

    public void listarProfessores() {
        ArrayList<Professor> lista = dao.read();
        for (Professor p : lista) {
            p.imprimirPessoa();
        }
    }

    public void removerProfessor(int id) {
        dao.delete(id);
    }
}
