public class PagamentoEspecie extends Pagamento {
    public PagamentoEspecie() {
        super("Espécie");
    }

    public void realizarPagamento(float valor) {
        System.out.println("Pagamento de R$" + valor + " realizado em espécie.");
    }
}