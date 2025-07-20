package br.cefet.model;

public class Aluno extends Pessoa {
    private String logradouro, numerocasa, bairro, estado, cep, datanascimento, datamatricula;
    private float peso, altura;
    private int matriculaAluno;
    private Plano plano;

    // Construtor Parametrizado
    public Aluno(String nome, String cpf, String telefone, String email, String logradouro, String numerocasa, String bairro, String estado, String cep, String datanascimento, String datamatricula, float peso, float altura, int matriculaAluno, Plano plano) {
        super(nome, cpf, telefone, email);
        this.logradouro = logradouro;
        this.numerocasa = numerocasa;
        this.bairro = bairro;
        this.estado = estado;
        this.cep = cep;
        this.datanascimento = datanascimento;
        this.datamatricula = datamatricula;
        this.peso = peso;
        this.altura = altura;
        this.matriculaAluno = matriculaAluno;
        this.plano = plano;
    }

   
    public String getLogradouro() {
        return logradouro;
    }
    public String getNumerocasa() {
        return numerocasa;
    }
    public String getBairro() {
        return bairro;
    }
    public String getEstado() {
        return estado;
    }
    public String getCep() {
        return cep;
    }
    public String getDatanascimento() {
        return datanascimento;
    }
    public String getDatamatricula() {
        return datamatricula;
    }
    public int getMatriculaAluno() {
        return matriculaAluno;
    }
    public float getPeso() {
        return peso;
    }
    public float getAltura() {
        return altura;
    }
    public Plano getPlano() {
        return plano;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public void setNumerocasa(String numerocasa) {
        this.numerocasa = numerocasa;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }
    public void setDatamatricula(String datamatricula) {
        this.datamatricula = datamatricula;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void setMatriculaAluno(int matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }
    public void setPlano(Plano plano) {
        this.plano = plano;
    }
    @Override
    public String toCSV(){
        return getNome() + ";" +
               getCpf() + ";" +
               getTelefone() + ";" +
               getEmail() + ";" +
               logradouro + ";" +
               numerocasa + ";" +
               bairro + ";" +
               estado + ";" +
               cep + ";" +
               datanascimento + ";" +
               datamatricula + ";" +
               peso + ";" +
               altura + ";" +
               matriculaAluno + ";" +
               plano.getTipo().getTipoPlano() + ";" +
               plano.getValor() + "\n";
    }
    @Override
    public void exibirDados() {
        System.out.println(toString());
    }
    
    @Override 
    public String toString() {
        return "Exibindo dados de aluno\n" +
               "Nome: " + getNome() + 
               "\nCPF: " + getCpf() + 
               "\nE-mail: " + getEmail() + 
               "\nTelefone: " + getTelefone() +
               "\nLogradouro: " + logradouro + 
               "\nNúmero da Casa: " + numerocasa + 
               "\nBairro: " + bairro + 
               "\nEstado: " + estado +
               "\nCEP: " + cep +
               "\nData de Nascimento: " + datanascimento +
               "\nData de Matrícula: " + datamatricula +
               "\nPeso: " + peso +
               "\nAltura: " + altura +
               "\nMatrícula do Aluno: " + matriculaAluno +
               "\nPlano: " + plano.getTipo().getTipoPlano() +
               "\nValor do Plano: R$" + plano.getValor() +
               "\n";
    }
}
