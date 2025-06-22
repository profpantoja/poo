package test;

import org.junit.Test;
import vought.Hero;
import static org.junit.Assert.assertEquals;

public class HeroTest {

    @Test
    public void testNickname() {
        Hero hero = new Hero("Homelander", 100, 50, 75);
        assertEquals("Homelander", hero.getNickname());
    }

    @Test
    public void testEnergy() {
        Hero hero = new Hero("Homelander", 100, 50, 75);
        assertEquals(100, hero.getEnergy());
    }

    @Test
    public void testStrength() {
        Hero hero = new Hero("Homelander", 100, 50, 75);
        assertEquals(50, hero.getStrength());
    }

    @Test
    public void testSpeed() {
        Hero hero = new Hero("Homelander", 100, 50, 75);
        assertEquals(75, hero.getSpeed());
    }

    @Test
    public void testSetNickname() {
        Hero hero = new Hero("Homelander", 100, 50, 75);
        hero.setNickname("Starlight");
        assertEquals("Starlight", hero.getNickname());
    }

    @Test
    public void testSetEnergy() {
        Hero hero = new Hero("Homelander", 100, 50, 75);
        hero.setEnergy(150);
        assertEquals(150, hero.getEnergy());
    }

    @Test
    public void testSetStrength() {
        Hero hero = new Hero("Homelander", 100, 50, 75);
        hero.setStrength(80);
        assertEquals(80, hero.getStrength());
    }

    @Test
    public void testSetSpeed() {
        Hero hero = new Hero("Homelander", 100, 50, 75);
        hero.setSpeed(90);
        assertEquals(90, hero.getSpeed());
    }

    @Test
    public void testEmptyConstructor() {
        Hero hero = new Hero();
        hero.setNickname("Maeve");
        hero.setEnergy(90);
        hero.setStrength(60);
        hero.setSpeed(70);
        assertEquals("Maeve", hero.getNickname());
        assertEquals(90, hero.getEnergy());
        assertEquals(60, hero.getStrength());
        assertEquals(70, hero.getSpeed());
    }

    @Test
    public void testConstructorWithPerson() {
        vought.Person person = new vought.Person("Annie", "January");
        Hero hero = new Hero(person, "Starlight", 85, 60, 95);
        assertEquals("Annie", hero.getName());
        assertEquals("January", hero.getSurname());
        assertEquals("Starlight", hero.getNickname());
        assertEquals(85, hero.getEnergy());
        assertEquals(60, hero.getStrength());
        assertEquals(95, hero.getSpeed());
    }

}
