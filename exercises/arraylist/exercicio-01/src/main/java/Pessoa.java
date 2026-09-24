

/**
 * A classe Pessoa define uma representação de uma pessoa que irá adotar um cão presente no abrigo da ONG CãoNino.
 */
public class Pessoa {

    private String nome, endereço, tel, email;
    private char sexo;
    private Cão cão;
    
    /**
     * Construtor padrão da classe Pessoa.
     * Instancia um cão que é associado como um atributo para a pessoa.
     * 
     */
    public Pessoa() {
        this.cão = new Cão();
    }

    /**
     * Construtor da classe Pessoa que recebe seis parâmetros.
     * Define os parâmetros recebidos.
     * 
     * @param nome Nome da pessoa
     * @param endereco Endereço da pessoa
     * @param tel Telefone da pessoa
     * @param email E-mail da pessoa
     * @param sexo Sexo da pessoa
     * @param cão Cachorro que a pessoa está adotando 
     */
    public Pessoa(String nome, String endereco, String tel, String email, char sexo, Cão cão) {
        this.nome = nome;
        this.endereço = endereco;
        this.tel = tel;
        this.email = email;
        this.sexo = sexo;
        this.cão = cão;
    }

    /**
     * Construtor da classe Pessoa que recebe cinco parâmetros.
     * Define os parâmetros recebidos.
     * 
     * @param nome Nome da pessoa
     * @param endereco Endereço da pessoa
     * @param tel Telefone da pessoa
     * @param email E-mail da pessoa
     * @param sexo Sexo da pessoa
     */
    public Pessoa(String nome, String endereco, String tel, String email, char sexo) {
        this.nome = nome;
        this.endereço = endereco;
        this.tel = tel;
        this.email = email;
        this.sexo = sexo;
    }

    /**
     * Getter padrão para o atributo nome.
     * Retorna o nome da pessoa.
     * 
     * @return o nome da pessoa
     */
    public String getNome() {
        return nome;
    }

    /**
     * Setter padrão para o atributo nome.
     * Define o nome da pessoa.
     * 
     * @param nome Nome da pessoa
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * Getter padrão para o atributo endereço.
     * Retorna o endereço da pessoa.
     * 
     * @return o endereço da pessoa
     */
    public String getEndereço() {
        return endereço;
    }
    
    /**
     * Setter padrão para o atributo endereço.
     * Define o endereço da pessoa.
     * 
     * @param endereço Endereço da pessoa
     */
    public void setEndereço(String endereco) {
        this.endereço = endereco;
    }
    
    /**
     * Getter padrão para o atributo tel.
     * Retorna o telefone da pessoa.
     * 
     * @return o telefone da pessoa
     */
    public String getTel() {
        return tel;
    }
    
    /**
     * Setter padrão para o atributo telefone.
     * Define o telefone da pessoa.
     * 
     * @param tel Telefone da pessoa
     */
    public void setTel(String tel) {
        this.tel = tel;
    }
    
    /**
     * Getter padrão para o atributo email.
     * Retorna o e-mail da pessoa.
     * 
     * @return o e-mail da pessoa
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Setter padrão para o atributo email.
     * Define o e-mail da pessoa.
     * 
     * @param email E-mail da pessoa
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Getter padrão para o atributo sexo.
     * Retorna o sexo da pessoa.
     * 
     * @return o sexo da pessoa
     */
    public char getSexo() {
        return sexo;
    }
    
    /**
     * Setter padrão para o atributo sexo.
     * Define o sexo da pessoa.
     * 
     * @param sexo Sexo da pessoa
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    /**
     * Getter padrão para o atributo cão.
     * Retorna o cachorro adotado pela pessoa.
     * 
     * @return o cachorro adotado pela pessoa
     */
    public Cão getCão() {
        return cão;
    }
    
    /**
     * Setter padrão para o atributo nome.
     * Define o cachorro adotado pela pessoa.
     * 
     * @param cão Cachorro adotado pela pessoa
     */
    public void setCão(Cão cão) {
        this.cão = cão;
    }

}
