package prova.pantoja.Interfaces;

import prova.pantoja.Models.Item;

import java.util.List;
import java.util.UUID;

public interface INFCGenerator {
    public void setId(UUID id);
    public void setEmitente(String cnpj);
    public void addProdutos(List<Item> items);
    public void setTotal(float total);
}