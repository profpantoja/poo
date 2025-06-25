package model;

/**
 * Represents a player in a sports team, containing basic personal and game-related information.
 */
public class Player {

    /** The player's first name. */
    private String name;

    /** The player's surname. */
    private String surname;

    /** The player's jersey number. */
    private int number;

    /** The player's position in the team (ex: goalkeeper, defender, attacker, etc.). */
    private String position;

    /**
     * Gets the player's position in the team.
     *
     * @return the position of the player
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the player's position in the team.
     *
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Gets the player's first name.
     *
     * @return the first name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the player's first name.
     *
     * @param name the first name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the player's surname.
     *
     * @return the surname of the player
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the player's surname.
     *
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Gets the player's jersey number.
     *
     * @return the jersey number of the player
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the player's jersey number.
     *
     * @param number the jersey number to set
     */
    
    public void setNumber(int number) {
        this.number = number;
    }

}