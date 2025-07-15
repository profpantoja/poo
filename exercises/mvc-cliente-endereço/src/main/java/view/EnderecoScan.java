package view;

import java.util.Scanner;
import controller.EnderecoController;

public class EnderecoScan {

    public void executarCadastro() {
        Scanner scanner = new Scanner(System.in);
        EnderecoController controller = new EnderecoController();

        System.out.println("=== Cadastro de Endereço ===");

        System.out.print("Rua: ");
        String rua = scanner.nextLine();

        System.out.print("Número: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Bairro: ");
        String bairro = scanner.nextLine();

        System.out.print("ID do Cliente: ");
        int idCliente = scanner.nextInt();

        controller.cadastrarEndereco(rua, numero, bairro, idCliente);
        System.out.println("✔ Endereço cadastrado com sucesso!\n");
    }

    public static void main(String[] args) {
        new EnderecoScan().executarCadastro();
    }
}
