package vought;
/**
 * Essa Classe representa o tipo Pessoa e suas características.
 */
public class Person {

	private String name;
	private String surname;
	/**
	 * Construtor sem parâmetros do tipo "Person" (vazio).
	 */
	public Person() {

	}
	
	/**
	 * Construtor inicializado com os parâmetros da Classe "Person".
	 * @param name Atributo que representa o nome de Pessoa.
	 * @param surname Atrbuto que representa o sobrenome de Pessoa.
	 */
	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	/**
	 * Método Getter para retornar o valor nome.
	 * @return Retorna o valor nome.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Método Setter para atribuir um valor à nome.
	 * @param name Atribui um valor à nome nessa instância.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Método Getter para retornar o valor sobrenome.
	 * @return Retorna o valor sobrenome.
	 */
	public String getSurname() {
		return surname;
	}
	
	/**
	 * Método Setter para atribuir um valor à sobrenome.
	 * @param surname Atribui um valor à sobrenome nessa instância.
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

}
