package com.restaurante.view;

import java.util.Scanner;
import com.restaurante.model.Mesa;
import java.util.List;

/**
 * Classe responsável pela interação com o usuário para operações
 * relacionadas a mesas, incluindo captura e exibição de dados.
 * Utiliza a entrada padrão (Scanner) para capturar dados do usuário.
 * 
 * Fornece métodos para pedir o número e o local da mesa,
 * além de exibir uma lista de mesas cadastradas.
 * 
 */
public class MesaView {

    /** Scanner para entrada de dados via teclado. */
    private Scanner scanner = new Scanner(System.in);

    /**
     * Solicita ao usuário o número da mesa.
     * 
     * @return número da mesa informado pelo usuário
     */
    public String pedirNumeroMesa() {
        System.out.print("Número da mesa: ");
        return scanner.nextLine();
    }

    /**
     * Solicita ao usuário o local da mesa.
     * 
     * @return local da mesa informado pelo usuário
     */
    public String pedirLocalMesa() {
        System.out.print("Local da mesa: ");
        return scanner.nextLine();
    }

    /**
     * Exibe a lista de mesas no console.
     * Caso a lista esteja vazia, exibe uma mensagem informando que não há mesas cadastradas.
     * 
     * @param mesas lista de mesas a ser exibida
     */
    public void exibirMesas(List<Mesa> mesas) {
        if (mesas.isEmpty()) {
            System.out.println("Nenhuma mesa cadastrada.");
        } else {
            for (Mesa m : mesas) {
                System.out.println("Mesa " + m.getNumero() + " - Local: " + m.getLocal());
            }
        }
    }
}
