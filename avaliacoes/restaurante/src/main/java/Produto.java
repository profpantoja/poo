public class Produto {
    
    private String nome;
    private float valProduto;
    private float iva;

    public Produto(String nome, float val, float iva) {
        setNome(nome);
        setValProduto(val);
        setIva(iva);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValProduto() {
        return this.valProduto;
    }

    public void setValProduto(float valProduto) {
        this.valProduto = valProduto;
    }

    public float getIva() {
        return this.iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getPrecoComIva() {
        return valProduto * (1 + iva);
    }

    @Override
    public String toString() {
        return nome + " - R$" + String.format("%.2f", valProduto);
    }
}
