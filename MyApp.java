public class MyApp {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante("Delícias da Vila", "12.345.678/0001-90");

        restaurante.getMenu().adicionarProduto(new Produto("Pizza Margherita", 30.0f));
        restaurante.getMenu().adicionarProduto(new Produto("Lasanha", 25.0f));
        restaurante.getMenu().adicionarProduto(new Produto("Suco Natural", 8.0f));

        restaurante.getMenu().exibirMenu();

        Mesa mesa = new Mesa(1);
        mesa.ocupar();

        Cliente cliente = new Cliente("João da Silva");

        Pedido pedido = new Pedido(cliente, mesa);
        pedido.adicionarProduto(new Produto("Pizza Margherita", 30.0f));
        pedido.adicionarProduto(new Produto("Suco Natural", 8.0f));

        Pagamento pagamento = new PagamentoCartao();
        pedido.fecharConta(pagamento, restaurante.getCnpj());
    }
}