package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Calopsita;

public class CalopsitaDao {
    private static final String arq = "java-exercicios/avaliacoes/pets/src/main/java/dao/db/calopsita.txt";

    public void adicionarCalopsita(Calopsita calopsita) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(arq, true));
            String texto = calopsita.getNome() + "|" + calopsita.getNascimento();
            bw.write(texto);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("Erro ao adicionar calopsita: " + e.getMessage());
        }
    }

    public List<Calopsita> listarCalopsitas() {
        List<Calopsita> calopsitas = new ArrayList<>();
        try {
            File file = new File(arq);
            if (!file.exists()) {
                return calopsitas;
            }
            BufferedReader br = new BufferedReader(new FileReader(arq));
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split("\\|");
                if (dados.length == 2) {
                    Calopsita c = new Calopsita(dados[0], dados[1]);
                    calopsitas.add(c);
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Erro ao listar calopsitas: " + e.getMessage());
        }
        return calopsitas;
    }

    public Calopsita buscarPorNome(String nome) {
        List<Calopsita> lista = listarCalopsitas();
        for (Calopsita c : lista) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

    public Calopsita buscarPorNascimento(String nascimento) {
        List<Calopsita> lista = listarCalopsitas();
        for (Calopsita c : lista) {
            if (c.getNascimento().equalsIgnoreCase(nascimento)) {
                return c;
            }
        }
        return null;
    }

    public Boolean removerPorNome(String nome) {
        List<Calopsita> lista = listarCalopsitas();
        Calopsita encontrou = null;

        for (Calopsita c : lista) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                encontrou = c;
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
        List<Calopsita> lista = listarCalopsitas();
        Calopsita encontrou = null;

        for (Calopsita c : lista) {
            if (c.getNascimento().equalsIgnoreCase(nascimento)) {
                encontrou = c;
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

    private void salvarListaNoArquivo(List<Calopsita> calopsitas) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(arq));
            for (Calopsita c : calopsitas) {
                bw.write(c.getNome() + "|" + c.getNascimento());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar lista: " + e.getMessage());
        }
    }
}
