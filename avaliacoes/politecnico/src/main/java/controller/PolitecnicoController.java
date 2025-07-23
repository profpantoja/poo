package controller;

import java.util.ArrayList;

import dao.PolitecnicoDAO;
import model.Politecnico;

public class PolitecnicoController {
    PolitecnicoDAO dao = new PolitecnicoDAO();

    public void adicionarPolitecnico(String nome, String url) {
        Politecnico politecnico = new Politecnico(nome);
        politecnico.setUrl(url);
        dao.create(politecnico);
    }

    public void listarPolitecnicos() {
        ArrayList<Politecnico> lista = dao.read();
        for (Politecnico p : lista) {
            p.imprimirCursos(); // Mesmo que esteja vazio, mostra nome e URL
        }
    }

    public void removerPolitecnico(String nome) {
        dao.delete(nome);
    }
}
