import java.util.ArrayList;
import java.util.UUID;

public interface INFCGenerator {
    
    public void setId(UUID id);
    public void setEmitente(String cnpj);
    public void setTotal(float total);
    public void addProd(ArrayList<Produto> produtos);

}
