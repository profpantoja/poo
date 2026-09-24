package test;

import org.junit.Test;
import vought.BillyCompoundV;
import vought.Hero;

import static org.junit.Assert.assertEquals;

public class BillyCompoundVTest {

    @Test
    public void testActivateDurability() {
        Hero hero = new Hero("Butcher", 10, 20, 30);
        BillyCompoundV billy = new BillyCompoundV();

        billy.activateDurability(hero);

        assertEquals(100, hero.getEnergy());
    }

    @Test
    public void testGiveStrengthDoesNotChangeStrength() {
        Hero hero = new Hero("Butcher", 10, 20, 30);
        BillyCompoundV billy = new BillyCompoundV();

        billy.giveStrength(hero);

        assertEquals(20, hero.getStrength());
    }

    @Test
    public void testMaxSpeedDoesNotChangeSpeed() {
        Hero hero = new Hero("Butcher", 10, 20, 30);
        BillyCompoundV billy = new BillyCompoundV();

        billy.maxSpeed(hero);

        assertEquals(30, hero.getSpeed());
    }

    @Test
    public void testFlyDoesNotChangeAnything() {
        Hero hero = new Hero("Butcher", 10, 20, 30);
        BillyCompoundV billy = new BillyCompoundV();

        billy.fly(hero);

        assertEquals(10, hero.getEnergy());
        assertEquals(20, hero.getStrength());
        assertEquals(30, hero.getSpeed());
    }

    @Test
    public void testUsePowerDoesNotChangeAnything() {
        Hero hero = new Hero("Butcher", 10, 20, 30);
        BillyCompoundV billy = new BillyCompoundV();

        billy.usePower(hero);

        assertEquals(10, hero.getEnergy());
        assertEquals(20, hero.getStrength());
        assertEquals(30, hero.getSpeed());
    }
}
