import java.util.*;

public class Menu {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void exibirMenu() {
        System.out.println("==== MENU DO RESTAURANTE ====");
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}