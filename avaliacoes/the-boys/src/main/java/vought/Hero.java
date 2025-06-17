package vought;
/**
 * Criação da relação Pai e Filha entres as classes, respectivamente, "Person" e "Hero".
 * Essa Classe representa os Heróis e suas características.
 */
public class Hero extends Person {

	private String nickname;
	private int energy;
	private int strength;
	private int speed;
	
	/**
	 * Construtor sem parâmetros do tipo "Hero" (vazio).
	 */
	public Hero() {

	}

	/**
	 * Construtor inicializado com os parâmetros da Classe "Hero".
	 * @param nickname Atributo que representa o apelido do Herói.
	 * @param energy Atributo que representa o Nível de Energia do Herói (0-100).
	 * @param strength Atributo que representa o Nível de Força do Herói (0-100).
	 * @param speed Atributo que representa o Nível de Velocidade do Herói (0-100).
	 */
	public Hero(String nickname, int energy, int strength, int speed) {
		this.nickname = nickname;
		this.energy = energy;
		this.strength = strength;
		this.speed = speed;
	}

	/**
	 * Construtor inicializado com os parâmetros da Classe "Hero" e da Classe "Person" (Herança de Pai e Filha).
	 * @param person Atributo recebido pela herança entre classes "Hero" e "Person".
	 * @param nickname Atributo que representa o apelido do Herói.
	 * @param energy Atributo que representa o Nível de Energia do Herói (0-100).
	 * @param strength Atributo que representa o Nível de Força do Herói (0-100).
	 * @param speed Atributo que representa o Nível de Velocidade do Herói (0-100).
	 */
	public Hero(Person person, String nickname, int energy, int strength, int speed) {
		super(person.getName(), person.getSurname());
		this.nickname = nickname;
		this.energy = energy; 
		this.strength = strength;
		this.speed = speed;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
