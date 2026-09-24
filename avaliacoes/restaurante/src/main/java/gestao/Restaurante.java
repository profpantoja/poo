package gestao;

public class Restaurante {
    private String nome;
    private String cnpj;
    private String nomeFantasia;
  
    public Restaurante(String nome, String cnpj, String nomeFantasia) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    
}