package view;

import java.util.Scanner;
import controller.ClienteController;

public class ClienteScan {

    public void executarCadastro() {
        Scanner scanner = new Scanner(System.in);
        ClienteController controller = new ClienteController();

        System.out.println("=== Cadastro de Cliente ===");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        controller.cadastrarCliente(nome, cpf, telefone);
        System.out.println("✔ Cliente cadastrado com sucesso!\n");
    }

    public static void main(String[] args) {
        new ClienteScan().executarCadastro();
    }
}
