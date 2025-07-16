package views;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.FuncionarioController;
import models.Funcionario;

public class FuncionarioScan {
    
    public Scanner scan = new Scanner(System.in);
    private FuncionarioController controller = new FuncionarioController();

    public void start(){

        int opcao;

        do{

            opcao = showMenu();

            switch(opcao){

                case 1:
                    
                    getFuncionarioDetails();
                    System.out.println("Funcionário criado com sucesso");
                break;

                case 2:
                    ArrayList<Funcionario> funcionarios = (ArrayList<Funcionario>) controller.readFuncionarios();
                    showFuncionarios(funcionarios);
                break;

                case 3:

                    int id = getId();
                    boolean removed = controller.deleteFuncionario(id);

                    if(removed){
                        System.out.println("Funcionário removido com sucesso");
                    }
                break;

                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao != 0);

        System.out.println("Saindo do fluxo de funcionários...");
    }

    public static void main(String[] args) {
        
        FuncionarioScan view = new FuncionarioScan();
        view.start();
    }


    public int showMenu(){
        System.out.println("Escolha a opção: ");
        System.out.println("0: Sair ");
        System.out.println("1: Criar");
        System.out.println("2: Ler");
        System.out.println("3: Deletar ");
        
        int opcao = Integer.parseInt(scan.nextLine());

        return opcao;
    }

    public void getFuncionarioDetails(){

        System.out.println("Nome: ");
        String nome = scan.nextLine();

        System.out.println("CPF: ");
        String cpf = scan.nextLine();

        System.out.println("Cargo: ");
        String cargo = scan.nextLine();

        System.out.println("CTPS: ");
        String ctps = scan.nextLine();


        controller.creatFuncionario(nome, cpf, cargo, ctps);
    }

    public void showFuncionarios(ArrayList<Funcionario> funcionarios){

        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum item encontrado.");
            return;
        }

        for (Funcionario funcionario : funcionarios) {
            System.out.println("ID: " + funcionario.getId());
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("Cargo: " + funcionario.getCargo());
            System.out.println("CTPS: " + funcionario.getCtps());
            System.out.println();
        }
    }

    public int getId(){
        System.out.println("ID: ");
        int id = Integer.parseInt(scan.nextLine());

        return id;
    }

}
