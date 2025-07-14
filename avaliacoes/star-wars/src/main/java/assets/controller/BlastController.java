package assets.controller;

import java.util.List;

import assets.dao.BlastDao;
import assets.model.Blast;
import assets.view.BlastView;

public class BlastController {
    private BlastDao blastDao;
    private static BlastView blastView;
    private Blast blast;

    public BlastController() {
        this.blastDao = new BlastDao(); 
        BlastController.blastView = new BlastView();
    }

    public void createBlast() {
        String dono = BlastView.getBlastOwner();
        String nome = BlastView.getBlastName();
        String dano = BlastView.getBlastDamage();
        int danoInt;
        try {
            danoInt = Integer.parseInt(dano);
        } catch (NumberFormatException e) {
            System.out.println("Dano inválido. Por favor, insira um número inteiro.");
            return;
        }
        
        this.blast = new Blast(nome, danoInt, dono);
        blastDao.addBlast(this.blast);
        BlastView.displayBlast(this.blast);
    }

    public void showBlasts() {
        List<Blast> blasts = blastDao.getAllBlasts();
        if (blasts.isEmpty()) {
            System.out.println("Nenhum Blaster cadastrado.");
        } else {
            System.out.println("== Lista de Blasters ==");
            for (Blast localBlast : blasts) {
                System.out.println();
                System.out.println("Nome: " + localBlast.getDescricao() + "\nDano: " + localBlast.getDano() 
                                    + "\nDono: " + localBlast.getOwner());
            }
        }
    }

    public Blast getBlastByName(String name) {
        Blast catchBlast = blastDao.getBlastByName(name);
        if (catchBlast != null) {
            BlastView.displayBlast(catchBlast);
        } else {
            System.out.println("Blaster não encontrado.");
        }
        return catchBlast;
    }

    public void removeBlast() {
        blastDao.removeBlast();
    }

}
