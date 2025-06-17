import vought.BillyCompoundV;
import vought.Hero;
import vought.Homelander;
import vought.HomelanderCompoundV;
import vought.HughieCompoundV;
import vought.Person;
import vought.StarLight;
import vought.StarLightCompoundV;
import vought.Team;
/**
 * Classe que representa a Main, onde os métodos serão chamados e utilizados.
 */
public class MyApp {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        Person ashley = new Person("Ashley", "Barret");
        Person billy = new Person("Billy", "Butcher");
        Person hughie = new Person("Hughie", "Campbell");
        Person anne = new Person("Rebecca", "Anne January");
        Person john = new Person("John", "Guilman");

        StarLight starlight = new StarLight(anne, "Starlight", 100, 80, 90);
        Homelander homelander = new Homelander(john, "Homelander", 100, 100, 100);

        StarLightCompoundV anneCompoundV = new StarLightCompoundV();
        HomelanderCompoundV johnCompoundV = new HomelanderCompoundV();

        anneCompoundV.usePower(starlight);
        anneCompoundV.giveStrength(starlight);
        anneCompoundV.maxSpeed(starlight);
        anneCompoundV.fly(starlight);
        anneCompoundV.activateDurability(starlight);
        johnCompoundV.usePower(homelander);
        johnCompoundV.giveStrength(homelander);
        johnCompoundV.maxSpeed(homelander);
        johnCompoundV.fly(homelander);
        johnCompoundV.activateDurability(homelander);

        Team seven = new Team();
        seven.getHeroes().add(starlight);
        seven.getHeroes().add(homelander);        

        Hero billyHero = new Hero(billy, "Brutus", 10, 10, 10);
        BillyCompoundV billyCompoundV = new BillyCompoundV();
        billyCompoundV.activateDurability(billyHero);
        System.out.println("Energy is now " + billyHero.getEnergy());

        Hero hughieHero = new Hero(billy, "Brutus", 10, 10, 10);
        HughieCompoundV hughieCompoundV = new HughieCompoundV();

        Team boys = new Team();
        boys.getHeroes().add(hughieHero);
        boys.getHeroes().add(billyHero);   

    }
}
