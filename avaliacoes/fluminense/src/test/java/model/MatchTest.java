package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatchTest {

    private Match match;
    private Team homeTeam;
    private Team visitorTeam;

    @BeforeEach
    void setUp() {
        homeTeam = new Team();
        homeTeam.setName("Fluminense");
        visitorTeam = new Team();
        visitorTeam.setName("Boca Juniors");
        match = new Match();
        match.setHome(homeTeam);
        match.setVisitor(visitorTeam);
    }


    @Test
    @DisplayName("Deve retornar o time da casa como vencedor")
    void testGetResult_WhenHomeTeamWins() {
        match.setHomeScore(2);
        match.setVisitorScore(1);
        Team winner = match.getResult();
        assertNotNull(winner, "O vencedor não deveria ser nulo.");
        assertEquals(homeTeam, winner, "O time da casa deveria ser o vencedor.");
    }

    @Test
    @DisplayName("Deve retornar o time visitante como vencedor")
    void testGetResult_WhenVisitorTeamWins() {
        match.setHomeScore(1);
        match.setVisitorScore(2);
        Team winner = match.getResult();
        assertNotNull(winner, "O vencedor não deveria ser nulo.");
        assertEquals(visitorTeam, winner, "O time visitante deveria ser o vencedor.");
    }

    @Test
    @DisplayName("Deve retornar nulo em caso de empate")
    void testGetResult_WhenIsADraw() {
        match.setHomeScore(1);
        match.setVisitorScore(1);
        Team winner = match.getResult();
        assertNull(winner, "O resultado deveria ser nulo em caso de empate.");
    }

    @Test
    @DisplayName("Deve retornar 3 pontos para o time vencedor")
    void testGetResultWithTeam_WhenTeamWins() {
        match.setHomeScore(2);
        match.setVisitorScore(1);

        assertEquals(3, match.getResult(homeTeam), "O time da casa vencedor deveria ter 3 pontos.");
    }

    @Test
    @DisplayName("Deve retornar 0 pontos para o time perdedor")
    void testGetResultWithTeam_WhenTeamLoses() {
        match.setHomeScore(2);
        match.setVisitorScore(1);
        assertEquals(0, match.getResult(visitorTeam), "O time visitante perdedor deveria ter 0 pontos.");
    }

    @Test
    @DisplayName("Deve retornar 1 ponto para ambos os times em caso de empate")
    void testGetResultWithTeam_WhenIsADraw() {
        match.setHomeScore(1);
        match.setVisitorScore(1);
        assertEquals(1, match.getResult(homeTeam), "O time da casa deveria ter 1 ponto em caso de empate.");
        assertEquals(1, match.getResult(visitorTeam), "O time visitante deveria ter 1 ponto em caso de empate.");
    }
}
