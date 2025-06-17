import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BlastTest extends WeaponTest {
    
    @Test
    public void testBlast() {
        Blast b = new Blast("Plasma", 20);
        assertEquals("Plasma", b.getDescricao());
        assertEquals(20, b.getDano());
    }

    @Test
    public void testShot() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        Blast b = new Blast("Plasma", 60);
        System.setOut(new PrintStream(outContent));

        try {
            b.shot();
        } finally {
            System.setOut(originalOut);
        }

        String expectedOutput = "O blaster Plasma atirou!" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}
