package aula1.controle;

import java.util.List;

public interface Repository<Type> {
    void salvar(Type obj);
    void alterar(Type obj);
    void apagar(Type obj);
    List<Type> buscar();
}