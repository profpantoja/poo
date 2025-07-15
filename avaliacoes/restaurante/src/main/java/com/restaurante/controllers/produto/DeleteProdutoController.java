package com.restaurante.controllers.produto;

import java.io.IOException;

import com.restaurante.dao.ProdutoDAO;
import com.restaurante.view.ProdutoView;

public class DeleteProdutoController {
    private ProdutoDAO dao;
    private ProdutoView view;

    public DeleteProdutoController() {
        dao = new ProdutoDAO();
        view = new ProdutoView();
    }

    public void removerProduto() throws IOException {
        String nome = view.pedirNomeProduto();
        dao.removerPorNome(nome);
        System.out.println("Produto removido!");
    }

}
