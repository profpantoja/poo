package model;

public class Professor extends Pessoa {
    private int id;
    private Double salario;
    private int contrato;
    private Politecnico politecnico;

   public Professor(String nome, String apelido, String numeroFiscal, int id, int contrato, Politecnico politecnico) {
        super(nome, apelido, numeroFiscal);
        this.id = id;
        this.contrato = contrato;
        this.politecnico = politecnico;
    }
       
    
    public void imprimirPessoa(){
        System.out.println("Professor [Nome: " + getNome() + ", Apelido: " + getApelido() + ", NumeroFiscal: " + getNumeroFiscal() + ", ID: " + this.id + ", Salario: " + this.salario + "]");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public Politecnico getPolitecnico() {
        return politecnico;
    }

    public void setPolitecnico(Politecnico politecnico) {
        this.politecnico = politecnico;
    }

}
