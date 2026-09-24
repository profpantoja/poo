package test;

import org.junit.Test;
import vought.Person;
import vought.Homelander;

import static org.junit.Assert.assertEquals;

public class HomelanderTest {

    @Test
    public void testHomelanderConstructor() {
        Person person = new Person("John", "Doe");
        Homelander homelander = new Homelander(person, "Homelander", 120, 100, 90);

        assertEquals("John", homelander.getName());
        assertEquals("Doe", homelander.getSurname());
        assertEquals("Homelander", homelander.getNickname());
        assertEquals(120, homelander.getEnergy());
        assertEquals(100, homelander.getStrength());
        assertEquals(90, homelander.getSpeed());
    }
}
