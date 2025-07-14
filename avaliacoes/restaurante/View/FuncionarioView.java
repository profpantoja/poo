package prova.pantoja.View;

import prova.pantoja.Controller.FuncionarioController;
import prova.pantoja.Controller.ProdutoController;
import prova.pantoja.Models.Endereco;
import prova.pantoja.Models.Funcionario;

import java.util.List;
import java.util.Scanner;

public class FuncionarioView {
    private Scanner scan = new Scanner(System.in);

    public void exibirMenuFuncionarios(FuncionarioController controller) {
        int opcao;
        do {
            System.out.println("\n--- Menu Funcionários ---");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Remover Funcionário");
            System.out.println("3. Atualizar Funcionário");
            System.out.println("4. Listar Funcionários");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1: 
                    controller.adicionarFuncionario();
                    break;
                
                case 2: 
                    controller.removerFuncionario();
                    break;
                
                case 3: 
                    controller.atualizarFuncionario();
                    break;
                
                case 4: 
                    controller.listarFuncionarios();
                    break;
                
                case 0: 
                    break;
            }
        } while (opcao != 0);
    }

    public void exibirFuncionarios(List<Funcionario> funcionarios) {
        System.out.println("\n--- Lista de Funcionários ---");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.toString());
        }
        System.out.println("---------------------------");
    }

    public String obterCTPParaRemover() {
        System.out.print("\nCTP do Funcionário a ser removido: ");
        return scan.nextLine();
    }

    public String obterCTPParaAtualizar() {
        System.out.print("\nCTP do Funcionário a ser atualizado: ");
        return scan.nextLine();
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
