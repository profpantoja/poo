package gestao;

public class Cliente extends Pessoa{
    private int numFid;

    public Cliente(String nome, String nif_cpf, int numFid) {
        super(nome, nif_cpf);
        this.numFid = numFid;
    }

    public int getNumFid() {
        return numFid;
    }

    public void setNumFid(int numFid) {
        this.numFid = numFid;
    } 
}