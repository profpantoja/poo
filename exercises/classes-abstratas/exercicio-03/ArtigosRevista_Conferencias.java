import java.time.LocalDate;

/**
 * A classe ArtigosRevista_Conferencias, que estende a classe abstrata Publicações, define características de um artigo de revista de uma conferência científica.
 * 
 */
public class ArtigosRevista_Conferencias extends Publicações{

    private String periódico;
    private String volume;
    private String numero;
    private Coordenador coordenador;


    /**
     * Construtor padrão da classe ArtigosRevista_Conferencias.
     */
    public ArtigosRevista_Conferencias(){
    }


    /**
     * Construtor da classe ArtigosRevista_Conferencias que recebe doze parâmetros
     * Define os parâmetros recebidos
     * 
     * @param nome Nome do artigo de revista
     * @param descrição Descrição do artiga de revista
     * @param data_inicio Data de início do artigo de revista
     * @param tipo_data_termino Tipo de data de término do artigo de revista
     * @param data_termino Data de término do artigo de revista
     * @param area_pesquisa Área de pesquisa do artigo de revista
     * @param titulo Título do artigo de revista
     * @param ano Ano do artigo de revista
     * @param autores Autores do artigo de revista
     * @param coordenador Coordenador do artigo de revista
     * @param periódico Periódico do artigo de revista 
     * @param volume Volume da revista
     * @param numero Número da revista
     */
    public ArtigosRevista_Conferencias(String nome, String descrição, LocalDate data_inicio, Data_termino tipo_data_termino, LocalDate data_termino, Areas_pesquisas area_pesquisa, 
        String titulo, String ano, String autores, Coordenador coordenador, String periódico, String volume, String numero) {
        
        super(nome, descrição, data_inicio, tipo_data_termino, data_termino, area_pesquisa, titulo, ano, autores);
        this.periódico = periódico;
        this.volume = volume;
        this.numero = numero;
        this.coordenador = coordenador;
    }


    /**
     * O método imprimir_informações imprime informações de um artigo de revista.
     */
    public void imprimir_informações(){
        System.out.println("\n\n+------------------------------------------------------+");
        System.out.println("Nome da publicaçao: " + getNome() + "\nDescriçao: " + getDescrição() + "\n\nData início: " + getData_inicio()
        + "\nData final " + getTipo_data_termino() + ": " + getData_termino() + "\nAréa da pesquisa: " + getArea_pesquisa() + "\n\nTitulo: " + getTitulo() + "\nAno: " + getAno() + "\nAutores: " + getAutores()
        + "\nPeriódico: " + getPeriódico() + "\nVolume: " + getVolume() + "\nNúmero: " + getNumero() + "\n\nNome do coordenador: " + coordenador.getNome_cordenador()
        + "\nE-mail: " + coordenador.getEmail() + "\nInstituiçao de origem: " + coordenador.getInstituição_origem() + "\nEndereço: " + coordenador.getEndereço()
        + "\nFunçao: " + coordenador.getFunção());
        System.out.println("+------------------------------------------------------+\n\n");
    }

    
    /**
     * Getter padrão para o atributo periódico.
     * Retorna periódico do artigo de revista.
     * 
     * @return periódico do artigo de revista
     */
    public String getPeriódico() {
        return periódico;
    }
    
    
    /**
     * Setter padrão para o atributo periódico.
     * Define periódico do artigo de revista.
     * 
     * @param periódico Periódico do artigo de revista
     */
    public void setPeriódico(String periódico) {
        this.periódico = periódico;
    }
    
    /**
     * Getter padrão para o atributo volume.
     * Retorna o volume da revista.
     * 
     * @return o volume da revista
     */
    public String getVolume() {
        return volume;
    }
    
    /**
     * Setter padrão para o atributo volume.
     * Define o volume da revista.
     * 
     * @param volume Volume da revista
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }
    
    /**
     * Getter padrão para o atributo numero.
     * Retorna o número da revista.
     * 
     * @return o número da revista
     */
    public String getNumero() {
        return numero;
    }
    
    /**
     * Setter padrão para o atributo numero.
     * Define o número da revista.
     * 
     * @param numero Número da revista
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    /**
     * Getter padrão para o atributo coordenador.
     * Retorna o coordenador do artigo de revista.
     * 
     * @return o coordenador do artigo de revista
     */
    public Coordenador getCoordenador() {
        return coordenador;
    }
    
    /**
     * Setter padrão para o atributo coordenador.
     * Define o coordenador do artigo de revista.
     * 
     * @param coordenador Coordenador do artigo de revista
     */
    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    
}
