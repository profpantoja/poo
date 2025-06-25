
public class Pessoa {

    private String nome, endereço, tel, email;
    private char sexo;
    private Cão cão;
    
    public Pessoa() {
        this.cão = new Cão();
    }

    public Pessoa(String nome, String endereco, String tel, String email, char sexo, Cão cão) {
        this.nome = nome;
        this.endereço = endereco;
        this.tel = tel;
        this.email = email;
        this.sexo = sexo;
        this.cão = cão;
    }

    public Pessoa(String nome, String endereco, String tel, String email, char sexo) {
        this.nome = nome;
        this.endereço = endereco;
        this.tel = tel;
        this.email = email;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereco) {
        this.endereço = endereco;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public Cão getCão() {
        return cão;
    }
    public void setCão(Cão cão) {
        this.cão = cão;
    }

}
