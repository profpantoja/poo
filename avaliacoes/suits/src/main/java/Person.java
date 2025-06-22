/**
 * É uma classe para Pessoa.
 * Contém informações específicas sobre a Pessoa, como nome, sobrenome, genero e trabalho.
 * Possui métodos para obter e definir essas informações.
 */
public class Person {

    /**
     * Atributos da classe Person.
     * name: Nome da pessoa.
     * surname: Sobrenome da pessoa.
     * gender: Gênero da pessoa.
     * job: Tipo de trabalho da pessoa da classe abstrata TypeJob.
     */
    private String name;
    private String surname;
    private String gender;
    private TypeJob job;

    /**
     * Construtor padrão da classe Person.
     * Inicializa a pessoa sem nome, sobrenome e gênero.
     */
    Person() {

    }

    /**
     * Construtor da classe Person.
     * Inicializa a pessoa com um nome e um sobrenome especificados.
     * @param name Nome da pessoa.
     * @param surname Sobrenome da pessoa.
     */
    Person(String name,String surname) {
        this.name = name;
        this.surname = surname;
    }

    /**
     * Construtor da classe Person.
     * Inicializa a pessoa com um nome e um sobrenome especificados.
     * @param name Nome da pessoa.
     * @param surname Sobrenome da pessoa.
     * @param gender Gênero da pessoa.
     */
    Person(String name, String surname, String gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    /**
     * Obtém o nome da pessoa.
     * @return Nome da pessoa.
     */
    public String getName() {
        return name;
    }

    /**
     * Define o nome da pessoa.
     * @param name Nome da pessoa a ser definido.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtém o sobrenome da pessoa.
     * @return Sobrenome da pessoa.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Define o sobrenome da pessoa.
     * @param surname Sobrenome da pessoa a ser definido.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Obtém o gênero da pessoa.
     * @return Gênero da pessoa.
     */
    public String getGender() {
        return gender;
    }

    /**
     * Define o gênero da pessoa.
     * @param gender Gênero da pessoa a ser definido.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Obtém o trabalho da pessoa.
     * @return Tipo de trabalho da pessoa.
     */
    public TypeJob getJob() {
        return job;
    }

    /**
     * Define o trabalho da pessoa.
     * @param job Tipo de trabalho a ser definido.
     */
    public void setJob(TypeJob job) {
        this.job = job;
    }

}
