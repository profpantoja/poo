public class Avião extends Veículo{

    private String registro_aeronaútico;
    private boolean decolar;
    
    
    public Avião() {
    }

    public Avião(String registro_aeronaútico) {
        this.registro_aeronaútico = registro_aeronaútico;
    }


    public void decolar(){

        if (isOn() == true) {
            if (decolar == false){
                System.out.println("\nO aviao decolou!!");
                decolar = true;
            }
            else {
                System.out.println("\nNao é possivel decolar pois o aviao já decolou!");
            }
        }

        else {
            System.out.println("\nO veículo está desligado, nao é possível decolar!");
        }
        
    }

    public void pousar(){

        if (isOn() == true) {
            if (decolar == true){
                System.out.println("\nO aviao pousou!");
                decolar = false;
            }
            else {
                System.out.println("\nNao é possivel pousar pois o aviao já está em pouso!");
            }
        }
        else {
            System.out.println("\nO veículo está desligado, nao é possível pousar!");
        }
        
    }


    public String getRegistro_aeronaútico() {
        return registro_aeronaútico;
    }

    public void setRegistro_aeronaútico(String registro_aeronaútico) {
        this.registro_aeronaútico = registro_aeronaútico;
    }

    
    
    
}
