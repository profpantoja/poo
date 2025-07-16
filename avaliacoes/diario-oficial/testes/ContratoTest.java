import org.junit.Test;
import static org.junit.Assert.*;

import java.time.LocalDate;

public class ContratoTest {

    @Test
    public void testConstrutorEDadosBasicos() {
        LocalDate dataAssinatura = LocalDate.of(2023, 1, 1);
        LocalDate dataPublicacao = LocalDate.of(2023, 1, 5);
        double valor = 50000.00;
        String objeto = "Serviços de limpeza";

        Contrato contrato = new Contrato(dataAssinatura, dataPublicacao, valor, objeto);

        assertEquals(dataAssinatura, contrato.getDataAssinatura());
        assertEquals(dataPublicacao, contrato.getDataPublicacao());
        assertEquals(valor, contrato.getValor(), 0.01);
        assertEquals(objeto, contrato.getObjeto());
    }

    @Test
    public void testImprimirPublicacaoNaoLancaExcecao() {
        Contrato contrato = new Contrato(LocalDate.now(), LocalDate.now(), 2000, "Teste");
        contrato.imprimirPublicação(); 
    }
}
