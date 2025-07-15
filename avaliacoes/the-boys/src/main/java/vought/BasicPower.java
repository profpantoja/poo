package vought;

/**
 * Interface genérica que define os métodos básicos para poderes,
 * onde cada método recebe um parâmetro do tipo genérico {@code Type}.
 *
 * @param <Type> o tipo do parâmetro que será usado nos métodos dos poderes
 */
public interface BasicPower<Type> {

    /**
     * Ativa a durabilidade do poder com base no parâmetro fornecido.
     *
     * @param T o valor ou objeto que define como a durabilidade será ativada
     */
    public abstract void activateDurability(Type T);

    /**
     * Concede força ao poder com base no parâmetro fornecido.
     *
     * @param T o valor ou objeto que define a força a ser dada
     */
    public abstract void giveStrength(Type T);

    /**
     * Define a velocidade máxima do poder com base no parâmetro fornecido.
     *
     * @param T o valor ou objeto que define a velocidade máxima
     */
    public abstract void maxSpeed(Type T);

    /**
     *Executa a ação de voar com base no parâmetro fornecido.
     *
     * @param T o valor ou objeto que controla ou define a capacidade de voar
     */
    public abstract void fly(Type T);

}
