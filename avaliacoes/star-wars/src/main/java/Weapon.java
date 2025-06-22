/**
 * Class that represents a weapon in the Star Wars universe.
 */
public class Weapon {

    private String descricao;
    private int dano;
    /**
     * Constructor for the Weapon class.
     * @param descricao The description of the weapon
     * @param dano The damage dealt by the weapon
     */
    public Weapon(String descricao, int dano) {

        this.descricao = descricao;
        this.dano = dano;
    }
    /**
     * Returns the description of the selected weapon.
     * @returns The description itself
     */
    public String getDescricao() {
        return descricao;
    }
    /**
     * Sets the description of the selected weapon.
     * @param descricao The description itself
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    /**
     * Returns the damage dealt by the selected weapon.
     * @returns The damage itself
     */
    public int getDano() {
        return dano;
    }
    /**
     * Sets the damage dealt by the selected weapon.
     * @param dano The damage itself
     */
    public void setDano(int dano) {
        this.dano = dano;
    }
    /**
     * Returns the weapon, dropping it in the process.
     * @return The weapon itself
     */
    public Weapon drop() {
        return this;
    }
    /**
     * Returns the weapon, picking it up in the process.
     * @return The weapon itself
     */
    public Weapon pickUp() {
        return this;
    }

}
