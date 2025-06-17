package restaurante;

import java.util.List;
import java.util.UUID;

public interface INFCGenerator {
    void setId(UUID id);
    void setEmitente(String cnpj);
    void addItem(List<Item> items);
    void setTotal(float total);  
}
