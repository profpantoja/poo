package controller;

import java.util.List;

import dao.GatoDao;
import model.Gato;

public class GatoController {

    GatoDao gatoDao = new GatoDao();

    public void criarGato(String nome, String nascimento) {
        Gato g = new Gato(nome, nascimento);
        gatoDao.adicionarGato(g);
        System.out.println("Gato adicionado com sucesso.");
    }

    public void buscarPorNome(String nome) {
        Gato g = gatoDao.buscarPorNome(nome);
        if (g != null) {
            System.out.println("Gato encontrado:");
            System.out.println("Nome: " + g.getNome());
            System.out.println("Nascimento: " + g.getNascimento());
        } else {
            System.out.println("Gato não encontrado.");
        }
    }

    public void buscarPorNascimento(String nascimento) {
        Gato g = gatoDao.buscarPorNascimento(nascimento);
        if (g != null) {
            System.out.println("Gato encontrado:");
            System.out.println("Nome: " + g.getNome());
            System.out.println("Nascimento: " + g.getNascimento());
        } else {
            System.out.println("Gato não encontrado.");
        }
    }

    public void removerPorNome(String nome) {
        if (gatoDao.removerPorNome(nome)) {
            System.out.println("Gato removido com sucesso.");
        } else {
            System.out.println("Gato não encontrado.");
        }
    }

    public void removerPorNascimento(String nascimento) {
        if (gatoDao.removerPorNascimento(nascimento)) {
            System.out.println("Gato removido com sucesso.");
        } else {
            System.out.println("Gato não encontrado.");
        }
    }

    public void listarGatos() {
        List<Gato> gatos = gatoDao.listarGatos();
        if (gatos.isEmpty()) {
            System.out.println("Nenhum gato cadastrado.");
        } else {
            for (Gato g : gatos) {
                System.out.println("\nNome: " + g.getNome() + "\nNascimento: " + g.getNascimento());
            }
        }
    }
}
