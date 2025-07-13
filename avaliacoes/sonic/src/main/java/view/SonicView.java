package view;

import java.util.List;
import java.util.Scanner;

import controller.SonicController;
import model.Sonic;

public class SonicView {
    public static void main(String[] args) {
        SonicController sonicController = new SonicController();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Criar Sonic");
            System.out.println("2 - Listar Sonics");
            System.out.println("3 - Deletar Sonic");
            System.out.println("4 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {
                case 1:
                    System.out.print("Escolha o nome: ");
                    String name = sc.nextLine();
                    System.out.print("Digite a vida: ");
                    int life = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Escolha uma imagem: ");
                    String image = sc.nextLine();
                    System.out.print("Digite a posição X: ");
                    int x = sc.nextInt();
                    System.out.print("Digite a posição Y: ");
                    int y = sc.nextInt();
                    sonicController.criarSonic(name, life, image, x, y);
                    System.out.println("Sonic criado.");
                    break;
                case 2:
                    List<Sonic> sonics = sonicController.listarSonics();
                    System.out.println("Lista de Sonics: ");
                    for (Sonic s : sonics) {
                        System.out.println("Nome: " + s.getName() + " \n Vida: " + s.getLife() + " \n Posição: (" + s.getX() + "," + s.getY() + ")");
                    }
                    break;
                case 3:
                    System.out.print("Nome do Sonic que você deseja remover: ");
                    String nomeSonicDeletar = sc.nextLine();
                    if (sonicController.deletarSonic(nomeSonicDeletar)) {
                        System.out.println("Sonic removido com sucesso.");
                    } else {
                        System.out.println("Sonic inexistente.");
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
