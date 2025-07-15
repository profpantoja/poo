package com.restaurante.controllers.cliente;

import com.restaurante.dao.ClienteDAO;
import com.restaurante.model.Cliente;
import com.restaurante.view.ClienteView;

/**
 * Controller responsável por listar todos os clientes cadastrados no sistema.
 * 
 * Esta classe utiliza a {@link ClienteDAO} para recuperar os clientes do banco de dados
 * e a {@link ClienteView} para exibi-los ao usuário.
 * 
 */
public class SearchClienteController {

    /** Interface de entrada e saída para o usuário. */
    private ClienteView view = new ClienteView();

    /** Objeto de acesso a dados para clientes. */
    private ClienteDAO dao = new ClienteDAO();

    /**
     * Executa a listagem de todos os clientes cadastrados.
     * 
     * Recupera a lista de clientes por meio do DAO e exibe cada cliente na tela.
     */
    public void executar() {
        for (Cliente c : dao.listar()) {
            view.mostrar(c);
        }
    }
}
