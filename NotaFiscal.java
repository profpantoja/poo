import java.util.*;

public class NotaFiscal implements INFCGenerator {
    private UUID identificacao;
    private String cnpjEmitente;
    private List<Produto> produtos = new ArrayList<>();
    private float total;

    public void setIdentificacao(UUID id) {
        this.identificacao = id;
    }

    public void setEmitente(String cnpj) {
        this.cnpjEmitente = cnpj;
    }

    public void addProduto(List<Produto> produtos) {
        this.produtos.addAll(produtos);
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void exibirNota() {
        System.out.println("=== NOTA FISCAL ===");
        System.out.println("ID: " + identificacao);
        System.out.println("Emitente (CNPJ): " + cnpjEmitente);
        for (Produto p : produtos) {
            System.out.println(p);
        }
        System.out.println("TOTAL (com IVA 23%): R$" + total);
    }
}