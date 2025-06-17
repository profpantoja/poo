package pets;

import static org.junit.Assert.*;
import org.junit.Test;

public class VeterinarioTest {

    @Test
    public void testGetInfoWithCRV() {
        Veterinario vet = new Veterinario("Dr. Smith", "Smith", "CRV123");
        String expected = "Nome: Dr. Smith, Apelido: Smith, CRV: CRV123";
        assertEquals(expected, vet.getInfo());
    }
}