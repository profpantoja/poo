
/**
 * A classe abstrata Veiculo define um padrão de ações para um veículo que a estenda.
 * 
 */
public abstract class Veiculo {

    /**
     * O método abstrato ligar define a ação de ligar um veículo.
     */
    public abstract void ligar();

    /**
     * O método abstrato desligar define a ação de desligar um veículo.
     */
    public abstract void desligar();
    
    /**
     * O método abstrato frente define a ação de mover-se para a frente em um veículo.
     */
    public abstract void frente();
    
    /**
     * O método abstrato ré define a ação de dar marcha à ré em um veículo.
     */
    public abstract void re();
    
    /**
     * O método abstrato parar define a ação de parar em um veículo.
     */
    public abstract void parar();
    
}
