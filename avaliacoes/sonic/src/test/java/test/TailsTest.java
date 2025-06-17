package test;

import model.Tails;
import model.Direction;

import static org.junit.Assert.*;
import org.junit.Test;

public class TailsTest {

    @Test
    public void testTailsInitialization() {
        Tails tails = new Tails("Tails", 100, "tails.png", 0, 0);
        assertEquals("Tails", tails.getName());
        assertEquals(100, tails.getLife());
        assertEquals("tails.png", tails.getImage());
        assertEquals(0, tails.getX());
        assertEquals(0, tails.getY());
        System.out.println("✅ testTailsInitialization passou");
    }

    @Test
    public void testMoveFront() {
        Tails tails = new Tails("Tails", 100, "tails.png", 0, 0);
        tails.mover(Direction.FRONT);
        assertEquals(1, tails.getX());
        assertEquals(0, tails.getY());
        System.out.println("✅ testMoveFront passou");
    }

    @Test
    public void testMoveBack() {
        Tails tails = new Tails("Tails", 100, "tails.png", 0, 0);
        tails.mover(Direction.BACK);
        assertEquals(-1, tails.getX());
        assertEquals(0, tails.getY());
        System.out.println("✅ testMoveBack passou");
    }

    @Test
    public void testMoveUp() {
        Tails tails = new Tails("Tails", 100, "tails.png", 0, 0);
        tails.mover(Direction.UP);
        assertEquals(0, tails.getX());
        assertEquals(1, tails.getY());
        System.out.println("✅ testMoveUp passou");
    }

    @Test
    public void testMoveDown() {
        Tails tails = new Tails("Tails", 100, "tails.png", 0, 0);
        tails.mover(Direction.DOWN);
        assertEquals(0, tails.getX());
        assertEquals(-1, tails.getY());
        System.out.println("✅ testMoveDown passou");
    }
}
