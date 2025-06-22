package test;

import org.junit.Test;
import vought.Person;
import vought.StarLight;
import vought.StarLightCompoundV;

public class StarLightCompoundVTest {

    @Test
    public void testActivateDurability() {
        StarLight starlight = new StarLight(new Person("Annie", "January"), "Starlight", 80, 40, 60);
        StarLightCompoundV compound = new StarLightCompoundV();
        compound.activateDurability(starlight);
    }

    @Test
    public void testGiveStrength() {
        StarLight starlight = new StarLight(new Person("Annie", "January"), "Starlight", 80, 40, 60);
        StarLightCompoundV compound = new StarLightCompoundV();
        compound.giveStrength(starlight);
    }

    @Test
    public void testMaxSpeed() {
        StarLight starlight = new StarLight(new Person("Annie", "January"), "Starlight", 80, 40, 60);
        StarLightCompoundV compound = new StarLightCompoundV();
        compound.maxSpeed(starlight);
    }

    @Test
    public void testFly() {
        StarLight starlight = new StarLight(new Person("Annie", "January"), "Starlight", 80, 40, 60);
        StarLightCompoundV compound = new StarLightCompoundV();

        compound.fly(starlight);
    }

    @Test
    public void testUsePower() {
        StarLight starlight = new StarLight(new Person("Annie", "January"), "Starlight", 80, 40, 60);
        StarLightCompoundV compound = new StarLightCompoundV();

        compound.usePower(starlight);
    }
}
