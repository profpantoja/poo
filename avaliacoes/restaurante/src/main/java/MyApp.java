import java.util.ArrayList;

public class MyApp {
    public static void main(String[] args) {

        // Produtos
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("coca-cola 600ml", 14.0f, 0.23f));
        produtos.add(new Produto("bacalhau", 200.5f, 0.23f));
        produtos.add(new Produto("carne seca", 140.0f, 0.23f));
     
        // Clientes e Pessoas
        Mesa mesa = new Mesa("1", "Salão");
        Cliente cliente = new Cliente("MARCAO", "88656181756", mesa);
        Funcionario funcionario = new Funcionario("moises", "00055566677");
        
        // Restaurante
        Endereco endereco = new Endereco("Estrada do portela", "10507020", "tijuca", "SC", 2);
        Restaurante restaurante = new Restaurante("TEMPERO DE MAE", "237123309", endereco, "tdm");
        Menu menu = new Menu(produtos, restaurante.getNome(), restaurante.getNomeFantasia(), restaurante.getCnpj(), restaurante.getEndereco());
        menu.exibirMenu();

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Mesa: " + mesa.getNum() + "-> " + mesa.getLocal());

        // Pedidos
        TipoPagamento tipoPagamento = TipoPagamento.PIX;
        ArrayList itens = new ArrayList<Item>();
        float valorTotal = 0;

        for(Produto produto : produtos){
            Item item = new Item(produto, 1, produto.getValProduto()); 
            itens.add(item);
            valorTotal += item.getTotal();
        }

        Pedido pedido = new Pedido(1, valorTotal, tipoPagamento);
        pedido.setItens(itens);
        pedido.pagar();

    }
}
