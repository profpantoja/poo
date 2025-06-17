import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SaberTest extends WeaponTest {
    @Test
    public void testSaber() {
        Saber s = new Saber("Azul", 60);
        assertEquals("Azul", s.getDescricao());
        assertEquals(60, s.getDano());
    }

    @Test
    public void testSlash() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        Saber s = new Saber("Azul", 60);
        System.setOut(new PrintStream(outContent));

        try {
            s.slash();
        } finally {
            System.setOut(originalOut);
        }

        String expectedOutput = "O sabre Azul atacou!" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
