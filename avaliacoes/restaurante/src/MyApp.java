import gestao.*;
import java.util.ArrayList;
import java.util.UUID;

public class MyApp {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente("Luiz Antonio", "516255975", 13);
        Restaurante restaurante = new Restaurante("Anvileo Rooftop, Lda.", "59721245000150", "Casa Guedes 22");
        Mesa mesa = new Mesa("213", "Terrace");
        Endereco endereco = new Endereco("Praça dos Poveiros", "4000-393", 76);

        Produto p1 = new Produto("Batata Frita", 2.50, 23.0);
        Produto p2 = new Produto("Francesinha Gued", 12.90, 23.0);
        Produto p3 = new Produto("Somersby Pressao", 5.90, 23);
        Produto p4 = new Produto("Francesinha Trad", 12.90, 23);
        Produto p5 = new Produto("Rissol Pernil Ce", 2.50, 23);
        

        Item i1 = new Item(p1, 1);
        Item i2 = new Item(p2, 1);
        Item i3 = new Item(p3, 1);
        Item i4 = new Item(p4, 1);
        Item i5 = new Item(p5, 1);
        
        
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        produtos.add(p5);

        ArrayList<Item> itens = new ArrayList<>();
        itens.add(i1);
        itens.add(i2);
        itens.add(i3);
        itens.add(i4);
        itens.add(i5);

        Pedido pedido = new Pedido(24, itens, cliente, mesa);

        Menu menu = new Menu(produtos, restaurante);

        NotaFiscal nota = new NotaFiscal();
        nota.setEm(restaurante.getCnpj());
        nota.setId(UUID.randomUUID());
        nota.addProd(itens);
        nota.setTotal(pedido.getValTotal());
        nota.setRestaurante(restaurante);
        nota.setMesa(mesa);
        nota.setEndereco(endereco);
        
        menu.show();
        pedido.encerrar();
        pedido.pagar(1);
        System.out.println(nota.gerar());
    }
}