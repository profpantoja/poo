import java.util.ArrayList;

public class Menu {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void show() {
        System.out.println("--- MENU ---");
        for (Produto p : produtos) {
            System.out.printf("%s - R$ %.2f\n", p.getNome(), p.getPreco());
        }
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}