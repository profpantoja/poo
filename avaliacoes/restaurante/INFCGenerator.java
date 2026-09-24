import java.util.ArrayList;
import java.util.UUID;

public interface INFCGenerator {
    void setIdentificacao(UUID id);
    void setEmitente(String cnpj);
    void addItens(ArrayList<Item> itens);
    void setTotal(float total);
}
