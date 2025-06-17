package test;

import model.Sonic;
import model.Direction;

import static org.junit.Assert.*;
import org.junit.Test;

public class SonicTest {

    @Test
    public void testSonicInitialization() {
        Sonic sonic = new Sonic("Sonic", 100, "sonic.png", 0, 0);
        assertEquals("Sonic", sonic.getName());
        assertEquals(100, sonic.getLife());
        assertEquals("sonic.png", sonic.getImage());
        assertEquals(0, sonic.getX());
        assertEquals(0, sonic.getY());
        assertFalse(sonic.isEstapulando());
        System.out.println("✅ testSonicInitialization passou");
    }

    @Test
    public void testSonicJumpSetsEstapulando() {
        Sonic sonic = new Sonic("Sonic", 100, "sonic.png", 0, 0);
        sonic.mover(Direction.UP);
        assertEquals(1, sonic.getY());
        assertTrue(sonic.isEstapulando());
        System.out.println("✅ testSonicJumpSetsEstapulando passou");
    }

    @Test
    public void testSonicMoveFront() {
        Sonic sonic = new Sonic("Sonic", 100, "sonic.png", 0, 0);
        sonic.mover(Direction.FRONT);
        assertEquals(1, sonic.getX());
        System.out.println("✅ testSonicMoveFront passou");
    }

    @Test
    public void testSonicMoveBack() {
        Sonic sonic = new Sonic("Sonic", 100, "sonic.png", 0, 0);
        sonic.mover(Direction.BACK);
        assertEquals(-1, sonic.getX());
        System.out.println("✅ testSonicMoveBack passou");
    }

    @Test
    public void testSonicMoveDown() {
        Sonic sonic = new Sonic("Sonic", 100, "sonic.png", 0, 0);
        sonic.mover(Direction.DOWN);
        assertEquals(-1, sonic.getY());
        System.out.println("✅ testSonicMoveDown passou");
    }
}
