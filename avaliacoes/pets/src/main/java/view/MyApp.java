package view;

import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VeterinarioView veterinarioView = new VeterinarioView();
        TutorView tutorView = new TutorView();
        // Futuramente: VeterinarioView veterinarioView = new VeterinarioView();

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n--- MENU PRINCIPAL DO SISTEMA PETS ---");
            System.out.println("1. Adicionar Novo Tutor");
            System.out.println("2. Listar Tutores");
            System.out.println("3. Remover Tutor");
            System.out.println("4. Adicionar Novo Veterinário");
            System.out.println("5. Listar Veterinários");
            System.out.println("6. Remover Veterinário");
            System.out.println("0. Sair do Sistema");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    tutorView.adicionar(scanner);
                    break;
                case 2:
                    tutorView.listar();
                    break;
                case 3:
                    tutorView.remover(scanner);
                    break;
                case 4:
                    veterinarioView.adicionar(scanner);
                    break;
                case 5:
                    veterinarioView.listar();
                    break;
                case 6:
                    veterinarioView.remover(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        scanner.close();
    }
}
