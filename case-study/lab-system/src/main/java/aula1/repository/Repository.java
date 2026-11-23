package aula1.repository;

import java.io.IOException;
import java.util.List;

public interface Repository<T> {

    void salvar(T objeto) throws IOException;

    void alterar(T objeto) throws IOException;

    void apagar(T objeto) throws IOException;

    List<T> buscar() throws IOException;
}
