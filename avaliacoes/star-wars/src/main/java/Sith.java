import java.util.ArrayList;

import interfaces.Force;
/**
 * Class that represents a Sith in the Star Wars universe.
 * It extends the Pessoa class and implements the Force interface.
 */
public class Sith extends Pessoa implements Force {
    
    private String titulo = "Sith";
    private ArrayList<Weapon> weapons;
    /**
     * Default constructor for the Sith class.
     */
    public Sith() {
        super();
        this.weapons = new ArrayList<Weapon>();
    }
    /**
     * Constructor for the Sith class with parameters.
     * @param nome The name of the Sith
     * @param sobrenome The surname of the Sith
     */
    public Sith(String nome, String sobrenome) {
        super(nome, sobrenome);
        this.weapons = new ArrayList<Weapon>();
    }
    /**
     * Returns the title of the Sith.
     * @return The title itself
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * Sets the title of the Sith.
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * Returns the list of weapons held by the Sith.
     * @return The weapon itself
     */
    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }
    /**
     * Sets the list of weapons held by the Sith.
     * @param weapons
     */
    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }
    /**
     * Method that simulates the mind control skill of the Sith.
     */
    @Override
    public void mindControl() {
        System.out.println("[Sith]: Controle mental ativado");

    }
    /**
     * Method that simulates the farseeing skill of the Sith.
     */
    @Override
    public void farseeing() {
        System.out.println("[Sith]: Visão amplificada");

    }
    /**
     * Method that simulates the telepath skill of the Sith.
     */
    @Override
    public void telepath() {
        System.out.println("[Sith]: Telepatia ativada");

    }
    /**
     * Method that simulates the levitation skill of the Sith.
     */
    @Override
    public void levitation() {
        System.out.println("[Sith]: Levitação ativada");

    }
    /**
     * Method that simulates the lightning skill of the Sith.
     */
    public void lightning() {

    }
    /**
     * Method that prints the name, surname, and title of the Sith.
     */
    public void imprime() {
        System.out.println(super.getNome() + " " + super.getSobrenome());
        System.out.println("Titulo: " + titulo);
    }

}
