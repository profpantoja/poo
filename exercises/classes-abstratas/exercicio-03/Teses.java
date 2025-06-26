import java.time.LocalDate;


/**
 * A classe Teses, que estende a classe abstrata Publicações, define características de uma tese científica.
 * 
 */
public class Teses extends Publicações{

    private String grau;
    private String instituição_defendimento;
    private Coordenador coordenador;


    /**
     * Construtor padrão da classe Teses.
     */
    public Teses(){
    }


    /**
     * Construtor da classe Teses que recebe doze parâmetros.
     * Define os parâmetros recebidos.
     * 
     * @param nome Nome da tese
     * @param descrição Descrição da tese
     * @param data_inicio Data de início da tese
     * @param tipo_data_termino Tipo de data de término da tese
     * @param data_termino Data de término da tese
     * @param area_pesquisa Área de pesquisa da tese
     * @param titulo Título da tese
     * @param ano Ano da tese
     * @param autores Autores da tese
     * @param coordenador Coordenador da tese
     * @param grau Grau da tese
     * @param instituição_defendimento Instituição de defendimento da tese
     */
    public Teses(String nome, String descrição, LocalDate data_inicio, Data_termino tipo_data_termino, LocalDate data_termino, Areas_pesquisas area_pesquisa, String titulo, String ano, String autores, Coordenador coordenador, String grau, String instituição_defendimento) {

        super(nome, descrição, data_inicio, tipo_data_termino, data_termino, area_pesquisa, titulo, ano, autores);
        this.coordenador = coordenador;
        this.grau = grau;
        this.instituição_defendimento = instituição_defendimento;

    }

    

    /**
     * O método imprimir_informações imprime informações de uma tese.
     */
    public void imprimir_informações(){
        System.out.println("\n\n+------------------------------------------------------+");
        System.out.println("Nome da publicaçao: " + getNome() + "\nDescriçao: " + getDescrição() + "\n\nData início: " + getData_inicio()
        + "\nData final " + getTipo_data_termino() + ": " + getData_termino() + "\nAréa da pesquisa: " + getArea_pesquisa() + "\n\nTitulo: " + getTitulo() + "\nAno: " + getAno() + "\nAutores: " + getAutores()
        + "\nGrau: " + getGrau() + "\nInstituiçao de defendimento: " + getInstituição_defendimento() + "\n\nNome do coordenador: " + coordenador.getNome_cordenador()
        + "\nE-mail: " + coordenador.getEmail() + "\nInstituiçao de origem: " + coordenador.getInstituição_origem() + "\nEndereço: " + coordenador.getEndereço()
        + "\nFunçao: " + coordenador.getFunção());
        System.out.println("+------------------------------------------------------+");
    }



    /**
     * Getter padrão para o atributo grau.
     * Retorna o grau da tese.
     * 
     * @return o grau da tese
     */
    public String getGrau() {
        return grau;
    }


    /**
     * Setter padrão para o atributo grau.
     * Define o grau da tese.
     * 
     * @param grau Grau da tese
     */
    public void setGrau(String grau) {
        this.grau = grau;
    }

    /**
     * Getter padrão para o atributo instituição_defendimento.
     * Retorna a instituição de defendimento da tese.
     * 
     * @return a instituição de defendimento da tese
     */
    public String getInstituição_defendimento() {
        return instituição_defendimento;
    }

    /**
     * Setter padrão para o atributo instituição_defendimento.
     * Definea instituição de defendimento da tese
     * 
     * @param instituição_defendimento Instituição de defendimento da tese
     */
    public void setInstituição_defendimento(String instituição_defendimento) {
        this.instituição_defendimento = instituição_defendimento;
    }

    /**
     * Getter padrão para o atributo coordenador.
     * Retorna o coordenador da tese.
     * 
     * @return o coordenador da tese
     */
    public Coordenador getCoordenador() {
        return coordenador;
    }

    /**
     * Setter padrão para o atributo coordenador.
     * Define o coordenador da tese.
     * 
     * @param coordenador Coordenador da tese
     */
    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    
}
