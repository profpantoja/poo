/**
 * Class that representes a person in the Star wars universe.
 */

public class Pessoa {

    private String nome;
    private String sobrenome;
    private String sexo;
    /**
     * Default constructor for the Pessoa class.
     */
    public Pessoa() {
 
    }
    /**
     * Constructor for the Pessoa class with parameters(does not include biological sex).
     * @param nome Name of the person
     * @param sobrenome Surname of the person
     */
    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    /**
     * Constructor for the Pessoa class with parameters(includes biological sex).
     * @param nome Name of the person
     * @param sobrenome Surname of the person
     * @param sexo Biological sex of the person
     */
    public Pessoa(String nome, String sobrenome, String sexo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
    }
    /**
     * Method thaat prints the name, surname and biological sex of the person.
     */
    void imprime() {
        System.out.println(this.nome);
        System.out.println(this.sobrenome);
        System.out.println(this.sexo);
    }
    /**
     * Returns the name of the person.
     * @return The name itself
     */
    public String getNome() {
        return nome;
    }
    /**
     * Sets the name of the person.
     * @param nome The name itself
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Returns the surname of the person.
     * @return The surname itself
     */
    public String getSobrenome() {
        return sobrenome;
    }
    /**
     * Sets the surname of tthe person
     * @param sobrenome The surname itself
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    /**
     * Returns the biological sex of the person.
     * @return The biological sex itself
     */
    public String getSexo() {
        return sexo;
    }
    /**
     * Sets the biological sex of the person.
     * @param sexo The biological sex itself
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
