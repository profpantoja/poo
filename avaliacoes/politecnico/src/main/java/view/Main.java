package view;

import java.util.Scanner;

import controller.PolitecnicoController;
import controller.ProfessorController;

public class Main {
    public static void main(String[] args) {
        ProfessorController profController = new ProfessorController();
        PolitecnicoController polController = new PolitecnicoController();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU GERAL =====");
            System.out.println("1 - Gerenciar Professores");
            System.out.println("2 - Gerenciar Politécnicos");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    menuProfessor(sc, profController);
                    break;
                case 2:
                    menuPolitecnico(sc, polController);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
        sc.close();
    }

    public static void menuProfessor(Scanner sc, ProfessorController controller) {
        int opcao;
        do {
            System.out.println("\n--- MENU PROFESSOR ---");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("0 - Voltar");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Apelido: ");
                    String apelido = sc.nextLine();
                    System.out.print("Número Fiscal: ");
                    String numeroFiscal = sc.nextLine();
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("Contrato (horas): ");
                    int contrato = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome do Politécnico: ");
                    String nomePol = sc.nextLine();

                    controller.adicionarProfessor(nome, apelido, numeroFiscal, id, contrato, nomePol);
                    break;
                case 2:
                    controller.listarProfessores();
                    break;
                case 3:
                    System.out.print("ID do professor a remover: ");
                    int idRemover = sc.nextInt();
                    controller.removerProfessor(idRemover);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    public static void menuPolitecnico(Scanner sc, PolitecnicoController controller) {
        int opcao;
        do {
            System.out.println("\n--- MENU POLITÉCNICO ---");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("0 - Voltar");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("URL: ");
                    String url = sc.nextLine();
                    controller.adicionarPolitecnico(nome, url);
                    break;
                case 2:
                    controller.listarPolitecnicos();
                    break;
                case 3:
                    System.out.print("Nome do Politécnico a remover: ");
                    String nomeRemover = sc.nextLine();
                    controller.removerPolitecnico(nomeRemover);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
