package com.restaurante.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.restaurante.model.Funcionario;
import com.restaurante.model.Mesa;

public class FuncionarioView {
    private Scanner scanner = new Scanner(System.in);

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

    public String capturarCpf() {
        System.out.print("Digite o CPF do funcionário: ");
        return scanner.nextLine();
    }

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

    public void mostrarMensagem(String msg) {
        System.out.println(msg);
    }

    public Scanner getScanner() {
        return scanner;
    }
}
