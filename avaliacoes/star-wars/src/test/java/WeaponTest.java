import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Test;

public class WeaponTest {

    @Test
    public void testWeapon() {
        Weapon w = new Weapon("Sabre de Luz", 60);
        assertEquals("Sabre de Luz", w.getDescricao());
        assertEquals(60, w.getDano());
    }

    @Test
    public void testSettersAndGetters() {
        Weapon w = new Weapon("Blaster", 20);
        w.setDescricao("Blaster");
        w.setDano(20);

        assertEquals("Blaster", w.getDescricao());
        assertEquals(20, w.getDano());
    }

    @Test
    public void testDrop() {
        Weapon w = new Weapon("Blaster", 20);
        assertSame(w, w.drop());
    }

    @Test
    public void testPickUp() {
        Weapon w = new Weapon("Sabre de Luz", 60);
        assertSame(w, w.pickUp());
    }
}