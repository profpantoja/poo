package pets;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalopsitaTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testGetInfo() {
        Calopsita bird = new Calopsita("Piu", "2022-03-15");
        assertEquals("Calopsita: Piu, Nascimento: 2022-03-15", bird.getInfo());
    }

    @Test
    public void testPiar() {
        Calopsita bird = new Calopsita("Piu", "2022-03-15");
        bird.piar();
        String expected = "A calopsita Piu: PIUPIU!" + System.lineSeparator();
        assertEquals(expected, outContent.toString());
    }
}