package model;

/**
 * A classe Player define um jogador de futebol no universo da série "Ted lasso"
 * 
 */
public class Player {

    private String name;
    private String surname;
    private Integer number;
    private String position;
    
    /**
     * Getter padrão para o atributo "name" (Nome do jogador).
     *
     * @return o atributo name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter padrão para o atributo "name".
     * 
     * @param name Nome do jogador
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Getter padrão para o atributo "surname" (Sobrenome do jogador).
     *
     * @return o atributo surname
     */
    public String getSurname() {
        return this.surname;
    }
    
    /**
     * Setter padrão para o atributo "surname".
     * 
     * @param surname Sobrenome do jogador
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    /**
     * Getter padrão para o atributo "number" (Número da camisa do jogador).
     *
     * @return o atributo number
     */
    public Integer getNumber() {
        return this.number;
    }
    
    /**
     * Setter padrão para o atributo "number".
     * 
     * @param number Número da camisa do jogador
     */
    public void setNumber(Integer number) {
        this.number = number;
    }
    
    /**
     * Getter padrão para o atributo "position" (Posição do jogador em campo).
     *
     * @return o atributo position
     */
    public String getPosition() {
        return this.position;
    }
    
    /**
     * Setter padrão para o atributo "position".
     * 
     * @param position Posição do jogador em campo
     */
    public void setPosition(String position) {
        this.position = position;
    }
}
