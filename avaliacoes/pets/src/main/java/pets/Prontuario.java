package pets;
/**
 * A classe Prontuario representa o prontuário de um pet, contendo informações sobre a consulta realizada.
 * Ela inclui a data da consulta, comentários, o veterinário responsável e o pet associado.
 * 
 * @author João Victor Tavares Fróes
 * @version 1.0
 */
public class Prontuario {

    private String data; // declaração das variaveis
    private String comentario;
    private Veterinario veterinario;
    private Pet pet;
    /**
     * Construtor padrão da classe Prontuario.
     * Cria uma nova instância de Prontuario sem inicializar os atributos.
     */
    public Prontuario() {

    }
    /**
     * Método para obter a data do prontuário.
     * 
     * @return a data do prontuário.
     */
    public String getData() {
        return data;
    }
    /**
     * Método para definir a data do prontuário.
     * 
     * @param data a data a ser definida para o prontuário.
     */
    public void setData(String data) {
        this.data = data;
    }
    /**
     * Método para obter o comentário do prontuário.
     * 
     * @return o comentário do prontuário.
     */
    public String getComentario() {
        return comentario; // GETTERS E SETTERS
    }
    /**
     * Método para definir o comentário do prontuário.
     * 
     * @param comentario o comentário a ser definido para o prontuário.
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    /**
     * Método para obter o veterinário responsável pelo prontuário.
     * 
     * @return o veterinário responsável pelo prontuário.
     */
    public Veterinario getVeterinario() {
        return veterinario;
    }
    /**
     * Método para definir o veterinário responsável pelo prontuário.
     * 
     * @param veterinario o veterinário a ser definido para o prontuário.
     */
    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
    /**
     * Método para obter o pet associado ao prontuário.
     * 
     * @return o pet associado ao prontuário.
     */
    public Pet getPet() {
        return pet;
    }
    /**
     * Método para definir o pet associado ao prontuário.
     * 
     * @param pet o pet a ser definido para o prontuário.
     */
    public void setPet(Pet pet) {
        this.pet = pet;
    }
    /**
     * Construtor da classe Prontuario.
     * Cria uma nova instância de Prontuario com a data e comentário fornecidos.
     * 
     * @param data a data da consulta
     * @param comentario o comentário sobre a consulta
     */
    public Prontuario(String data, String comentario) { // construtor do prontuario
        this.data = data;
        this.comentario = comentario;
    }
    /**
     * Método para realizar uma consulta associando um veterinário e um pet ao prontuário.
     * Este método imprime uma mensagem indicando que a consulta foi realizada para o pet pelo veterinário.
     * 
     * @param veterinario
     * @param pet
     */
    public void realizarConsulta(Veterinario veterinario, Pet pet) { // método para fazer a consulta
        this.veterinario = veterinario;
        this.pet = pet;
        System.out.println("Consulta realizada para " + pet.getNome() + " por " + veterinario.getNome());
    }
    /**
     * Método para obter informações formatadas sobre o prontuário.
     * Inclui a data, comentário, informações do veterinário e do pet.
     * 
     * @return uma String contendo as informações do prontuário.
     */
    public String getInfo() { // getinfo da prontuario
        return "Data: " + data + ", Comentario: " + comentario + "\nVeterinário: " + veterinario.getInfo() + "\nPet: "
                + pet.getInfo();
    }
}