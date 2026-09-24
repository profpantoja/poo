package test;

import org.junit.Test;
import vought.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TeamTest {

    @Test
    public void testDefaultConstructor() {
        Team team = new Team();
        assertNotNull(team.getHeroes());
        assertEquals(0, team.getHeroes().size());
    }

    @Test
    public void testConstructorWithHeroesList() {
        List<Hero> heroList = new ArrayList<>();
        heroList.add(new Hero("Maeve", 80, 60, 70));
        Team team = new Team(heroList);
        assertEquals(1, team.getHeroes().size());
        assertEquals("Maeve", team.getHeroes().get(0).getNickname());
    }

    @Test
    public void testSetHeroes() {
        List<Hero> heroList = new ArrayList<>();
        heroList.add(new Hero("A-Train", 70, 50, 90));
        Team team = new Team();
        team.setHeroes(heroList);
        assertEquals(1, team.getHeroes().size());
        assertEquals("A-Train", team.getHeroes().get(0).getNickname());
    }
}
