import org.junit.Test;
import static org.junit.Assert.*;

public class LegislacaoTest {

    @Test
    public void testImprimirPublicacaoNaoLancaExcecao() {
        Legislacao legislacao = new Legislacao("LEI Nº 123", "Texto completo");
        legislacao.imprimirPublicação(); 
    }
}
