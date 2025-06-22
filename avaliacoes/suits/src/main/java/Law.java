/**
 * Importação da biblioteca LocalDate
 */
import java.time.LocalDate;

/**
 * É uma classe para a Lei que extende da classe Firma.
 * Contém informações específicas sobre a lei, como cota de seguro e aprovação do governo.
 * Possui métodos para obter informações sobre a lei e seus empregados.
 */
public class Law extends Firm{

    /**
     * Atributos da classe Law.
     * insuranceQuote: Cota de seguro da lei.
     * govApprovement: Aprovação do governo para a lei.
     */
    private String insuranceQuote;
    private String govApprovement;

    /**
     * Construtor padrão da classe Law.
     * Inicializa a lei sem nome, data de fundação, cota de seguro e aprovação do governo.
     * @param name Nome da lei.
     * @param foundation Data de fundação da lei.
     * @param insuranceQuote Cota de seguro da lei.
     * @param govApprovement Aprovação do governo para a lei.
     * @return Unimplemented method 'Law'
     */
    public Law(String name, LocalDate foundation, String insuranceQuote, String govApprovement) {
        super(name, foundation);
        this.insuranceQuote = insuranceQuote;
        this.govApprovement = govApprovement;
    }

    /**
     * Obtém informações sobre a lei, incluindo nome, data de fundação, cota de seguro, aprovação do governo e lista de empregados.
     * @return String com informações sobre a lei.
     */
    public String info() {
        return "Law [name=" + getName() + ", foundation=" + getFoundation() + ", insuranceQuote=" + insuranceQuote + ", govApprovement=" + govApprovement + listEmployees() + "]";
    }

    /**
     * Obtém a data de fundação da lei.
     * @return Data de fundação da lei.
     */
    public String getInsuranceQuote() {
        return insuranceQuote;
    }

    /**
     * Define a cota de seguro da lei.
     * @param insuranceQuote Cota de seguro a ser definida.
     */
    public void setInsuranceQuote(String insuranceQuote) {
        this.insuranceQuote = insuranceQuote;
    }

    /**
     * Obtém a aprovação do governo para a lei.
     * @return Aprovação do governo da lei.
     */
    public String getGovApprovement() {
        return govApprovement;
    }

    /**
     * Define a aprovação do governo para a lei.
     * @param govApprovement Aprovação do governo a ser definida.
     */
    public void setGovApprovement(String govApprovement) {
        this.govApprovement = govApprovement;
    }
    
}
