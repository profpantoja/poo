package br.cefet.model;

public class Funcionario extends Pessoa {
    private String turno;
    private String cargo;
    private String matricula;
    private double salario;
    private int idFuncionario;
    // Construtor Parametrizado
    public Funcionario(String nome, String cpf, String telefone, String email, String turno, String cargo, String matricula, double salario, int idFuncionario) {
        super(nome, cpf, telefone, email);
        this.turno = turno;
        this.cargo = cargo;
        this.matricula = matricula;
        this.salario = salario;
        this.idFuncionario = idFuncionario;
    }

    // Getters e Setters
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    // Getters e Setters para cargo, matricula e salario
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    
    @Override
    public void exibirDados(){
        System.out.println(toString());
    }

    @Override
    public String toCSV(){
        return idFuncionario + ";" + getNome() + ";" + getEmail() + ";" + getTelefone() + ";" + getCpf() + ";" + salario;
    }
    
    @Override
    public String toString() {
        return "ID: "+ idFuncionario +"Nome: " + getNome() + "\nCPF: " + getCpf() + "E-mail: " + getEmail() + "Telefone: " + getTelefone() +
         "\nTurno: " + turno + "\nCargo: " + cargo + "\nSalário: " + salario + "\nMatrícula: " + matricula + "\n";
    }

}
