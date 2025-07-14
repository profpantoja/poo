package prova.pantoja.Models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Pedido {
    private int numPedido;
    private float valorTotal;
    private List<Item> itens;
    private Pagamento tipoPagamento;
    private NotaFiscal notaFiscal;
    private Cliente cliente;

    public Pedido(int numPedido, Cliente cliente) {
        this.numPedido = numPedido;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.valorTotal = 0.0f;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
        calcularValorTotal();
    }

    public Pagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(Pagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float calcularValorTotal() {
        float totalCalculado = 0.0f;
        for (Item item : itens) {
            totalCalculado += item.calcularTotal();
        }
        this.valorTotal = totalCalculado;
        return this.valorTotal;
    }

    public void pagar() {
        System.out.println("Processando pagamento para o Pedido #" + numPedido + "...");
        this.tipoPagamento.pagar();
        System.out.println("Total do pedido: " + this.valorTotal);
    }

    public void encerrar(String cnpjRestaurante) {
        System.out.println("\nEncerrando o Pedido...");

        NotaFiscal novaNotaFiscal = new NotaFiscal();
        novaNotaFiscal.setId(UUID.randomUUID());
        novaNotaFiscal.setEmitente(cnpjRestaurante);
        novaNotaFiscal.addProdutos(this.itens);
        novaNotaFiscal.setTotal(this.valorTotal);

        this.setNotaFiscal(novaNotaFiscal);
        System.out.println("Pedido " + numPedido + " encerrado.");
        System.out.println("Nota Fiscal salva.");
        novaNotaFiscal.gerarNota();
    }
}

