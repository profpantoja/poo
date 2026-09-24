package gestao;

public class Produto {
    private String nome;
    private double valProd;
    private double iva;
    private double lucro;
    
    public Produto(String nome, double valProd, double iva) {
        this.nome = nome;
        this.valProd = valProd;
        this.iva = iva;
        this.lucro = (valProd * 1.23) - valProd;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValProd() {
        return valProd;
    }
    public void setValProd(double valProd) {
        this.valProd = valProd;
    }
    public double getIva() {
        return iva;
    }
    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }
}