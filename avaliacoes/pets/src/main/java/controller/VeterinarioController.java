package controller;

import java.util.ArrayList;
import dao.VeterinarioDAO;
import model.Veterinario;

public class VeterinarioController {
    private VeterinarioDAO dao = new VeterinarioDAO();

    public void adicionarVeterinario(String nome, String apelido) {
        Veterinario novoVeterinario = new Veterinario(nome, apelido);
        dao.create(novoVeterinario);
    }

    public void listarVeterinario() {
        ArrayList<Veterinario> lista = dao.read();
        System.out.println("\n--- Lista de Veterinairos Cadastrados ---");
        if (lista.isEmpty()) {
            System.out.println("Nenhum tutor cadastrado.");
        } else {
            for (Veterinario v : lista) {
                System.out.println(v.getInfo());
            }
        }
        System.out.println("-----------------------------------");
    }

    public void removerVeterinario(String nome) {
        dao.delete(nome);
    }

}
