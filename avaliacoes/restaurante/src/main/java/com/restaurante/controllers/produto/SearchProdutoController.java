package com.restaurante.controllers.produto;

import java.io.IOException;
import java.util.List;

import com.restaurante.dao.ProdutoDAO;
import com.restaurante.model.Produto;
import com.restaurante.view.ProdutoView;

public class SearchProdutoController {
    private ProdutoDAO dao;
    private ProdutoView view;

    public SearchProdutoController() {
        dao = new ProdutoDAO();
        view = new ProdutoView();
    }

    public void listarProdutos() throws IOException {
        List<Produto> produtos = dao.listarTodos();
        view.exibirProdutos(produtos);
    }

}
