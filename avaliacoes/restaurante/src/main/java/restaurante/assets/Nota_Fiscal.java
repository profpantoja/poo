package restaurante.assets;

import java.util.List;
import java.util.UUID;

public class Nota_Fiscal implements INFCGenerator {
    private List<Item> itens;
    private Restaurante restaurante;
    private Mesa mesa;
    private Endereco endereco;
    private UUID id;
    private String cnpj;
    private double total;
    private double valTotal;


  public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public UUID getId() {
        return id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getTotal() {
        return total;
    }

    public double getValTotal() {
        return valTotal;
    }

    public void setValTotal(double valTotal) {
        this.valTotal = valTotal;
    }

    @Override
    public void setId(UUID id) {
        this.id=id;
    }

    @Override
    public void setEm(String cpnj) {
        this.cnpj=cnpj;
    }

    @Override
    public void addProd(List<Item> itens) {
        this.itens=itens;
    }
    @Override
    public void setTotal(double total) {
        this.total=total;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

  
    
    public String gerar(){
        String aux = String.format("\n NOTA FISCAL:");

        String aux2 =  (restaurante.getNome() + "\n" + restaurante.getNomeFantasia() + "\n" + restaurante.getCnpj() + endereco.getNumero() + "\n" + endereco.getCep() + "  -  " + endereco.getTipo() + "\n" + "N. Contrib. - " + getId() + "\n" + "MESA: " + mesa.getLocal() + " " + mesa.getNum());

        aux += aux2;
        aux += String.format("\n QTD --- Descricao ------------ P.Unit. --- Tx --- Valor");

        for(Item item : itens){
            aux += "\n" + item.getQtd() + " ---  " + item.getProduto().getNome() + " ------------  " + item.getProduto().getVal() + " ---  " + "23" + " ---  " + item.getProduto().getValProd();

             total += item.getQtd() * item.getProduto().getValProd();
        
        }
        setTotal(total);

        aux += "\n\n\n Total liq.   e " + getTotal(); 

        return aux;
        
    }

    
    
}