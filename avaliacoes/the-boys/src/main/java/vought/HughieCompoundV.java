package vought;

public class HughieCompoundV implements BasicPower<Hero>, SpecialPower<Hero> {

	public void activateDurability(Hero hero) {
		hero.setEnergy(100);
		System.out.println("Ganhei energia demais!");
	}

	public void giveStrength(Hero hero) {

	}

	public void maxSpeed(Hero hero) {

	}

	public void fly(Hero hero) {

	}

	public void usePower(Hero hero) {
		System.out.println("[HUGHIE]: Me teletransportei e fiquei nu!");
	}

}
