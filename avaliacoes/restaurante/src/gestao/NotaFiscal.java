package gestao;

import java.util.List;
import java.util.UUID;

public class NotaFiscal implements INFCGenerator{
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
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public UUID getId() {
        return id;
    }
    
    @Override
    public void setId(UUID id) {
        this.id = id;
    }
    
    public String getCnpj() {
        return cnpj;
    }
    
    @Override
    public void setEm(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public double getTotal() {
        return total;
    }

    @Override
    public void setTotal(double total) {
        this.total = total;
    }
    
    @Override
    public void addProd(List<Item> itens) {
        this.itens = itens;
    }
    
    public NotaFiscal() {
    }

    public String gerar(){
        String info = String.format("\nNota fiscal: \n");

        String nota = (restaurante.getNome() + "\n" +restaurante.getNomeFantasia()+ "\n" +restaurante.getCnpj()+ "\n"  + mesa.getLocal() + "\n" + mesa.getNumMesa() + "\n" + endereco.getCep() + "\n" + endereco.getTipo() + "\n" + endereco.getNumero());
        
        info += nota;
        info += String.format("\n   QTD | DESCRIÇÃO | IVA | PREÇO UNIT ");
        for(Item item : itens){
            info += "\n[-] " + item.getQtd() + " | " + item.getProduto().getNome() + " | " + item.getProduto().getIva() + " | " + item.getProduto().getValProd();
            valTotal += (item.getValVenda() * item.getQtd());
        }

        info += "\n\nTotal líquido: " + valTotal;
        
        return info;
    }
}
