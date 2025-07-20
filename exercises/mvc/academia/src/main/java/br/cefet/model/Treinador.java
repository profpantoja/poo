package br.cefet.model;

public class Treinador extends Funcionario {
    private int idTreinador;
    public Treinador(String nome, String cpf, String telefone, String email, String turno, String cargo, String matricula, double salario, int idTreinador){
        super(nome, cpf, telefone, email, turno, cargo, matricula, salario, idTreinador);
        this.idTreinador = idTreinador;
        super.setIdFuncionario(idTreinador);
    }
    public int getIdTreinador() {
        return idTreinador;
    }
    public void setIdTreinador(int idTreinador) {
        this.idTreinador = idTreinador;
        super.setIdFuncionario(idTreinador);
    }

    @Override
    public String toCSV(){
        return idTreinador + ";" + getNome() + ";" + getEmail() + ";" + getTelefone() + ";" + getCpf()+ ";" + getMatricula() + ";" + getSalario()+ ";" + getCargo() + ";" + getTurno();
    }
    
    public static Treinador fromCSV(String linhaCSV){
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
        
        return new Treinador(nome, cpf, telefone, email, turno, cargo, matricula, salario, id);
    }

    @Override
    public void exibirDados() {
        System.out.println("ID: " + idTreinador);
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CPF: " + getCpf());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Salario: " + getSalario());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Turno: " + getTurno());
    }
}
