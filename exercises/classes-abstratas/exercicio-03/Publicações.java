import java.time.LocalDate;

/**
 * A classe abstrata Publicações define um padrão de publicação em determinado âmbito que a estenda.
 * 
 */
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



    /**
     * Construtor padrão da classe abstrata Publicações.
     */
    public Publicações() {
    }


    /**
     * Construtor da classe abstrata Publicações que recebe nove parâmetros.
     * Define os parâmetros recebidos.
     * 
     * @param nome Nome da publicação
     * @param descrição Descrição da publicação
     * @param data_inicio Data de início da publicação
     * @param tipo_data_termino Tipo da data de término da publicação
     * @param data_termino Data de término da publicação
     * @param area_pesquisa Área de pesquisa da publicação
     * @param titulo Título da publicação
     * @param ano Ano da publicação
     * @param autores Autores da publicação
     */
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


    /**
     * O método abstrato imprimir_informações define a açõa de imprimir informações de uma publicação.
     */
    public abstract void imprimir_informações();



    /**
     * Getter padrão para o atributo nome.
     * Retorna o nome da publicação.
     * 
     * @return o nome da publicação
     */
    public String getNome() {
        return nome;
    }

    /**
     * Setter padrão para o atributo nome.
     * Define o nome da publicação.
     * 
     * @param nome Nome da publicação
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Getter padrão para o atributo descrição.
     * Retorna a descrição da publicação.
     * 
     * @return a descrição da publicação
     */
    public String getDescrição() {
        return descrição;
    }

    /**
     * Setter padrão para o atributo descrição.
     * Define a descrição da publicação.
     * 
     * @param descrição Descrição da publicação
     */
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    /**
     * Getter padrão para o atributo data_inicio.
     * Retorna a data de início da publicação.
     * 
     * @return a data de início da publicação
     */
    public LocalDate getData_inicio() {
        return data_inicio;
    }

    /**
     * Setter padrão para o atributo data_inicio.
     * Define a data de início da publicação.
     * 
     * @param data_inicio Data de início da publicação
     */
    public void setData_inicio(LocalDate data_inicio) {
        this.data_inicio = data_inicio;
    }

    /**
     * Getter padrão para o atributo data_termino.
     * Retorna a data de término da publicação.
     * 
     * @return a data de término da publicação
     */
    public LocalDate getData_termino() {
        return data_termino;
    }

    /**
     * Setter padrão para o atributo data_termino.
     * Define a data de término da publicação.
     * 
     * @param data_termino Data de término da publicação
     */
    public void setData_termino(LocalDate data_termino) {
        this.data_termino = data_termino;
    }

    /**
     * Getter padrão para o atributo area_pesquisa.
     * Retorna a área de pesquisa da publicação.
     * 
     * @return a área de pesquisa da publicação
     */
    public Areas_pesquisas getArea_pesquisa() {
        return area_pesquisa;
    }

    /**
     * Setter padrão para o atributo area_pesquisa.
     * Define a área de pesquisa.
     * 
     * @param area_pesquisa Área de pesquisa da publicação
     */
    public void setArea_pesquisa(Areas_pesquisas area_pesquisa) {
        this.area_pesquisa = area_pesquisa;
    }

    /**
     * Getter padrão para o atributo título.
     * Retorna o título da publicação.
     * 
     * @return título da publicação
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Setter padrão para o atributo titulo.
     * Define o título da publicação.
     * 
     * @param titulo Título da publicação
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Getter padrão para o atributo ano.
     * Retorna o ano da publicação.
     * 
     * @return o ano da publicação
     */
    public String getAno() {
        return ano;
    }

    /**
     * Setter padrão para o atributo ano.
     * Define o ano da publicação.
     * 
     * @param nome Ano da publicação
     */
    public void setAno(String ano) {
        this.ano = ano;
    }

    /**
     * Getter padrão para o atributo autores.
     * Retorna os autores da publicação.
     * 
     * @return os autores da publicação
     */
    public String getAutores() {
        return autores;
    }

    /**
     * Setter padrão para o atributo autores.
     * Define os autores da publicação.
     * 
     * @param autores Autores da publicação
     */
    public void setAutores(String autores) {
        this.autores = autores;
    }

    /**
     * Getter padrão para o atributo tipo_data_termino.
     * Retorna o tipo de data de término da publicação.
     * 
     * @return o tipo de data de término da publicação
     */
    public Data_termino getTipo_data_termino() {
        return tipo_data_termino;
    }

    /**
     * Setter padrão para o atributo tipo_data_termino.
     * Define o tipo de data de término da publicação.
     * 
     * @param tipo_data_termino Tipo de data de término da publicação
     */
    public void setTipo_data_termino(Data_termino tipo_data_termino) {
        this.tipo_data_termino = tipo_data_termino;
    }

    
}
