package com.restaurante.view;

import java.util.Scanner;
import java.util.List;
import com.restaurante.model.Produto;

public class ProdutoView {
    private Scanner scanner;

    public ProdutoView() {
        scanner = new Scanner(System.in);//Cria um objeto "scanner" que vai ler o que é digitado no terminal (System.in)
    }

    public String pedirNomeProduto() {
        System.out.print("Nome do produto: ");
        return scanner.nextLine(); //Aguarda o usuário a digitar uma linha de texto e retorna esse valor para o controller. Util para textos com espaços.
    }

    public float pedirValorProduto() {
        float valor = 0;
        boolean valido = false;//variavel para ver se a entrada q o usuário digitou é válida

        while (!valido) {//continua pedindo o preço do produto até que o usuário dê uma entrada válida
            try {
                System.out.print("Valor do produto: ");
                valor = Float.parseFloat(scanner.nextLine()); //converte a entrada o usuario String para float
                valido = true;
            } catch (NumberFormatException e) {//se der errado, aciona a exceção e exibe uma mensagem de erro
                System.out.println("Valor inválido. Tente novamente.");
            }
        }

        return valor; // retorna para o controller
    }

    public void exibirProdutos(List<Produto> produtos) {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto encontrado.");
        } else {
            for (Produto p : produtos) {//loop for each que percorre a todos os produtos da lista, para cada produto, ele retorna o nome e o preço
                System.out.printf("Produto: %-20s | Valor: R$ %.2f%n | \n ", p.getNome(), p.getValorProd());
            }
        }
    }
}
