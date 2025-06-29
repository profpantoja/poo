package controller;

import dao.ObjectDao;
import model.Object;

import java.io.IOException;
import java.util.List;

public class ObjectController {
    private final ObjectDao dao = new ObjectDao();

    public void create(Object objeto) throws IOException {
        dao.create(objeto);
    }

    public List<Object> listar() throws IOException {
        return dao.read();
    }

     public void deletar(String nome) throws IOException {
        dao.DeleteByName(nome);
    }
}
