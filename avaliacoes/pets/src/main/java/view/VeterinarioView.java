package view;

import java.util.Scanner;
import controller.VeterinarioController;

public class VeterinarioView {

    public void adicionar(Scanner scanner) {
        VeterinarioController controller = new VeterinarioController();
        System.out.println("--- Adicionar Novo Veterinário ---");
        System.out.println("Digite o nome do Veterinário : ");
        String nome = scanner.nextLine();
        System.out.println("Digite o apelido do Veterinário : ");
        String apelido = scanner.nextLine();
        controller.adicionarVeterinario(nome, apelido);
        System.out.println("Veterinário adicionado com sucesso!");
    }

    public void listar() {
        VeterinarioController controller = new VeterinarioController();
        controller.listarVeterinario();
    }

    public void remover(Scanner scanner) {
        VeterinarioController controller = new VeterinarioController();
        System.out.println("--- Remover Tutor ---");
        System.out.println("Digite o nome do veterinario a ser removido: ");
        String nomeRemover = scanner.nextLine();
        controller.removerVeterinario(nomeRemover);
        System.out.println(">> Veterinário removido com sucesso!");
    }

}
