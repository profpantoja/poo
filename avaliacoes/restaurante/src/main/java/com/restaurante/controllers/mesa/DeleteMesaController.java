package com.restaurante.controllers.mesa;

import java.io.IOException;

import com.restaurante.dao.MesaDAO;
import com.restaurante.view.MesaView;

public class DeleteMesaController {
    private MesaDAO dao;
    private MesaView view;

    public DeleteMesaController(){
        this.dao = new MesaDAO();
        this.view = new MesaView();
    }

    public void removerMesa() throws IOException {
        String numero = view.pedirNumeroMesa();
        dao.deletar(numero);
        System.out.println("Mesa removida (se existia)!");
    }


}
