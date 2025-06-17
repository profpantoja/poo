public class Item {
    
    private Produto produto;
    private int quantidade;
    private float valVenda;

    public Item(Produto produto, int quantidade, float val) {
        setProduto(produto);
        setQuantidade(quantidade);
        setValVenda(val);
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValVenda() {
        return this.valVenda;
    }

    public void setValVenda(float valVenda) {
        this.valVenda = valVenda;
    }

    public float getTotal() {
        return this.valVenda * this.quantidade;
    }
}