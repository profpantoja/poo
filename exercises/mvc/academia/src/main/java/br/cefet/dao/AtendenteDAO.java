package br.cefet.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

import br.cefet.model.Atendente;

public class AtendenteDAO {
    private List<Atendente> atendentes = new ArrayList<>();
    private int nextId;

    Path caminhoRelativo = Paths.get("demo", "data", "atendentes.csv");
    File arquivoRelativo = caminhoRelativo.toFile();

    public AtendenteDAO() {
        if (!arquivoRelativo.exists()) {
            try {
                Files.createDirectories(arquivoRelativo.getParentFile().toPath());
                arquivoRelativo.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            loadCSVFile();
        }
        this.nextId = 1;
    }

    public void loadCSVFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoRelativo))) {
            String linha;
            boolean primeira_linha = true;
            while ((linha = reader.readLine()) != null) {
                if (primeira_linha) {
                    primeira_linha = false;
                    continue;
                }

                Atendente atendente = Atendente.fromCSV(linha);
                atendentes.add(atendente);
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveOnCSVFile(Atendente atendente) {
        boolean fileIsEmpty = (arquivoRelativo.length() == 0);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoRelativo, true))) {
            if (fileIsEmpty) {
                writer.write("id;nome;email;telefone;cpf;salario;matricula;turno;cargo");
                writer.newLine();
            }

            writer.write(atendente.toCSV());
            writer.newLine();
            atendentes.add(atendente);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateCSVFile(){
        try(BufferedWriter write = new BufferedWriter(new FileWriter(arquivoRelativo))){
            write.write("id;nome;email;telefone;cpf;matricula;salario;cargo;turno");
            write.newLine();
            for (Atendente atendente : atendentes){
                write.write(atendente.toCSV());
                write.newLine();
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public boolean delete(int id) {
        for (Atendente atendente : atendentes) {
            if (atendente.getIdAtendente() == id) {
                atendentes.remove(atendente);
                updateCSVFile();
                return true;
            }
        }
        return false;
    }

    public Atendente getAtendenteById(int id) {
        for (Atendente atendente : atendentes) {
            if (atendente.getIdAtendente() == id) {
                return atendente;
            }
        }
        return null;
    }

    public void update(Atendente atendente) {
        for (int i = 0; i < atendentes.size(); i++) {
            if (atendentes.get(i).getIdAtendente() == atendente.getIdAtendente()) {
                atendentes.set(i, atendente);
                updateCSVFile();
                return;
            }
        }
    }
    
    public List<Atendente> getAtendentes() {
        return atendentes;
    }

    public int getNextId() {
        return nextId++;
    }
}
