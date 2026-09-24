import java.time.LocalDate;
import java.util.ArrayList;

/**
 * A classe Cão define uma representação do animal cachorro presentes no abrigo da ONG CãoNino.
 */
public class Cão {
    
    private String nome;
    private LocalDate data_entrada;
    private Raça raça;
    private String cor;
    private float peso;
    static int qtd = 0;
    

    /**
     * Construtor padrão da Classe Cão.
     * Aumenta a quantidade de cachorros registrados no abrigo.
     *  
     */
    public Cão() {
        qtd++;
    }


    /**
     * Construtor da Classe Cão que recebe cinco parâmetros.
     * Define os parâmetros recebidos.
     * Aumento a quantidade de cachorros registrados no abrigo.
     * 
     * @param nome Nome do cachorro
     * @param data_entrada Data de entrada do cachorro no abrigo
     * @param raça Raça do cachorro
     * @param cor Cor do cachorro
     * @param peso Peso do cachorro
     */
    public Cão(String nome, LocalDate data_entrada, Raça raça, String cor, float peso) {
        this.nome = nome;
        this.data_entrada = data_entrada;
        this.raça = raça;
        this.cor = cor;
        this.peso = peso;
        qtd++;
    }


    /**
     * O método qtd_desnutridos percorre a lista de cachorros registrados no abrigo e 
     * analisa e conta quais tem a faixa de peso que indica desnutrição,
     * ao fim do processo imprime na tela a quantidade de cachorros desnutridos no abrigo.
     * 
     * @param cães Cachorros presentes no abrigo
     */
    public void qtd_desnutridos(ArrayList<Cão> cães){

        int qtd = 0;

        for (Cão c : cães){
            if(c.getPeso() <= 20){
                qtd++;
            }
        }

        System.out.println("\nQuantidade de cachorros desnutridos: "+qtd);

    }


    /**
     * O método qtd_viraLata percorre a lista de cachorros registrados no abrigo e 
     * analisa e conta quais são da raça vira-lata, ao fim do processo imprime
     * na tela a quantidade de cachorros vira-latas no abrigo.
     * 
     * @param cães Cachorros presentes no abrigo
     */
    public void qtd_viralata(ArrayList<Cão> cães){

        int qtd = 0;

        for (Cão c : cães){
            if(c.getRaça().equals(Raça.VIRA_LATA)){
                qtd++;
            }
        }

        System.out.println("\nQuantidade de cachorros no sistema com a raça Vira Lata: " + qtd);

    }


    /**
     * O método qtd_cao_amarelos percorre a lista de cachorros registrados no abrigo e 
     * analisa e conta quais são da cor amarela, ao fim do processo imprime
     * na tela a quantidade de cachorros amarelos no abrigo.
     * 
     * @param cães Cachorros presentes no abrigo
     */
    public void qtd_cao_amarelos(ArrayList<Cão> cães){

        int qtd = 0;

        for (Cão c : cães){
            if(c.getCor().equals("Amarela")){
                qtd++;
            }
        }
        System.out.println("\nQuantidade de cachorros com a cor amarela: " + qtd + "\n\n");

    }

    
    /**
     * Getter padrão para o atributo nome.
     * Retorna o nome do cachorro.
     * 
     * @return o nome do cachorro
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * Setter padrão para o atributo nome.
     * Define o nome do cachorro.
     * 
     * @param nome Nome do cachorro
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * Getter padrão para o atributo data_entrada.
     * Retorna a data de entrada do cachorro no abrigo.
     * 
     * @return o nome do cachorro
     */
    public LocalDate getData_entrada() {
        return data_entrada;
    }
    
    /**
     * Setter padrão para o atributo data_entrada.
     * Define a data de entrada do cachorro no abrigo.
     * 
     * @param data_entrada Data de entrada do cachorro no abrigo
     */
    public void setData_entrada(LocalDate data_entrada) {
        this.data_entrada = data_entrada;
    }
    
    /**
     * Getter padrão para o atributo raça.
     * Retorna a raça do cachorro.
     * 
     * @return a raça do cachorro
     */
    public Raça getRaça() {
        return raça;
    }
    
    /**
     * Setter padrão para o atributo raça.
     * Define a raça do cachorro.
     * 
     * @param raça Raça do cachorro
     */
    public void setRaça(Raça possui_raça) {
        this.raça = possui_raça;
    }
    
    /**
     * Getter padrão para o atributo cor.
     * Retorna a cor do cachorro.
     * 
     * @return a cor do cachorro
     */
    public String getCor() {
        return cor;
    }
    
    /**
     * Setter padrão para o atributo cor.
     * Define a cor do cachorro.
     * 
     * @param cor Cor do cachorro
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    /**
     * Getter padrão para o atributo peso.
     * Retorna o peso do cachorro.
     * 
     * @return o peso do cachorro
     */
    public float getPeso() {
        return peso;
    }
    
    /**
     * Setter padrão para o atributo peso.
     * Define o peso do cachorro.
     * 
     * @param peso Peso do cachorro
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    
    /**
     * Getter padrão para o atributo qtd.
     * Retorna a quantidade de cachorros no abrigo.
     * 
     * @return a quantidade de cachorros no abrigo
     */
    public static int getQtd() {
        return qtd;
    }

}
