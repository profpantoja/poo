package com.restaurante.controllers.mesa;

import java.io.IOException;
import java.util.List;

import com.restaurante.dao.MesaDAO;
import com.restaurante.model.Mesa;
import com.restaurante.view.MesaView;

/**
 * Controller responsável por listar as mesas cadastradas no sistema.
 * 
 * Esta classe utiliza a {@link MesaDAO} para recuperar a lista de mesas
 * e a {@link MesaView} para exibir as mesas ao usuário.
 * 
 * Pode lançar exceções de entrada/saída durante a operação de exibição.
 */
public class SearchMesaController {

    /** Objeto de acesso a dados para mesas. */
    private MesaDAO dao;

    /** Interface de entrada e saída para o usuário. */
    private MesaView view;

    /**
     * Construtor que inicializa os DAOs e Views necessários.
     */
    public SearchMesaController(){
        this.dao = new MesaDAO();
        this.view = new MesaView();
    }

    /**
     * Recupera a lista de mesas do banco de dados e as exibe ao usuário.
     * 
     * @throws IOException caso ocorra erro na operação de exibição
     */
    public void listarMesas() throws IOException {
        List<Mesa> mesas = dao.listar();
        view.exibirMesas(mesas);
    }
}
