package controller;

import java.util.List;

import dao.CalopsitaDao;
import model.Calopsita;

public class CalopsitaController {
    CalopsitaDao calopsitaDao = new CalopsitaDao();

    public void criarCalopsita(String nome, String nascimento) {
        Calopsita c = new Calopsita(nome, nascimento);
        calopsitaDao.adicionarCalopsita(c);
        System.out.println("Calopsita adicionada com sucesso.");
    }

    public void buscarNome(String nome) {
        Calopsita c = calopsitaDao.buscarPorNome(nome);
        if (c != null) {
            System.out.println("Calopsita encontrada:");
            System.out.println("Nome: " + c.getNome());
            System.out.println("Nascimento: " + c.getNascimento());
        } else {
            System.out.println("Calopsita não encontrada.");
        }
    }

    public void buscarNascimento(String nascimento) {
        Calopsita c = calopsitaDao.buscarPorNascimento(nascimento);
        if (c != null) {
            System.out.println("Calopsita encontrada:");
            System.out.println("Nome: " + c.getNome());
            System.out.println("Nascimento: " + c.getNascimento());
        } else {
            System.out.println("Calopsita não encontrada.");
        }
    }

    public void removerNome(String nome) {
        if (calopsitaDao.removerPorNome(nome)) {
            System.out.println("Calopsita removida com sucesso.");
        } else {
            System.out.println("Calopsita não encontrada.");
        }
    }

    public void removerNascimento(String nascimento) {
        if (calopsitaDao.removerPorNascimento(nascimento)) {
            System.out.println("Calopsita removida com sucesso.");
        } else {
            System.out.println("Calopsita não encontrada.");
        }
    }

    public void listarCalopsitas() {
        List<Calopsita> calopsitas = calopsitaDao.listarCalopsitas();
        for (Calopsita c : calopsitas) {
            System.out.println("\nNome: " + c.getNome() + "\nNascimento: " + c.getNascimento());
        }
    }
}
