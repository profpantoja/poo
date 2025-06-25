package model;

import java.util.ArrayList;

/**
 * Represents a sports team, containing information about the team's name, colors,
 * and a list of players.
 */
public class Team {

    /** The name of the team. */
    private String name;

    /** The colors representing the team. */
    private String colors;

    /** The list of players in the team. */
    private ArrayList<Player> players = new ArrayList<Player>();

    /**
     * Gets the name of the team.
     *
     * @return the name of the team
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the team.
     *
     * @param name the name to set for the team
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the colors of the team.
     *
     * @return the colors representing the team
     */
    public String getColors() {
        return colors;
    }

    /**
     * Sets the colors of the team.
     *
     * @param colors the colors to set for the team
     */
    public void setColors(String colors) {
        this.colors = colors;
    }

    /**
     * Gets the list of players in the team.
     *
     * @return an ArrayList containing the players in the team
     */
    
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * Sets the list of players in the team.
     *
     * @param players the ArrayList of players to set for the team
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    
}