package prova.pantoja.Models;

public class Item {
    private Produto produto;
    private int qtd;
    private float valVenda;

    public Item(Produto produto, int qtd, float valVenda) {
        this.produto = produto;
        this.qtd = qtd;
        this.valVenda = valVenda;
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

    public float getValVenda() {
        return valVenda;
    }

    public void setValVenda(float valVenda) {
        this.valVenda = valVenda;
    }

    public float calcularSubtotal() {
        return qtd * valVenda;
    }

    public float calcularTotal() {
        return qtd * valVenda * (1 + (produto.getIVA() / 100));
    }

}