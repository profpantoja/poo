import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 * A classe FichaAdoção define uma representação de uma ficha de adoção de um cachorro presente no abrigo da ONG CãoNino.
 */
public class FichaAdoção {

    private Pessoa pessoa;
    private Cão cão;
    private LocalDate data_adoção;
    static int qtd = 0;

    /**
     * Construtor padrão da classe FichaAdoção.
     * Instancia um cão e uma pessoa que estão presentes como atributos da ficha de adoção.
     * Aumenta a quantidade de fichas de adoção.
     * 
     */
    public FichaAdoção() {
        this.cão = new Cão();
        this.pessoa = new Pessoa();
        qtd++;
    }

    /**
     * Construtor da classe FichaAdoção que recebe três parâmetros.
     * Se data de adoção ocorreu depois da data de entrada do cão no abrigo,
     * define os parâmetros recebidos, imprime na tela uma mensagem de adoção
     * do cão pela pessoa e aumenta a quantidade de fichas de adoção, caso contrário,
     * é imprimido na tela uma mensagem avisando que um cão não pode ser adotado em uma data
     * anterior a sua data de entrada no abrigo.
     * 
     * @param pessoa Pessoa que adotou o cão
     * @param cão Cão que foi adotado pela pessoa 
     * @param data_adoção Data da adoção
     */
    public FichaAdoção(Pessoa pessoa, Cão cão, LocalDate data_adoção) {
        boolean v = verificar_data(cão.getData_entrada(), data_adoção);
        if (v == true){
            this.pessoa = pessoa;
            this.cão = cão;
            this.data_adoção = data_adoção;
            System.out.println("A pessoa "+pessoa.getNome()+" adotou o cao "+cão.getNome()+"!\n");
            qtd++;
        }
        else {
            System.out.println("A data de adoçao nao pode ser anterior a data de entrada do cao! \nO erro está na adoçao da pessoa "+pessoa.getNome()+" e do cao "+cão.getNome()+"\n");
        }
    }


    /**
     * O método visualizar_fichar percorre a lista de fichas de adoção e imprime na tela 
     * todas as fichas de adoção registradas com suas respectivas informações.
     * 
     * @param fa Lista de fichas de adoção
     * @see Pessoa
     * @see Cão
     */
    public static void visualizar_fichar(ArrayList<FichaAdoção> fa){

        for (int i = 0; i < fa.size();i++){

        System.out.println("\n+-------------------------------------+");
        System.out.println("|           FICHA DE ADOÇAO           |");
        System.out.println("+-------------------------------------+");
        System.out.println("\nDono: "+fa.get(i).getPessoa().getNome()+"\nCao adotado: "+ fa.get(i).getCão().getNome()+"\nData de adoçao: "+ fa.get(i).getData_adoção()+"\n");
        
        tempo_ong(fa.get(i).getCão().getData_entrada(), fa.get(i).getData_adoção());
        nutricao(fa.get(i).getCão().getPeso());
        tempo_adotado(fa.get(i).getData_adoção());

        System.out.println("+-------------------------------------+\n");

        }
    }


    /**
     * O método verificar_data analisa se a data de adoção do cão
     * é coerente com sua data de entrada no abrigo.
     * 
     * @param entrada Data de entrada do cão no abrigo
     * @param adoção Data de adoção do cão
     * @return verdadeiro se a data registrada indica que a adoção ocorreu na mesma data ou após o cão ter entrado no abrigo
     *         e falso se a data registrada indica que a adoção aconteceu antes do cão ter entrado no abrigo.
     */
    public static boolean verificar_data(LocalDate entrada, LocalDate adoção) {

        if (entrada.compareTo(adoção) <= 0) {
            System.out.println("Adoçao foi realizada!");
            return true;
        } else {
            System.out.println("ERRO!");
            return false;
        }
    }


    /**
     * O método tempo_adotado imprime na tela o tempo de adoção
     * de um cão, baseando-se nos anos, meses e/ou dias que se
     * passaram desde então.
     * 
     * @param adoção Data de adoção do cão
     */
    public static void tempo_adotado(LocalDate adoção) {

        LocalDate hoje = LocalDate.now();
        long anos = adoção.until(hoje, ChronoUnit.YEARS);
        long meses = adoção.until(hoje, ChronoUnit.MONTHS);
        long dias = adoção.until(hoje, ChronoUnit.DAYS);
        if ((anos == 1) && ((meses - 12) == 0)){
            System.out.println("Tempo de adocao: " + anos+ " ano");
        }
        else if (anos >= 1){
            meses = meses - (12*anos);
            System.out.println("Tempo de adocao: " + anos+ " ano(s) e "+meses+" meses");
        }
        else if ((anos >= 1) && (meses == 0)){
            System.out.println("Tempo de adocao: " + anos+ " ano(s)");
        }
        else if (meses >= 1){
            System.out.println("Tempo de adocao: " + meses+ " mes(es)");
        }
        else {
            System.out.println("Tempo de adocao: " + dias+ " dia(s)");
        }
    }
    

