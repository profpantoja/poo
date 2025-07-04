package restaurante;

import java.util.List;
import java.util.UUID;

public class NotaFiscal implements INFCGenerator {
    private UUID id;
    private String cnpj;
    private List<Item> items;
    private float total;
    private Restaurante restaurante;
    
    public NotaFiscal() {
        this.id = UUID.randomUUID();
    }
    public NotaFiscal(Restaurante restaurante) {
        this.restaurante = restaurante;
        this.cnpj = restaurante.getCnpj();
        this.id = UUID.randomUUID();
    }

    @Override
    public void setId(UUID id){
        this.id = id;
    }

    @Override
    public void setEmitente(String cnpj){
        this.cnpj = cnpj;
    }

    @Override
    public void addItem(List<Item> items){
        this.items = items;
        for (Item item : items) {
            this.total += item.getValorVenda();
        }
    }

    @Override
    public void setTotal(float total){
        this.total = total;
    }

    public void gerar(){
        System.out.println("------------NOTA FISCAL-----------------");
        System.out.println(restaurante.getNome() + "\n"
                            +  restaurante.getNomeFantasia()+ "\n"
                            +  restaurante.getEndereco().getTipo() + " " 
                            +  restaurante.getEndereco().getCep() +restaurante.getEndereco().getNumero()
                            + "\nN. Contrib " + cnpj + "\n"
                            );
        
    }
    public void listarItens() {
        System.out.println("----------PRODUTOS-------------------");
        System.out.println("QT" + " - "+ " Descrição" + "   -   " + "Valor");
        for (Item item : items) {
            System.out.println(item.getQntd() + "  " +item.getProduto().getNome() + " - " + item.getValorVenda());
        }
        System.out.println("-----------------------------");

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
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }
    public float getTotal() {
        return total;
    }
}
