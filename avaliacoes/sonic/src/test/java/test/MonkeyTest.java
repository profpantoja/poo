package test;

import model.Monkey;
import model.Direction;

import static org.junit.Assert.*;
import org.junit.Test;

public class MonkeyTest {

    @Test
    public void testMonkeyInitialization() {
        Monkey monkey = new Monkey("Monkey", 50, "monkey.png", 2, 3);
        assertEquals("Monkey", monkey.getName());
        assertEquals(50, monkey.getLife());
        assertEquals("monkey.png", monkey.getImage());
        assertEquals(2, monkey.getX());
        assertEquals(3, monkey.getY());
        System.out.println("✅ testMonkeyInitialization passou");
    }

    @Test
    public void testMonkeyMoveUp() {
        Monkey monkey = new Monkey("Monkey", 50, "monkey.png", 2, 3);
        monkey.mover(Direction.UP);
        assertEquals(2, monkey.getX());
        assertEquals(4, monkey.getY());
        System.out.println("✅ testMonkeyMoveUp passou");
    }

    @Test
    public void testMonkeyMoveFront() {
        Monkey monkey = new Monkey("Monkey", 50, "monkey.png", 2, 3);
        monkey.mover(Direction.FRONT);
        assertEquals(3, monkey.getX());
        System.out.println("✅ testMonkeyMoveFront passou");
    }

    @Test
    public void testMonkeyMoveBack() {
        Monkey monkey = new Monkey("Monkey", 50, "monkey.png", 2, 3);
        monkey.mover(Direction.BACK);
        assertEquals(1, monkey.getX());
        System.out.println("✅ testMonkeyMoveBack passou");
    }

    @Test
    public void testMonkeyMoveDown() {
        Monkey monkey = new Monkey("Monkey", 50, "monkey.png", 2, 3);
        monkey.mover(Direction.DOWN);
        assertEquals(2, monkey.getX());
        assertEquals(2, monkey.getY());
        System.out.println("✅ testMonkeyMoveDown passou");
    }
}
