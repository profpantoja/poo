package models;

public class Funcionario extends Pessoa {

    private String cargo;
    private String ctps;
    private int id;
    
    public Funcionario(String nome, String cpf){
        super(nome,cpf);   
    }

    public Funcionario(String nome, String cpf, String cargo, String ctps){
        super(nome,cpf);
        setCargo(cargo);
        setCtps(ctps);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Funcionario [cargo=" + cargo + ", ctps=" + ctps + "]";
    }

}