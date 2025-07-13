public class Funcionario extends Pessoa {
    private String cargo;
    private String ctp;


    public Funcionario(String nome, String cpf, String cargo, Endereço endereco, String ctp) {
        super(nome, cpf, endereco);
        this.cargo = cargo;
        this.ctp = ctp;
    }

    public String getCargo() {
        return cargo; 
    }
    public void setCargo(String cargo) {
        this.cargo = cargo; 
    }

    public String getCtp() {
        return ctp; 
    }
    public void setCtp(String ctp) {
        this.ctp = ctp;
    }
}
