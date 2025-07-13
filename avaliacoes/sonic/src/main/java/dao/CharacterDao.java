package dao;

import model.Character;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CharacterDao {
    private static final String FILE = "avaliacoes/sonic/src/main/java/db/characters.txt";

    public void create(Character personagem) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(FILE,true));
        bw.write(personagem.getName() + "," + personagem.getLife() + "," + personagem.getImage() + "," + personagem.getX() + "," + personagem.getY());
        bw.newLine();
        bw.close();
    } 
    
    public List<Character> read() throws NumberFormatException, IOException {
        List<Character> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(FILE));
        String linha;
        while ((linha = br.readLine()) != null) {
            String[] p = linha.split(",");
            if (p.length == 5) {
                Character personagem = new Character(p[0], Integer.parseInt(p[1]), p[2], Integer.parseInt(p[3]), Integer.parseInt(p[4]));
                list.add(personagem);
            }
        }
        br.close();
        return list;
    }

    public void DeleteByName(String nome) throws NumberFormatException, IOException {
        List<Character> personagens = read();
        for (int i = 0; i < personagens.size(); i++) {
            Character c = personagens.get(i);
            if (c.getName().equals(nome)) {
                personagens.remove(i);
                break; 
            }
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(FILE));
            for (Character personagem : personagens) {
                bw.write(personagem.getName() + "," + personagem.getLife() + "," + personagem.getImage() + "," + personagem.getX() + "," + personagem.getY());
                bw.newLine();
            }
        bw.close();
    }
}
