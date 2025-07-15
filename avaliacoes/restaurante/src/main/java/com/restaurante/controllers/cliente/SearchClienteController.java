package com.restaurante.controllers.cliente;
import com.restaurante.dao.ClienteDAO;
import com.restaurante.model.Cliente;
import com.restaurante.view.ClienteView;

public class SearchClienteController {
    private ClienteView view = new ClienteView();
    private ClienteDAO dao = new ClienteDAO();

    public void executar() {
        for (Cliente c : dao.listar()) {
            view.mostrar(c);
        }
    }
}
