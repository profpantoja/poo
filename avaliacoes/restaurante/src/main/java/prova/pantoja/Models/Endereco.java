package prova.pantoja.Models;

public class Endereco {
    private String tipo;
    private String cep;
    private int numero;

    public Endereco(String tipo, String cep, int numero) {
        this.tipo = tipo;
        this.cep = cep;
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco [tipo=" + tipo + ", cep=" + cep + ", numero=" + numero + "]";
    }
}