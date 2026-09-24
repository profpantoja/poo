public class Cliente extends Pessoa {
    private int numFid;
    public Cliente(String nome, String cpf, Endereço endereco, int numFid) {
        super(nome, cpf, endereco);
        this.numFid = numFid;
    }

    public int getNumFid() {
        return numFid;
    }

    public void setNumFid(int numFid) {
        this.numFid = numFid;
    }
}