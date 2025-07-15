package com.restaurante.controllers.funcionario;

import com.restaurante.dao.FuncionarioDAO;
import com.restaurante.view.FuncionarioView;

/**
 * Controller responsável por excluir um funcionário do sistema com base no CPF.
 * 
 * Esta classe interage com a {@link FuncionarioView} para capturar o CPF do funcionário
 * e utiliza a {@link FuncionarioDAO} para realizar a remoção no banco de dados.
 * 
 * Informa ao usuário se a remoção foi bem-sucedida ou se o CPF não foi encontrado.
 */
public class DeleteFuncionarioController {

    /** Interface de entrada e saída com o usuário. */
    private FuncionarioView view = new FuncionarioView();

    /** Objeto de acesso a dados para funcionários. */
    private FuncionarioDAO dao = new FuncionarioDAO();

    /**
     * Executa o processo de remoção de um funcionário com base no CPF.
     * 
     * Caso o funcionário seja encontrado e removido com sucesso,
     * exibe uma mensagem de confirmação. Caso contrário,
     * informa que o funcionário não foi encontrado.
     */
    public void executar() {
        String cpf = view.capturarCpf();
        boolean removido = dao.remover(cpf);

        if (removido) {
            view.mostrarMensagem("Funcionário removido com sucesso!");
        } else {
            view.mostrarMensagem("Funcionário não encontrado.");
        }
    }
}
