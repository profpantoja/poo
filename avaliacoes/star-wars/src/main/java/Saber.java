/**
 * Class tha represents a Saber weapon in the Star Wars universe.
 * It extends the Weapon class.
 */
public class Saber extends Weapon {
    /**
     * Constructor for the Saber class.
     * @param descricao the description of the saber
     * @param dano the damage dealt by the saber
     */
    public Saber(String descricao, int dano) {
        super(descricao, dano);
    }
    /**
     * Method that simulates the attack "slash" with the saber.
     */
    public void slash() {
        System.out.println("O sabre " + this.getDescricao() + " atacou!");
    }

}