package prova.pantoja;

import prova.pantoja.Controller.FuncionarioController;
import prova.pantoja.Controller.ProdutoController;
import prova.pantoja.Models.Funcionario;
import prova.pantoja.Models.Produto;
import prova.pantoja.View.FuncionarioView;
import prova.pantoja.View.ProdutoView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        List<Funcionario> funcionarios = new ArrayList<>();

        ProdutoView produtoView = new ProdutoView();
        FuncionarioView funcionarioView = new FuncionarioView();

        ProdutoController produtoController = new ProdutoController(produtos, produtoView);
        FuncionarioController funcionarioController = new FuncionarioController(funcionarios, funcionarioView);

        Scanner scan = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Gerenciar Funcionários");
            System.out.println("2. Gerenciar Produtos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    funcionarioView.exibirMenuFuncionarios(funcionarioController);
                    break;
                case 2: 
                    produtoView.exibirMenuProdutos(produtoController);
                    break;
                case 0:
                    funcionarioController.salvarFuncionarios();
                    produtoController.salvarProdutos();
                    System.out.println("Dados salvos. Saindo...");
                    break;
            }
        } while (opcao != 0);
    }
    
}
