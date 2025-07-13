package view;

import java.io.File;
import java.util.Scanner;
import controller.MonkeyController;

public class MonkeyView {

    public static void main(String[] args) {

        MonkeyController controller = new MonkeyController();

        try {
            int option = 0;
            String fileName = "";
            Scanner sc = new Scanner(System.in);

            do {
                System.out.println("\n----- MENU MACACO -----");
                System.out.println("[1] - CRIAR E SALVAR MACACO");
                System.out.println("[2] - DELETAR MACACO");
                System.out.println("[3] - LER MACACO");
                System.out.println("[4] - SAIR");
                System.out.println("---------------------------");
                System.out.print("Digite a opção desejada: ");

                if (sc.hasNextInt()) {
                    option = sc.nextInt();
                    sc.nextLine(); // limpa o ENTER pendente no buffer
                } else {
                    System.out.println("Entrada inválida. Digite um número.");
                    sc.nextLine(); // descarta entrada inválida
                    continue;
                }

                switch (option) {
                    case 1:
                        System.out.println("\n-----CRIANDO MACACO-----");
                        File file = controller.createMonkey();
                        if (file != null) {
                            System.out.println("Macaco salvo no arquivo: " + file.getName());
                        }
                        break;

                    case 2:
                        System.out.println("\n-----DELETANDO MACACO-----");
                        System.out.print("Digite o nome do arquivo a ser deletado (sem extensão): ");
                        fileName = sc.nextLine();
                        controller.deleteMonkey(fileName);
                        break;

                    case 3:
                        System.out.println("\n-----LENDO MACACO-----");
                        System.out.print("Digite o nome do arquivo a ser lido (sem extensão): ");
                        fileName = sc.nextLine();
                        controller.readMonkey(fileName);
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
