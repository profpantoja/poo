package gestao;

public class Funcionario extends Pessoa{
    private String ctp;
    private String cargo;

    public Funcionario(String nome, String nif_cpf, String ctp, String cargo) {
        super(nome, nif_cpf);
        this.ctp = ctp;
        this.cargo = cargo;
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
