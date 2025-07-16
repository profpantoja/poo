import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class DiarioOficialTest {

    @Test
    public void testAddPublicacao() {
        DiarioOficial diario = new DiarioOficial();
        Publicacao p = new Corrigenda("Texto de exemplo");
        diario.addPublicação(p);
        assertEquals(1, diario.getPublicacoes().size());
        assertEquals(p, diario.getPublicacoes().get(0));
    }

    @Test
    public void testDeletePublicacao() {
        DiarioOficial diario = new DiarioOficial();
        Publicacao p1 = new Corrigenda("Um");
        Publicacao p2 = new Corrigenda("Dois");
        diario.addPublicação(p1);
        diario.addPublicação(p2);
        diario.deletePublicação(p1);
        assertEquals(1, diario.getPublicacoes().size());
        assertEquals(p2, diario.getPublicacoes().get(0));
    }

    @Test
    public void testImprimirDiarioNaoLancaExcecao() {
        DiarioOficial diario = new DiarioOficial();
        diario.addPublicação(new Corrigenda("Exemplo"));
        diario.imprimirDiario(); 
    }
}
