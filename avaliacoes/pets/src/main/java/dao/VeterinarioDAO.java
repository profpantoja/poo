package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import model.Veterinario;

public class VeterinarioDAO {
    private final String FILE_PATH = "db/veterinarios.txt";

    // --- CREATE ---
    public void create(Veterinario veterinario) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            String linha = veterinario.getNome() + ";" + veterinario.getApelido();
            writer.write(linha);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Erro ao criar veterinario: " + e.getMessage());
        }
    }

    // --- READ ---
    public ArrayList<Veterinario> read() {
        ArrayList<Veterinario> lista = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] campos = linha.split(";");
                if (campos.length >= 2) {
                    Veterinario vet = new Veterinario(campos[0], campos[1]);
                    lista.add(vet);
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler veterinario: " + e.getMessage());
        }
        return lista;
    }

    // --- DELETE ---
    public void delete(String nomeTutor) {
        ArrayList<Veterinario> lista = read();
        lista.removeIf(tutor -> tutor.getNome().equals(nomeTutor));

        // Reescreve o arquivo com a lista atualizada (sem o tutor removido)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, false))) {
            for (Veterinario v : lista) {
                String linha = v.getNome() + ";" + v.getApelido();
                writer.write(linha);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao deletar tutor: " + e.getMessage());
        }
    }

}
