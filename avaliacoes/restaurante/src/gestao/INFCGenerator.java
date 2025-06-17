package gestao;

import java.util.List;
import java.util.UUID;

public interface INFCGenerator {
    public abstract void setId(UUID id);
    public abstract void setEm(String cnpj);
    public abstract void addProd(List<Item> itens);
    public abstract void setTotal(double total);
} 