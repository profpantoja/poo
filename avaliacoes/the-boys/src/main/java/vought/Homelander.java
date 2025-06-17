package vought;
/**
 * Criação da relação Pai e Filha entres as classes, respectivamente, "Hero" e "Homelander".
 * Dessa forma, "Homelander" recebe as características de "Hero".
 */
public class Homelander extends Hero {
    
    /**
     * Construtor inicializado pelos atributos da classe "Hero".
     * @param person Atributo que representa Herói como Pessoa.
     * @param nickname Atributo que representa o Apelido do Herói.
     * @param energy Atributo que representa o Nível de Energia do Herói (0-100).
     * @param strength Atributo que representa o Nível de Força do Herói(0-100).
     * @param speed Atributo que representa o Nível de Velocidade do Herói(0-100).
     */
    public Homelander(Person person, String nickname, int energy, int strength, int speed) {
        super(person, nickname, energy, strength, speed);
    }

}
