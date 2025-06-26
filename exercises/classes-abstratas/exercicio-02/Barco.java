
/**
 * A classe Barco, que estende a classe abstrata Veiculo, define um veículo aquático (barco) que realiza diversas ações.
 * 
 */
public class Barco extends Veiculo{

    private String reg_embarcação;


    /**
     * Construtor da classe Barco que recebe um parâmetro.
     * Define o parâmetro recebido.
     * @param reg_embarcação Registro da embarcação
     */
    public Barco(String reg_embarcação) {
        this.reg_embarcação = reg_embarcação;
    }

    /**
     * O método ligar, herdado da classe abstrata Veiculo, exibe na tela uma mensagem indicando a ação de ligar do barco.
     */
    public void ligar(){
        System.out.println("O barco ligou!");
    }

    /**
     * O método desligar, herdado da classe abstrata Veiculo, exibe na tela uma mensagem indicando a ação de desligar do barco.
     */
    public void desligar(){
        System.out.println("O barco desligou!");
    }

    /**
     * O método frente, herdado da classe abstrata Veiculo, exibe na tela uma mensagem indicando a ação de mover-se para frente do barco.
     */
    public void frente(){
        System.out.println("O barco se moveu para frente!");
    }

    /**
     * O método re, herdado da classe abstrata Veiculo, exibe na tela uma mensagem indicando a ação de dar marcha à ré do barco.
     */
    public void re(){
        System.out.println("O barco deu ré!");
    }

    /**
     * O método parar, herdado da classe abstrata Veiculo, exibe na tela uma mensagem indicando a ação de parar do barco.
     */
    public void parar(){
        System.out.println("O barco parou!");
    }


    /**
     * Getter padrão para o atributo reg_embarcação.
     * Retorna o registro da embarcação.
     * @return o registro da embarcação 
     */
    public String getReg_embarcação() {
        return reg_embarcação;
    }


    /**
     * Setter padrão para o atributo reg_embarcação.
     * Define o registro da embarcação.
     * @param reg_embarcação Registro da embarcação
     */
    public void setReg_embarcação(String reg_embarcação) {
        this.reg_embarcação = reg_embarcação;
    }


    
}
