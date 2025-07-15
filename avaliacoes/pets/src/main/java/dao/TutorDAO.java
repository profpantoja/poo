package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import model.Tutor;

public class TutorDAO {

    private final String FILE_PATH = "db/tutores.txt";

    // --- CREATE ---
    public void create(Tutor tutor){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            String linha = tutor.getNome() + ";" + tutor.getApelido();
            writer.write(linha);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Erro ao criar tutor: " + e.getMessage());
        }
    }

    // --- READ ---
    public ArrayList<Tutor> read(){
        ArrayList<Tutor> lista = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] campos = linha.split(";");
                if (campos.length >= 2) {
                    Tutor tutor = new Tutor(campos[0], campos[1]);
                    lista.add(tutor);
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler tutores: " + e.getMessage());
        }
        return lista;
    }

    // --- DELETE ---
    public void delete(String nomeTutor){
        ArrayList<Tutor> lista = read();
        lista.removeIf(tutor -> tutor.getNome().equals(nomeTutor));

        // Reescreve o arquivo com a lista atualizada 
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, false))){
            for (Tutor tutor : lista) {
                String linha = tutor.getNome() + ";" + tutor.getApelido();
                writer.write(linha);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao deletar tutor: " + e.getMessage());
        }
    }
}