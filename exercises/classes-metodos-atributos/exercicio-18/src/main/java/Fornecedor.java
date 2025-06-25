public class Fornecedor {

    private String nome, telefone, endereço, cnpj;


    public Fornecedor() {
    }

    public Fornecedor(String nome, String telefone, String endereço, String cnpj) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereço = endereço;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    
    
}
