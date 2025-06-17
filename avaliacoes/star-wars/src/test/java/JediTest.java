import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class JediTest extends PessoaTest{

    private Jedi jedi;

    @Before
    public void setUp() {
        jedi = new Jedi("Anakin", "Skywalker");
    }

    @Test
    public void testConstrutorPadrao() {
        Jedi j = new Jedi();
        assertEquals("Jedi", j.getTitulo());
        assertNotNull(j.getWeapons());
        assertTrue(j.getWeapons().isEmpty());
    }

    @Test
    public void testConstrutorComParametros() {
        assertEquals("Anakin", jedi.getNome());
        assertEquals("Skywalker", jedi.getSobrenome());
        assertEquals("Jedi", jedi.getTitulo());
        assertNotNull(jedi.getWeapons());
    }

    @Test
    @Override
    public void testSettersAndGetters() {
        jedi.setTitulo("Mestre Jedi");
        assertEquals("Mestre Jedi", jedi.getTitulo());

        ArrayList<Weapon> w = new ArrayList<>();
        w.add(new Weapon("Sabre Azul", 85));
        jedi.setWeapons(w);

        assertEquals(1, jedi.getWeapons().size());
        assertEquals("Sabre Azul", jedi.getWeapons().get(0).getDescricao());
    }

    @Test
    @Override
    public void testImprime() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        jedi.imprime();

        System.setOut(System.out);

        String expected = "Anakin Skywalker" + System.lineSeparator() +
                          "Titulo: Jedi" + System.lineSeparator();

        assertEquals(expected, out.toString());
    }

    @Test
    public void testMindControl() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        jedi.mindControl();

        System.setOut(System.out);

        assertEquals("[Jedi]: Do what I wish" + System.lineSeparator(), out.toString());
    }

    @Test
    public void testFarseeing() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        jedi.farseeing();

        System.setOut(System.out);

        assertEquals("[Jedi]: Visão amplificada" + System.lineSeparator(), out.toString());
    }

    @Test
    public void testTelepath() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        jedi.telepath();

        System.setOut(System.out);

        assertEquals("[Jedi]: Telepatia ativada" + System.lineSeparator(), out.toString());
    }

    @Test
    public void testLevitation() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        jedi.levitation();

        System.setOut(System.out);

        assertEquals("[Jedi]: Levitação ativada" + System.lineSeparator(), out.toString());
    }

    @Test
    public void testWeaponsVazia() {
        Jedi jediSemArmas = new Jedi();
        assertTrue(jediSemArmas.getWeapons().isEmpty());
    }
}