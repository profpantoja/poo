import java.util.ArrayList;

public class Mesa {
    private int numero;
    private Funcionario garcom;  
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    
    public Mesa(int numero) {
        this.numero = numero;
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void setGarcom(Funcionario garcom){
        this.garcom = garcom;   
    }

    public int getNumero() {
         return numero;
         }
    public ArrayList<Pedido> getPedidos() {
         return pedidos; 
        }
}