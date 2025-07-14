package prova.pantoja.View;

import prova.pantoja.Controller.ProdutoController;
import prova.pantoja.Models.Produto;
import java.util.List;
import java.util.Scanner;

public class ProdutoView {
    private Scanner scan = new Scanner(System.in);

    public void exibirMenuProdutos(ProdutoController controller) {
        int opcao;
        do {
            System.out.println("\n--- Menu Produtos ---");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Atualizar Produto");
            System.out.println("4. Listar Produtos");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    controller.adicionarProduto();
                    break;
                case 2:
                    controller.removerProduto();
                    break;
                case 3:
                    controller.atualizarProduto();
                    break;
                case 4:
                    controller.listarProdutos();
                    break;
                case 0:
                    break;
            }
        } while (opcao != 0);
    }

    public void exibirProdutos(List<Produto> produtos) {
        System.out.println("\n--- Lista de Produtos ---");
        for (Produto produto : produtos) {
            System.out.println(produto.toString());
        }
        System.out.println("------------------------");
    }

    public Produto criarProduto() {
        System.out.println("\n--- Criar Novo Produto ---");
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Preço de Venda: ");
        float valVenda = scan.nextFloat();
        System.out.print("Preço de Custo: ");
        float valProduto = scan.nextFloat();
        System.out.print("IVA (%): ");
        float IVA = scan.nextFloat();
        scan.nextLine();
        return new Produto(nome, valVenda, valProduto, IVA);
    }

    public String obterNomeProdutoParaRemover() {
        System.out.print("\nNome do Produto a ser removido: ");
        return scan.nextLine();
    }

    public String obterNomeProdutoParaAtualizar() {
        System.out.print("\nNome do Produto a ser atualizado: ");
        return scan.nextLine();
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}