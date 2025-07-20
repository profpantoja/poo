package br.cefet.view;

import java.util.List;
import java.util.Scanner;
import br.cefet.model.Treinador;

public class TreinadorView {
    Scanner scanner = new java.util.Scanner(System.in);

    public int getMenuOption(){
        System.out.println("===== Menu Treinador =====");
        System.out.println("1. Cadastrar Treinador");
        System.out.println("2. Remover Treinadores");
        System.out.println("3. Listar Treinador");
        System.out.println("4. Atualizar Treinador");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public Treinador getInformation(){
        scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Turno: ");
        String turno = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();
        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        return new Treinador(nome, cpf, telefone, email, turno, cargo, matricula, salario, 0);
    }

    public void showTreinadores(List<Treinador> treinadores){
        if(!treinadores.isEmpty()){
            System.out.println("----------Lista de Treinadores----------");
            for (Treinador treinador : treinadores){
                treinador.exibirDados();
                System.out.println("----------------------------------------");
            }
        }else{
            exibirMensagem("Não há treinadores cadastrados");
        }
    }

    public int getIdRemover(){
        System.out.println("Escolha por ID o treinador a remover: ");
        int idTreinadorRemove = scanner.nextInt();
        return idTreinadorRemove;
    }

    public int getIdUpdate(){
        System.out.println("Escolha por ID o treinador a atualizar: ");
        int idTreinadorUpdate = scanner.nextInt();
        return idTreinadorUpdate;
    }

    public void exibirMensagem(String msg){
        System.out.println(msg);
    }
}
