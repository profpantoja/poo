package br.cefet.controller;
import br.cefet.view.*;
import br.cefet.dao.*;
import br.cefet.model.*;

public class TreinadorController {
    private TreinadorDAO tdao = new TreinadorDAO();
    private TreinadorView tview = new TreinadorView();

    public void startTreinador(){
        int option;
        do {
            option = tview.getMenuOption();

            switch(option){
                case 1:
                    registerTreinador();
                    break;
                case 2:
                    deleteTreinador();
                    break;
                case 3:
                    showTreinadores();
                    break;
                case 4:
                    updateTreinador();
                    break;
                case 0:
                    tview.exibirMensagem("Saindo...");
                    break;
                default:
                    tview.exibirMensagem("Opção inválida.");
            }
        }while(option != 0);
    }

    public void registerTreinador(){
        Treinador novoTreinador = tview.getInformation();
        novoTreinador.setIdTreinador(tdao.getNextId());
        tdao.saveOnCSVFile(novoTreinador);
        tview.exibirMensagem("Treinador cadastrado com sucesso!");
    }

    public void deleteTreinador(){
        int id = tview.getIdRemover();
        boolean sucess = tdao.delete(id);
        if(sucess){
            tview.exibirMensagem("Treinador removido com sucesso");
        }else{
            tview.exibirMensagem("Treinador não encontrado.");
        }
    }

    public void showTreinadores(){
        tview.showTreinadores(tdao.getTreinadores());
    }

    public void updateTreinador(){
        int id = tview.getIdUpdate();
        Treinador treinador = tdao.getTreinadorById(id);
        if(treinador != null){
            Treinador updatedTreinador = tview.getInformation();
            updatedTreinador.setIdTreinador(id);
            tdao.update(updatedTreinador);
            tview.exibirMensagem("Treinador atualizado com sucesso!");
        } else {
            tview.exibirMensagem("Treinador não encontrado.");
        }
    }
}
