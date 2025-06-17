package pets;

import static org.junit.Assert.*;
import org.junit.Test;

public class PetTest {

    @Test
    public void testPetProntuarios() {
        Cachorro dog = new Cachorro("Rex", "2020-01-01");
        Prontuario pront = new Prontuario();
        dog.getProntuarios().add(pront);
        assertEquals(1, dog.getProntuarios().size());
        assertEquals(pront, dog.getProntuarios().get(0));
    }
}