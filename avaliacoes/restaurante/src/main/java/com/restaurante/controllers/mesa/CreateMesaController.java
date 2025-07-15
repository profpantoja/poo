package com.restaurante.controllers.mesa;

import java.io.IOException;

import com.restaurante.dao.MesaDAO;
import com.restaurante.model.Mesa;
import com.restaurante.view.MesaView;

/**
 * Controller responsável pela criação de mesas no sistema.
 * 
 * Esta classe interage com o usuário através da {@link MesaView} para capturar
 * as informações necessárias sobre a mesa (número e local), cria o objeto {@link Mesa}
 * e persiste seus dados usando a {@link MesaDAO}.
 * 
 * Pode lançar exceções de entrada/saída durante o processo de captura dos dados.
 */
public class CreateMesaController {

    /** Objeto de acesso a dados para mesas. */
    private MesaDAO dao;

    /** Interface de entrada e saída para o usuário. */
    private MesaView view;

    /**
     * Construtor que inicializa os DAOs e Views necessários.
     */
    public CreateMesaController(){
        this.dao = new MesaDAO();
        this.view = new MesaView();
    }

    /**
     * Captura os dados da mesa, cria o objeto Mesa e salva no banco de dados.
     * 
     * Informa no console se a mesa foi adicionada com sucesso.
     * 
     * @throws IOException caso ocorra erro na entrada de dados pelo usuário
     */
    public void adicionarMesa() throws IOException {
        String numero = view.pedirNumeroMesa();
        String local = view.pedirLocalMesa();
        Mesa mesa = new Mesa(numero, local);
        dao.salvar(mesa);
        System.out.println("Mesa adicionada com sucesso!");
    }
}
