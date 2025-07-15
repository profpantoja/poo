package com.restaurante.controllers.funcionario;

import java.util.List;

import com.restaurante.dao.FuncionarioDAO;
import com.restaurante.dao.MesaDAO;
import com.restaurante.model.Funcionario;
import com.restaurante.model.Mesa;
import com.restaurante.view.FuncionarioView;

public class CreateFuncionarioController {
    
    private FuncionarioView funcionarioView = new FuncionarioView();
    private FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    private MesaDAO mesaDAO = new MesaDAO();

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
