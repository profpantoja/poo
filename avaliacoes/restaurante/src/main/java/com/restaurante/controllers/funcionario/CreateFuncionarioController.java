package com.restaurante.controllers.funcionario;

import java.util.List;

import com.restaurante.dao.FuncionarioDAO;
import com.restaurante.dao.MesaDAO;
import com.restaurante.model.Funcionario;
import com.restaurante.model.Mesa;
import com.restaurante.view.FuncionarioView;

/**
 * Controller responsável por cadastrar um novo funcionário no sistema.
 * 
 * Esta classe interage com a {@link FuncionarioView} para capturar os dados do funcionário,
 * incluindo a seleção das mesas existentes para associar,
 * e utiliza a {@link FuncionarioDAO} para persistir os dados no armazenamento.
 * 
 * Caso não existam mesas cadastradas, informa o usuário para cadastrá-las antes.
 * Exibe mensagens de sucesso ou erro durante o processo.
 */
public class CreateFuncionarioController {
    
    /** Interface para interação com o usuário. */
    private FuncionarioView funcionarioView = new FuncionarioView();
    
    /** Objeto de acesso a dados para funcionários. */
    private FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    
    /** Objeto de acesso a dados para mesas. */
    private MesaDAO mesaDAO = new MesaDAO();

    /**
     * Executa o fluxo de cadastro do funcionário.
     * 
     * Passos:
     * - Lista as mesas já cadastradas no sistema.
     * - Caso não existam mesas, informa para cadastrar mesas antes.
     * - Solicita os dados do funcionário, permitindo associação com mesas existentes.
     * - Salva o funcionário no armazenamento.
     * - Exibe mensagens de sucesso ou falha na operação.
     */
    public void executar() {
        try {
            List<Mesa> mesasExistentes = mesaDAO.listar();

            if (mesasExistentes.isEmpty()) {
                funcionarioView.mostrarMensagem("Não há mesas cadastradas. Cadastre mesas antes de criar um funcionário.");
                return;
            }

            Funcionario funcionario = funcionarioView.capturarFuncionarioComMesasExistentes(mesasExistentes);
            funcionarioDAO.salvar(funcionario);
            funcionarioView.mostrarMensagem("Funcionário cadastrado com sucesso!");
        } catch (Exception e) {
            funcionarioView.mostrarMensagem("Erro ao cadastrar funcionário: " + e.getMessage());
        }
    }
}
