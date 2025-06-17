package pets;
/**
 * Classe Pet representa um animal de estimação, que é uma classe abstrata.
 * Ela possui atributos como nome, data de nascimento e uma lista de prontuários.
 * A classe Pet é estendida por outras classes específicas de tipos de animais.
 * Possui métodos para acessar e modificar os atributos, além de um método abstrato getInfo.
 * 
 * @author João Victor Tavares Fróes
 * @version 1.0
 */
import java.util.ArrayList;

public abstract class Pet {

    private String nome; // declara o nome
    private String nascimento; // declara o nascimento
    private ArrayList<Prontuario> prontuarios = new ArrayList<>(); // ArrayList contendo a lista de prontuarios de um
                                                                   // pet
    /**
     * Construtor da classe Pet.
     * Cria uma nova instância de Pet com o nome e data de nascimento fornecidos.
     * 
     * @param nome
     * @param nascimento
     */
    public Pet(String nome, String nascimento) { // construtor do PET
        this.nome = nome;
        this.nascimento = nascimento;
    }
    /**
     * Método para obter o nome do pet.
     * 
     * @return o nome do pet.
     */
    public String getNome() { // Getter do nome
        return nome;
    }
    /**
     * Método para definir o nome do pet.
     * 
     * @param nome o nome a ser definido para o pet.
     */
    public void setNome(String nome) { // setter do nome
        this.nome = nome;
    }
    /**
     * Método para obter a data de nascimento do pet.
     * 
     * @return a data de nascimento do pet.
     */
    public String getNascimento() { // getter do nascimento
        return nascimento;
    }
    /**
     * Método para definir a data de nascimento do pet.	
     * 
     * @param nascimento a data de nascimento a ser definida para o pet.
     */
    public void setNascimento(String nascimento) { // setter do nascimento
        this.nascimento = nascimento;
    }
    /**
     * Método para obter a lista de prontuários do pet.
     * 
     * @return a lista de prontuários do pet.
     */
    public ArrayList<Prontuario> getProntuarios() {
        return prontuarios;
    }
    /**
     * Método para definir a lista de prontuários do pet.
     * 
     * @param prontuarios a lista de prontuários a ser definida para o pet.
     */
    public void setProntuarios(ArrayList<Prontuario> prontuarios) {
        this.prontuarios = prontuarios;
    }
    /**
     * Método abstrato para obter informações sobre o pet.
     * Este método deve ser implementado pelas subclasses de Pet para fornecer informações específicas sobre o tipo de animal.
     * 
     * @return uma String contendo informações sobre o pet.
     */
    protected abstract String getInfo(); // getinfo criado para poder ser usado no prontuário

}