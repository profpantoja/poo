package vought;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BillyCompoundV implements BasicPower<Hero>, SpecialPower<Hero> {

	@Test
	public void activateDurability(Hero hero) {
		hero.setEnergy(100);
		System.out.println("Ganhei energia demais!");
		assertEquals(100, "Ganhei energia demais");
	}

	public void giveStrength(Hero hero) {
		hero.setStrength(100);
		System.out.println("Ganhei força");
		assertEquals(100, 0);
	}

	@Test
	public void maxSpeed(Hero hero) {
		int currentSpeed = 0;
		hero.setSpeed(100);
		currentSpeed = hero.getSpeed();
		assertEquals(hero.getSpeed(), currentSpeed);
	}

	public void fly(Hero hero) {
		
	}

	public void usePower(Hero hero) {

	}

}
