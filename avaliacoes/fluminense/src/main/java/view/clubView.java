package view;

import java.util.*;

public class clubView {
    private final Scanner scanner = new Scanner(System.in);

    public int menu() {
        System.out.println("\n--- Clube ---");
        System.out.println("1 - Criar Clube");
        System.out.println("2 - Listar Clubes");
        System.out.println("3 - Deletar Clube");
        System.out.println("0 - Voltar");
        System.out.print("Escolha: ");
        int op = scanner.nextInt();
        scanner.nextLine();
        return op;
    }

    public String lerCampo(String label) {
        System.out.print(label);
        return scanner.nextLine();
    }

    public void exibirLista(List<String> dados) {
        if (dados.isEmpty()) System.out.println("Nenhum registro.");
        else dados.forEach(d -> System.out.println("- " + d));
    }

    public void exibirMensagem(String msg) {
        System.out.println(msg);
    }
}