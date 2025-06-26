
/**
 * A classe Dog estende a classe abstrata Animal e define uma representação do animal cachorro.
 */
public class Dog extends Animal{


    /**
     * O método respirar, herdado da classe abstrata Animal, exibe na tela uma mensagem indicando a ação de respirar do cachorro.
     */
    public void respirar(){
        System.out.println("O cachorro respirou!");
    }

     /**
     * O método dormir, herdado da classe abstrata Animal, exibe na tela uma mensagem indicando a ação de dormir do cachorro.
     */
    public void dormir(){
        System.out.println("O cachorro dormiu!");
    }
    
    /**
     * O método comer, herdado da classe abstrata Animal, exibe na tela uma mensagem indicando a ação de comer do cachorro.
     */
    public void comer(){
        System.out.println("O cachorro comeu!");
    }
    
    /**
     * O método andar, herdado da classe abstrata Animal, exibe na tela uma mensagem indicando a ação de andar do cachorro.
     */
    public void andar(){
        System.out.println("O cachorro andou!");
    }

    /**
     * O método latir exibe na tela uma mensagem indicando a ação de latir do cachorro.
     */
    public void latir(){
        System.out.println("O cachorro latiu!");
    }
    
    
}
