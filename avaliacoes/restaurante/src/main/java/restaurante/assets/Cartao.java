package restaurante.assets;

public class Cartao extends Pagamento {

    @Override
    public void pagar() {

        System.out.println("[Cartão] Pagando...");

    }

}