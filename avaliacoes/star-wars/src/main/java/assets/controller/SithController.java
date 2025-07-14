package assets.controller;


import java.util.List;

import assets.dao.SithDao;
import assets.model.Sith;
import assets.view.SithView;
public class SithController {
    private SithDao sithDao;
    private SithView sithView;
    private Sith sith;
    
    public SithController() {
        this.sithDao   = new SithDao();
        this.sithView  = new SithView();
    }
    
    public void createSith() {
        String nome      = sithView.getSithNome();
        String sobrenome = sithView.getSithSobrenome();
        String sexo      = sithView.getSithSexo();
        String titulo    = sithView.getSithTitulo();
        this.sith = new Sith(nome, sobrenome, sexo, titulo);
        sithDao.addSith(this.sith);
        sithView.displaySith(this.sith);
    }

        
        
        public void showSith() {
                List<Sith> siths = sithDao.getAllSiths();
                if (siths.isEmpty()) {
                    System.out.println("Nenhum Sith cadastrado.");
                } else {
                    System.out.println("== Lista de Siths ==");
                    for (Sith sith : siths) {
                        System.out.println();
                        System.out.println("Nome:"+sith.getNome() + "\nSobre Nome: " + sith.getSobrenome() + "\nSexo: "+sith.getSexo()+" \nTitulo: " + sith.getTitulo());

                    }
                }
        }
    public Sith getSithByName(String name) {
        Sith sith = sithDao.getSithByName(name);
        if (sith != null) {
            sithView.displaySith(sith);
        } else {
            System.out.println("Sith não encontrado.");
        }
        return sith;

    }

    public void showAllSiths(Sith[] siths) {
            sithView.displayAllSiths(siths);
        }

    public void removeSith() {
        sithDao.removeSith();
    }

}
