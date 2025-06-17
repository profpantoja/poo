package restaurante;

public class Produto {
    private String nome;
    private float valorProduto, valorVenda;
    private double iva = 0.23;
    
    public Produto() {
    }

    public Produto(String nome, float valorProduto,float valorVenda) {
        this.nome = nome;
        this.valorProduto = valorProduto;
        this.valorVenda = valorVenda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;
    }

    public double getIva() {
        return iva;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }
    
    
}
