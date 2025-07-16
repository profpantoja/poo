package controllers;

import java.util.List;

import DAO.MesaDao;
import models.Mesa;

public class MesaController {

    private Mesa mesa;
    private MesaDao mesaDAO = new MesaDao();

    public void createMesa(String num, String local){

        Mesa mesa = new Mesa(num, local);

        mesaDAO.add(mesa);
    }

    public List<Mesa> readMesas(){
        return mesaDAO.getAll();
    }

    public boolean deleteMesa(int id){

        if(id < 0){
            throw new IllegalArgumentException("ID não pode ser negativo");
        }
        
        return mesaDAO.delete(id);
    }

}