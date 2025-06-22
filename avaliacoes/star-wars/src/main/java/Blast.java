/**
 * Class that represents a Blast in the Star Wars universe.
 * It extends the Weapon class.
 */
public class Blast extends Weapon {
    /**
     * Default constructor for the Blast class.
     * @param descricao The description of the weapon
     * @param dano The damage dealt by the weapon
     */
    public Blast(String descricao, int dano) {
        super(descricao, dano);
    }
    /**
     * Method that simulates the action of shooting the blaster.
     */
    public void shot() {
        System.out.println("O blaster " +this.getDescricao() + " atirou!");
    }

}