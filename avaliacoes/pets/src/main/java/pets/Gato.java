package pets;
/**
 * Classe Gato representa um gato, que é uma extensão da classe Pet.
 * Ela possui um construtor que recebe o nome e a data de nascimento do gato,
 * além de um método para obter informações formatadas sobre o gato e um método para simular o som do gato.
 * 
 * @author João Victor Tavares Fróes
 * @version 1.0
 */
public class Gato extends Pet { // herdeiro do PET
    /**
     * Construtor da classe Gato.
     * Cria uma nova instância de Gato com o nome e data de nascimento fornecidos.
     * 
     * @param nome o nome do gato
     * @param nascimento a data de nascimento do gato
     */
    public Gato(String nome, String nascimento) { // construtor do gato
        super(nome, nascimento);
    }
    /**
     * Método para criar e retornar uma String com as informações do gato.
     * Sobrescreve o método getInfo da classe Pet para incluir informações específicas do gato.
     * 
     * @return uma String contendo o nome e a data de nascimento do gato.
     */
    @Override // sobrescreve o getinfo do PET
    public String getInfo() { // getinfo do gato
        return "Gato: " + getNome() + ", Nascimento: " + getNascimento();
    }
    /**
     * Método para simular o som do gato.
     * Imprime uma mensagem no console representando o som que o gato faz.
     */
    public void miar() { // método do mio do gato
        System.out.println("O gato " + getNome() + ": MIAUMIAU!");
    }
}