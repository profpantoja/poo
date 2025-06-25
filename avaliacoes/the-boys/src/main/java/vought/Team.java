package vought;

import java.util.ArrayList;
import java.util.List;

public class Team {

        private List<Hero> heroes;

        public Team() {
                this.heroes = new ArrayList<Hero>();
        }

        public Team(List<Hero> heroes) {
                this.heroes = heroes;
        }

        public List<Hero> getHeroes() {
                return heroes;
        }

        public void setHeroes(List<Hero> heroes) {
                this.heroes = heroes;
        }

}
