import java.time.LocalDate;

public abstract class Publicações {


    private String nome;
    private String descrição;
    private LocalDate data_inicio;
    private Data_termino tipo_data_termino;
    private LocalDate data_termino;
    private Areas_pesquisas area_pesquisa;

    private String titulo;
    private String ano;
    private String autores;



    public Publicações() {
    }


    public Publicações(String nome, String descrição, LocalDate data_inicio, Data_termino tipo_data_termino, LocalDate data_termino,
        Areas_pesquisas area_pesquisa, String titulo, String ano, String autores) {

        this.nome = nome;
        this.descrição = descrição;
        this.data_inicio = data_inicio;
        this.tipo_data_termino = tipo_data_termino;
        this.data_termino = data_termino;
        this.area_pesquisa = area_pesquisa;
        this.titulo = titulo;
        this.ano = ano;
        this.autores = autores;
        
    }


    public abstract void imprimir_informações();



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public LocalDate getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(LocalDate data_inicio) {
        this.data_inicio = data_inicio;
    }

    public LocalDate getData_termino() {
        return data_termino;
    }

    public void setData_termino(LocalDate data_termino) {
        this.data_termino = data_termino;
    }

    public Areas_pesquisas getArea_pesquisa() {
        return area_pesquisa;
    }

    public void setArea_pesquisa(Areas_pesquisas area_pesquisa) {
        this.area_pesquisa = area_pesquisa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public Data_termino getTipo_data_termino() {
        return tipo_data_termino;
    }

    public void setTipo_data_termino(Data_termino tipo_data_termino) {
        this.tipo_data_termino = tipo_data_termino;
    }

    
}
