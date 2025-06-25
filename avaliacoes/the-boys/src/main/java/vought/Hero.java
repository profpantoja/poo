package vought;

public class Hero extends Person {

	private String nickname;
	private int energy;
	private int strength;
	private int speed;

	public Hero() {

	}

	public Hero(String nickname, int energy, int strength, int speed) {
		this.nickname = nickname;
		this.energy = energy;
		this.strength = strength;
		this.speed = speed;
	}

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
