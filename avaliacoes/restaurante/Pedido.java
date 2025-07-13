import java.util.ArrayList;
import java.util.UUID;

public class Pedido {
    private Cliente cliente;
    private ArrayList<Item> itens;
    private Pagamento pagamento;
    private NotaFiscal notaFiscal;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void pagar(Pagamento pagamento) {
        this.pagamento = pagamento;
        gerarNotaFiscal();
    }

    

    private void gerarNotaFiscal() {
        notaFiscal = new NotaFiscal();
        notaFiscal.setIdentificacao(UUID.randomUUID());
        notaFiscal.setEmitente("99.999.999/0001-00");
        notaFiscal.addItens(itens);
        float total = 0;
        for (Item item: itens) {
            total += item.getQuantidade() * item.getProduto().getPreco() * 1.23f;
        }

        notaFiscal.setTotal(total);
        notaFiscal.exibirNota();
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }
}
