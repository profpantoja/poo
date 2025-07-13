package controller;

import java.util.List;

import dao.SonicDAO;
import model.Sonic;

public class SonicController {
    private SonicDAO sonicDAO;

    public SonicController() {
        this.sonicDAO = new SonicDAO();
    }

    public void criarSonic(String name, int life, String image, int x, int y) {
        Sonic sonic = new Sonic(name, life, image, x, y);
        sonicDAO.salvarSonic(sonic);
    }

    public List<Sonic> listarSonics() {
        return sonicDAO.listarSonic();
    }

    public boolean deletarSonic(String name) {
        return sonicDAO.deletarSonic(name);
    }

}
