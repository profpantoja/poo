/**
 * Importação da biblioteca LocalDate.
 */
import java.time.LocalDate;

/**
 * É uma classe para a empresa de tecnologia que estende da classe Firm.
 * Contém informações específicas sobre a empresa de tecnologia, como cláusula de não divulgação e endereço IP.
 * Possui métodos para obter informações sobre a empresa e seus empregados.
 */
public class Tech extends Firm {

    /**
     * Atributos da classe Tech.
     * nonDisclosure: Cláusula de não divulgação da empresa de tecnologia.
     * ipAddress: Endereço IP da empresa de tecnologia.
     */
    private String nonDisclosure;
    private String ipAddress;
    
    /**
     * Construtor padrão da classe Tech.
     * Inicializa a empresa de tecnologia sem nome, data de fundação, cláusula de não divulgação e endereço IP.
     */
    Tech(String name, LocalDate foundation, String nonDisclosure, String ipAddress) {
        super(name, foundation);
        this.nonDisclosure = nonDisclosure;
        this.ipAddress = ipAddress;
    }

    /**
     * Obtém informações sobre a empresa de tecnologia, incluindo nome, data de fundação, cláusula de não divulgação, endereço IP e lista de empregados.
     * @return String com informações sobre a empresa de tecnologia.
     */
    public String getNonDisclosure() {
        return nonDisclosure;
    }

    /**
     * Define a cláusula de não divulgação da empresa de tecnologia.
     * @param nonDisclosure Cláusula de não divulgação a ser definida.
     */
    public void setNonDisclosure(String nonDisclosure) {
        this.nonDisclosure = nonDisclosure;
    }

    /**
     * Obtém o endereço IP da empresa de tecnologia.
     * @return Endereço IP da empresa de tecnologia.
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Define o endereço IP da empresa de tecnologia.
     * @param ipAddress Endereço IP a ser definido.
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * Obtém informações sobre a empresa de tecnologia, incluindo nome, data de fundação, cláusula de não divulgação, endereço IP e lista de empregados.
     * @return String com informações sobre a empresa de tecnologia.
     */
    public String info() {
        return "Tech [name=" + getName() + ", foundation=" + getFoundation() + " ,nonDisclosure=" + nonDisclosure + ", ipAddress=" + ipAddress + listEmployees() + "]";
    }
    
}
