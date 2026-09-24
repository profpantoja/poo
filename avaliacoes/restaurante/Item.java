public class Item {

    private Produto produto;
    private int quantidade;
    private float valorVenda;

    public Item(Produto produto, int quantidade, float valorVenda) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorVenda = valorVenda;
    }

    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public float getValorVenda() {
        return valorVenda;
    }
    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }
}
