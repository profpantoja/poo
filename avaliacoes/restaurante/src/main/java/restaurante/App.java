package restaurante;

import restaurante.assets.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class App {
    public static void main(String[] args) throws Exception {

        Restaurante restaurante = new Restaurante("Anvileo Rooftop, Lda.", "516255975", "Casa Guedes 2");

        Endereco endereco = new Endereco("Praça dos Poveiros", "4000-393", 76);

        Mesa mesa = new Mesa("213", "Terrace");

        Produto p1 = new Produto("Rissol Pernil Ce", 1.00f, 2.90f);
        Produto p2 = new Produto("Somersby Pressao", 2.50f, 5.90f);
        Produto p3 = new Produto("Francesinha Trad", 7.60f, 12.90f);
        Produto p4 = new Produto("Francesinha Gued", 8.90f, 12.90f);
        Produto p5 = new Produto("1/2 Batata Frita", 1.25f, 2.50f);

        System.out.println("\n### Exibindo o Menu Online ###");

        Menu menu = new Menu(restaurante);

        menu.adicionarProduto(p1);
        menu.adicionarProduto(p2);
        menu.adicionarProduto(p3);
        menu.adicionarProduto(p4);
        menu.adicionarProduto(p5);

        menu.show();

        System.out.println("\n### Simulando um Pedido ###");

        Item item1 = new Item(p1, 1, p1.getVal());
        Item item2 = new Item(p2, 1, p2.getVal());
        Item item3 = new Item(p3, 1, p3.getVal());
        Item item4 = new Item(p4, 1, p4.getVal());
        Item item5 = new Item(p5, 1, p5.getVal());

        List<Item> itensDoPedido = new ArrayList<>();

        itensDoPedido.add(item1);
        itensDoPedido.add(item2);
        itensDoPedido.add(item3);
        itensDoPedido.add(item4);
        itensDoPedido.add(item5);

        Pedido pedido = new Pedido(265569, 0f);
        System.out.println("Pedido N. " + pedido.getnumPedido() + " criado com " + itensDoPedido.size() + " itens.");

        System.out.println("\n### Realizando o Pagamento ###");

        Cartao formaDePagamento = new Cartao();
        pedido.pagar(formaDePagamento);
        formaDePagamento.pagar();
        pedido.encerrar();

        // GERANDO A NOTA FISCAL
        System.out.println("\n### Gerando a Nota Fiscal ###");

        Nota_Fiscal notaFiscal = new Nota_Fiscal();

        notaFiscal.setId(UUID.randomUUID());
        notaFiscal.setEm(restaurante.getCnpj());
        notaFiscal.addProd(itensDoPedido);
        notaFiscal.setRestaurante(restaurante);
        notaFiscal.setEndereco(endereco);
        notaFiscal.setMesa(mesa);

        String notaGerada = notaFiscal.gerar();
        System.out.println("--------------------------------------------------");
        System.out.println(notaGerada);
        System.out.println("--------------------------------------------------");

        pedido.SalvarNotaFiscal(notaFiscal);
        System.out.println("\nNota fiscal gerada e salva no pedido.");

        
    }
}