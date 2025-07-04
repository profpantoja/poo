package restaurante;

import java.util.List;

public class Pedido {
    
    private int numPedido;
    private float valorTotal;
    private float valorTotalSemIva;
    private List<Item> itens;
    private List<Cliente> clientes;
    private Mesa mesa;
    private NotaFiscal nota;
    private int iva;
    private Pagamento pgmt;

    public Pedido() {
    }

    public Pedido(int numPedido, Mesa mesa, List<Cliente> clientes){
        this.numPedido = numPedido;
        this.mesa = mesa;
        this.clientes = clientes;
        this.iva = 23;
    }

    public void encerrar(Pagamento pgmt, Restaurante restaurante){
        this.pgmt = pgmt;
        for(Item item : itens){
            valorTotalSemIva += item.getValorVenda();
            valorTotal += item.getValorVenda() + (item.getValorVenda()*iva/100);
        }
        pagar(restaurante);
    }

    public void pagar(Restaurante restaurante){
        if(pgmt.pagar()){
            System.out.println("Pedido finalizado");
            this.nota = new NotaFiscal(restaurante);
            this.nota.setItems(itens);
            nota.gerar();
            System.out.println("MESA: " + mesa.getNumero() + " - " + mesa.getLocal());
            nota.listarItens();
        }
        System.out.println("Total LÍQUIDO: " + String.format("%.2f", valorTotal));
        System.out.println("Tx: " + iva + "%" + " Base: " + valorTotalSemIva + " Valor: " + valorTotalSemIva * iva / 100 + " Total: " + String.format("%.2f", valorTotal));
        System.out.println("-----------------------------");
        System.out.println("Pagamento realizado com sucesso!");
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

    public Pagamento getPgmt() {
        return pgmt;
    }

    public void setPgmt(Pagamento pgmt) {
        this.pgmt = pgmt;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getValorTotalSemIva() {
        return valorTotalSemIva;
    }
    public void setValorTotalSemIva(float valorTotalSemIva) {
        this.valorTotalSemIva = valorTotalSemIva;
    }
    
    public Mesa getMesa() {
        return mesa;
    }
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public NotaFiscal getNota() {
        return nota;
    }

    public void setNota(NotaFiscal nota) {
        this.nota = nota;
    }
    
    
}
