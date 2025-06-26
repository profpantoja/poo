
/**
 * A classe Aviao, que estende a classe abstrata Veiculo, define um veículo aéreo (avião) que realiza diversas ações.
 * 
 */
public class Aviao extends Veiculo{

    private String reg_aeronautico;
    

    /**
     * Construtor da classe Aviao que recebe um parâmetro.
     * Define o parâmetro recebido.
     * @param reg_aeronautico Registro aeronáutico
     */
    public Aviao(String reg_aeronautico) {
        this.reg_aeronautico = reg_aeronautico;
    }

    /**
     * O método ligar, herdado da classe abstrata Veiculo, exibe na tela uma mensagem indicando a ação de ligar do avião.
     */
    public void ligar(){
        System.out.println("O aviao ligou!");
    }

    /**
     * O método desligar, herdado da classe abstrata Veiculo, exibe na tela uma mensagem indicando a ação de desligar do avião.
     */
    public void desligar(){
        System.out.println("O aviao desligou!");
    }

     /**
     * O método frente, herdado da classe abstrata Veiculo, exibe na tela uma mensagem indicando a ação de mover-se para frente do avião.
     */
    public void frente(){
        System.out.println("O aviao se moveu para frente!");
    }

    /**
     * O método re, herdado da classe abstrata Veiculo, exibe na tela uma mensagem indicando a ação de dar marcha à ré do avião.
     */
    public void re(){
        System.out.println("O aviao deu ré!");
    }

    /**
     * O método parar, herdado da classe abstrata Veiculo, exibe na tela uma mensagem indicando a ação de parar do avião.
     */
    public void parar(){
        System.out.println("O aviao parou!");
    }

    /**
     * Getter padrão para o atributo reg_aeronautico.
     * Retorna o registro aeronáutico.
     * @return o registro aeronáutico
     */
    public String getReg_aeronautico() {
        return reg_aeronautico;
    }

    /**
     * Setter padrão para o atributo reg_aeronautico.
     * Define o registro aeronáutico.
     * @param reg_aeronautico Registro aeronáutico
     */
    public void setReg_aeronautico(String reg_aeronautico) {
        this.reg_aeronautico = reg_aeronautico;
    }

    
    
}
