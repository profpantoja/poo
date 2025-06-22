package model;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe Team define um time de futebol no universo da série "Ted lasso"
 * 
 */
public class Team {
    
    private String name;
    private String colors;
    private List<Player> players = new ArrayList<Player>() {
        
    };
    
    /**
     * Getter padrão para o atributo "name" (Nome do time).
     *
     * @return o atributo name
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Setter padrão para o atributo "name".
     * 
     * @param name Nome do time
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Getter padrão para o atributo "colors" (Cores do time).
     *
     * @return o atributo colors
     */
    public String getColors() {
        return this.colors;
    }
    
    /**
     * Setter padrão para o atributo "colors".
     * 
     * @param colors Cores do time
     */
    public void setColors(String colors) {
        this.colors = colors;
    }
    
    /**
     * Getter padrão para o atributo "players" (Jogadores do time).
     *
     * @return o atributo players
     */
    public List<Player> getPlayers() {
        return this.players;
    }
    
    /**
     * Setter padrão para o atributo "players".
     * 
     * @param players Jogadores do time
     */
    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
