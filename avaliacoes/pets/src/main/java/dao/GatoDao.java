package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Gato;

public class GatoDao {
    private static final String arq = "java-exercicios/avaliacoes/pets/src/main/java/dao/db/gato.txt";

    public void adicionarGato(Gato gato) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(arq, true));
            String texto = gato.getNome() + "|" + gato.getNascimento();
            bw.write(texto);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("Erro ao adicionar gato: " + e.getMessage());
        }
    }

    public List<Gato> listarGatos() {
        List<Gato> gatos = new ArrayList<>();
        try {
            File file = new File(arq);
            if (!file.exists()) {
                return gatos;
            }
            BufferedReader br = new BufferedReader(new FileReader(arq));
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split("\\|");
                if (dados.length == 2) {
                    Gato g = new Gato(dados[0], dados[1]);
                    gatos.add(g);
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Erro ao listar gatos: " + e.getMessage());
        }
        return gatos;
    }

    public Gato buscarPorNome(String nome) {
        List<Gato> lista = listarGatos();
        for (Gato g : lista) {
            if (g.getNome().equalsIgnoreCase(nome)) {
                return g;
            }
        }
        return null;
    }

    public Gato buscarPorNascimento(String nascimento) {
        List<Gato> lista = listarGatos();
        for (Gato g : lista) {
            if (g.getNascimento().equalsIgnoreCase(nascimento)) {
                return g;
            }
        }
        return null;
    }

    public Boolean removerPorNome(String nome) {
        List<Gato> lista = listarGatos();
        Gato encontrou = null;

        for (Gato g : lista) {
            if (g.getNome().equalsIgnoreCase(nome)) {
                encontrou = g;
                break;
            }
        }
        if (encontrou != null) {
            lista.remove(encontrou);
            salvarListaNoArquivo(lista);
            return true;
        }
        return false;
    }

    public Boolean removerPorNascimento(String nascimento) {
        List<Gato> lista = listarGatos();
        Gato encontrou = null;

        for (Gato g : lista) {
            if (g.getNascimento().equalsIgnoreCase(nascimento)) {
                encontrou = g;
                break;
            }
        }
        if (encontrou != null) {
            lista.remove(encontrou);
            salvarListaNoArquivo(lista);
            return true;
        }
        return false;
    }

    private void salvarListaNoArquivo(List<Gato> gatos) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(arq));
            for (Gato g : gatos) {
                bw.write(g.getNome() + "|" + g.getNascimento());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar lista: " + e.getMessage());
        }
    }
}
