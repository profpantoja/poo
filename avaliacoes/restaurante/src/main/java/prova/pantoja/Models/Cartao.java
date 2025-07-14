package prova.pantoja.Models;

public class Cartao extends Pagamento {

    @Override
    public void pagar() {
        System.out.println("Pagamento realizado com Cartão.");
    }
}