package vought;
/**
 * Método de interfaca que especifica o tipo de Poder Básico do herói.
 * @param Type Tipo do poder. 
 */
public interface BasicPower<Type> {
	/**
	 * Ativa o poder do personagem.
	 * @param T Tipo do poder (durabilidade).
	 */
	public abstract void activateDurability(Type T);

	/**
	 * Ativa o poder do personagem.
	 * @param T Tipo do poder (força).
	 */
	public abstract void giveStrength(Type T);

	/**
	 * Ativa o poder do personagem.
	 * @param T Tipo do poder (velocidade máxima).
	 */
	public abstract void maxSpeed(Type T);

	/**
	 * Ativa o poder do personagem.
	 * @param T Tipo do poder (voo).
	 */
	public abstract void fly(Type T);

}
