import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;


public class SithTest {

    private Sith sith;

    @Before
    public void setUp() {
        sith = new Sith("Darth", "Vader");
    }

    @Test
    public void testConstrutorPadrao() {
        Sith s = new Sith();
        assertEquals("Sith", s.getTitulo());
        assertNotNull(s.getWeapons());
        assertTrue(s.getWeapons().isEmpty());
    }

    @Test
    public void testConstrutorComParametros() {
        assertEquals("Darth", sith.getNome());
        assertEquals("Vader", sith.getSobrenome());
        assertEquals("Sith", sith.getTitulo());
        assertNotNull(sith.getWeapons());
    }

    @Test
    public void testSettersAndGetters() {
        sith.setTitulo("Mestre Sith");
        assertEquals("Mestre Sith", sith.getTitulo());

        ArrayList<Weapon> w = new ArrayList<>();
        w.add(new Weapon("Sabre Vermelho", 85));
        sith.setWeapons(w);

        assertEquals(1, sith.getWeapons().size());
        assertEquals("Sabre Vermelho", sith.getWeapons().get(0).getDescricao());
    }

    @Test
    public void testImprime() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        sith.imprime();

        System.setOut(System.out);

        String expected = "Darth Vader" + System.lineSeparator() +
                          "Titulo: Sith" + System.lineSeparator();

        assertEquals(expected, out.toString());
    }

    @Test
    public void testMindControl() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        sith.mindControl();

        System.setOut(System.out);

        assertEquals("[Sith]: Controle mental ativado" + System.lineSeparator(), out.toString());
    }

    @Test
    public void testFarseeing() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        sith.farseeing();

        System.setOut(System.out);

        assertEquals("[Sith]: Visão amplificada" + System.lineSeparator(), out.toString());
    }

    @Test
    public void testTelepath() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        sith.telepath();

        System.setOut(System.out);

        assertEquals("[Sith]: Telepatia ativada" + System.lineSeparator(), out.toString());
    }

    @Test
    public void testLevitation() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        sith.levitation();

        System.setOut(System.out);

        assertEquals("[Sith]: Levitação ativada" + System.lineSeparator(), out.toString());
    }

    @Test
    public void testWeaponsVazia() {
        Sith sithSemArmas = new Sith();
        assertTrue(sithSemArmas.getWeapons().isEmpty());
    }
}
