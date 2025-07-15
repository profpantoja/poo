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
 * Classe principal de aplicação para demonstrar a criação de personagens, 
 * atribuição de poderes e formação de times.
 */
public class MyApp {

    /**
     * Método principal que instancia pessoas, heróis, poderes e times,
     * executando algumas ações básicas para exemplificar o funcionamento do sistema.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // Criação de objetos Person
        Person ashley = new Person("Ashley", "Barret");
        Person billy = new Person("Billy", "Butcher");
        Person hughie = new Person("Hughie", "Campbell");
        Person anne = new Person("Rebecca", "Anne January");
        Person john = new Person("John", "Guilman");

        // Criação de heróis a partir das pessoas
        StarLight starlight = new StarLight(anne, "Starlight", 100, 80, 90);
        Homelander homelander = new Homelander(john, "Homelander", 100, 100, 100);

        // Instanciação das classes que representam os poderes dos heróis
        StarLightCompoundV anneCompoundV = new StarLightCompoundV();
        HomelanderCompoundV johnCompoundV = new HomelanderCompoundV();

        // Uso dos poderes básicos e especiais do StarLight
        anneCompoundV.usePower(starlight);
        anneCompoundV.giveStrength(starlight);
        anneCompoundV.maxSpeed(starlight);
        anneCompoundV.fly(starlight);
        anneCompoundV.activateDurability(starlight);

        // Uso dos poderes básicos e especiais do Homelander
        johnCompoundV.usePower(homelander);
        johnCompoundV.giveStrength(homelander);
        johnCompoundV.maxSpeed(homelander);
        johnCompoundV.fly(homelander);
        johnCompoundV.activateDurability(homelander);

        // Criação do time "seven" e adição dos heróis
        Team seven = new Team();
        seven.getHeroes().add(starlight);
        seven.getHeroes().add(homelander);

        // Criação e configuração do herói Billy
        Hero billyHero = new Hero(billy, "Brutus", 10, 10, 10);
        BillyCompoundV billyCompoundV = new BillyCompoundV();
        billyCompoundV.activateDurability(billyHero);
        System.out.println("Energy is now " + billyHero.getEnergy());

        // Criação e configuração do herói Hughie
        Hero hughieHero = new Hero(billy, "Brutus", 10, 10, 10);
        HughieCompoundV hughieCompoundV = new HughieCompoundV();

        //Criação do time "boys" e adição dos heróis Hughie e Billy
        Team boys = new Team();
        boys.getHeroes().add(hughieHero);
        boys.getHeroes().add(billyHero);
    }
}
