package vought;

/**
 * Representa um herói, que é uma extensão da classe {@link Person}.
 * Contém atributos específicos de um herói, como apelido, energia, força e velocidade.
 */
public class Hero extends Person {

    /**
     * Apelido do herói.
     */
    private String nickname;

    /**
     * Energia do herói.
     */
    private int energy;

    /**
     * Força do herói.
     */
    private int strength;

    /**
     * Velocidade do herói.
     */
    private int speed;

    /**
     * Construtor padrão da classe Hero.
     */
    public Hero() {
    }

    /**
     * Construtor que inicializa o herói com apelido, energia, força e velocidade.
     *
     * @param nickname apelido do herói
     * @param energy energia do herói
     * @param strength força do herói
     * @param speed velocidade do herói
     */
    public Hero(String nickname, int energy, int strength, int speed) {
        this.nickname = nickname;
        this.energy = energy;
        this.strength = strength;
        this.speed = speed;
    }

    /**
     * Construtor que cria um herói a partir de uma pessoa existente,
     * adicionando apelido, energia, força e velocidade.
     *
     * @param person pessoa base para o herói
     * @param nickname apelido do herói
     * @param energy energia do herói
     * @param strength força do herói
     * @param speed velocidade do herói
     */
    public Hero(Person person, String nickname, int energy, int strength, int speed) {
        super(person.getName(), person.getSurname());
        this.nickname = nickname;
        this.energy = energy;
        this.strength = strength;
        this.speed = speed;
    }

    /**
     * Obtém o apelido do herói.
     *
     * @return apelido do herói
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Define o apelido do herói.
     *
     * @param nickname apelido a ser definido
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * Obtém a energia do herói.
     *
     * @return energia do herói
     */
    public int getEnergy() {
        return energy;
    }

    /**
     * Define a energia do herói.
     *
     * @param energy energia a ser definida
     */
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    /**
     * Obtém a força do herói.
     *
     * @return força do herói
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Define a força do herói.
     *
     * @param strength força a ser definida
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * Obtém a velocidade do herói.
     *
     * @return velocidade do herói
     */
    public int getSpeed() {
        return speed;
    }

    /**
     *Define a velocidade do herói.
     *
     * @param speed velocidade a ser definida
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
