package restaurante;

import java.util.List;

public class Restaurante {
    private String nome, cnpj, nomeFantasia;
    private Endereco endereco;
    private List<Mesa> mesas;
    
    
    public Restaurante(String nome, String cnpj, String nomeFantasia, Endereco endereco){
        this.nome = nome;
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.endereco = endereco;
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
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public List<Mesa> getMesas() {
        return mesas;
    }
    public void setMesas(List<Mesa> mesas) {
        this.mesas = mesas;
    }
    
}
