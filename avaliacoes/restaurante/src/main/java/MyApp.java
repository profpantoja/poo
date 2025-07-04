import restaurante.*;
import java.util.ArrayList;
import java.util.List;


public class MyApp {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Praca dos Poveiros", "4000-393", 76);
        Restaurante restaurante = new Restaurante(
            "Anvileo Rooftop, Lda.",
            "516255975",
            "Casa Guedes 2",
            endereco
        );
        List<Mesa> mesas = new ArrayList<>();
        Funcionario garcom = new Funcionario("João", "123456789", "123456", "Garçom");
        Mesa mesa1 = new Mesa("Terraço", 1);
        Mesa mesa2 = new Mesa("Jardim", 2);
        mesa1.setGarcom(garcom);
        mesa2.setGarcom(garcom);
        mesas.add(mesa1);
        mesas.add(mesa2);
        restaurante.setMesas(mesas);
        
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Rissol Parnil Ce", 2.90f, 2.90f));
        produtos.add(new Produto("Somersby Pressao", 5.90f, 5.90f));
        produtos.add(new Produto("Francesinha Trad", 12.90f, 12.90f));
        produtos.add(new Produto("Francesinha Gued", 12.90f, 12.90f));
        produtos.add(new Produto("1/2 Batata Frita", 2.50f, 2.50f));

        Menu menu = new Menu();
        menu.setProdutos(produtos);
        menu.show();

        List<Cliente> clientes = new ArrayList<>();
        Cliente cliente1 = new Cliente("Maria", "987654321",8);
        clientes.add(cliente1);
        Pedido pedido1 = new Pedido(1, mesa1, clientes);
        List<Item> itens = new ArrayList<>();
        itens.add(new Item(produtos.get(0), 1));
        itens.add(new Item(produtos.get(1), 1));
        itens.add(new Item(produtos.get(2), 1));
        itens.add(new Item(produtos.get(3), 1));
        itens.add(new Item(produtos.get(4), 1));
        pedido1.setItens(itens);
        pedido1.encerrar(new Pix(), restaurante);
    }
}