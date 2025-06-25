public class Ventilador {

    private int velocidade;
    private boolean status;


    public Ventilador() {
    }
    
    public Ventilador(int velocidade) {
        this.velocidade = velocidade;
    }


    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
