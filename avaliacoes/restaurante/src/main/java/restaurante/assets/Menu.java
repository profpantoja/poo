package restaurante.assets;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Produto> produtos;
    private Restaurante restaurante;

    public Menu(Restaurante restaurante) {
        this.restaurante = restaurante;
        this.produtos = new ArrayList<>();
    }

    public List<Produto> getProduto() {
        return produtos;
    }

    public void setProduto(ArrayList<Produto> produto) {
        this.produtos = produto;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);

    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public void show() {
        System.out.println("========= MENU - " + this.restaurante.getNomeFantasia() + " =========");
        if (produtos == null || produtos.isEmpty()) {
            System.out.println("O menu está vazio no momento.");
            return;
        }
        for (Produto produto : produtos) {
            double precoFinal = produto.getVal();
            System.out.println(String.format("- %-25s ...... R$ %.2f", produto.getNome(), precoFinal));
        }
        System.out.println("==========================================");
    }

}