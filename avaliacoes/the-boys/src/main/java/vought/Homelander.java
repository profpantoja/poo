package vought;

/**
 * Representa o personagem Homelander, que é um tipo específico de {@link Hero}.
 * 
 * Esta classe herda todos os atributos e comportamentos da classe Hero.
 */
public class Homelander extends Hero {

    /**
     * Construtor que cria um Homelander a partir de uma pessoa base,
     *com apelido, energia, força e velocidade definidos.
     * 
     * @param person pessoa base para o Homelander
     * @param nickname apelido do Homelander
     * @param energy energia do Homelander
     * @param strength força do Homelander
     * @param speed velocidade do Homelander
     */
    public Homelander(Person person, String nickname, int energy, int strength, int speed) {
        super(person, nickname, energy, strength, speed);
    }
}
