package test;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pets.Cachorro;

public class CachorroTest {

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
        Cachorro dog = new Cachorro("Rex", "2020-01-01");
        assertEquals("Cachorro: Rex, Nascimento: 2020-01-01", dog.getInfo());
    }

    @Test
    public void testLatir() {
        Cachorro dog = new Cachorro("Rex", "2020-01-01");
        dog.latir();
        String expected = "O cachorro Rex: AUAU!";
        assertEquals(expected, outContent.toString());
    }
}