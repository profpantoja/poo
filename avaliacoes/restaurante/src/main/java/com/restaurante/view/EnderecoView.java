package com.restaurante.view;

import java.util.List;
import java.util.Scanner;
import com.restaurante.model.Endereco;

/**
 * Classe responsável pela interação com o usuário para operações
 * relacionadas a endereços, incluindo captura e exibição de dados.
 * Utiliza a entrada padrão (Scanner) para capturar dados do usuário.
 * 
 * Fornece métodos para capturar um endereço completo, capturar um CEP,
 * mostrar um endereço individual, mostrar uma lista de endereços e
 * exibir mensagens gerais.
 */
public class EnderecoView {
    
    /** Scanner para entrada de dados via teclado. */
    private Scanner scanner = new Scanner(System.in);

    /**
     * Captura os dados necessários para criar um objeto Endereco,
     * solicitando tipo, número e CEP ao usuário.
     * 
     * @return objeto Endereco criado com os dados capturados
     */
    public Endereco capturarEndereco() {
        System.out.print("Tipo (Rua, Av...): ");
        String tipo = scanner.nextLine();

        System.out.print("Número: ");
        int numero = Integer.parseInt(scanner.nextLine());

        System.out.print("CEP: ");
        String cep = scanner.nextLine();

        return new Endereco(tipo, cep, numero);
    }

    /**
     * Captura o CEP do usuário via entrada padrão.
     * 
     * @return CEP capturado como String
     */
    public String capturarCep() {
        System.out.print("Digite o CEP: ");
        return scanner.nextLine();
    }

    /**
     * Exibe as informações de um endereço formatadas no console.
     * Caso o endereço seja nulo, exibe uma mensagem informando que
     * o endereço não foi encontrado.
     * 
     * @param e endereço a ser exibido
     */
    public void mostrarEndereco(Endereco e) {
        if (e != null) {
            System.out.printf("Endereço: %s, %d, CEP: %s%n", e.getTipo(), e.getNumero(), e.getCep());
        } else {
            System.out.println("Endereço não encontrado.");
        }
    }

    /**
     * Exibe uma lista de endereços no console, formatando cada um.
     * Caso a lista esteja vazia, exibe uma mensagem informando que
     * não há endereços cadastrados.
     * 
     * @param enderecos lista de endereços a ser exibida
     */
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

    /**
     * Exibe uma mensagem genérica no console.
     * 
     * @param msg mensagem a ser exibida
     */
    public void mostrarMensagem(String msg) {
        System.out.println(msg);
    }
}
