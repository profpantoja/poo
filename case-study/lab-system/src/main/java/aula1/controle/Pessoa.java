package aula1.controle;

public class Pessoa {

    private String nome;
    private float altura;
    private double peso;
    private String dtNascimento;
    private String user;

    public Pessoa(String nome, String user, float altura) {
        this.nome = nome;
        this.user = user;
        this.altura = altura;
    }

    // Método que descreve o papel no laboratório
    public void exibirFuncao() {
        System.out.println("Sou " + nome + ", usuário do laboratório.");
    }

    public String getNome() {
        return nome;
    }

    public String getUser() {
        return user;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
