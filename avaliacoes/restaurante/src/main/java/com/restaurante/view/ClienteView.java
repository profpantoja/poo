package com.restaurante.view;

import java.util.Scanner;
import com.restaurante.model.Cliente;

public class ClienteView {
    private Scanner scanner = new Scanner(System.in);

    public Cliente capturarCliente() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Número de Fidelidade: ");
        int numFid = Integer.parseInt(scanner.nextLine());

        return new Cliente(nome, cpf, null, numFid); // Endereço será setado depois
    }

    public String capturarCpf() {
        System.out.print("Digite o CPF do cliente: ");
        return scanner.nextLine();
    }

    public void mostrar(Cliente c) {
        System.out.println("Nome: " + c.getNome());
        System.out.println("CPF: " + c.getCpf());
        System.out.println("Número de Fidelidade: " + c.getNumFid());
        if (c.getEndereco() != null)
            System.out.println("Endereço: " + c.getEndereco().getEndereco() + " - " + c.getEndereco().getCep());
        System.out.println("--------------------------");
    }

    public void mostrarMensagem(String msg) {
        System.out.println(msg);
    }

    public Scanner getScanner() {
        return scanner;
    }
}
