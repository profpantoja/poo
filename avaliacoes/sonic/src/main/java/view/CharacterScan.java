package view;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import controller.CharacterController;
import model.Character;

public class CharacterScan {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        CharacterController controller = new CharacterController();

        int opcao = 1;

        while (opcao != 0) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Adicionar Personagem");
            System.out.println("2 - Listar Personagens");
            System.out.println("3 - Remover Personagem");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.next();

                    System.out.print("Vida: ");
                    int vida = sc.nextInt();

                    System.out.print("Imagem: ");
                    String imagem = sc.next();

                    System.out.print("X: ");
                    int x = sc.nextInt();

                    System.out.print("Y: ");
                    int y = sc.nextInt();

                    Character personagem = new Character(nome, vida, imagem, x, y);
                    controller.create(personagem);
                    System.out.println("Personagem salvo!");
                    break;

                case 2:
                    List<Character> personagens = controller.listar();
                    if (personagens.isEmpty()) {
                        System.out.println("Nenhum personagem listado.");
                    } else {
                        System.out.println("--- Personagens ---");
                        for (int i = 0; i < personagens.size(); i++) {
                            Character person = personagens.get(i);
                            System.out.println((i + 1) + ". " + person.getName() + " - Url: " + person.getImage() + " - Vida: " + person.getLife() + " - Posição: (" + person.getX() + ", " + person.getY() + ")");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do personagem a remover: ");
                    String nomeRemover = sc.next();
                    controller.deletar(nomeRemover);
                    System.out.println("Personagem removido");
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        sc.close();
    }
}    