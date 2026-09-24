package test;

import org.junit.Test;
import vought.Person;
import vought.Hero;
import vought.HughieCompoundV;

import static org.junit.Assert.assertEquals;

public class HughieCompoundVTest {

    @Test
    public void testActivateDurability() {
        Hero hughie = new Hero(new Person("Hugh", "Campbell"), "Hughie", 20, 30, 40);
        HughieCompoundV compound = new HughieCompoundV();

        compound.activateDurability(hughie);

        assertEquals(100, hughie.getEnergy());
    }

    @Test
    public void testUsePower() {
        Hero hughie = new Hero(new Person("Hugh", "Campbell"), "Hughie", 20, 30, 40);
        HughieCompoundV compound = new HughieCompoundV();

        // Apenas verificar que o método
        compound.usePower(hughie);
    }
}
