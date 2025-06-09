import java.util.List;
import java.util.UUID;

public interface INFCGenerator {
    void setIdentificacao(UUID id);
    void setEmitente(String cnpj);
    void addProduto(List<Produto> produtos);
    void setTotal(float total);
}