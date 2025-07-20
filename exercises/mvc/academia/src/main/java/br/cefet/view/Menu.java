package br.cefet.view;

import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    
    public int getMenuOption(){
        System.out.println("------------Sistema da Academia------------");
        System.out.println("1. Gerênciar atendentes");
        System.out.println("2. Gerênciar treinadores");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
        
    }

    public void exibirMensagem(String msg){
        System.out.println(msg);
    }
    
}