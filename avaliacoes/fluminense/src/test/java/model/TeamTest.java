package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TeamTest {

    private Team team;

    @BeforeEach
    void setUp() {
        team = new Team();
    }

    @Test
    @DisplayName("Deve definir e obter o nome do time")
    void testSetAndGetName() {
        team.setName("Fluminense");
        assertEquals("Fluminense", team.getName());
    }

    @Test
    @DisplayName("Deve definir e obter as cores do time")
    void testSetAndGetColors() {
        team.setColors("Verde, Grená e Branco");
        assertEquals("Verde, Grená e Branco", team.getColors());
    }

    @Test
    @DisplayName("Deve inicializar com uma lista de jogadores vazia")
    void testInitialPlayersList() {
        assertNotNull(team.getPlayers());
        assertTrue(team.getPlayers().isEmpty());
    }

    @Test
    @DisplayName("Deve definir e obter a lista de jogadores")
    void testSetAndGetPlayers() {
        Player player1 = new Player();
        player1.setName("German Cano");

        Player player2 = new Player();
        player2.setName("John Kennedy");

        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        team.setPlayers(players);

        assertNotNull(team.getPlayers());
        assertEquals(2, team.getPlayers().size());
        assertEquals("German Cano", team.getPlayers().get(0).getName());
    }
}
