package assets.controller;

import java.util.List;

import assets.dao.SaberDao;
import assets.model.Saber;
import assets.view.SaberView;

public class SaberController {
    private SaberDao saberDao;
    private static SaberView saberView;
    private Saber saber;

    public SaberController() {
        this.saberDao = new SaberDao(); 
        SaberController.saberView = new SaberView();
    }

    public void createSaber() {
        String dono = SaberView.getSaberOwner();
        String cor = SaberView.getSaberColor();
        String dano = SaberView.getSaberDamage();
        
        int danoInt;
        try {
            danoInt = Integer.parseInt(dano);
        } catch (NumberFormatException e) {
            System.out.println("Dano inválido. Por favor, insira um número inteiro.");
            return;
        }
        
        this.saber = new Saber(cor, danoInt, dono);
        saberDao.addSaber(this.saber);
        SaberView.displaySaber(this.saber);
    }

    public void showSabers() {
        List<Saber> sabers = saberDao.getAllSabers();
        if (sabers.isEmpty()) {
            System.out.println("Nenhum Sabre cadastrado.");
        } else {
            System.out.println("== Lista de Sabres =="); 
            for (Saber localSaber : sabers) {
                System.out.println();
                System.out.println("Cor: " + localSaber.getDescricao() + "\nDano: " + localSaber.getDano() 
                                    + "\nDono: " + localSaber.getOwner());
            }
        }
    }

    public Saber getSaberByColor(String color) {
        Saber catchSaber = saberDao.getSaberByColor(color);
        if (catchSaber != null) {
            SaberView.displaySaber(catchSaber);
        } else {
            System.out.println("Sabre não encontrado.");
        }
        return catchSaber;
    }

    public void removeSaber() {
        saberDao.removeSaber();
    }

}
