public class Aviao extends Veiculo{

    private String reg_aeronautico;
    

    public Aviao(String reg_aeronautico) {
        this.reg_aeronautico = reg_aeronautico;
    }


    public void ligar(){
        System.out.println("O aviao ligou!");
    }

    public void desligar(){
        System.out.println("O aviao desligou!");
    }

    public void frente(){
        System.out.println("O aviao se moveu para frente!");
    }

    public void re(){
        System.out.println("O aviao deu ré!");
    }

    public void parar(){
        System.out.println("O aviao parou!");
    }


    public String getReg_aeronautico() {
        return reg_aeronautico;
    }

    public void setReg_aeronautico(String reg_aeronautico) {
        this.reg_aeronautico = reg_aeronautico;
    }

    
    
}
