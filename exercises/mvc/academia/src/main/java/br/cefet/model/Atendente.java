package br.cefet.model;

public class Atendente extends Funcionario {
    private int idAtendente;
    // Construtor da classe Atendente
    public Atendente(String nome, String cpf, String telefone, String email, String turno, String cargo, String matricula, double salario, int idAtendente) {
        super(nome, cpf, telefone, email, turno, cargo, matricula, salario, idAtendente);
        this.idAtendente = idAtendente;
        super.setIdFuncionario(idAtendente);
    }
    public int getIdAtendente() {
        return idAtendente;
    }
    public void setIdAtendente(int idAtendente) {
        this.idAtendente = idAtendente;
        super.setIdFuncionario(idAtendente);
    }

    @Override
    public String toCSV(){
        return idAtendente + ";" + getNome() + ";" + getEmail() + ";" + getTelefone() + ";" + getCpf() + ";" + getSalario() + ";" + getMatricula() + ";" + getTurno() +
                ";" + getCargo();
    }

    public static Atendente fromCSV(String linhaCSV){
        String[] colunas = linhaCSV.split(";");
        int id = Integer.parseInt(colunas[0]);
        
        String nome = colunas[1];
        String email = colunas[2];
        String telefone = colunas[3];
        String cpf = colunas[4];
        double salario = Double.parseDouble(colunas[5]);
        String matricula = colunas[6];
        String turno = colunas[7];
        String cargo = colunas[8];
        
        return new Atendente(nome, cpf, telefone, email, turno, cargo, matricula, salario, id);
    }

    @Override
    public void exibirDados() {
        System.out.println("ID: " + idAtendente);
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Email: " + getEmail());
        System.out.println("Turno: " + getTurno());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Salário: " + getSalario());
    }
}