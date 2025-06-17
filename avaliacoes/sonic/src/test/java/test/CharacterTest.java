package test;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Character;
import model.Direction;

public class CharacterTest {

    @Test
    public void testCharacterInitialization() {
        Character character = new Character("Hero", 100, "hero.png", 0, 0);
        assertEquals("Hero", character.getName());
        assertEquals(100, character.getLife());
        assertEquals("hero.png", character.getImage());
        assertEquals(0, character.getX());
        assertEquals(0, character.getY());
    }

    @Test
    public void testMoveFront() {
        Character character = new Character("Hero", 100, "hero.png", 0, 0);
        character.mover(Direction.FRONT);
        assertEquals(1, character.getX());
        assertEquals(0, character.getY());
        System.out.println("✅ testMoveFront passou");
    }

    @Test
    public void testMoveBack() {
        Character character = new Character("Hero", 100, "hero.png", 0, 0);
        character.mover(Direction.BACK);
        assertEquals(-1, character.getX());
        assertEquals(0, character.getY());
        System.out.println("✅ testMoveBack passou");
    }

    @Test
    public void testMoveUp() {
        Character character = new Character("Hero", 100, "hero.png", 0, 0);
        character.mover(Direction.UP);
        assertEquals(0, character.getX());
        assertEquals(1, character.getY());
        System.out.println("✅ testMoveUp passou");
    }

    @Test
    public void testMoveDown() {
        Character character = new Character("Hero", 100, "hero.png", 0, 0);
        character.mover(Direction.DOWN);
        assertEquals(0, character.getX());
        assertEquals(-1, character.getY());
        System.out.println("✅ testMoveDown passou");
    }
}
