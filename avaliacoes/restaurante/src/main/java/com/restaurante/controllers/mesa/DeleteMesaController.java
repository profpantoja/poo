package com.restaurante.controllers.mesa;

import java.io.IOException;

import com.restaurante.dao.MesaDAO;
import com.restaurante.view.MesaView;

/**
 * Controller responsável pela remoção de mesas do sistema.
 * 
 * Esta classe utiliza a {@link MesaView} para capturar o número da mesa que deve ser removida
 * e a {@link MesaDAO} para deletar a mesa da base de dados.
 * 
 * Exibe uma mensagem no console informando que a mesa foi removida, caso existisse.
 * 
 * Pode lançar exceções de entrada/saída durante a captura dos dados.
 */
public class DeleteMesaController {

    /** Objeto de acesso a dados para mesas. */
    private MesaDAO dao;

    /** Interface de entrada e saída para o usuário. */
    private MesaView view;

    /**
     * Construtor que inicializa os DAOs e Views necessários.
     */
    public DeleteMesaController(){
        this.dao = new MesaDAO();
        this.view = new MesaView();
    }

    /**
     * Captura o número da mesa e remove a mesa correspondente do banco de dados.
     * 
     * Exibe mensagem informativa no console, independentemente de a mesa existir ou não.
     * 
     * @throws IOException caso ocorra erro na entrada de dados pelo usuário
     */
    public void removerMesa() throws IOException {
        String numero = view.pedirNumeroMesa();
        dao.deletar(numero);
        System.out.println("Mesa removida (se existia)!");
    }
}
