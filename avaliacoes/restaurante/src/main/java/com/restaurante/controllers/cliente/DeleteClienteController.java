package com.restaurante.controllers.cliente;
import com.restaurante.dao.ClienteDAO;

import com.restaurante.view.ClienteView;

public class DeleteClienteController {
    private ClienteView view = new ClienteView();
    private ClienteDAO dao = new ClienteDAO();

    public void executar() {
        String cpf = view.capturarCpf();
        boolean removido = dao.remover(cpf);

        if (removido) {
            view.mostrarMensagem("Cliente removido com sucesso!");
        } else {
            view.mostrarMensagem("Cliente não encontrado.");
        }
    }
}
