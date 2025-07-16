import java.util.ArrayList;
import java.util.UUID;

public class NotaFiscal implements INFCGenerator {
    private UUID id;
    private String cnpj;
    private ArrayList<Item> itens;
    private float total;

    public NotaFiscal() {
        itens = new ArrayList<>();
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setIdentificacao(UUID id) {
        this.id = id;
    }

    public void setEmitente(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void exibirNota() {
        System.out.println("--- NOTA FISCAL ---");
        System.out.println("ID: " + id);
        System.out.println("Emitente: " + cnpj);
        for (Item p : itens) {
            System.out.println(p.getProduto().getNome() + " - R$ " + p.getProduto().getPreco());
        }
        System.out.printf("Total (c/ IVA): R$ %.2f\n", total);
    }

    @Override
    public void addItens(ArrayList<Item> itens) {
        this.itens.addAll(itens);
    }
}
