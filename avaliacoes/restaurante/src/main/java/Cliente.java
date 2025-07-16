public class Cliente extends Pessoa {
    
    private int numFid;
    private Mesa mesa;
    private Pedido pedido;

    
    public Cliente (String nome, String cpf, Mesa mesa){
        super(nome,cpf);
        setNumFid(numFid);
        setMesa(mesa);
        
    }
    
    public Pedido getPedido() {
        return this.pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    public int getNumFid() {
        return numFid;
    }
    
    public void setNumFid(int numFid) {
        this.numFid = numFid;
    }
    
    public Mesa getMesa() {
        return this.mesa;
    }
    
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    
}