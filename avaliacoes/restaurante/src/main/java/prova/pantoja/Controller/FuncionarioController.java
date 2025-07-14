package prova.pantoja.Controller;

import prova.pantoja.DAO.FuncionarioDAO;
import prova.pantoja.Models.Funcionario;
import prova.pantoja.View.FuncionarioView;
import java.util.List;

public class FuncionarioController {
    private List<Funcionario> funcionarios;
    private FuncionarioView view;
    private FuncionarioDAO funcionarioDAO;

    public FuncionarioController(List<Funcionario> funcionarios, FuncionarioView view) {
        this.funcionarios = funcionarios;
        this.view = view;
        this.funcionarioDAO = new FuncionarioDAO();
        this.funcionarios = funcionarioDAO.carregarFuncionarios();
    }

    public void adicionarFuncionario() {
        Funcionario novoFuncionario = view.criarFuncionario();
        funcionarios.add(novoFuncionario);
        funcionarioDAO.salvarFuncionarios(funcionarios);
        view.exibirMensagem("Funcionário adicionado e salvo!");
    }

    public void removerFuncionario() {
        String ctp = view.obterCTPParaRemover();
        boolean removido = funcionarios.removeIf(f -> f.getCtp().equalsIgnoreCase(ctp));
        if (removido) {
            funcionarioDAO.salvarFuncionarios(funcionarios);
            view.exibirMensagem("Funcionário removido e salvo!");
        } else {
            view.exibirMensagem("Funcionário não encontrado.");
        }
    }

    public void atualizarFuncionario() {
        String ctp = view.obterCTPParaAtualizar();
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCtp().equalsIgnoreCase(ctp)) {
                Funcionario funcionarioAtualizado = view.criarFuncionario();
                funcionario.setNome(funcionarioAtualizado.getNome());
                funcionario.setNumContribuinte(funcionarioAtualizado.getNumContribuinte());
                funcionario.setEndereco(funcionarioAtualizado.getEndereco());
                funcionario.setCtp(funcionarioAtualizado.getCtp());
                funcionario.setCargo(funcionarioAtualizado.getCargo());
                funcionarioDAO.salvarFuncionarios(funcionarios);
                view.exibirMensagem("Funcionário atualizado e salvo!");
                return;
            }
        }
        view.exibirMensagem("Funcionário não encontrado.");
    }

    public void listarFuncionarios() {
        view.exibirFuncionarios(funcionarios);
    }

    public void salvarFuncionarios() {
        funcionarioDAO.salvarFuncionarios(funcionarios);
    }
}