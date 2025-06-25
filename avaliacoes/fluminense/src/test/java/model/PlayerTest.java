package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PlayerTest {

    private Player player;

    @BeforeEach
    void setUp() {
        player = new Player();
    }

    @Test
    @DisplayName("Deve definir e obter o nome do jogador")
    void testSetAndGetName() {
        player.setName("German");
        assertEquals("German", player.getName());
    }

    @Test
    @DisplayName("Deve definir e obter o sobrenome do jogador")
    void testSetAndGetSurname() {
        player.setSurname("Cano");
        assertEquals("Cano", player.getSurname());
    }

    @Test
    @DisplayName("Deve definir e obter o número do jogador")
    void testSetAndGetNumber() {
        player.setNumber(14);
        assertEquals(14, player.getNumber());
    }

    @Test
    @DisplayName("Deve definir e obter a posição do jogador")
    void testSetAndGetPosition() {
        player.setPosition("Atacante");
        assertEquals("Atacante", player.getPosition());
    }
}
