package view;

import java.util.*;

public class playerView {
    private final Scanner scanner = new Scanner(System.in);

    public int menu() {
        System.out.println("\n--- Jogador ---");
        System.out.println("1 - Criar Jogador");
        System.out.println("2 - Listar Jogadores");
        System.out.println("3 - Deletar Jogador");
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
        if (dados.isEmpty()) System.out.println("Nenhum jogador.");
        else dados.forEach(d -> System.out.println("- " + d));
    }

    public void exibirMensagem(String msg) {
        System.out.println(msg);
    }
}
