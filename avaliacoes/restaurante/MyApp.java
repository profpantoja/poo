import java.util.ArrayList;


public class MyApp {
    public static void main(String[] args) {
       
        Endereço enderecoRestaurante = new Endereço("Av. Central", "1000", "Centro", "Serra");
        Endereço enderecoCliente = new Endereço("Rua das Acácias", "45", "Jardim", "Serra");
        Endereço enderecoFuncionario = new Endereço("Rua das Palmeiras", "22", "Bela Vista", "Serra");

        
        Menu menuPrincipal = new Menu();
        Produto pizza = new Produto("Pizza Calabresa", 30.00f, 0.15f);
        Produto suco = new Produto("Suco Natural", 10.00f, 0.08f);
        Produto sobremesa = new Produto("Pudim", 12.00f, 0.10f);
        menuPrincipal.adicionarProduto(pizza);
        menuPrincipal.adicionarProduto(suco);
        menuPrincipal.adicionarProduto(sobremesa);

        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(menuPrincipal);

        Mesa mesa1 = new Mesa(1);
        ArrayList<Mesa> mesas = new ArrayList<>();
        mesas.add(mesa1);

        Restaurante restaurante = new Restaurante("Sabores da Serra", enderecoRestaurante, menus, mesas);

       
        Funcionario garcom = new Funcionario("João", "123.456.789-00", "Garçom", enderecoFuncionario, "CTP12345");
        mesa1.setGarcom(garcom);

        Cliente cliente = new Cliente("Maria", "987.654.321-00", enderecoCliente, 5);
        Pedido pedido = new Pedido(cliente);

        pedido.adicionarItem(new Item(pizza, 2, pizza.getPreco()));
        pedido.adicionarItem(new Item(suco, 1, suco.getPreco()));
        pedido.adicionarItem(new Item(sobremesa, 1, sobremesa.getPreco()));

        
        mesa1.adicionarPedido(pedido);

        
        Pagamento pagamento = new PagamentoPix(100.00f);
        pedido.pagar(pagamento);

        System.out.println("\n====== STATUS FINAL ======");
        System.out.println("Restaurante: " + restaurante.getNome());
        System.out.println("Endereço: " + restaurante.getEndereco());

        System.out.println("\n--- CARDÁPIO ---");
        for (Produto prod : menuPrincipal.getProdutos()) {
            System.out.printf("%s - R$ %.2f\n", prod.getNome(), prod.getPreco());
        }

        System.out.println("\n--- MESAS ---");
        for (Mesa mesa : restaurante.getMesas()) {
            System.out.println("Mesa " + mesa.getNumero());
            System.out.println("Garçom: " + mesa.getPedidos().get(0).getNotaFiscal() != null ? mesa1.getPedidos().get(0).getNotaFiscal().toString() : "Sem nota");
            for (Pedido p : mesa.getPedidos()) {
                System.out.println("Pedido do cliente: " + p.getNotaFiscal() != null ? cliente.getNome() : "Sem nome");
                System.out.println("Itens:");
                for (Item item : p.getNotaFiscal() != null ? p.getNotaFiscal().getItens() : new ArrayList<Item>()) {
                    System.out.println("- " + item.getProduto().getNome());
                }
            }
        }
    }
}