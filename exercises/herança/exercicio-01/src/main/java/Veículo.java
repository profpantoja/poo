public class Veículo {

    private boolean on;
    private boolean frente;
    private boolean re;

    public void ligar(){

        if (on == false){
            System.out.println("\nVeículo ligado!");
            on = true;
        }
        else {
            System.out.println("\nO veículo já está ligado!");
        }
    }

    public void desligar(){

        if (on == true){
            System.out.println("\nVeículo desligado!");
            on = false;
        }
        else {
            System.out.println("\nO veículo já está desligado!");
        }
    }

    public void mover_frente(){

        if (on == true) {
            if (frente == false){
                System.out.println("\nVeículo em movimento para frente!");
                frente = true;
                re = false;
            }
            else {
                System.out.println("\nO veículo já está se movendo para frente!");
            }
        }
        else {
            System.out.println("\nO veículo está desligado, nao é possível se locomover para frente!");
        }
        
    }

    public void mover_re(){

        if (on == true) {
            if (re == false){
                System.out.println("\nVeículo em movimento de ré!");
                re = true;
                frente = false;
            }
            else {
                System.out.println("\nO veículo já está se movendo de ré!");
            }
        }
        else {
            System.out.println("\nO veículo está desligado, nao é possível se locomover de ré!");
        }

        
    }

    public void parar(){

        if (on == true) {
            if ((re == false) && (frente == false)) {
                System.out.println("\nO veículo já está parado!");
            }
            else {
                System.out.println("\nO veículo parou!");
                re = false;
                frente = false;
            }
        }
        else {
            System.out.println("\nO veículo está desligado, nao é possível parar!");
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isFrente() {
        return frente;
    }

    public void setFrente(boolean frente) {
        this.frente = frente;
    }

    public boolean isRe() {
        return re;
    }

    public void setRe(boolean re) {
        this.re = re;
    }

    
    
    
}
