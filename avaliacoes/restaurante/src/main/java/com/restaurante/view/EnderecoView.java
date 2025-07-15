package com.restaurante.view;

import java.util.List;
import java.util.Scanner;
import com.restaurante.model.Endereco;

public class EnderecoView {
    private Scanner scanner = new Scanner(System.in);

    public Endereco capturarEndereco() {
        System.out.print("Tipo (Rua, Av...): ");
        String tipo = scanner.nextLine();

        System.out.print("Número: ");
        int numero = Integer.parseInt(scanner.nextLine());

        System.out.print("CEP: ");
        String cep = scanner.nextLine();

        return new Endereco(tipo, cep, numero);
    }

    public String capturarCep() {
        System.out.print("Digite o CEP: ");
        return scanner.nextLine();
    }

    public void mostrarEndereco(Endereco e) {
        if (e != null) {
            System.out.printf("Endereço: %s, %d, CEP: %s%n", e.getTipo(), e.getNumero(), e.getCep());
        } else {
            System.out.println("Endereço não encontrado.");
        }
    }

    public void mostrarListaEnderecos(List<Endereco> enderecos) {
        if (enderecos.isEmpty()) {
            System.out.println("Nenhum endereço cadastrado.");
        } else {
            System.out.println("Lista de endereços:");
            for (Endereco e : enderecos) {
                System.out.printf("- %s, %d, CEP: %s%n", e.getTipo(), e.getNumero(), e.getCep());
            }
        }
    }

    public void mostrarMensagem(String msg) {
        System.out.println(msg);
    }
}
