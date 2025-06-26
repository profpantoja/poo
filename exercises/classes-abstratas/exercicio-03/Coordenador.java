

/**
 * A classe Coordenador define características de um coordenador de determinada publicação científica.
 * 
 */
public class Coordenador {

    private String nome_cordenador;
    private String email;
    private String instituição_origem;
    private String endereço;
    private String função;

    /**
     * Construtor da classe Coordenador que recebe cinco parâmetros
     * Define os parâmetros recebidos
     * 
     * @param nome_cordenador Nome do coordenador
     * @param email E-mail do coordenador
     * @param instituição_origem Instituição de origem do coordenador
     * @param endereço Endereço do coordenador
     * @param função Função do coordenador
     */
    public Coordenador(String nome_cordenador, String email, String instituição_origem, String endereço,
            String função) {
        this.nome_cordenador = nome_cordenador;
        this.email = email;
        this.instituição_origem = instituição_origem;
        this.endereço = endereço;
        this.função = função;
    }

    
    /**
     * Getter padrão para o atributo nome_coordenador.
     * Retorna o nome do coordenador.
     * 
     * @return o nome do coordenador
     */
    public String getNome_cordenador() {
        return nome_cordenador;
    }
    
    
    /**
     * Setter padrão para o atributo nome_coordenador.
     * Define o nome do coordenador.
     * 
     * @param nome_cordenador Nome do coordenador
     */
    public void setNome_cordenador(String nome_cordenador) {
        this.nome_cordenador = nome_cordenador;
    }
    
    /**
     * Getter padrão para o atributo email.
     * Retorna o e-mail do coordenador.
     * 
     * @return o e-mail do coordenador
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Setter padrão para o atributo email.
     * Define o e-mail do coordenador.
     * 
     * @param email E-mail do coordenador
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Getter padrão para o atributo instituição_origem.
     * Retorna a instituição de origem do coordenador.
     * 
     * @return a instituição de origem do coordenador
     */
    public String getInstituição_origem() {
        return instituição_origem;
    }
    
    /**
     * Setter padrão para o atributo nome_coordenador.
     * Define a instituição de origem do coordenador.
     * 
     * @param instituição_origem Instituição de origem do coordenador
     */
    public void setInstituição_origem(String instituição_origem) {
        this.instituição_origem = instituição_origem;
    }
    
    /**
     * Getter padrão para o atributo endereço.
     * Retorna o endereço do coordenador.
     * 
     * @return o endereço do coordenador
     */
    public String getEndereço() {
        return endereço;
    }
    
    /**
     * Setter padrão para o atributo endereço.
     * Define o endereço do coordenador.
     * 
     * @param endereço Endereço do coordenador
     */
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    
    /**
     * Getter padrão para o atributo função.
     * Retorna a função do coordenador.
     * 
     * @return a função do coordenador
     */
    public String getFunção() {
        return função;
    }
    
    /**
     * Setter padrão para o atributo função.
     * Define a função do coordenador.
     * 
     * @param função Função do coordenador
     */
    public void setFunção(String função) {
        this.função = função;
    }


    
    
}
