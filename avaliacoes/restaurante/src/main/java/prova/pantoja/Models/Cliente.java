package prova.pantoja.Models;

public class Cliente extends Pessoa {
    private int numeroFid;

    public Cliente(String nome, String numContribuinte, Endereco endereco, int numeroFid) {
        super(nome, numContribuinte, endereco);
        this.numeroFid = numeroFid;
    }

    public int getNumeroFid() {
        return numeroFid;
    }

    public void setNumeroFid(int numeroFid) {
        this.numeroFid = numeroFid;
    }

    @Override
    public String toString() {
        return "Cliente [numeroFid=" + numeroFid + ", " + super.toString() + "]";
    }
}