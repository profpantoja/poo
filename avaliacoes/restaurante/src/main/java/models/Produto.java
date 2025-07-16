package models;

public class Produto {
    
    private int id;
    private String nome;
    private double valProduto;
    private float iva;

    public Produto(String nome, double val, float iva) {
     
        setNome(nome);
        setValProduto(val);
        setIva(iva);
    }

    public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValProduto() {
        return this.valProduto;
    }

    public void setValProduto(double valProduto) {
        this.valProduto = valProduto;
    }

    public float getIva() {
        return this.iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public double getPrecoComIva() {
        return valProduto * (1 + iva);
    }

    @Override
    public String toString() {
        return "Produto nome=" + nome + ", valProduto=" + valProduto + ", iva=" + iva + "]";
    }
}