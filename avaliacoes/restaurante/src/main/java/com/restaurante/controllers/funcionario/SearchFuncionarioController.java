package com.restaurante.controllers.funcionario;



import com.restaurante.dao.FuncionarioDAO;
import com.restaurante.model.Funcionario;
import com.restaurante.view.FuncionarioView;


public class SearchFuncionarioController {
    private FuncionarioView view = new FuncionarioView();
    private FuncionarioDAO dao = new FuncionarioDAO();

    public void executar() {
        for (Funcionario f : dao.listar()) {
            view.mostrar(f);
        }
    }
}
