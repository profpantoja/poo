package pets;
/**
 * Classe Calopsita representa uma calopsita, que é uma extensão da classe Pet.
 * Ela possui um construtor que recebe o nome e a data de nascimento da calopsita,
 * além de um método para obter informações formatadas sobre a calopsita e um método para simular o som da calopsita.
 * 
 * @author João Victor Tavares Fróes
 * @version 1.0
 */
public class Calopsita extends Pet { // herdeiro do pet
    /**
     * Construtor da classe Calopsita.
     * Cria uma nova instância de Calopsita com o nome e data de nascimento fornecidos.
     * 
     * @param nome o nome da calopsita
     * @param nascimento a data de nascimento da calopsita
     */
    public Calopsita(String nome, String nascimento) { // construtor da calopsita
        super(nome, nascimento);
    }
    /**
     * Método para criar e retornar uma String com as informações da calopsita.
     * Sobrescreve o método getInfo da classe Pet para incluir informações específicas da calopsita.
     * 
     * @return uma String contendo o nome e a data de nascimento da calopsita.
     */
    @Override // sobrescreve o getinfo do PET
    public String getInfo() { // getinfo da calopsita
        return "Calopsita: " + getNome() + ", Nascimento: " + getNascimento();
    }
    /**
     * Método para simular o som da calopsita.
     * Imprime uma mensagem no console representando o som que a calopsita faz.
     */
    public void piar() { // método do pio da caloptsita
        System.out.println("A calopsita " + getNome() + ": PIUPIU!");
    }
}