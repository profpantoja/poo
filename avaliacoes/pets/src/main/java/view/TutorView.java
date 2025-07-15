package view;

import java.util.Scanner;
import controller.TutorController;

public class TutorView {

    // Cada método representa uma "tela" ou "interação" específica.

    public void adicionar(Scanner scanner) {
        TutorController controller = new TutorController();
        System.out.println("\n--- Adicionar Novo Tutor ---");
        System.out.print("Digite o nome do tutor: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o apelido do tutor: ");
        String apelido = scanner.nextLine();
        controller.adicionarTutor(nome, apelido);
        System.out.println(">> Tutor adicionado com sucesso!");
    }

    public void listar() {
        TutorController controller = new TutorController();
        controller.listarTutores();
    }

    public void remover(Scanner scanner) {
        TutorController controller = new TutorController();
        System.out.println("\n--- Remover Tutor ---");
        System.out.print("Digite o nome do tutor a ser removido: ");
        String nomeRemover = scanner.nextLine();
        controller.removerTutor(nomeRemover);
        System.out.println(">> Tutor removido com sucesso!");
    }
}
