package controller;

import java.util.ArrayList;
import dao.TutorDAO;
import model.Tutor;

public class TutorController {
    private TutorDAO dao = new TutorDAO();

    public void adicionarTutor(String nome, String apelido) {
        Tutor novoTutor = new Tutor(nome, apelido);
        dao.create(novoTutor);
    }

    public void listarTutores() {
        ArrayList<Tutor> lista = dao.read();
        System.out.println("\n--- Lista de Tutores Cadastrados ---");
        if (lista.isEmpty()) {
            System.out.println("Nenhum tutor cadastrado.");
        } else {
            for (Tutor t : lista) {
                System.out.println(t.getInfo());
            }
        }
        System.out.println("-----------------------------------");
    }

    public void removerTutor(String nome) {
        dao.delete(nome);
    }
}