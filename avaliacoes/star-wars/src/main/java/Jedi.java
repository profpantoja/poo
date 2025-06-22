import java.util.ArrayList;

import interfaces.Force;
/**
 * Class that represents a Jedi in the Star Wars universe.
 * It extends the Pessoa class and implements the Force interface.
 */
public class Jedi extends Pessoa implements Force {

    private String titulo = "Jedi";
    private ArrayList<Weapon> weapons;
    /**
     * Default constructor for the Jedi class.
     */
    public Jedi() {
        super();
        this.weapons = new ArrayList<Weapon>();
    }
    /**
     * Constructor for the Jedi class with parameters.
     * @param nome The name of the Jedi
     * @param sobrenome The surname of the Jedi
     */
    public Jedi(String nome, String sobrenome) {
        super(nome, sobrenome);
        this.weapons = new ArrayList<Weapon>();
    }
    /**
     * Returns the title of the Jedi
     * @return The title itself
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * Sets the title of the Jedi.
     * @param titulo The title itself
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    /**
     * Returns of the list of weapons held by the Jedi.
     * @return
     */
    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }
    /**
     * Sets the list of weapons held by the Jedi.
     * @param weapons
     */
    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }
    /**
     * Method that simulates the mind control skill of the Jedi.
     */
    @Override
    public void mindControl() {
        System.out.println("[Jedi]: Do what I wish");
    
    }
    /**
     * Method that simulates the farseeing skill of the Jedi.
     */
    @Override
    public void farseeing() {
        System.out.println("[Jedi]: Visão amplificada");
    }
    /**
     * Method that simulates the telepath skill of the Jedi.
     */
    @Override
    public void telepath() {
        System.out.println("[Jedi]: Telepatia ativada");
    }
    /**
     * Method that simulates the levitation skill of the Jedi.
     */
    @Override
    public void levitation() {
        System.out.println("[Jedi]: Levitação ativada");
    }
    /**
     * Method that simulates the patience skill of the Jedi.
     */
    public void patience() {

    }
    /**
     * Method that prints the name, surname, and title of the Sith.
     */
    public void imprime() {
        System.out.println(super.getNome() + " " + super.getSobrenome());
        System.out.println("Titulo: " + titulo);
    }

}