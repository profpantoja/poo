/** 
* Importação da interface I_Partner.
*/
import interfaces.I_Partner;

/**
 * É uma classe para o NamePartner que herda da classe Attorney e que implementa a interface I_Partner.
 */
public class NamePartner extends Attorney implements I_Partner{

    /**
     * Sobrescreve o metodo decisionMaking da interface I_Partner.
     * Este metodo imprime uma mensagem indicando que o NamePartner está tomando decisões.
     * @return decision Making
     */
    @Override
    public void decisionMaking() {
        System.out.println("decision Making");
    }

    /**
     * Sobrescreve o metodo profitRevenue da interface I_Partner.
     * Este metodo imprime uma mensagem indicando que o NamePartner está gerando receita.
     * @return profit Revenue
     */
    @Override
    public void profitRevenue() {
        System.out.println("profit Revenue");
    }
    
}
