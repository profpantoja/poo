package prova.pantoja.Controller;

import prova.pantoja.DAO.FuncionarioDAO;
import prova.pantoja.Models.Funcionario;
import prova.pantoja.Models.Endereco;
import prova.pantoja.View.FuncionarioView;
import java.util.List;
import java.util.Scanner;

public class FuncionarioController {
    private List<Funcionario> funcionarios;
    private FuncionarioView view;
    private FuncionarioDAO funcionarioDAO;
    private Scanner scan = new Scanner(System.in);

    public FuncionarioController(List<Funcionario> funcionarios, FuncionarioView view) {
        this.funcionarios = funcionarios;
        this.view = view;
        this.funcionarioDAO = new FuncionarioDAO();
        this.funcionarios = funcionarioDAO.carregarFuncionarios();
    }

    public void adicionarFuncionario() {
        System.out.println("\n--- Criar Novo Funcionário ---");
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Número Contribuinte: ");
        String numContribuinte = scan.nextLine();
        System.out.print("Tipo Endereço: ");
        String tipo = scan.nextLine();
        System.out.print("CEP: ");
        String cep = scan.nextLine();
        System.out.print("Número: ");
        int numero = scan.nextInt();
        scan.nextLine();
        System.out.print("CTP: ");
        String ctp = scan.nextLine();
        System.out.print("Cargo: ");
        String cargo = scan.nextLine();

        Endereco endereco = new Endereco(tipo, cep, numero);
        Funcionario novoFuncionario = new Funcionario(nome, numContribuinte, endereco, ctp, cargo);
        funcionarios.add(novoFuncionario);
        funcionarioDAO.salvarFuncionarios(funcionarios);
        System.out.println("Funcionário adicionado e salvo!");
    }

    public void removerFuncionario() {
        System.out.print("\nCTP do Funcionário a ser removido: ");
        String ctp = scan.nextLine();
        boolean removido = false;
        
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCtp().equals(ctp)) {
                funcionarios.remove(funcionario);
                removido = true;
                break;
            }
        }
        
        if (removido) {
            funcionarioDAO.salvarFuncionarios(funcionarios);
            System.out.println("Funcionário removido e salvo!");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    public void atualizarFuncionario() {
        System.out.print("\nCTP do Funcionário a ser atualizado: ");
        String ctp = scan.nextLine();
        boolean encontrado = false;
        
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCtp().equals(ctp)) {
                System.out.println("\n--- Atualizar Funcionário ---");
                System.out.print("Novo Nome: ");
                String novoNome = scan.nextLine();
                System.out.print("Novo Número Contribuinte: ");
                String novoNumContribuinte = scan.nextLine();
                System.out.print("Novo Tipo Endereço: ");
                String novoTipo = scan.nextLine();
                System.out.print("Novo CEP: ");
                String novoCep = scan.nextLine();
                System.out.print("Novo Número: ");
                int novoNumero = scan.nextInt();
                scan.nextLine();
                System.out.print("Novo CTP: ");
                String novoCtp = scan.nextLine();
                System.out.print("Novo Cargo: ");
                String novoCargo = scan.nextLine();

                Endereco novoEndereco = new Endereco(novoTipo, novoCep, novoNumero);
                funcionario.setNome(novoNome);
                funcionario.setNumContribuinte(novoNumContribuinte);
                funcionario.setEndereco(novoEndereco);
                funcionario.setCtp(novoCtp);
                funcionario.setCargo(novoCargo);
                
                funcionarioDAO.salvarFuncionarios(funcionarios);
                System.out.println("Funcionário atualizado e salvo!");
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("Funcionário não encontrado.");
        }
    }

    public void listarFuncionarios() {
        System.out.println("\n--- Lista de Funcionários ---");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.toString());
        }
        System.out.println("---------------------------");
    }

    public void salvarFuncionarios() {
        funcionarioDAO.salvarFuncionarios(funcionarios);
    }
}