package restaurante.assets;

import java.util.List;
import java.util.ArrayList;

public class Pedido{
    private int numPedido;
    private float valorTotal;
    private List<Item> itens = new ArrayList<>();
    private Nota_Fiscal nota;

    public Pedido(int numPedido, float valorTotal){
        this.numPedido=numPedido;
        this.valorTotal=valorTotal;
    }
    public void setnumPedido(int numPedido){
        this.numPedido=numPedido;
        }
    public int getnumPedido(){
        return numPedido;
    }
    public void setvalorTotal(float valorTotal){
        this.valorTotal=valorTotal;
    }
    public double getvalorTotal(){
        return valorTotal;
    }
    
    public void encerrar(){
        System.out.println("Pedido encerrado! ");
    }
    public void pagar(Pagamento pagamento){
        System.out.println("Pagamento realizado");


    }

    public void SalvarNotaFiscal(Nota_Fiscal nota){
        this.nota = nota;
    }

}