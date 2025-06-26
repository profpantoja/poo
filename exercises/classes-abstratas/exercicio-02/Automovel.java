
/**
 * A classe Automovel, que estende a classe abstrata Veiculo, define um veículo terrestre (automóvel) que realiza diversas ações.
 * 
 */
public class Automovel extends Veiculo{

    private String renavam;
    private String placa;
    

    /**
     * Construtor da classe Aviao que recebe dois parâmetro.
     * Define os parâmetros recebidos.
     * @param renavam Registro Nacional de Veículos Automotores
     * @param placa Placa do automóvel
     */
    public Automovel(String renavam, String placa) {
        this.renavam = renavam;
        this.placa = placa;
    }

    /**
     * O método ligar, herdado da classe abstrata Veiculo, exibe na tela uma mensagem indicando a ação de ligar do automóvel.
     */
    public void ligar(){
        System.out.println("O carro ligou!");
    }

     /**
     * O método desligar, herdado da classe abstrata Veiculo, exibe na tela uma mensagem indicando a ação de desligar do automóvel.
     */
    public void desligar(){
        System.out.println("O carro desligou!");
    }

    /**
     * O método frente, herdado da classe abstrata Veiculo, exibe na tela uma mensagem indicando a ação de mover-se para frente do automóvel.
     */
    public void frente(){
        System.out.println("O carro se moveu para frente!");
    }

    /**
     * O método re, herdado da classe abstrata Veiculo, exibe na tela uma mensagem indicando a ação de dar marcha à ré do automóvel.
     */
    public void re(){
        System.out.println("O carro deu ré!");
    }

    /**
     * O método parar, herdado da classe abstrata Veiculo, exibe na tela uma mensagem indicando a ação de parar do automóvel.
     */
    public void parar(){
        System.out.println("O carro parou!");
    }

    /**
     * Getter padrão para o atributo renavam.
     * Retorna o Registro Nacional de Veículos Automotores.
     * @return o Registro Nacional de Veículos Automotores
     */
    public String getRenavam() {
        return renavam;
    }

    /**
     * Setter padrão para o atributo renavam.
     * Define o Registro Nacional de Veículos Automotores.
     * @param renavam Registro Nacional de Veículos Automotores
     */
    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    /**
     * Getter padrão para o atributo placa.
     * Retorna a placa do automóvel
     * @return a placa do automóvel
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Setter padrão para o atributo placa.
     * Define o Registro Nacional de Veículos Automotores.
     * @param placa Placa do automóvel
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }


}
