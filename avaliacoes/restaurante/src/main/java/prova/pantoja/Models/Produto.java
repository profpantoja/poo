package prova.pantoja.Models;

public class Produto {
    private String nome;
    private float valVenda;
    private float valProduto;
    private float IVA;

    public Produto(String nome, float valVenda, float valProduto, float IVA) {
        this.nome = nome;
        this.valVenda = valVenda;
        this.valProduto = valProduto;
        this.IVA = IVA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValVenda() {
        return valVenda;
    }

    public void setValVenda(float valVenda) {
        this.valVenda = valVenda;
    }

    public float getValProduto() {
        return valProduto;
    }

    public void setValProduto(float valProduto) {
        this.valProduto = valProduto;
    }

    public float getIVA() {
        return IVA;
    }

    public void setIVA(float IVA) {
        this.IVA = IVA;
    }

    public float calcularPrecoComImposto() {
        return valVenda * (1 + (IVA / 100));
    }

    @Override
    public String toString() {
        return "Produto " + nome + ", Preço de venda sem impostos= " + valVenda +
               ", Preço de venda com impostos = " + calcularPrecoComImposto() +
               ", Impostos= " + IVA + "%";
    }
}