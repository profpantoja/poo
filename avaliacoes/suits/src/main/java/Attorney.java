/** 
* Importação da interface I_Lawyer
*/
import interfaces.I_Lawyer;


/**
* É uma classe para o Attorney que herda da classe TypeJob e que implementa a interface I_Lawyer.
*/
public class Attorney extends TypeJob implements I_Lawyer {

    /**
     * Sobrescreve o metodo representClients da interface I_Lawyer.
     * Este metodo imprime uma mensagem indicando que o advogado está representando clientes.
     * @return represent x
     */
    @Override
    public void representClients() {
        System.out.println("represent x");
    }

    /**
     * Sobrescreve o metodo research da interface I_Lawyer.
     * Este metodo imprime uma mensagem indicando que o advogado está pesquisando clientes.
     * @return research x
     */
    @Override
    public void research() {
        System.out.println("research x");
    }

    /**
     * Sobrescreve o metodo analysis da interface I_Lawyer.
     * Este metodo imprime uma mensagem indicando que o advogado está analisando um documento.
     * @param doc Documento a ser analisado
     * @return analysis x
     */
    @Override
    public void analysis(String doc) {
        System.out.println("analysing " + doc);
    }

    /**
     * Sobrescreve o metodo fileDocument da interface I_Lawyer.
     * Este metodo imprime uma mensagem indicando que o advogado está arquivando um documento.
     * @param type Tipo do documento a ser arquivado
     * @return file Document is type
     */
    @Override
    public void fileDocument(String type) {
        System.out.println("file Document is" + type);
    }
    
}
