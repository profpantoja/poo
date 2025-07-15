package com.restaurante.controllers.produto;

import java.io.IOException;

import com.restaurante.dao.ProdutoDAO;
import com.restaurante.model.Produto;
import com.restaurante.view.ProdutoView;

public class CreateProdutoController {
    private ProdutoDAO dao;
    private ProdutoView view;

    public CreateProdutoController() {
        dao = new ProdutoDAO();
        view = new ProdutoView();
    }

    public void adicionarProduto() throws IOException {
        String nome = view.pedirNomeProduto();
        float valor = view.pedirValorProduto();

        dao.salvar(new Produto(nome, valor));
        System.out.println("Produto adicionado com sucesso!");
    }

}
