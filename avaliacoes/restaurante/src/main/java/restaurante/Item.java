package restaurante;

public class Item {
    private Produto produto;
    private int qntd;
    private float valorVenda;
    
    public Item() {
    }

    public Item(Produto produto, int qntd) {
        setProduto(produto);
        setQntd(qntd);
        setValorVenda();
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQntd() {
        return qntd;
    }

    public void setQntd(int qntd) {
        this.qntd = qntd;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda() {
        this.valorVenda = produto.getValorVenda();
    }
    
}
