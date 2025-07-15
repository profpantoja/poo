package com.restaurante.controllers.produto;

import java.io.IOException;
import java.util.List;

import com.restaurante.dao.ProdutoDAO;
import com.restaurante.model.Produto;
import com.restaurante.view.ProdutoView;

/**
 * Controller responsável por listar todos os produtos cadastrados no sistema.
 * 
 * Esta classe utiliza a {@link ProdutoDAO} para recuperar a lista de produtos
 * e a {@link ProdutoView} para exibir essas informações ao usuário.
 * 
 * Pode lançar exceções relacionadas à entrada/saída durante a exibição.
 * 
 * Útil para visualização geral dos produtos disponíveis.
 */
public class SearchProdutoController {

    /** Objeto de acesso a dados para produtos. */
    private ProdutoDAO dao;

    /** Interface de entrada e saída para o usuário. */
    private ProdutoView view;

    /**
     * Construtor que inicializa os objetos DAO e View.
     */
    public SearchProdutoController() {
        dao = new ProdutoDAO();
        view = new ProdutoView();
    }

    /**
     * Recupera a lista de todos os produtos cadastrados e os exibe ao usuário.
     * 
     * @throws IOException caso ocorra erro na operação de exibição
     */
    public void listarProdutos() throws IOException {
        List<Produto> produtos = dao.listarTodos();
        view.exibirProdutos(produtos);
    }
}
