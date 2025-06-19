package restaurante.assets;

public class Funcionario extends Pessoa{
    private String ctp;
    private String cargo;

    public Funcionario(){}
    public Funcionario(String nome, String cpf, String ctp, String cargo){
        super(nome,cpf);
        this.ctp=ctp;
        this.cargo=cargo;
    }
    public String getCtp() {
        return ctp;
    }
    public void setCtp(String ctp) {
        this.ctp = ctp;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}