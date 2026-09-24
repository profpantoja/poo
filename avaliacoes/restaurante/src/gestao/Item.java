package gestao;

public class Item {
    private Produto produto;
    private int qtd;
    private double valVenda;

    public Item(Produto produto, int qtd) {
        this.produto = produto;
        this.qtd = qtd;
        this.valVenda = produto.getValProd() * 1.23;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getValVenda() {
        return valVenda;
    }

    public void setValVenda(double valVenda) {
        this.valVenda = valVenda;
    }

    @Override
    public String toString() {
        String info = "\n" + getQtd() + getValVenda() + getProduto(); 

        return info;
    }
}