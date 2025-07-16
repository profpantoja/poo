package controllers;

import java.util.List;

import DAO.ProdutoDao;
import models.Produto;

public class ProdutoController {

    private Produto produto;
    private ProdutoDao produtoDAO = new ProdutoDao();

    public void createProduto(String nome, double val, float iva){

        Produto produto = new Produto(nome, val, iva);

        produtoDAO.add(produto);
    }
    
    public List<Produto> readProdutos(){
        return produtoDAO.getAll();
    }

    public boolean deleteProduto(int id){
        if(id < 0){
            throw new IllegalArgumentException("ID não pode ser negativo");
        }

        return produtoDAO.delete(id);
    }

}