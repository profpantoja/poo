public class Automovél extends Veículo{
    
    private String renavam;
    private String placa;
    private boolean marcha;
    private int cont = 0;
    
    
    public Automovél() {
    }

    public Automovél(String renavam, String placa) {
        this.renavam = renavam;
        this.placa = placa;
    }

    public void passar_marcha(){

        if ((isOn() == true) && ((isFrente() == true) || (isRe() == true))){
            if (marcha == false){
                cont++;
                System.out.println("\nO veículo passou a " + cont + " marcha!");
                marcha = true;
            }
            else if (cont >= 5){
                System.out.println("\nNúmero de marchas excedido!");
            }
            else {
                cont++;
                System.out.println("\nO veículo passou a " + cont + " marcha!");
            }
        }
        else if (isOn() == false){
            System.out.println("\nO veículo está desligado, nao é possível passar marcha!");
        }
        else { 
            System.out.println("\nO veículo está parado, nao é possível passar marcha!"); 
        }
    }

    public void frear(){

        if (isOn() == true) {
            if ((marcha == true) && (isFrente() == true) || (isRe() == true)){
                System.out.println("\nO veículo freiou! reduzindo uma marcha! ");
                cont--;
                if (cont == 0) {
                    marcha = false;
                }
            }
            else {
                System.out.println("\nO veículo está em ponto morto!");
            }
        }
        else { 
            System.out.println("\nO veículo está desligado, nao é possível freiar!");
        }
    }


    public String getRenavam() {
        return renavam;
    }
    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    

}
