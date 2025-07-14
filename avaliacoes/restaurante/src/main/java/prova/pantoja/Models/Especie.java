package prova.pantoja.Models;

public class Especie extends Pagamento {

    @Override
    public void pagar() {
        System.out.println("Pagamento realizado em Espécie.");
    }
}