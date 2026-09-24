package test;

import org.junit.Test;
import vought.Person;
import vought.Homelander;
import vought.HomelanderCompoundV;

import static org.junit.Assert.assertEquals;

public class HomelanderCompoundVTest {

    @Test
    public void testActivateDurability() {
        Homelander homelander = new Homelander(new Person("John", "Doe"), "Homelander", 50, 80, 70);
        HomelanderCompoundV compound = new HomelanderCompoundV();

        compound.activateDurability(homelander);

        assertEquals(100, homelander.getEnergy());
    }

    @Test
    public void testGiveStrength() {
        Homelander homelander = new Homelander(new Person("John", "Doe"), "Homelander", 50, 80, 70);
        HomelanderCompoundV compound = new HomelanderCompoundV();

        compound.giveStrength(homelander);

        assertEquals(100, homelander.getStrength());
    }

    @Test
    public void testMaxSpeed() {
        Homelander homelander = new Homelander(new Person("John", "Doe"), "Homelander", 50, 80, 70);
        HomelanderCompoundV compound = new HomelanderCompoundV();

        compound.maxSpeed(homelander);

        assertEquals(100, homelander.getSpeed());
    }

    @Test
    public void testFly() {
        Homelander homelander = new Homelander(new Person("John", "Doe"), "Homelander", 50, 80, 70);
        HomelanderCompoundV compound = new HomelanderCompoundV();
        compound.fly(homelander);
    }

    @Test
    public void testUsePower() {
        Homelander homelander = new Homelander(new Person("John", "Doe"), "Homelander", 50, 80, 70);
        HomelanderCompoundV compound = new HomelanderCompoundV();
        compound.usePower(homelander);
    }
}
