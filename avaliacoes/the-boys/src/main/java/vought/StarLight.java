package vought;

/**
 * Representa o personagem StarLight, que é uma extensão da classe {@link Hero}.
 * 
 * Esta classe herda todos os atributos e comportamentos da classe Hero,
 * podendo ser usada para definir características e poderes específicos do StarLight.
 */
public class StarLight extends Hero {

    /**
     *Construtor que cria um StarLight a partir de uma pessoa base,
     * com apelido, energia, força e velocidade definidos.
     * 
     * @param person pessoa base para o StarLight
     * @param nickname apelido do StarLight
     * @param energy energia do StarLight
     * @param strength força do StarLight
     * @param speed velocidade do StarLight
     */
    public StarLight(Person person, String nickname, int energy, int strength, int speed) {
        super(person, nickname, energy, strength, speed);
    }
}
