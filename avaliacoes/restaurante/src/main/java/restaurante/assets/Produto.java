package restaurante.assets;

public class Produto {
    private String nome;
    private float valProd;
    private float val;


    public Produto(){

    }
    
    public Produto(String nome, float valProd, float val){
        this.nome = nome;
        this.valProd = valProd;
        this.val = val;

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getValProd() {
        return valProd;
    }
    public void setValProd(float valProd) {
        this.valProd = valProd;
    }
    public float getVal() {
        return val;
    }
    public void setVal(float val) {
        this.val = val;
    }
}