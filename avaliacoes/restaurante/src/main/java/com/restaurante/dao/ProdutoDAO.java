package com.restaurante.dao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.restaurante.model.Produto;

public class ProdutoDAO {
    private static final String FILE_NAME = "produtos.txt";
    
    public void salvar(Produto produto) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(produto.getNome() + ";" + produto.getValorProd());
            writer.newLine();
        }
    }

    public List<Produto> listarTodos() throws IOException {
        List<Produto> produtos = new ArrayList<>();
        File arquivo = new File(FILE_NAME);

        if (!arquivo.exists()) {
            return produtos;
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                produtos.add(new Produto(dados[0], Float.parseFloat(dados[1])));
            }
        }
        return produtos;
    }

    public void removerPorNome(String nome) throws IOException {
        List<Produto> produtos = listarTodos();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {

            for (Produto p : produtos) {
                if (!p.getNome().equals(nome)) {
                    writer.write(p.getNome() + ";" + p.getValorProd());
                    writer.newLine();
                }
            }
        }
    }
}
