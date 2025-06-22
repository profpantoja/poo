package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import vought.BasicPower;
import vought.Hero;

public class BasicPowerTest {
    @Test
    public void testActivateDurability() {
        Hero hero = new Hero("Homelander", 100, 50, 75);

        BasicPower<Hero> power = new BasicPower<Hero>() {
            @Override
            public void activateDurability(Hero h) {
                h.setEnergy(h.getEnergy() + 20);
            }

            @Override
            public void giveStrength(Hero h) {
            }

            @Override
            public void maxSpeed(Hero h) {
            }

            @Override
            public void fly(Hero h) {
            }
        };

        power.activateDurability(hero);
        assertEquals(120, hero.getEnergy());
    }
}
