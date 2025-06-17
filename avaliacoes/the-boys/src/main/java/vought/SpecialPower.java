package vought;
/**
 * Método de interfaca que especifica o tipo de Poder Especial do herói.
 * @param Type Tipo do poder. 
 */
public interface SpecialPower<Type> {
	
	/**
	 * Ativa o poder do personagem.
	 * @param T Tipo do poder.
	 */
	public abstract void usePower(Type T);

}
