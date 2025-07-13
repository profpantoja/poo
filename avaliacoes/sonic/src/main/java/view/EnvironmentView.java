package view;

import java.io.File;
import java.util.Scanner;
import controller.EnvironmentController;

public class EnvironmentView {

    public static void main(String[] args) {

        EnvironmentController controller = new EnvironmentController();

        try {
            int option = 0;
            String fileName = "";
            Scanner sc = new Scanner(System.in);

            do {
                System.out.println("\n----- MENU ENVIRONMENT -----");
                System.out.println("[1] - CRIAR E SALVAR AMBIENTE");
                System.out.println("[2] - DELETAR AMBIENTE");
                System.out.println("[3] - LER AMBIENTE");
                System.out.println("[4] - SAIR");
                System.out.println("-----------------------------");
                System.out.print("Digite a opção desejada: ");

                if (sc.hasNextInt()) {
                    option = sc.nextInt();
                    sc.nextLine();
                } else {
                    System.out.println("Entrada inválida. Digite um número.");
                    sc.nextLine(); 
                    continue;
                }

                switch (option) {
                    case 1:
                        System.out.println("\n----- CRIANDO AMBIENTE -----");
                        File file = controller.createEnvironment();
                        if (file != null) {
                            System.out.println("Arquivo criado: " + file.getName());
                        }
                        break;
                    case 2:
                        System.out.println("\n----- DELETAR AMBIENTE -----");
                        System.out.print("Digite o nome do arquivo (sem extensão): ");
                        fileName = sc.nextLine();
                        controller.deleteEnvironment(fileName);
                        break;
                    case 3:
                        System.out.println("\n----- LER AMBIENTE -----");
                        System.out.print("Digite o nome do arquivo (sem extensão): ");
                        fileName = sc.nextLine();
                        controller.readEnvironment(fileName);
                        break;
                    case 4:
                        System.out.println("Saindo do menu...");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                        break;
                }

            } while (option != 4);

            sc.close();

        } catch (Exception e) {
            System.out.println("\nOcorreu um erro:");
            e.printStackTrace();
        }
    }
}
