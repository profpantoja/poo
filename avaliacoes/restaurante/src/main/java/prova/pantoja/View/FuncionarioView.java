package prova.pantoja.View;

import prova.pantoja.Controller.FuncionarioController;
import prova.pantoja.Controller.ProdutoController;
import prova.pantoja.Models.Endereco;
import prova.pantoja.Models.Funcionario;

import java.util.List;
import java.util.Scanner;

public class FuncionarioView {
    private Scanner scanner = new Scanner(System.in);

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
            opcao = scanner.nextInt();
            scanner.nextLine();

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

    public Funcionario criarFuncionario() {
        System.out.println("\n--- Criar Novo Funcionário ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Número Contribuinte: ");
        String numContribuinte = scanner.nextLine();
        System.out.print("Tipo Endereço: ");
        String tipo = scanner.nextLine();
        System.out.print("CEP: ");
        String cep = scanner.nextLine();
        System.out.print("Número: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("CTP: ");
        String ctp = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();

        Endereco endereco = new Endereco(tipo, cep, numero);
        return new Funcionario(nome, numContribuinte, endereco, ctp, cargo);
    }

    public String obterCTPParaRemover() {
        System.out.print("\nCTP do Funcionário a ser removido: ");
        return scanner.nextLine();
    }

    public String obterCTPParaAtualizar() {
        System.out.print("\nCTP do Funcionário a ser atualizado: ");
        return scanner.nextLine();
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
