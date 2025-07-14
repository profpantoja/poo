package prova.pantoja.Controller;

import prova.pantoja.DAO.ProdutoDAO;
import prova.pantoja.Models.Produto;
import prova.pantoja.View.ProdutoView;
import java.util.List;
import java.util.Scanner;

public class ProdutoController {
    private List<Produto> produtos;
    private ProdutoView view;
    private ProdutoDAO produtoDAO;
    private Scanner scan = new Scanner(System.in);

    public ProdutoController(List<Produto> produtos, ProdutoView view) {
        this.produtos = produtos;
        this.view = view;
        this.produtoDAO = new ProdutoDAO();
        this.produtos = produtoDAO.carregarProdutos();
    }

    public void adicionarProduto() {
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
        
        Produto novoProduto = new Produto(nome, valVenda, valProduto, IVA);
        produtos.add(novoProduto);
        produtoDAO.salvarProdutos(produtos);
        System.out.println("Produto adicionado e salvo!");
    }

    public void removerProduto() {
        System.out.print("\nNome do Produto a ser removido: ");
        String nome = scan.nextLine();
        boolean removido = false;
        
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                produtos.remove(produto);
                removido = true;
                break;
            }
        }
        
        if (removido) {
            produtoDAO.salvarProdutos(produtos);
            System.out.println("Produto removido e salvo!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void atualizarProduto() {
        System.out.print("\nNome do Produto a ser atualizado: ");
        String nome = scan.nextLine();
        boolean encontrado = false;
        
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                System.out.println("\n--- Atualizar Produto ---");
                System.out.print("Novo Nome: ");
                String novoNome = scan.nextLine();
                System.out.print("Novo Preço de Venda: ");
                float novoValVenda = scan.nextFloat();
                System.out.print("Novo Preço de Custo: ");
                float novoValProduto = scan.nextFloat();
                System.out.print("Novo IVA (%): ");
                float novoIVA = scan.nextFloat();
                scan.nextLine();
                
                produto.setNome(novoNome);
                produto.setValVenda(novoValVenda);
                produto.setValProduto(novoValProduto);
                produto.setIVA(novoIVA);
                produtoDAO.salvarProdutos(produtos);
                System.out.println("Produto atualizado e salvo!");
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("Produto não encontrado.");
        }
    }

    public void listarProdutos() {
        System.out.println("\n--- Lista de Produtos ---");
        for (Produto produto : produtos) {
            System.out.println(produto.toString());
        }
        System.out.println("------------------------");
    }

    public void salvarProdutos() {
        produtoDAO.salvarProdutos(produtos);
    }
}