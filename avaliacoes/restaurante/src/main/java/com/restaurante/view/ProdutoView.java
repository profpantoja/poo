package com.restaurante.view;

import java.util.Scanner;
import java.util.List;
import com.restaurante.model.Produto;

/**
 * Classe responsável pela interface de entrada e saída de dados relacionada aos produtos.
 * Utiliza Scanner para capturar dados do usuário e exibe informações dos produtos no console.
 * 
 * Permite capturar o nome e o valor do produto com validação para entrada numérica,
 * além de exibir uma lista de produtos formatada.
 * 
 */
public class ProdutoView {
    /** Scanner para entrada de dados do usuário */
    private Scanner scanner;

    /**
     * Construtor que inicializa o Scanner para leitura da entrada padrão.
     */
    public ProdutoView() {
        scanner = new Scanner(System.in);
    }

    /**
     * Solicita ao usuário o nome do produto.
     * 
     * @return nome do produto informado pelo usuário
     */
    public String pedirNomeProduto() {
        System.out.print("Nome do produto: ");
        return scanner.nextLine();
    }

    /**
     * Solicita ao usuário o valor do produto e valida a entrada.
     * Repete a solicitação enquanto o valor informado não for válido (float).
     * 
     * @return valor do produto informado pelo usuário
     */
    public float pedirValorProduto() {
        float valor = 0;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Valor do produto: ");
                valor = Float.parseFloat(scanner.nextLine());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Tente novamente.");
            }
        }

        return valor;
    }

    /**
     * Exibe a lista de produtos no console.
     * Caso a lista esteja vazia, exibe uma mensagem informando que nenhum produto foi encontrado.
     * 
     * @param produtos lista de produtos a ser exibida
     */
    public void exibirProdutos(List<Produto> produtos) {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto encontrado.");
        } else {
            for (Produto p : produtos) {
                System.out.printf("Produto: %-20s | Valor: R$ %.2f%n | \n ", p.getNome(), p.getValorProd());
            }
        }
    }
}
