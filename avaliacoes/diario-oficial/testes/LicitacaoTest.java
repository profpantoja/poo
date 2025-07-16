import org.junit.Test;
import static org.junit.Assert.*;

public class LicitacaoTest {

    @Test
    public void testImprimirPublicacaoNaoLancaExcecao() {
        Licitacao licitacao = new Licitacao("Objeto", "Modalidade", 10000.0);
        licitacao.imprimirPublicação(); 
    }
}
