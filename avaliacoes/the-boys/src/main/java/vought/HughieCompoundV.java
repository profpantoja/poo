package vought;
/**
 * Classe que representa um herói "HughieCompoundV" e que implementa uma interface de Poderes básicos e Poderes Especiais com base em "Herói (Hero)".
 */
public class HughieCompoundV implements BasicPower<Hero>, SpecialPower<Hero> {
	
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
	 * Método que ativa o poder (Teletransporte) no personagem.
	 * @param hero "Herói", que receberá o valor de poder.
	 */
	public void usePower(Hero hero) {
		System.out.println("[HUGHIE]: Me teletransportei e fiquei nu!");
	}

}
