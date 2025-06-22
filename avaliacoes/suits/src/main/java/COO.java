/**
 * Importação da interface I_OperatingOfficer e I_Partner
 */
import interfaces.I_OperatingOfficer;
import interfaces.I_Partner;

/**
* É uma classe para o COO que herda da classe Secretary e que implementa a interface I_Partner e I_OperatingOfficer.
*/

public class COO extends Secretary implements I_Partner, I_OperatingOfficer{

    /**
     * Sobrescreve o metodo supportExecutives da interface I_OperatingOfficer.
     * Este metodo lança uma exceção UnsupportedOperationException indicando que o método não foi implementado.
     * @return Unimplemented method 'supportExecutives'
     */
    @Override
    public void supportExecutives() {
        throw new UnsupportedOperationException("Unimplemented method 'supportExecutives'");
    }

    /**
     * Sobrescreve o metodo developPolicies da interface I_OperatingOfficer.
     * Este metodo imprime uma mensagem indicando que o COO está desenvolvendo políticas.
     * @return develop Policies
     */
    @Override
    public void developPolicies() {
        System.out.println("develop Policies");
    }

    /**
     * Sobrescreve o metodo coordinate da interface I_OperatingOfficer.
     * Este metodo imprime uma mensagem indicando que o COO está coordenando.
     * @return coordinate
     */
    @Override
    public void coordinate() {
        System.out.println("coordinate");
    }

    /**
     * Sobrescreve o metodo decisionMaking da interface I_Partner.
     * Este metodo imprime uma mensagem indicando que o COO está tomando decisões.
     * @return decision Making
     */
    @Override
    public void decisionMaking() {
        System.out.println("decision Making");
    }

    /**
     * Sobrescreve o metodo profitRevenue da interface I_Partner.
     * Este metodo imprime uma mensagem indicando que o COO está gerando receita.
     * @return profit Revenue
     */
    @Override
    public void profitRevenue() {
        System.out.println("profit Revenue");
    }
    
}
