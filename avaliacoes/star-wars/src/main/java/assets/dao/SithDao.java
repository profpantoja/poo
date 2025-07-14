package assets.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import assets.model.Sith;

public class SithDao {
    private List<Sith> siths;
    private Scanner scanner;
    private final String FILE_PATH = "java-exercicios\\avaliacoes\\star-wars\\src\\main\\java\\assets\\dao\\txts\\siths.txt"; 

    public SithDao() {
        this.siths = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        carregarOArquivo();
    }
    public void carregarOArquivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                Sith sith = Sith.fromString(linha);
                if (sith != null) {
                    siths.add(sith);
                }
            }
        } catch (IOException e) {

        }
    }

public List<Sith> getAllSiths() {
     siths.clear();
     carregarOArquivo();
      return new ArrayList<>(siths);
}

 
    private void salvarNoArquivo() {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
        for (Sith sith : siths) {
            writer.write(sith.toString());
            writer.newLine();
        }
    } catch (IOException e) {
        System.out.println("Erro ao salvar siths: " + e.getMessage());
    }
    }

    public void addSith(Sith sith) {
        siths.add(sith);
        salvarNoArquivo(); 
    }



    public Sith getSithByName(String name) {
        for (Sith sith : siths) {
            if (sith.getNome().equalsIgnoreCase(name)) {
                return sith;
            }
        }
        return null;
    }
    
    
    public void removeSith() {
        System.out.print("Digite o nome do Sith a ser removido: ");
        String name = scanner.nextLine();
        siths.removeIf(sith -> sith.getNome().equalsIgnoreCase(name));
        salvarNoArquivo(); 
    }

    

}
