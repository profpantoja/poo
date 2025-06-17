package gestao;

public class Mesa {
    private String numMesa;
    private String local;
    
    public Mesa(String numMesa, String local) {
        this.numMesa = numMesa;
        this.local = local;
    }

    public String getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(String numMesa) {
        this.numMesa = numMesa;
    }

    public String getLocal() {
        return local;
    }
    
    public void setLocal(String local) {
        this.local = local;
    }   
}