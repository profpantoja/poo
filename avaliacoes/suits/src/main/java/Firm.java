/**
 * Importação da biblioteca LocalDate e ArrayList
 */
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * É uma classe para a Firma que contém informações sobre o nome, data de fundação e empregados.
 * Possui métodos para manipular e obter informações sobre a firma e seus empregados.
 */
public class Firm {

    /**
     * Atributos da classe Firm.
     * name: Nome da firma.
     * foundation: Data de fundação da firma, inicializada com a data atual.
     * employeers: Lista de empregados da firma, inicializada como uma ArrayList vazia.
     */
    private String name;
    private LocalDate foundation = LocalDate.now();
    private ArrayList<Person> employeers = new ArrayList<Person>();

    /**
     * Construtor padrão da classe Firm.
     * Inicializa a firma sem nome e data de fundação.
     */
    Firm() {
        
    }
    
    /**
     * Construtor da classe Firm.
     * Inicializa a firma com um nome e uma data de fundação especificados.
     * @param name Nome da firma.
     * @param foundation Data de fundação da firma.
     */
    Firm(String name, LocalDate foundation) {
        this.name = name;
        this.foundation = foundation;
    }
    
    /**
     * Construtor da classe Firm.
     * Inicializa a firma com um nome especificado e a data de fundação como a data atual.
     * @param name Nome da firma.
     */
    public String getName() {
        return name;
    }

    /**
     * Define o nome da firma.
     * @param name Nome da firma a ser definido.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtém a data de fundação da firma.
     * @return Data de fundação da firma.
     */
    public LocalDate getFoundation() {
        return foundation;
    }

    /**
     * Define a data de fundação da firma.
     * @param foundation Data de fundação a ser definida.
     */
    public void setFoundation(LocalDate foundation) {
        this.foundation = foundation;
    }

    /**
     * Define a lista de empregados da firma.
     * @param employeers Lista de empregados a ser definida.
     */
    public void setEmployeers(ArrayList<Person> employeers) {
        this.employeers = employeers;
    }

    /**
     * Obtém a lista de empregados da firma.
     * @return Lista de empregados da firma.
     */
    public ArrayList<Person> getEmployeers() {
        return employeers;
    }

    /**
     * Adiciona um empregado à lista de empregados da firma.
     * @param person Pessoa a ser adicionada como empregado.
     */
    public void setEmployeers(Person person) {
        this.employeers.add(person);
    }

    /**
     * Lista os empregados da firma.
     * Se não houver empregados, retorna uma mensagem indicando que não há nenhum.
     * Caso contrário, retorna uma lista com os nomes dos empregados.
     * @return String com a lista de empregados ou mensagem indicando que não há nenhum.
     */
    public String listEmployees() {
        String r = "Empregados: ";
        if(employeers.size() == 0)
            return r = "nenhum.";
        for (Person person : employeers) {
            r += person.getName() + ",";
        }
        return r + ".";
    }

    /**
     * Obtém informações sobre a firma, incluindo nome e data de fundação.
     * @return String com as informações da firma.
     */
    public String info() {
        return "Firm [name=" + name + ", foundation=" + foundation + "]";
    }

}
