package interfaces;

/**
 * Interface I_Lawyer que define os métodos que um advogado deve implementar.
 */
public interface I_Lawyer {

    /**
     * Método para representar clientes.
     */
    void representClients();

    /**
     * Método para realizar pesquisas.
     */
    void research();

    /**
     * Método para analisar um documento.
     * @param doc Documento a ser analisado.
     */
    void analysis(String doc);

    /**
     * Método para arquivar um documento.
     * @param type Tipo do documento a ser arquivado.
     */
    void fileDocument(String type);

}
