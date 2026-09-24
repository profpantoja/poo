package gestao;

import java.util.ArrayList;

public class Pedido{
    private int numPedido;
    private double valTotal;
    private ArrayList<Item> itens;
    private Cliente cliente;
    private Mesa mesa;

    public Pedido(int numPedido, ArrayList<Item> itens, Cliente cliente, Mesa mesa) {
        this.numPedido = numPedido;
        this.itens = new ArrayList<>();
        this.cliente = cliente;
        this.mesa = mesa;
    }    

    public void encerrar(){
        System.out.println("\nNota fiscal salva. Encerrando sua conta...\n");
    }

    public void pagar(int tipoPagamento){
        System.out.println("Como deseja pagar:\n[1]Pix\n[2]Espécie\n[3]Cartão\n");
        switch (tipoPagamento) {
            case 1 -> System.out.println("Pagamento por PIX selecionado.");
            case 2 -> System.out.println("Pagamento por Espécie selecionado.");
            case 3 -> System.out.println("Pagamento por Cartão selecionado.");
            default -> System.out.println("Opção inválida");
        }
        
    }

    public double valTotal() {
        for(Item item : itens){
            valTotal += (item.getValVenda() * item.getQtd()) * 1.23;
        }
        return valTotal;
    }
    
    
    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public double getValTotal() {
        return valTotal;
    }

    public void setValTotal(float valTotal) {
        this.valTotal = valTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    };
}