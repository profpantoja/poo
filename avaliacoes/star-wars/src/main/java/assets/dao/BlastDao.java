package assets.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import assets.model.Blast;

public class BlastDao {
    private List<Blast> blasts;
    private Scanner scanner;
    private final String FILE_PATH = "java-exercicios\\avaliacoes\\star-wars\\src\\main\\java\\assets\\dao\\txts\\blasters.txt"; 
    public BlastDao() {
        this.blasts = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        carregarOArquivo();
    }

    public void carregarOArquivo() { 
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                Blast blast = Blast.fromString(linha);
                if (blast != null) {
                    blasts.add(blast);
                }
            }
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado. Será criado ao salvar.");
        }
    }

    public List<Blast> getAllBlasts() {
        blasts.clear();
        carregarOArquivo();
        return new ArrayList<>(blasts);
    }

    private void salvarNoArquivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Blast blast : blasts) {
                writer.write(blast.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar blasts: " + e.getMessage());
        }
    }

    public void addBlast(Blast blast) {
        blasts.add(blast);
        salvarNoArquivo();
    }

    public Blast getBlastByName(String name) {
       for (Blast blast : blasts) {
            if (blast.getDescricao().equalsIgnoreCase(name)) {
                return blast;
            }
        }
        return null;
    }

    public void removeBlast() {
        System.out.println("Deseja remover qual Blaster: ");
        String name = scanner.nextLine();
        blasts.removeIf(blast -> blast.getDescricao().equalsIgnoreCase(name));
        salvarNoArquivo();
    }

}
