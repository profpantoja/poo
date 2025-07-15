package com.restaurante.controllers.produto;

import java.io.IOException;

import com.restaurante.dao.ProdutoDAO;
import com.restaurante.view.ProdutoView;

/**
 * Controller responsável pela remoção de produtos do sistema com base no nome.
 * 
 * Esta classe interage com a {@link ProdutoView} para capturar o nome do produto
 * a ser removido e utiliza a {@link ProdutoDAO} para realizar a exclusão no banco de dados.
 * 
 * Exibe mensagem informativa no console após a remoção.
 */
public class DeleteProdutoController {

    /** Objeto de acesso a dados para produtos. */
    private ProdutoDAO dao;

    /** Interface de entrada e saída para o usuário. */
    private ProdutoView view;

    /**
     * Construtor que inicializa os objetos DAO e View.
     */
    public DeleteProdutoController() {
        dao = new ProdutoDAO();
        view = new ProdutoView();
    }

    /**
     * Captura o nome do produto e remove o produto correspondente do banco de dados.
     * 
     * Exibe mensagem no console informando que o produto foi removido.
     * 
     * @throws IOException caso ocorra erro na entrada de dados pelo usuário
     */
    public void removerProduto() throws IOException {
        String nome = view.pedirNomeProduto();
        dao.removerPorNome(nome);
        System.out.println("Produto removido!");
    }
}
