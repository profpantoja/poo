package com.restaurante.controllers.funcionario;

import com.restaurante.dao.FuncionarioDAO;
import com.restaurante.model.Funcionario;
import com.restaurante.view.FuncionarioView;

/**
 * Controller responsável por listar todos os funcionários cadastrados no sistema.
 * 
 * Esta classe recupera os dados de todos os funcionários utilizando a {@link FuncionarioDAO}
 * e exibe essas informações ao usuário por meio da {@link FuncionarioView}.
 * 
 * Útil para visualização geral e conferência dos registros de funcionários.
 */
public class SearchFuncionarioController {

    /** Interface de entrada e saída com o usuário. */
    private FuncionarioView view = new FuncionarioView();

    /** Objeto de acesso a dados para funcionários. */
    private FuncionarioDAO dao = new FuncionarioDAO();

    /**
     * Executa a listagem de todos os funcionários cadastrados no sistema.
     * 
     * Recupera a lista de funcionários do DAO e utiliza a view para exibir
     * cada registro ao usuário.
     */
    public void executar() {
        for (Funcionario f : dao.listar()) {
            view.mostrar(f);
        }
    }
}
