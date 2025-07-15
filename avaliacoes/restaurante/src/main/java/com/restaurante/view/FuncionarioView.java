package com.restaurante.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.restaurante.model.Funcionario;
import com.restaurante.model.Mesa;

/**
 * Classe responsável pela interação com o usuário para operações relacionadas a funcionários,
 * incluindo captura de dados e exibição de informações.
 * 
 * Permite capturar informações de um funcionário, associando mesas já existentes ou criando novas mesas,
 * capturar CPF para buscas ou remoções, mostrar detalhes do funcionário e exibir mensagens genéricas.
 * 
 */
public class FuncionarioView {
    private Scanner scanner = new Scanner(System.in);

    /**
     * Captura os dados para criar um funcionário associando mesas já existentes.
     * Exibe a lista de mesas disponíveis para seleção e permite que o usuário selecione múltiplas mesas.
     * 
     * @param mesasExistentes lista de mesas já cadastradas e disponíveis para associação
     * @return um objeto Funcionario criado com os dados fornecidos e as mesas selecionadas
     */
    public Funcionario capturarFuncionarioComMesasExistentes(List<Mesa> mesasExistentes) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("CTP: ");
        String ctp = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();

        List<Mesa> mesasSelecionadas = new ArrayList<>();
        String opcao = "s";

        while (opcao.equalsIgnoreCase("s")) {
            System.out.println("Mesas disponíveis:");
            for (int i = 0; i < mesasExistentes.size(); i++) {
                Mesa m = mesasExistentes.get(i);
                System.out.printf("%d - Mesa %s - Local: %s%n", i + 1, m.getNumero(), m.getLocal());
            }
            System.out.print("Escolha o número da mesa para associar: ");
            int escolha;
            try {
                escolha = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, tente novamente.");
                continue;
            }

            if (escolha >= 1 && escolha <= mesasExistentes.size()) {
                Mesa mesaEscolhida = mesasExistentes.get(escolha - 1);
                if (!mesasSelecionadas.contains(mesaEscolhida)) {
                    mesasSelecionadas.add(mesaEscolhida);
                } else {
                    System.out.println("Mesa já selecionada.");
                }
            } else {
                System.out.println("Opção inválida.");
            }

            System.out.print("Deseja adicionar outra mesa? (s/n): ");
            opcao = scanner.nextLine();
        }

        return new Funcionario(nome, cpf, null, ctp, cargo, mesasSelecionadas);
    }

    /**
     * Captura os dados para criar um funcionário incluindo mesas criadas manualmente.
     * Permite adicionar múltiplas mesas informando número e local.
     * 
     * @return um objeto Funcionario criado com os dados fornecidos e mesas informadas manualmente
     */
    public Funcionario capturarFuncionario() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("CTP: ");
        String ctp = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();

        List<Mesa> mesas = new ArrayList<>();
        String opcao = "s";

        while (opcao.equalsIgnoreCase("s")) {
            System.out.print("Número da mesa: ");
            String numero = scanner.nextLine();
            System.out.print("Local da mesa: ");
            String local = scanner.nextLine();

            mesas.add(new Mesa(numero, local));

            System.out.print("Deseja adicionar outra mesa? (s/n): ");
            opcao = scanner.nextLine();
        }

        return new Funcionario(nome, cpf, null, ctp, cargo, mesas);
    }

    /**
     * Captura o CPF do funcionário via entrada padrão.
     * 
     * @return CPF capturado como String
     */
    public String capturarCpf() {
        System.out.print("Digite o CPF do funcionário: ");
        return scanner.nextLine();
    }

    /**
     * Exibe as informações de um funcionário formatadas no console,
     * incluindo nome, CPF, CTP, cargo e mesas associadas.
     * 
     * @param f funcionário cujos dados serão exibidos
     */
    public void mostrar(Funcionario f) {
        System.out.println("Nome: " + f.getNome());
        System.out.println("CPF: " + f.getCpf());
        System.out.println("CTP: " + f.getCtp());
        System.out.println("Cargo: " + f.getCargo());
        if (f.getMesas() != null && !f.getMesas().isEmpty()) {
            System.out.println("Mesas:");
            for (Mesa m : f.getMesas()) {
                System.out.println("  - Mesa " + m.getNumero() + " - Local: " + m.getLocal());
            }
        }
        System.out.println("--------------------------");
    }

    /**
     * Exibe uma mensagem genérica no console.
     * 
     * @param msg mensagem a ser exibida
     */
    public void mostrarMensagem(String msg) {
        System.out.println(msg);
    }

    /**
     * Retorna o objeto Scanner usado para captura de entrada.
     * 
     * @return Scanner associado à entrada padrão
     */
    public Scanner getScanner() {
        return scanner;
    }
}
