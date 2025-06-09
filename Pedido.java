import java.util.*;

public class Pedido {
    private Cliente cliente;
    private Mesa mesa;
    private List<Produto> produtos = new ArrayList<>();
    private NotaFiscal notaFiscal;

    public Pedido(Cliente cliente, Mesa mesa) {
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public void fecharConta(Pagamento pagamento, String cnpjEmitente) {
        float subtotal = 0;
        for (Produto p : produtos) {
            subtotal += p.getPreco();
        }

        float totalComIVA = subtotal * 1.23f;
        pagamento.realizarPagamento(totalComIVA);

        notaFiscal = new NotaFiscal();
        notaFiscal.setIdentificacao(UUID.randomUUID());
        notaFiscal.setEmitente(cnpjEmitente);
        notaFiscal.addProduto(produtos);
        notaFiscal.setTotal(totalComIVA);

        notaFiscal.exibirNota();
        mesa.desocupar();
    }
}