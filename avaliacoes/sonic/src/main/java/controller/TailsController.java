package controller;

import java.util.List;

import model.Tails;
import dao.TailsDAO;



public class TailsController {
    private TailsDAO tailsDAO;

    public TailsController() {
        this.tailsDAO = new TailsDAO();
    }

    public void criarTails(String nome, int vida, String image, int x, int y) {
        Tails tails = new Tails(nome, vida, image, x, y);
        tailsDAO.salvarTails(tails);
    }

    public List<Tails> listarTails() {
        return tailsDAO.listarTails();
    }

    public boolean deletarTails(String nome) {
        return tailsDAO.deletarTails(nome);
    }

}
