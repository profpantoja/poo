package pets;
/**
 * Classe Veterinario representa um veterinário, que é uma extensão da classe Pessoa.
 * Ela possui um CRV (Cadastro de Registro de Veterinário) e métodos para acessar e modificar esse atributo
 * E metódo para obter informações formatadas sobre o veterinário.
 * @author João Victor Tavares Fróes
 * @version 1.0
 */
public class Veterinario extends Pessoa { // herdeiro da classe pessoa

    private String crv; // declara o crv
    /**
     * Construtor da classe Veterinario.
     * Cria uma nova instância de Veterinario com o nome e apelido fornecidos.
     * CRV ainda não é inicializado, pois não foi passado como parâmetro.
     * 
     * @param nome
     * @param apelido
     */
    public Veterinario(String nome, String apelido) {
        super(nome, apelido);
    }
    /**
     * Construtor da classe Veterinario.
     * Cria uma nova instância de Veterinario com o nome, apelido e CRV fornecidos.
     * 
     * @param nome
     * @param apelido
     * @param crv
     */
    public Veterinario(String nome, String apelido, String crv) {
        super(nome, apelido);
        this.crv = crv;
    }
    /**
     * Método para obter o CRV do veterinário.
     * 
     * @return o CRV do veterinário.
     */
    public String getCrv() {
        return crv; // getter do crv
    }
    /**
     * Método para definir o CRV do veterinário.
     * 
     * @param crv o CRV a ser definido para o veterinário.
     */
    public void setCrv(String crv) {
        this.crv = crv; // setter do crv
    }
    /**
     * Método para criar e retornar uma String com as informações do veterinário.
     * Sobrescreve o método getInfo da classe Pessoa para incluir o CRV do veterinário.
     * 
     * @return uma String contendo o nome, apelido e CRV do veterinário.
     */
    @Override // possui o override para sobrescrever o getinfo da classe Pessoa
    public String getInfo() { // getinfo do veterinario
        return super.getInfo() + ", CRV: " + crv;
    }
}