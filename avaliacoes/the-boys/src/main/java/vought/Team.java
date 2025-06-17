package vought;

import java.util.ArrayList;
import java.util.List;

/**
 * Essa Classe representa o Time de Heróis e suas características.
 */
public class Team {
        
        private List<Hero> heroes;
        
        /**
         * Construtor sem parâmetros que inicializa uma lista de heróis(vazia).
         * 
         */
        public Team() {
                this.heroes = new ArrayList<Hero>();
        }
        
        /**
         * Construtor com parâmetros de uma Lista de Heróis já existente.
         * 
         * @param heroes  Lista dos Heróis que farão parte da Classe Time.
         */
        public Team(List<Hero> heroes) {
                this.heroes = heroes;
        
        }
        
        /**Método Getter para retornar o valor da lista de heróis.
         * 
         * @return Retorna o valor da lista de heróis nessa instância.
         */
        public List<Hero> getHeroes() {
                return heroes;
        }

        /**
         * Método Setter para atribuir um valor à lista de heróis.
         * 
         * @param heroes Atribui o valor na lista de heróis nessa instância.
         */
        public void setHeroes(List<Hero> heroes) {
                this.heroes = heroes;
        }

}
