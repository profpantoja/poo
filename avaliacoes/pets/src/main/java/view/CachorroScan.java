package view;

import java.util.Scanner;

import controller.CachorroController;

public class CachorroScan {
    Scanner scan = new Scanner(System.in);
    int index = 1;
    CachorroController controller = new CachorroController();

    public void menuCachorro() {
        while (index != 0) {
            System.out.println("\nMENU DO CACHORRO:\n[1] - Criar Cachorro\n[2] - Ler Cachorro\n[3] - Remover Cachorro\n[4] - Listar Cachorros\n[0] - Voltar");
            index = scan.nextInt();
            scan.nextLine();

            switch (index) {
                case 1:
                    criarCachorro();
                    break;

                case 2:
                    lerCachorro();
                    break;

                case 3:
                    removerCachorro();
                    break;

                case 4:
                    controller.listarCachorros();
                    break;

                case 0:
                    System.out.println("Voltando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void criarCachorro() {
        System.out.println("Nome:");
        String nome = scan.nextLine();

        System.out.println("Nascimento:");
        String nascimento = scan.nextLine();

        controller.criarCachorro(nome, nascimento);
    }

    private void lerCachorro() {
        System.out.println("\nBuscar por:\n[1] Nome\n[2] Nascimento");
        int index2 = scan.nextInt();
        scan.nextLine();

        switch (index2) {
            case 1:
                System.out.println("Nome: ");
                String lerNome = scan.nextLine();
                controller.buscarNome(lerNome);
                break;

            case 2:
                System.out.println("Nascimento: ");
                String lerNascimento = scan.nextLine();
                controller.buscarNascimento(lerNascimento);
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }

    private void removerCachorro() {
        System.out.println("\nRemover por:\n[1] Nome\n[2] Nascimento");
        int index3 = scan.nextInt();
        scan.nextLine();

        switch (index3) {
            case 1:
                System.out.println("Nome: ");
                String removerNome = scan.nextLine();
                controller.removerNome(removerNome);
                break;

            case 2:
                System.out.println("Nascimento: ");
                String removerNascimento = scan.nextLine();
                controller.removerNascimento(removerNascimento);
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }
}
