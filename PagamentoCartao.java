public class PagamentoCartao extends Pagamento {
    public PagamentoCartao() {
        super("Cartão");
    }

    public void realizarPagamento(float valor) {
        System.out.println("Pagamento de R$" + valor + " realizado no cartão.");
    }
}