package com.restaurante.controllers.mesa;

import java.io.IOException;
import java.util.List;

import com.restaurante.dao.MesaDAO;
import com.restaurante.model.Mesa;
import com.restaurante.view.MesaView;

public class SearchMesaController {
    private MesaDAO dao;
    private MesaView view;

    public SearchMesaController(){
        this.dao = new MesaDAO();
        this.view = new MesaView();
    }

    public void listarMesas() throws IOException {
        List<Mesa> mesas = dao.listar();
        view.exibirMesas(mesas);
    }
}
