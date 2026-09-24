package gestao;

public class Pix extends Pagamento{
    private String chave;
    
    public Pix(String chave) {
        this.chave = chave;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }
}