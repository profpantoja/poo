package pets;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GatoTest {

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
        Gato cat = new Gato("Mimi", "2021-05-05");
        assertEquals("Gato: Mimi, Nascimento: 2021-05-05", cat.getInfo());
    }

    @Test
    public void testMiar() {
        Gato cat = new Gato("Mimi", "2021-05-05");
        cat.miar();
        String expected = "O gato Mimi: MIAUMIAU!" + System.lineSeparator();
        assertEquals(expected, outContent.toString());
    }
}