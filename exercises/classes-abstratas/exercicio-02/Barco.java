public class Barco extends Veiculo{

    private String reg_embarcação;


    public Barco(String reg_embarcação) {
        this.reg_embarcação = reg_embarcação;
    }


    public void ligar(){
        System.out.println("O barco ligou!");
    }

    public void desligar(){
        System.out.println("O barco desligou!");
    }

    public void frente(){
        System.out.println("O barco se moveu para frente!");
    }

    public void re(){
        System.out.println("O barco deu ré!");
    }

    public void parar(){
        System.out.println("O barco parou!");
    }


    public String getReg_embarcação() {
        return reg_embarcação;
    }

    public void setReg_embarcação(String reg_embarcação) {
        this.reg_embarcação = reg_embarcação;
    }


    
}
