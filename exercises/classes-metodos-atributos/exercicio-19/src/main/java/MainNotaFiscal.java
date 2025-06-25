import java.time.LocalDate;

public class MainNotaFiscal {

    public static void main(String[] args) {

    NotaFiscal nf = new NotaFiscal("293837728",LocalDate.of(2024,03,10), 150f, "José amaral dos santos", "(21) 97045-2345", "184.876.234-12");

    nf.setPagamento_realizado(false);
    nf.setEndereco_comprador("Rua juscelino Kubichek n° 27");

    float juros = nf.juros(nf.getValor(), nf.getData_compra());

    nf.visualizar_nota(nf, juros);

    }

}