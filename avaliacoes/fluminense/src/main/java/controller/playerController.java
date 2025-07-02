package controller;

import dao.playerDAO;
import model.Player;
import view.playerView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class playerController {
    private final playerView view = new playerView();

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
        String nome = view.lerCampo("Nome do jogador: ");
        String posicao = view.lerCampo("Posição: ");
        try {
            playerDAO.salvar(new Player(nome, posicao));
            view.exibirMensagem("Jogador salvo!");
        } catch (IOException e) {
            view.exibirMensagem("Erro ao salvar jogador.");
        }
    }

    private void listar() {
        try {
            List<Player> lista = playerDAO.listar();
            List<String> textos = new ArrayList<>();
            for (Player p : lista) {
                textos.add(p.getNome() + " - " + p.getPosicao());
            }
            view.exibirLista(textos);
        } catch (IOException e) {
            view.exibirMensagem("Erro ao listar.");
        }
    }

    private void deletar() {
        String nome = view.lerCampo("Nome do jogador: ");
        String posicao = view.lerCampo("Posição: ");
        try {
            boolean ok = playerDAO.deletar(nome, posicao);
            view.exibirMensagem(ok ? "Jogador deletado." : "Jogador não encontrado.");
        } catch (IOException e) {
            view.exibirMensagem("Erro ao deletar jogador.");
        }
    }
}