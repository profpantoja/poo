/**
 * Main Class that represents the application for the Star Wars universe.
 */
public class App {
    
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();  
        p1.setNome("Leia");
        p1.setSobrenome("Organa");
        p1.setSexo("Feminino");
        p1.imprime();
        Pessoa p2 = new Pessoa("Luke", "Skywalker", "Masculino");
        p2.imprime();

        Jedi obiwan = new Jedi("Obi-Wan", "Kenobi");
        obiwan.imprime();
        obiwan.mindControl();
        obiwan.levitation();

        Sith vader = new Sith("Darth", "Vader");
        vader.imprime();
        vader.mindControl();
        vader.levitation();

        Saber sabre1 = new Saber("azul", 0);
        Saber sabre2 = new Saber("vermelho", 0);
        Blast blast = new Blast("laser", 0);

        obiwan.getWeapons().add(sabre1.pickUp());
        vader.getWeapons().add(sabre2.pickUp());
        obiwan.getWeapons().add(blast.pickUp());

        for(Weapon s: vader.getWeapons()) {
            if(s.getClass().getName().equals("Saber")) {
                ((Saber) s).slash();
            }
        }
        
        for(Weapon s: obiwan.getWeapons()) {
            if(s.getClass().getName().equals("Blast")) {
                ((Blast) s).shot();
                s.drop();
            }
        }
    }

}