package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import model.Politecnico;

public class PolitecnicoDAO {
    private final String arquivo = "db/politecnico.txt";

    public PolitecnicoDAO() {
        File dir = new File("db");
        if (!dir.exists()) dir.mkdirs();
    }

    public void create(Politecnico p) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true))) {
            bw.write(p.getNome() + ";" + p.getUrl());
            bw.newLine();
            System.out.println("Politécnico salvo com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar politécnico: " + e.getMessage());
        }
    }

    public ArrayList<Politecnico> read() {
        ArrayList<Politecnico> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                if (dados.length >= 1) {
                    String nome = dados[0];
                    String url = dados.length > 1 ? dados[1] : "";

                    Politecnico p = new Politecnico(nome);
                    p.setUrl(url);
                    lista.add(p);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler politécnicos: " + e.getMessage());
        }
        return lista;
    }

    public void delete(String nome) {
        ArrayList<Politecnico> lista = read();
        boolean removido = false;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().equalsIgnoreCase(nome)) {
                lista.remove(i);
                removido = true;
                break;
            }
        }

        if (!removido) {
            System.out.println("Politécnico com nome \"" + nome + "\" não encontrado.");
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {
            for (Politecnico p : lista) {
                bw.write(p.getNome() + ";" + p.getUrl());
                bw.newLine();
            }
            System.out.println("Politécnico removido com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao deletar politécnico: " + e.getMessage());
        }
    }
}
