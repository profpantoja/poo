package view;

import java.util.List;
import java.util.Scanner;

import controller.TailsController;
import model.Tails;

public class TailsView {
     public static void main(String[] args) {
        TailsController tailsController = new TailsController();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Criar Tails");
            System.out.println("2 - Listar os Tails");
            System.out.println("3 - Deletar Tails");
            System.out.println("4 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {
                case 1:
                    System.out.print("Escolha o nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite a vida: ");
                    int vida = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Escolha uma imagem: ");
                    String image = sc.nextLine();
                    System.out.print("Digite a posição X: ");
                    int x = sc.nextInt();
                    System.out.print("Digite a posição Y: ");
                    int y = sc.nextInt();
                    tailsController.criarTails(nome, vida, image, x, y);
                    System.out.println("Tails criado.");
                    break;
                case 2:
                    List<Tails> os_tails = tailsController.listarTails();
                    System.out.println("Lista dos Tails: ");
                    for (Tails t : os_tails) {
                        System.out.println("Nome: " + t.getName() + " \n Vida: " + t.getLife() + " \n Posição: (" + t.getX() + "," + t.getY() + ")");
                    }
                    break;
                case 3:
                    System.out.print("Nome do Tails que você deseja remover: ");
                    String nomeTailsDeletar = sc.nextLine();
                    if (tailsController.deletarTails(nomeTailsDeletar)) {
                        System.out.println("Tails removido com sucesso.");
                    } else {
                        System.out.println("Tails inexistente.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 4);
        sc.close();
    }
}
