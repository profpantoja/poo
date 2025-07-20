package br.cefet.view;

    import java.util.List;
    import java.util.Scanner;
    import br.cefet.model.Atendente;

public class AtendenteView {
    Scanner scanner = new java.util.Scanner(System.in);

    public int getMenuOption(){
        System.out.println("===== Menu Atendente =====");
        System.out.println("1. Cadastrar Atendente");
        System.out.println("2. Remover Atendente");
        System.out.println("3. Listar Atendentes");
        System.out.println("4. Atualizar Atendente");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public Atendente getInformation(){
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
        return new Atendente(nome, cpf, telefone, email, turno, cargo, matricula, salario, 0);
    }

    public void showAtendentes(List<Atendente> atendentes){
        if(!atendentes.isEmpty()){
            System.out.println("----------Lista de Atendentes----------");
            for (Atendente atendente : atendentes){
                atendente.exibirDados();
                System.out.println("----------------------------------------");
            }
        } else {
            exibirMensagem("Não há atendentes cadastrados");
        }
    }

    public int getIdRemover(){
        System.out.print("Digite o ID do atendente a ser removido: ");
        return scanner.nextInt();
    }

    public int getIdUpdate(){
        System.out.print("Digite o ID do atendente a ser atualizado: ");
        return scanner.nextInt();
    }
    
    public void exibirMensagem(String mensagem){
        System.out.println(mensagem);
    }
}
