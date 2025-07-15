package controller;

import dao.clubDAO;
import model.Club;
import view.clubView;

import java.io.IOException;
import java.util.*;


public class clubController {
    private final clubView view = new clubView();

    public void executar() {
        int opcao;
        do {
            opcao = view.menu();
            switch (opcao) {
                case 1: criar();
                break;
                case 2: listar();
                break;
                case 3:  deletar();
                break;
                case 0:  view.exibirMensagem("Voltando ao menu principal...");
                break;
                default:  view.exibirMensagem("Opção inválida.");
                break;
            }
        } while (opcao != 0);
    }

    private void criar() {
        String nome = view.lerCampo("Nome do clube: ");
        String cidade = view.lerCampo("Cidade: ");
        try {
            clubDAO.salvar(new Club(nome, cidade));
            view.exibirMensagem("Clube salvo!");
        } catch (IOException e) {
            e.printStackTrace(); 
             view.exibirMensagem("Erro ao salvar: " + e.getMessage());
    
        }
    }

    private void listar() {
        try {
            List<Club> lista = clubDAO.listar();
            List<String> textos = new ArrayList<>();
            for (Club c : lista) {
                textos.add(c.getNome() + " - " + c.getCidade());
            }
            view.exibirLista(textos);
        } catch (IOException e) {
            view.exibirMensagem("Erro ao listar.");
        }
    }

    private void deletar() {
        String nome = view.lerCampo("Nome do clube: ");
        String cidade = view.lerCampo("Cidade: ");
        try {
            boolean ok = clubDAO.deletar(nome, cidade);
            view.exibirMensagem(ok ? "Clube deletado." : "Clube não encontrado.");
        } catch (IOException e) {
            view.exibirMensagem("Erro ao deletar.");
        }
    }
}
