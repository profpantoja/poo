package view;

import java.util.*;

public class matchView {
    private final Scanner scanner = new Scanner(System.in);

    public int menu() {
        System.out.println("\n--- Partida ---");
        System.out.println("1 - Criar Partida");
        System.out.println("2 - Listar Partidas");
        System.out.println("3 - Deletar Partida");
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
        if (dados.isEmpty()) System.out.println("Nenhuma partida.");
        else dados.forEach(d -> System.out.println("- " + d));
    }

    public void exibirMensagem(String msg) {
        System.out.println(msg);
    }
}
