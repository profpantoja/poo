package vought;

/**
 * Interface genérica que define um poder especial,
 * representado pelo método {@code usePower}, que recebe um parâmetro do tipo {@code Type}.
 *
 * @param <Type> o tipo do objeto que usará o poder especial
 */
public interface SpecialPower<Type> {

    /**
     *Método para usar o poder especial no objeto do tipo {@code Type}.
     *
     * @param T o objeto que usará o poder especial
     */
    public abstract void usePower(Type T);

}
