package vought;
/**
 * Classe que representa um herói "BillyCompoundV" e que implementa uma interface de Poderes básicos e Poderes Especiais com base em "Herói (Hero)".
 */
public class BillyCompoundV implements BasicPower<Hero>, SpecialPower<Hero> {

	/**
	 * Método que ativa a durabilidade aprimorada no personagem.
	 * @param hero "Herói", que receberá o valor de durabilidade.
	 */
	public void activateDurability(Hero hero) {
		hero.setEnergy(100);
		System.out.println("Ganhei energia demais!");
	}

	/**
	 * Método que ativa a força aprimorada no personagem.
	 * @param hero "Herói", que receberá o valor de força.
	 */
	public void giveStrength(Hero hero) {

	}

	/**
	 * Método que ativa a velocidade máxima no personagem.
	 * @param hero "Herói", que receberá o valor de velocidade máxima.
	 */
	public void maxSpeed(Hero hero) {

	}

	/**
	 * Método que ativa o voo no personagem.
	 * @param hero "Herói", que receberá o valor de voo.
	 */
	public void fly(Hero hero) {

	}

	/**
	 * Método que ativa o poder no personagem.
	 * @param hero "Herói", que receberá o valor de poder.
	 */
	public void usePower(Hero hero) {

	}

}
