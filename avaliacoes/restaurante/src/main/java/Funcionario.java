public class Funcionario extends Pessoa {

    private String cargo;
    private String ctps;

    public Funcionario(String nome, String cpf){
        super(nome,cpf);
        this.cargo = cargo;
        this.ctps = ctps;

    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getCtps() {
        return ctps;
    }
    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    
    
}