package restaurante;

public class Mesa {
    private String local;
    private int numero;
    private Funcionario garcom;
    private boolean ocupada;

    public Mesa(String local, int numero) {
        this.local = local;
        this.numero = numero;
    }

    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Funcionario getGarcom(){
        return garcom;
    }
    public void setGarcom(Funcionario garcom) {
        this.garcom = garcom;
    }
    
    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
     
}
