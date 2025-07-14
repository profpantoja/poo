package controller;

import java.util.List;

import dao.CachorroDao;
import model.Cachorro;

public class CachorroController {
    CachorroDao cachorroDao = new CachorroDao();

    public void criarCachorro(String nome, String nascimento) {
        Cachorro c = new Cachorro(nome, nascimento);
        cachorroDao.adicionarCachorro(c);
        System.out.println("Cachorro adicionado com sucesso.");
    }

    public void buscarNome(String nome) {
        Cachorro c = cachorroDao.buscarPorNome(nome);
        if (c != null) {
            System.out.println("Cachorro encontrado:");
            System.out.println("Nome: " + c.getNome());
            System.out.println("Nascimento: " + c.getNascimento());
        } else {
            System.out.println("Cachorro não encontrado.");
        }
    }

    public void buscarNascimento(String nascimento) {
        Cachorro c = cachorroDao.buscarPorNascimento(nascimento);
        if (c != null) {
            System.out.println("Cachorro encontrado:");
            System.out.println("Nome: " + c.getNome());
            System.out.println("Nascimento: " + c.getNascimento());
        } else {
            System.out.println("Cachorro não encontrado.");
        }
    }

    public void removerNome(String nome) {
        if (cachorroDao.removerPorNome(nome)) {
            System.out.println("Cachorro removido com sucesso.");
        } else {
            System.out.println("Cachorro não encontrado.");
        }
    }

    public void removerNascimento(String nascimento) {
        if (cachorroDao.removerPorNascimento(nascimento)) {
            System.out.println("Cachorro removido com sucesso.");
        } else {
            System.out.println("Cachorro não encontrado.");
        }
    }

    public void listarCachorros() {
        List<Cachorro> cachorros = cachorroDao.listarCachorros();
        for (Cachorro c : cachorros) {
            System.out.println("\nNome: " + c.getNome() + "\nNascimento: " + c.getNascimento());
        }
    }
}
