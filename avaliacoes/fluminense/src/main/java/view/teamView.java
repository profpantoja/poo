package view;

import java.util.*;

public class teamView {
    private final Scanner scanner = new Scanner(System.in);

    public int menu() {
        System.out.println("\n--- Time ---");
        System.out.println("1 - Criar Time");
        System.out.println("2 - Listar Times");
        System.out.println("3 - Deletar Time");
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
        if (dados.isEmpty()) System.out.println("Nenhum time.");
        else dados.forEach(d -> System.out.println("- " + d));
    }

    public void exibirMensagem(String msg) {
        System.out.println(msg);
    }
}
