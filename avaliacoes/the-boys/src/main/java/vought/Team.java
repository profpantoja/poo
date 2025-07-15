package vought;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa um time composto por uma lista de heróis.
 */
public class Team {

    /**
     * Lista de heróis que compõem o time.
     */
    private List<Hero> heroes;

    /**
     * Construtor padrão que inicializa um time vazio.
     */
    public Team() {
        this.heroes = new ArrayList<Hero>();
    }

    /**
     * Construtor que inicializa um time com uma lista de heróis fornecida.
     *
     * @param heroes lista de heróis para compor o time
     */
    public Team(List<Hero> heroes) {
        this.heroes = heroes;
    }

    /**
     * Obtém a lista de heróis do time.
     *
     * @return lista de heróis
     */
    public List<Hero> getHeroes() {
        return heroes;
    }

    /**
     *Define a lista de heróis do time.
     *
     * @param heroes nova lista de heróis
     */
    public void setHeroes(List<Hero> heroes) {
        this.heroes = heroes;
    }
}
