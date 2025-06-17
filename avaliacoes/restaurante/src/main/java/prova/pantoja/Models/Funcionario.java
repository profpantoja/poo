package prova.pantoja.Models;

public class Funcionario extends Pessoa {
    private String ctp;
    private String cargo;

    public Funcionario(String nome, String numContribuinte, Endereco endereco, String ctp, String cargo) {
        super(nome, numContribuinte, endereco);
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