package com.restaurante.dao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.restaurante.model.Produto;

/**
 * Data Access Object (DAO) responsável pela persistência e manipulação dos dados dos produtos.
 * 
 * Esta classe realiza operações de salvar, listar e remover produtos
 * em um arquivo de texto denominado {@code produtos.txt},
 * armazenando as informações no formato delimitado por ponto e vírgula.
 *
 * Exceções de I/O são propagadas para o chamador tratar.
 *
 */
public class ProdutoDAO {

    /** Nome do arquivo usado para armazenar os produtos. */
    private static final String FILE_NAME = "produtos.txt";
    
    /**
     * Salva um produto no arquivo, adicionando ao final do arquivo existente.
     * 
     * O formato utilizado para armazenamento é "nome;valor".
     * 
     * @param produto o produto a ser salvo
     * @throws IOException caso ocorra erro na operação de escrita no arquivo
     */
    public void salvar(Produto produto) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(produto.getNome() + ";" + produto.getValorProd());
            writer.newLine();
        }
    }

    /**
     * Lista todos os produtos armazenados no arquivo.
     * 
     * Realiza a leitura do arquivo, criando objetos {@link Produto} para cada linha.
     * 
     * @return lista contendo todos os produtos encontrados no arquivo;
     *         lista vazia caso o arquivo não exista ou esteja vazio
     * @throws IOException caso ocorra erro na operação de leitura do arquivo
     */
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

    /**
     * Remove um produto do arquivo com base no nome informado.
     * 
     * A operação recarrega todos os produtos, remove o produto com o nome especificado,
     * e reescreve o arquivo com os produtos restantes.
     * 
     * @param nome o nome do produto que deve ser removido
     * @throws IOException caso ocorra erro na operação de leitura ou escrita no arquivo
     */
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
