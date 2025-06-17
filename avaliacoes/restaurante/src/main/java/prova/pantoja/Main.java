package prova.pantoja;

import prova.pantoja.Models.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Endereco enderecoRest = new Endereco("Praca dos Poveiros", "4000-393", 76);
        Restaurante casaGuedes = new Restaurante("Anvileo Rooftop, Lda.", "516255975", "Casa Guedes 2", enderecoRest);

        Produto rissol = new Produto("Rissol Pernil Ce", 2.90f, 1.50f, 23);
        Produto somersby = new Produto("Somersby Pressão", 5.90f, 3.00f, 23);
        Produto francesinhaTrad = new Produto("Francesinha Trad", 12.90f, 8.00f, 23);
        Produto francesinhaGued = new Produto("Francesinha Gued", 12.90f, 8.00f, 23);
        Produto batataFrita = new Produto("1/2 Batata Frita", 2.50f, 1.00f, 23);

        casaGuedes.getMenu().addProduto(rissol);
        casaGuedes.getMenu().addProduto(somersby);
        casaGuedes.getMenu().addProduto(francesinhaTrad);
        casaGuedes.getMenu().addProduto(francesinhaGued);
        casaGuedes.getMenu().addProduto(batataFrita);

        casaGuedes.exibirMenu();
        Endereco enderecoCliente = new Endereco("Av.", "12345-678", 100);
        Cliente clienteTH = new Cliente("TH", "19418877713", enderecoCliente, 1);

        Endereco enderecoFunc = new Endereco("Rua", "98765-432", 50);
        Funcionario garcomPantoja = new Funcionario("Kadu Pantoja", "321312", enderecoFunc, "CTP001", "Garçom");

        Mesa mesaTerrace213 = new Mesa("Terrace 213", "Terraço", garcomPantoja);
        casaGuedes.adicionarMesa(mesaTerrace213);

        Item item1 = new Item(rissol, 1, 2.90f);
        Item item2 = new Item(somersby, 1, 5.90f);
        Item item3 = new Item(francesinhaTrad, 1, 12.90f);
        Item item4 = new Item(francesinhaGued, 1, 12.90f);
        Item item5 = new Item(batataFrita, 1, 2.50f);

        Pedido pedidoMesa213 = new Pedido(265569, clienteTH);
        pedidoMesa213.adicionarItem(item1);
        pedidoMesa213.adicionarItem(item2);
        pedidoMesa213.adicionarItem(item3);
        pedidoMesa213.adicionarItem(item4);
        pedidoMesa213.adicionarItem(item5);

        mesaTerrace213.adicionarPedido(pedidoMesa213);

        Pagamento pagamentoPix = new Pix();
        pedidoMesa213.setTipoPagamento(pagamentoPix);

        NotaFiscal notaFiscalPDF = new NotaFiscal();
        notaFiscalPDF.setNomeRestaurante("Casa Guedes 2");
        notaFiscalPDF.setEnderecoRestaurante("Anvileo Rooftop, Lda.\nPraca dos Poveiros, 76\n4000-393 - Porto");
        notaFiscalPDF.setEmitente("516255975");
        notaFiscalPDF.setDataHoraEmissao("2025-02-19 17:49");
        notaFiscalPDF.setNomeMesa("Terrace 213");

        List<Item> itensNotaFiscal = new ArrayList<>();
        itensNotaFiscal.add(new Item(rissol, 1, 2.90f));
        itensNotaFiscal.add(new Item(somersby, 1, 5.90f));
        itensNotaFiscal.add(new Item(francesinhaTrad, 1, 12.90f));
        itensNotaFiscal.add(new Item(francesinhaGued, 1, 12.90f));
        itensNotaFiscal.add(new Item(batataFrita, 1, 2.50f));
        notaFiscalPDF.addProdutos(itensNotaFiscal);

        notaFiscalPDF.setTotal(37.10f);

        notaFiscalPDF.gerarNota();
    }
}