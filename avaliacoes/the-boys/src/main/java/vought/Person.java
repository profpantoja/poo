package vought;

/**
 * Representa uma pessoa com nome e sobrenome.
 */
public class Person {

    /**
     * Nome da pessoa.
     */
    private String name;

    /**
     * Sobrenome da pessoa.
     */
    private String surname;

    /**
     * Construtor padrão da classe Person.
     */
    public Person() {
    }

    /**
     * Construtor que inicializa uma pessoa com nome e sobrenome.
     *
     * @param name nome da pessoa
     * @param surname sobrenome da pessoa
     */
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    /**
     * Obtém o nome da pessoa.
     *
     * @return nome da pessoa
     */
    public String getName() {
        return name;
    }

    /**
     * Define o nome da pessoa.
     *
     * @param name nome a ser definido
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtém o sobrenome da pessoa.
     *
     * @return sobrenome da pessoa
     */
    public String getSurname() {
        return surname;
    }

    /**
     *Define o sobrenome da pessoa.
     *
     * @param surname sobrenome a ser definido
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
}
