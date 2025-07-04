package restaurante;

public class Cartao extends Pagamento{
    private String tipo;

    public Cartao(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
