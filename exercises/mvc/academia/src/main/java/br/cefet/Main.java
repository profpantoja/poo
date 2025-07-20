package br.cefet;

import br.cefet.view.*;
import br.cefet.controller.*;

public class Main {
    public static void main(String[] args){
        Menu menu = new Menu();
        AtendenteController atendenteController = new AtendenteController();
        TreinadorController treinadorController = new TreinadorController();
        int option;

        do{
            option = menu.getMenuOption();
            switch(option){
                case 1:
                    atendenteController.startAtendente();
                    break;
                case 2:
                    treinadorController.startTreinador();
                    break;
                case 0:
                    menu.exibirMensagem("Encerrando sistema.");
                    break;
                default:
                    menu.exibirMensagem("Opção inválida.");
            }
        }while(option != 0);
    }
}
