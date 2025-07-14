package prova.pantoja.DAO;

import prova.pantoja.Models.Produto;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    private static final String ARQUIVO = "produtos.txt";

    public void salvarProdutos(List<Produto> produtos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO))) {
            for (Produto produto : produtos) {
                writer.write(produto.getNome() + "," + produto.getValVenda() + "," + produto.getValProduto() + "," + produto.getIVA());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar produtos: " + e.getMessage());
        }
    }

    public List<Produto> carregarProdutos() {
        List<Produto> produtos = new ArrayList<>();
        File file = new File(ARQUIVO);

        if (!file.exists()) return produtos;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                produtos.add(new Produto(dados[0], Float.parseFloat(dados[1]), Float.parseFloat(dados[2]), Float.parseFloat(dados[3])));
            }
        } catch (IOException e) {
            System.err.println("Erro ao carregar produtos: " + e.getMessage());
        }
        return produtos;
    }
}