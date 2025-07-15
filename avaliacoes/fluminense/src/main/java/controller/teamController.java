package controller;

import dao.teamDAO;
import model.Team;
import view.teamView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class teamController {
    private final teamView view = new teamView();

    public void executar() {
        int opcao;
        do {
            opcao = view.menu();
            switch (opcao) {
    case 1:
        criar();
        break;
    case 2:
        listar();
        break;
    case 3:
        deletar();
        break;
    case 0:
        view.exibirMensagem("Voltando ao menu principal...");
        break;
    default:
        view.exibirMensagem("Opção inválida.");
        break;
}
        } while (opcao != 0);
    }

    private void criar() {
        String nome = view.lerCampo("Nome do time: ");
        String tecnico = view.lerCampo("Técnico: ");
        try {
            teamDAO.salvar(new Team(nome, tecnico));
            view.exibirMensagem("Time salvo!");
        } catch (IOException e) {
            view.exibirMensagem("Erro ao salvar time.");
        }
    }

    private void listar() {
        try {
            List<Team> lista = teamDAO.listar();
            List<String> textos = new ArrayList<>();
            for (Team t : lista) {
                textos.add(t.getNome() + " - Técnico: " + t.getTecnico());
            }
            view.exibirLista(textos);
        } catch (IOException e) {
            view.exibirMensagem("Erro ao listar.");
        }
    }

    private void deletar() {
        String nome = view.lerCampo("Nome do time: ");
        String tecnico = view.lerCampo("Técnico: ");
        try {
            boolean ok = teamDAO.deletar(nome, tecnico);
            view.exibirMensagem(ok ? "Time deletado." : "Time não encontrado.");
        } catch (IOException e) {
            view.exibirMensagem("Erro ao deletar time.");
        }
    }
}