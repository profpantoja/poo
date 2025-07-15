package com.restaurante.controllers.mesa;

import java.io.IOException;

import com.restaurante.dao.MesaDAO;
import com.restaurante.model.Mesa;
import com.restaurante.view.MesaView;

public class CreateMesaController {
    private MesaDAO dao;
    private MesaView view;

    public CreateMesaController(){
        this.dao = new MesaDAO();
        this.view = new MesaView();
    }

    public void adicionarMesa() throws IOException {
        String numero = view.pedirNumeroMesa();
        String local = view.pedirLocalMesa();
        Mesa mesa = new Mesa(numero, local);
        dao.salvar(mesa);
        System.out.println("Mesa adicionada com sucesso!");
    }

    
}
