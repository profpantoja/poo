package com.restaurante.controllers.produto;

import java.io.IOException;

import com.restaurante.dao.ProdutoDAO;
import com.restaurante.model.Produto;
import com.restaurante.view.ProdutoView;

/**
 * Controller responsável pela criação de produtos no sistema.
 * 
 * Esta classe captura os dados do produto através da {@link ProdutoView},
 * cria um novo objeto {@link Produto} e persiste no banco de dados
 * utilizando a {@link ProdutoDAO}.
 * 
 * Pode lançar exceções relacionadas à entrada de dados durante a captura.
 * 
 * Informa ao usuário sobre o sucesso da operação via console.
 */
public class CreateProdutoController {

    /** Objeto de acesso a dados para produtos. */
    private ProdutoDAO dao;

    /** Interface de entrada e saída para o usuário. */
    private ProdutoView view;

    /**
     * Construtor que inicializa os objetos DAO e View.
     */
    public CreateProdutoController() {
        dao = new ProdutoDAO();
        view = new ProdutoView();
    }

    /**
     * Captura os dados do produto, cria o objeto Produto e salva no banco de dados.
     * 
     * Exibe uma mensagem de sucesso no console após a operação.
     * 
     * @throws IOException caso ocorra erro durante a entrada de dados
     */
    public void adicionarProduto() throws IOException {
        String nome = view.pedirNomeProduto();
        float valor = view.pedirValorProduto();

        dao.salvar(new Produto(nome, valor));
        System.out.println("Produto adicionado com sucesso!");
    }
}

