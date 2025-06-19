package restaurante.assets;

import java.util.List;
import java.util.UUID;

public interface INFCGenerator {
    
    public abstract void setId(UUID id);

    public abstract void setEm(String cpnj);

    public abstract void addProd(List<Item> Itens);

    public abstract void setTotal(double total);


}