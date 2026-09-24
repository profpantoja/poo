package gestao;

public class Pessoa {
    private String nome;
    private String nif_cpf;

    public Pessoa(String nome, String nif_cpf) {
        this.nome = nome;
        this.nif_cpf = nif_cpf;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNif_cpf() {
        return nif_cpf;
    }
    public void setNif_cpf(String nif_cpf) {
        this.nif_cpf = nif_cpf;
    } 
}