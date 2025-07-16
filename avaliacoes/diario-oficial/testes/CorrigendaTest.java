import org.junit.Test;
import static org.junit.Assert.*;

public class CorrigendaTest {

    @Test
    public void testImprimirPublicacaoNaoLancaExcecao() {
        Corrigenda corrigenda = new Corrigenda("Texto de exemplo");
        corrigenda.imprimirPublicação();
    }
}
