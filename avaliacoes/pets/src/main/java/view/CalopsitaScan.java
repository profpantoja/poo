package view;

import java.util.Scanner;

import controller.CalopsitaController;

public class CalopsitaScan {
    Scanner scan = new Scanner(System.in);
    int index = 1;
    CalopsitaController controller = new CalopsitaController();

    public void menuCalopsita() {
        while (index != 0) {
            System.out.println("\nMENU DA CALOPSITA:\n[1] - Criar Calopsita\n[2] - Ler Calopsita\n[3] - Remover Calopsita\n[4] - Listar Calopsitas\n[0] - Voltar");
            index = scan.nextInt();
            scan.nextLine();

            switch (index) {
                case 1:
                    criarCalopsita();
                    break;

                case 2:
                    lerCalopsita();
                    break;

                case 3:
                    removerCalopsita();
                    break;

                case 4:
                    controller.listarCalopsitas();
                    break;

                case 0: 
                    System.out.println("Voltando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void criarCalopsita() {
        System.out.println("Nome:");
        String nome = scan.nextLine();

        System.out.println("Nascimento:");
        String nascimento = scan.nextLine();

        controller.criarCalopsita(nome, nascimento);
    }

    private void lerCalopsita() {
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

    private void removerCalopsita() {
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
