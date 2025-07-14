package assets.model;
public class Pessoa {

    private String nome;
    private String sobrenome;
    private String sexo;
    private String titulo;

    public Pessoa() {
 
    }

    public Pessoa(String nome, String sobrenome, String sexo, String titulo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.titulo = titulo;
    }

    public Pessoa(String nome, String sobrenome, String sexo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    

}
