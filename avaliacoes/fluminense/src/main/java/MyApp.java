import java.util.ArrayList;
import model.Player;
import model.Team;

/**
 * Main class of the application that demonstrates the creation of players and a soccer team.
 * Instantiates Player and Team objects, assigns values, and organizes the players into a team.
 */
public class MyApp {

    /**
     * Main method that runs the program flow.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {

        // Create and configure player German Cano
        Player german = new Player();
        german.setName("German");
        german.setSurname("Cano");
        german.setNumber(14);
        german.setPosition("forward");

        // Create and configure player John Kennedy
        Player john = new Player();
        john.setName("John");
        john.setSurname("Kennedy");
        john.setNumber(9);
        john.setPosition("forward");

        // Create and configure player André
        Player andre = new Player();
        andre.setName("André");
        andre.setSurname(null);
        andre.setNumber(7);
        andre.setPosition("midfielder");

        // Create the Fluminense team and set its colors
        Team fluminense = new Team();
        fluminense.setName("Fluminense");
        fluminense.setColors("green, maroon, and white");
        
        // Add the players to the list and assign to the team
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(german);
        players.add(john);
        players.add(andre);
        fluminense.setPlayers(players);
        
    }
}