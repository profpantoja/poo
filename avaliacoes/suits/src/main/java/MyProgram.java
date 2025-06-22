/**
 * Importação da biblioteca LocalDate.
 */
import java.time.LocalDate;

/**
 * Classe aonde é instanciado todos os objetos do programa.
 */
public class MyProgram {
    
    public static void main(String[] args) {
        Person harvey = new Person();
        harvey.setName("Harvey");
        harvey.setSurname("Specter");

        Person litt = new Person("Louis", "Litt", "male");
        Person paulsen = new Person("Donna", "Paulsen", "female");

        Law law1 = new Law("Rand, Kaldor & Zane", LocalDate.now(), "IQ1", "GA1");      
        Law law2 = new Law("Pearson-Specter-Litt", LocalDate.now(), "IQ2", "GA2");
        
        Tech tech1 = new Tech("Velocity Data Solutions.", LocalDate.now(), "ND", "123");

        Person mike = new Person("Mike", "Ross", "male");
        Person robert = new Person("Robert", "Zane", "male");
        
        law2.setEmployeers(harvey);
        law2.setEmployeers(litt);
        law2.setEmployeers(paulsen);

        law1.setEmployeers(robert);
        tech1.setEmployeers(mike);

        System.out.println(law1.info()); 
        System.out.println(law2.info());

        harvey.setJob(new NamePartner());
        robert.setJob(new NamePartner());
        paulsen.setJob(new COO());
        mike.setJob(new Attorney());

        ((NamePartner) harvey.getJob()).decisionMaking();

    }
}
