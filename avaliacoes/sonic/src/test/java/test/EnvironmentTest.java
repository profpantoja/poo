package test;

import model.*;
import model.Object;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;

public class EnvironmentTest {

    @Test
    public void testSonicColetaRing() {
        Sonic sonic = new Sonic("Sonic", 3, "sonic.png", 10, 10);
        Tails tails = new Tails("Tails", 3, "tails.png", 0, 0);
        Monkey monkey = new Monkey("Monkey", 1, "monkey.png", 0, 0);

        Object ring = new Object("Ring", "ring.png", 11, 11, TipoObjeto.RING); 
        ArrayList<Object> objetos = new ArrayList<>();
        objetos.add(ring);

        Environment env = new Environment("Green Hill", "bg.png", 100, 100, 0, 0.0, 1);
        env.setObjects(objetos);

        env.colidiu(sonic, tails, monkey);

        assertEquals(0, env.getQtdRings());
    }

    @Test
    public void testSonicColideComMonkeyPulando() {
        Sonic sonic = new Sonic("Sonic", 3, "sonic.png", 10, 10);
        sonic.setEstapulando(true);
        Monkey monkey = new Monkey("Monkey", 1, "monkey.png", 11, 11); 
        Tails tails = new Tails("Tails", 3, "tails.png", 0, 0);

        Environment env = new Environment("Green Hill", "bg.png", 100, 100, 0, 0.0, 0);
        env.colidiu(sonic, tails, monkey);

        assertEquals(3, sonic.getLife()); 
    }

    @Test
    public void testSonicColideComMonkeySemPular() {
        Sonic sonic = new Sonic("Sonic", 3, "sonic.png", 10, 10);
        sonic.setEstapulando(false);
        Monkey monkey = new Monkey("Monkey", 1, "monkey.png", 11, 11); 
        Tails tails = new Tails("Tails", 3, "tails.png", 0, 0);

        Environment env = new Environment("Green Hill", "bg.png", 100, 100, 0, 0.0, 0);
        env.colidiu(sonic, tails, monkey);

        assertEquals(2, sonic.getLife()); 
    }

    @Test
    public void testTailsColideComRing() {
        Sonic sonic = new Sonic("Sonic", 3, "sonic.png", 0, 0);
        Tails tails = new Tails("Tails", 3, "tails.png", 10, 10);
        Monkey monkey = new Monkey("Monkey", 1, "monkey.png", 0, 0);

        Object ring = new Object("Ring", "ring.png", 11, 11, TipoObjeto.RING); 
        ArrayList<Object> objetos = new ArrayList<>();
        objetos.add(ring);

        Environment env = new Environment("Green Hill", "bg.png", 100, 100, 0, 0.0, 0);
        env.setObjects(objetos);

        env.colidiu(sonic, tails, monkey);

        assertEquals(1, env.getQtdRings()); 
    }

    @Test
    public void testSonicETailsColidem() {
        Sonic sonic = new Sonic("Sonic", 3, "sonic.png", 10, 10);
        Tails tails = new Tails("Tails", 3, "tails.png", 11, 11); 
        Monkey monkey = new Monkey("Monkey", 1, "monkey.png", 0, 0);

        Environment env = new Environment("Green Hill", "bg.png", 100, 100, 0, 0.0, 0);
        env.colidiu(sonic, tails, monkey);

        assertEquals(3, sonic.getLife()); 
    }
}
