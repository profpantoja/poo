public class Pessoa {
    private String nome;
    private String cpf;
    private Endereço endereco;

    public Pessoa(String nome, String cpf, Endereço endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() { 
        return nome; }
    public String getCpf() {
         return cpf; }
    public Endereço getEndereco() {
        return endereco; 
    }
      public void setEndereco(Endereço endereco) {
        this.endereco = endereco; 
    }
    public void setNome(String nome) {
        this.nome = nome; 
    }
    public void setCpf(String cpf) {
        this.cpf = cpf; 
    }
  
}

