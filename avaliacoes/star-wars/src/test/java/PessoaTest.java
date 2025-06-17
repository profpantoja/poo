import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class PessoaTest {

    @Test
    public void testPessoa() {
        Pessoa p = new Pessoa();
        assertNull(p.getNome());
        assertNull(p.getSobrenome());
        assertNull(p.getSexo());
    }

    @Test
    public void testPessoaNomeSobrenome() {
        Pessoa p = new Pessoa("Mace", "Windu");
        assertEquals("Mace", p.getNome());
        assertEquals("Windu", p.getSobrenome());
    }

    @Test
    public void testPessoaNomeSobrenomeSexo() {
        Pessoa p = new Pessoa("Anakin", "Skywalker", "Masculino");
        assertEquals("Anakin", p.getNome());
        assertEquals("Skywalker", p.getSobrenome());
        assertEquals("Masculino", p.getSexo());
    }

    @Test
    public void testSettersAndGetters() {
        Pessoa p = new Pessoa();
        p.setNome("Padmé");
        p.setSobrenome("Amidala");
        p.setSexo("Feminino");

        assertEquals("Padmé", p.getNome());
        assertEquals("Amidala", p.getSobrenome());
        assertEquals("Feminino", p.getSexo());
    }

    @Test
    public void testImprime() {
        Pessoa p = new Pessoa("Ben", "Solo", "Masculino");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            p.imprime();
        } finally {
            System.setOut(originalOut);
        }

        String expectedOutput = "Ben" + System.lineSeparator()
                              + "Solo" + System.lineSeparator()
                              + "Masculino" + System.lineSeparator();

        assertEquals(expectedOutput, outContent.toString());
    }
}
