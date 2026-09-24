package test;

import org.junit.Test;
import vought.Person;
import static org.junit.Assert.assertEquals;

public class PersonTest {
    @Test
    public void testGetName() {
        Person person = new Person("Billy", "Brutus");
        assertEquals("Billy", person.getName());
    }

    @Test
    public void testGetSurname() {
        Person person = new Person("Billy", "Brutus");
        assertEquals("Brutus", person.getSurname());
    }

    @Test
    public void testSetName() {
        Person person = new Person("Billy", "Brutus");
        person.setName("Hughie");
        assertEquals("Hughie", person.getName());
    }

    @Test
    public void testNoArgsConstructor() {
        Person person = new Person();
        person.setName("Annie");
        person.setSurname("January");
        assertEquals("Annie", person.getName());
        assertEquals("January", person.getSurname());
    }

    @Test
    public void testSetSurname() {
        Person person = new Person("Billy", "Brutus");
        person.setSurname("Campbell");
        assertEquals("Campbell", person.getSurname());
    }

}
