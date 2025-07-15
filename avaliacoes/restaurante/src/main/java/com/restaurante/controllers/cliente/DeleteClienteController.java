package com.restaurante.controllers.cliente;

import com.restaurante.dao.ClienteDAO;
import com.restaurante.view.ClienteView;

/**
 * Controller responsável por excluir um cliente do sistema.
 * 
 * Esta classe interage com a camada de visualização ({@link ClienteView})
 * para capturar o CPF do cliente a ser removido e utiliza a {@link ClienteDAO}
 * para realizar a exclusão no banco de dados.
 * 
 * Exibe mensagens ao usuário informando se a remoção foi bem-sucedida ou não.
 * 
 */
public class DeleteClienteController {

    /** Interface de entrada e saída para o usuário. */
    private ClienteView view = new ClienteView();

    /** Objeto de acesso a dados para clientes. */
    private ClienteDAO dao = new ClienteDAO();

    /**
     * Executa o processo de remoção de um cliente com base no CPF fornecido pelo usuário.
     * 
     * Caso o cliente seja encontrado e removido com sucesso, uma mensagem de confirmação
     * é exibida. Caso contrário, informa que o cliente não foi encontrado.
     */
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
