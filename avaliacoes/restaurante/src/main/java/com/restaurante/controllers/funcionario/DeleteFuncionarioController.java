package com.restaurante.controllers.funcionario;
import com.restaurante.dao.FuncionarioDAO;
import com.restaurante.view.FuncionarioView;

public class DeleteFuncionarioController {
    private FuncionarioView view = new FuncionarioView();
    private FuncionarioDAO dao = new FuncionarioDAO();

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
