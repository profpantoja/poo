package gestao;

public class Cartao extends Pagamento{
    private String tipo;
    private String num;

    public Cartao(String tipo, String num) {
        this.tipo = tipo;
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}