    /**
     * O método tempo_ong imprime na tela o tempo de ong
     * de um cão, baseando-se nos anos, meses e/ou dias que se
     * passaram entre a data de entrada e a data de adoção.
     * 
     * @param entrada Data de entrada do cão no abrigo
     * @param adoção Data de adoção do cão
     */
    public static void tempo_ong(LocalDate entrada, LocalDate adoção) {

        long anos = entrada.until(adoção, ChronoUnit.YEARS);
        long meses = entrada.until(adoção, ChronoUnit.MONTHS);
        long dias = entrada.until(adoção, ChronoUnit.DAYS);
        if ((anos == 1) && ((meses - 12) == 0)){
            System.out.println("Tempo de ONG: " + anos+ " ano");
        }
        else if (anos >= 1){
            meses = meses - (12*anos);
            System.out.println("Tempo de ONG: " + anos+ " ano(s) e "+meses+" meses");
        }
        else if (meses >= 1){
            System.out.println("Tempo de ONG: " + meses+ " mes(es)");
        }
        else {
            System.out.println("Tempo de ONG: " + dias+ " dia(s)");
        }
    }


    /**
     * O método nutricao imprime na tela o status de nutrição 
     * do cão baseado em seu peso atual.
     * 
     * @param kg Peso do cão
     */
    public static void nutricao(float kg){
        if (kg <= 20) {
            System.out.println("Status: desnutrido!");
        }
        else if ( kg <= 30){
            System.out.println("Status: bem nutrido!");
        }
        else if ( kg > 30){
            System.out.println("Status: O cachorro está obeso!");
        }
    }

    /**
     * O método buscar_cao busca o nome de um cão em todos os registros
     * de ficha de adoção presentes no sistema, imprimindo na tela o 
     * resultado da busca.
     * 
     * @param nome Nome do cão
     * @param adoções Lista de fichas de adoção
     */
    public static void buscar_cao(String nome, ArrayList<FichaAdoção> adoções){

        boolean encontrado = false;
        for (FichaAdoção ficha : adoções) {
            if (ficha.getCão().getNome().equals(nome)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("\nCao "+ nome + " encontrado no sistema!");
        } else {
            System.out.println("\nCao "+ nome + "não encontrado no sistema!");
        }

    }
    
    /**
     * O método cao_mais_antigo percorre uma lista de fichas de adoção
     * para encontrar o cachorro com a data de adoção mais antiga, após
     * o encontrar, é imprimido na tela o resultado da busca.
     * 
     * @param adoções Lista de fichas de adoção
     */
    public static void cao_mais_antigo(ArrayList<FichaAdoção> adoções){

        LocalDate data = LocalDate.now();
        String cao_mais_antigo = "";

        for (FichaAdoção ficha : adoções) {

            LocalDate dataAdoção = ficha.getData_adoção();

            if (dataAdoção.isBefore(data)) {
                data = dataAdoção;
                cao_mais_antigo = ficha.getCão().getNome();
            }
        }
        System.out.println("\nCao com maior tempo de adoçao: " + cao_mais_antigo);
    }


    /**
     * O método qtd_viralata_adotados percorre uma lista de fichas de adoção que aumenta
     * em 1 num contador toda a vez que um cachorro vira-lata é encontrado, ao final
     * do método é imprimido na tela o contador indicando a quantidade de vira-latas adotados.
     * 
     * @param adoções Lista de fichas de adoção
     */
    public static void qtd_viralata_adotados(ArrayList<FichaAdoção> adoções){

        int qtd = 0;

        for (FichaAdoção ficha : adoções){
            if(ficha.getCão().getRaça().equals(Raça.VIRA_LATA)){
                qtd++;
            }
        }

        System.out.println("\nQuantidade de caes adotados com a raça Vira Lata: " + qtd);
    }


    /**
     * Getter padrão para o atributo pessoa.
     * Retorna a pessoa presente na ficha de adoção.
     * 
     * @return a pessoa presente na ficha de adoção
     */
    public Pessoa getPessoa() {
        return pessoa;
    }
    
    
    /**
     * Setter padrão para o atributo pessoa.
     * Define a pessoa presente na ficha de adoção.
     * 
     * @param pessoa Pessoa presente na ficha de adoção
     */
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    /**
     * Getter padrão para o atributo cão.
     * Retorna o cão presente na ficha de adoção.
     * 
     * @return o cão presente na ficha de adoção
     */
    public Cão getCão() {
        return cão;
    }
    
     /**
     * Setter padrão para o atributo cão.
     * Define o cão presente na ficha de adoção.
     * 
     * @param cão Cão presente na ficha de adoção
     */
    public void setCão(Cão cão) {
        this.cão = cão;
    }
    
    /**
     * Getter padrão para o atributo data_adoção.
     * Retorna a data de adoção.
     * 
     * @return a data de adoção
     */
    public LocalDate getData_adoção() {
        return data_adoção;
    }
    
     /**
     * Setter padrão para o atributo data_adoção.
     * Define data de adoção.
     * 
     * @param data_adoção Data de adoção
     */
    public void setData_adoção(LocalDate data_adoção) {
        this.data_adoção = data_adoção;
    }

    /**
     * Getter padrão para o atributo qtd.
     * Retorna a quantidade de fichas de adoção.
     * 
     * @return a quantidade de fichas de adoção
     */
    public static int getQtd() {
        return qtd;
    }
    
}
