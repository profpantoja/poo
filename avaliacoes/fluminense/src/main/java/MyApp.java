import controller.clubController;
import controller.playerController;
import controller.teamController;
import controller.matchController;

import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n==== MENU PRINCIPAL ====");
            System.out.println("1 - Gerenciar Clubes");
            System.out.println("2 - Gerenciar Jogadores");
            System.out.println("3 - Gerenciar Times");
            System.out.println("4 - Gerenciar Partidas");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: new clubController().executar();
                break;
                case 2: new playerController().executar();
                break;
                case 3: new teamController().executar();
                break;
                case 4: new matchController().executar();
                break;
                case 0: System.out.println("Encerrando o sistema...");
                break;
                default: System.out.println("Opção inválida.");
                break;
            }
        } while (opcao != 0);
    }
}
