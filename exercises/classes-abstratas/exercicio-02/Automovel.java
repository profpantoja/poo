public class Automovel extends Veiculo{

    private String renavam;
    private String placa;
    

    public Automovel(String renavam, String placa) {
        this.renavam = renavam;
        this.placa = placa;
    }


    public void ligar(){
        System.out.println("O carro ligou!");
    }

    public void desligar(){
        System.out.println("O carro desligou!");
    }

    public void frente(){
        System.out.println("O carro se moveu para frente!");
    }

    public void re(){
        System.out.println("O carro deu ré!");
    }

    public void parar(){
        System.out.println("O carro parou!");
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
