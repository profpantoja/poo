import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class NotaFiscal implements INFCGenerator {

    private UUID id;
    private String cnpjEmitente;
    private List<Produto> produtos;
    private float total;

    public NotaFiscal() {
        this.produtos = new ArrayList<>();
    }

    @Override
    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public String getCnpjEmitente() {
        return cnpjEmitente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public float getTotal() {
        return total;
    }

    @Override
    public void setEmitente(String cnpj) {
        this.cnpjEmitente = cnpj;
    }

    @Override
    public void addProd(ArrayList<Produto> produtos) {
        this.produtos.addAll(produtos);
    }

    @Override
    public void setTotal(float total) {
        this.total = total;
    }

   
public void gerar() {
    System.out.println("\n=========== NOTA FISCAL ===========");
    System.out.println("ID: " + id);
    System.out.println("Emitente (CNPJ): " + cnpjEmitente);
    System.out.println("Produtos:");

    for (Produto p : produtos) {
        System.out.println("- " + p.getNome() + " - R$" + String.format("%.2f", p.getValProduto()) +
                           " (com IVA: R$" + String.format("%.2f", p.getPrecoComIva()) + ")");
    }

    System.out.println("-----------------------------------");
    System.out.printf("Total com IVA (23%%): R$%.2f\n", total);
    System.out.println("===================================\n");
}



    
}
