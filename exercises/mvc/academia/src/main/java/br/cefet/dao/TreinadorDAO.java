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

import br.cefet.model.Treinador;

public class TreinadorDAO {
    private List<Treinador> treinadores = new ArrayList<>();
    private int nextId;

    Path caminhoRelativo = Paths.get("demo","data","treinadores.csv");
    File arquivoRelativo = caminhoRelativo.toFile();

    public TreinadorDAO() {
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

    public void loadCSVFile(){
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoRelativo))){
            String linha;
            boolean primeira_linha = true;
            while((linha = reader.readLine()) != null){
                if(primeira_linha){
                    primeira_linha = false;
                    continue;
                }

                Treinador treinador = Treinador.fromCSV(linha);
                treinadores.add(treinador);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void saveOnCSVFile(Treinador treinador){
        boolean fileIsEmpty = (arquivoRelativo.length() == 0);
        try ( BufferedWriter write = new BufferedWriter(new FileWriter(arquivoRelativo, true))){
            if(fileIsEmpty){
                write.write("id;nome;email;telefone;cpf;matricula;salario;cargo;turno");
                write.newLine();
            }

            write.write(treinador.toCSV());
            write.newLine();
            treinadores.add(treinador);

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void updateCSVFile(){
        try(BufferedWriter write = new BufferedWriter(new FileWriter(arquivoRelativo))){
            write.write("id;nome;email;telefone;cpf;matricula;salario;cargo;turno");
            write.newLine();
            for (Treinador treinador : treinadores){
                write.write(treinador.toCSV());
                write.newLine();
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public boolean delete(int id){
        for(Treinador treinador : treinadores){
            if(treinador.getIdTreinador() == id){
                treinadores.remove(treinador);
                updateCSVFile();
                return true;
            }
        }
        return false;
    }

    public Treinador getTreinadorById(int id){
        for(Treinador treinador : treinadores){
            if(treinador.getIdTreinador() == id){
                return treinador;
            }
        }
        return null;
    }
    
    public void update(Treinador treinador){
        for(int i = 0; i < treinadores.size(); i++){
            if(treinadores.get(i).getIdTreinador() == treinador.getIdTreinador()){
                treinadores.set(i, treinador);
                updateCSVFile();
                return;
            }
        }
    }
    public List<Treinador> getTreinadores(){
        return this.treinadores;
    }
    public int getNextId(){
        return nextId++;
    }
}
