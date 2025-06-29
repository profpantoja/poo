package controller;

import dao.CharacterDao;
import model.Character;

import java.io.IOException;
import java.util.List;

public class CharacterController {
    private final CharacterDao dao = new CharacterDao();

    public void create(Character personagem) throws IOException {
        dao.create(personagem);
    }

    public List<Character> listar() throws IOException {
        return dao.read();
    }

    public void deletar(String nome) throws IOException {
        dao.DeleteByName(nome);
    }
}
