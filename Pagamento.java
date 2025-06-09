public abstract class Pagamento {
    protected String forma;

    public Pagamento(String forma) {
        this.forma = forma;
    }

    public String getForma() {
        return forma;
    }

    public abstract void realizarPagamento(float valor);
}