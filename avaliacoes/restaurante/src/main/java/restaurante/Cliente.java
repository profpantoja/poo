package restaurante;

public class Cliente extends Pessoa{
    private int numFid;

    
    public Cliente(String nome, String cpf, int numFid) {
        super(nome, cpf);
        this.numFid = numFid;
    }

    public int getNumFid() {
        return numFid;
    }

    public void setNumFid(int numFid) {
        this.numFid = numFid;
    }

    
}
