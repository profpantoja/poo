import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome, apelido;
    private LocalDate datanascimento;

    public Pessoa(LocalDate datanascimento) {
        this.datanascimento = datanascimento;
    }

    public Pessoa (String nome, String apelido, LocalDate datanascimento){
        this.nome = nome;
        this.apelido = apelido;
        this.datanascimento = datanascimento;
    }

    public int getIdade(){
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(datanascimento, dataAtual);

        return periodo.getYears();
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setApelido(String apelido){
        this.apelido = apelido;
    }

    public String getApelido() {
        return apelido;
    }

    public LocalDate getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(LocalDate datanascimento) {
        this.datanascimento = datanascimento;
    }

    
    
}
