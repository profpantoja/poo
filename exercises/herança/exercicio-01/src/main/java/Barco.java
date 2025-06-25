public class Barco extends Veículo{

    private String registro_embarcação;
    private boolean navegar;
    private boolean ancorar = true;
    
    public Barco() {
    }

    public Barco(String registro_embarcação) {
        this.registro_embarcação = registro_embarcação;
    }

    public void navegar(){

        if (isOn() == true) {
            if ((navegar == false) && (ancorar == false)){
                System.out.println("\nO barco está em navegaçao!!");
                navegar = true;
            }
            else if (ancorar == true){
                System.out.println("\nO barco está ancorado, nao é possivel navegar! ");
            }
            else {
                System.out.println("\nO barco já está navegando!");
            }
        }

        else {
            System.out.println("\nO veículo está desligado, nao é possível navegar!");
        }
        
    }

    public void ancorar(){

        if (isOn() == true) {
            if (ancorar == false){
                System.out.println("\nO barco ancorou!");
                ancorar = true;
                navegar = false;
            }
            else {
                System.out.println("\nO barco já está ancorado!");
            }
        }
        
        else {
            System.out.println("\nO veículo está desligado, nao é possível ancorar!");
        }
    }

    public void desancorar(){
        if (isOn() == true) {
            if (ancorar == true){
                System.out.println("\nO barco desancorou!");
                ancorar = false;
            }
            else {
                System.out.println("\nO barco já está desancorado!");
            }
        }
        
        else {
            System.out.println("\nO veículo está desligado, nao é possível passar desancorar!");
        }
    }

    public String getRegistro_embarcação() {
        return registro_embarcação;
    }

    public void setRegistro_embarcação(String registro_embarcação) {
        this.registro_embarcação = registro_embarcação;
    }
    
}
