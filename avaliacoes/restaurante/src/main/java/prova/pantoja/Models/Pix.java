package prova.pantoja.Models;

public class Pix extends Pagamento {

    @Override
    public void pagar() {
        System.out.println("Pagamento realizado com PIX.");
    }
}
