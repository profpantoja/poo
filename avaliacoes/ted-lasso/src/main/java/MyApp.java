import model.Player;
import model.Team;

/**
 * A classe Myapp define a aplicação para as classes e métodos criados do universo da série "Ted lasso"
 * 
 */
public class MyApp {
    
    public static void main(String[] args){
       
        Player p1 = new Player();
        p1.setName("Roy");
        p1.setSurname("Kent");
        p1.setPosition("Meio-campo");
        p1.setNumber(6);

        Player p2 = new Player();
        p2.setName("Dani");
        p2.setSurname("Rojas");
        p2.setPosition("Atacante");
        p2.setNumber(4);

        Player p3 = new Player();
        p3.setName("Jamie");
        p3.setSurname("Tartt");
        p3.setPosition("Atacante");
        p3.setNumber(9);

        Team t1 = new Team();
        t1.setName("Richmond");
        t1.setColors("Azul, Branca e Amarela");
        t1.getPlayers().add(p1);
        t1.getPlayers().add(p2);
        t1.getPlayers().add(p3);
    }
}
