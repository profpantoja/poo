package view;

import java.util.Scanner;
import controller.GatoController;

public class GatoScan {
    Scanner scan = new Scanner(System.in);
    int index = 1;
    GatoController controller = new GatoController();

    public void menuGato() {
        while (index != 0) {
            System.out.println("\nMENU DO GATO:");
            System.out.println("[1] - Criar Gato\n[2] - Ler Gato\n[3] - Remover Gato\n[4] - Listar Gatos\n[0] - Voltar");
            index = scan.nextInt();
            scan.nextLine();

            switch (index) {
                case 1:
                    criarGato();
                    break;

                case 2:
                    lerGato();
                    break;

                case 3:
                    removerGato();
                    break;

                case 4:
                    controller.listarGatos();
                    break;

                case 0:
                    System.out.println("Voltando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void criarGato() {
        System.out.println("Nome:");
        String nome = scan.nextLine();

        System.out.println("Nascimento:");
        String nascimento = scan.nextLine();

        controller.criarGato(nome, nascimento);
    }

    private void lerGato() {
        System.out.println("\nBuscar por:\n[1] Nome\n[2] Nascimento");
        int opcao = scan.nextInt();
        scan.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Nome: ");
                String nome = scan.nextLine();
                controller.buscarPorNome(nome);
                break;

            case 2:
                System.out.println("Nascimento: ");
                String nascimento = scan.nextLine();
                controller.buscarPorNascimento(nascimento);
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }

    private void removerGato() {
        System.out.println("\nRemover por:\n[1] Nome\n[2] Nascimento");
        int opcao = scan.nextInt();
        scan.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Nome: ");
                String nome = scan.nextLine();
                controller.removerPorNome(nome);
                break;

            case 2:
                System.out.println("Nascimento: ");
                String nascimento = scan.nextLine();
                controller.removerPorNascimento(nascimento);
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }
}
