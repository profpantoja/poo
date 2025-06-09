public class PagamentoPIX extends Pagamento {
    public PagamentoPIX() {
        super("PIX");
    }

    public void realizarPagamento(float valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via PIX.");
    }
}