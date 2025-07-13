package view;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import controller.ObjectController;
import model.Object;
import model.TipoObjeto;

public class ObjectScan {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        ObjectController controller = new ObjectController();

        int opcao = 1;

        while (opcao != 0) {
            System.out.println("\n=== MENU OBJETOS ===");
            System.out.println("1 - Adicionar Objeto");
            System.out.println("2 - Listar Objetos");
            System.out.println("3 - Remover Objeto");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.next();

                    System.out.print("Imagem: ");
                    String imagem = sc.next();

                    System.out.print("X: ");
                    int x = sc.nextInt();

                    System.out.print("Y: ");
                    int y = sc.nextInt();

                    System.out.print("Tipo (BOX , RING): ");
                    String tipoStr = sc.next();
                    TipoObjeto tipo;

                    if (tipoStr.equals("BOX")) {
                        tipo = TipoObjeto.BOX;
                    } else if (tipoStr.equals("RING")) {
                        tipo = TipoObjeto.RING;
                    } else{
                        System.out.println("Opção inválida");
                        break;
                    }

                    Object objeto = new Object(nome, imagem, x, y, tipo);
                    controller.create(objeto);
                    System.out.println("Objeto salvo!");
                    break;

                case 2:
                    List<Object> objetos = controller.listar();
                    if (objetos.isEmpty()) {
                        System.out.println("Nenhum objeto listado.");
                    } else {
                        System.out.println("--- Objetos ---");
                        for (int i = 0; i < objetos.size(); i++) {
                            Object obj = objetos.get(i);
                            System.out.println((i + 1) + ". " + obj.getName() + " - Url: " + obj.getImage() + " - Tipo: " + obj.getTipo() + " - Posição: (" + obj.getX() + ", " + obj.getY() + ")");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do objeto a remover: ");
                    String nomeRemover = sc.next();
                    controller.deletar(nomeRemover);
                    System.out.println("Objeto removido");
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
