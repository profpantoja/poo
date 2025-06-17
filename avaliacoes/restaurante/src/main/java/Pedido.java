import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Pedido{
    private int numPedido;
    private float valorTotal;
    private List<Item> itens;
    private NotaFiscal notaFiscal;
    private TipoPagamento tipoPagamento;

    public Pedido(int numPedido, float valorTotal, TipoPagamento tipo){
        setNumPedido(numPedido);
        setValorTotal(valorTotal);
        setTipoPagamento(tipo);
        this.itens = new ArrayList<Item>();
    }
    
    public TipoPagamento getTipoPagamento() {
        return this.tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    
    public List<Item> getItens() {
        return this.itens;
    }
    
    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public void addItem(Item item){
        this.itens.add(item);
    }
    public NotaFiscal getNotaFiscal() {
        return this.notaFiscal;
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
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

   public void pagar() {
      
        if (tipoPagamento == TipoPagamento.PIX) {
            new Pix().pagar();
        } else if (tipoPagamento == TipoPagamento.CARTAO) {
            new Cartao().pagar();
        } else if (tipoPagamento == TipoPagamento.ESPECIE) {
            new Especie().pagar();
        }
        NotaFiscal nota = new NotaFiscal();
        nota.setId(UUID.randomUUID());
        nota.setEmitente("237123309"); 

        ArrayList<Produto> produtos = new ArrayList<Produto>();
        float total = 0;
        float iva = 0;

        for (Item item : getItens()) {
            produtos.add(item.getProduto());
            iva = item.getProduto().getIva();
            total += item.getTotal() * (1 + iva); 
        }
        
        nota.setTotal(total);
        nota.addProd(produtos);
        setValorTotal(total);

        setNotaFiscal(nota);
        nota.gerar();
   }
}
