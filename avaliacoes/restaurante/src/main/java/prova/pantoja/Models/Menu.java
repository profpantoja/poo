package prova.pantoja.Models;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Produto> produtos;

    public Menu() {
        this.produtos = new ArrayList<>();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public String Show() {
        String infoMenu = "--- Menu do Restaurante ---\n";
        if (produtos.isEmpty()) {
            infoMenu = infoMenu + "Menu vazio.\n";
        } else{
            for (Produto produto : produtos) {
                infoMenu = infoMenu + produto.toString() + "\n";
            }
        }
        infoMenu = infoMenu + "---------------------------\n";
        return infoMenu;
    }
}