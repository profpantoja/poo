package assets.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import assets.model.Jedi;

public class JediDao {
    private List<Jedi> jedis;
    private Scanner scanner;
    private final String FILE_PATH = "java-exercicios\\avaliacoes\\star-wars\\src\\main\\java\\assets\\dao\\txts\\jedis.txt"; 

    public JediDao() {
        this.jedis = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        carregarOArquivo();
    }
    public void carregarOArquivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                Jedi jedi = Jedi.fromString(linha);
                if (jedi != null) {
                    jedis.add(jedi);
                }
            }
        } catch (IOException e) {

        }
    }

public List<Jedi> getAllJedis() {
     jedis.clear();
     carregarOArquivo();
      return new ArrayList<>(jedis);
}

 
    private void salvarNoArquivo() {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
        for (Jedi jedi : jedis) {
            writer.write(jedi.toString());
            writer.newLine();
        }
    } catch (IOException e) {
        System.out.println("Erro ao salvar jedis: " + e.getMessage());
    }
    }

    public void addJedi(Jedi jedi) {
        jedis.add(jedi);
        salvarNoArquivo(); 
    }



    public Jedi getJediByName(String name) {
        for (Jedi jedi : jedis) {
            if (jedi.getNome().equalsIgnoreCase(name)) {
                return jedi;
            }
        }
        return null;
    }
    
    
    public void removeJedi() {
        System.out.print("Digite o nome do Jedi a ser removido: ");
        String name = scanner.nextLine();
        jedis.removeIf(jedi -> jedi.getNome().equalsIgnoreCase(name));
        salvarNoArquivo(); 
    }

    

}
