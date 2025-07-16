package models;

public class Item {
    
    private int id;

    
    private Produto produto;
    private int quantidade;
    private double valVenda;
    private double total;
    
    public Item( 
        Produto produto, 
        int quantidade, 
        double val,
        double total
        ) {
            setId(id);
            setProduto(produto);
            setQuantidade(quantidade);
            setValVenda(val);
            setTotal(total);
        }
        
        public int getId() {
            return this.id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
        public Produto getProduto() {
            return this.produto;
        }
        
        public void setProduto(Produto produto) {
            this.produto = produto;
        }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValVenda() {
        return this.valVenda;
    }

    public void setValVenda(double valVenda) {
        this.valVenda = valVenda;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total){
        this.total = total;
    }

    @Override
    public String toString() {
        return "Item [id=" + id + ", produto=" + produto + ", quantidade=" + quantidade + ", valVenda=" + valVenda + ", total=" + total + "]";
    }

}