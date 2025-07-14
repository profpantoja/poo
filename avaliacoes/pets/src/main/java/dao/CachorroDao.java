package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Cachorro;

public class CachorroDao {
    private static final String arq = "java-exercicios/avaliacoes/pets/src/main/java/dao/db/cachorro.txt";

    public void adicionarCachorro(Cachorro cachorro) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(arq, true));
            String texto = cachorro.getNome() + "|" + cachorro.getNascimento();
            bw.write(texto);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("Erro ao adicionar cachorro: " + e.getMessage());
        }
    }

    public List<Cachorro> listarCachorros() {
        List<Cachorro> cachorros = new ArrayList<>();
        try {
            File file = new File(arq);
            if (!file.exists()) {
                return cachorros;
            }
            BufferedReader br = new BufferedReader(new FileReader(arq));
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split("\\|");
                if (dados.length == 2) {
                    Cachorro c = new Cachorro(dados[0], dados[1]);
                    cachorros.add(c);
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Erro ao listar cachorros: " + e.getMessage());
        }
        return cachorros;
    }

    public Cachorro buscarPorNome(String nome) {
        List<Cachorro> lista = listarCachorros();
        for (Cachorro c : lista) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

    public Cachorro buscarPorNascimento(String nascimento) {
        List<Cachorro> lista = listarCachorros();
        for (Cachorro c : lista) {
            if (c.getNascimento().equalsIgnoreCase(nascimento)) {
                return c;
            }
        }
        return null;
    }

    public Boolean removerPorNome(String nome) {
        List<Cachorro> lista = listarCachorros();
        Cachorro encontrou = null;

        for (Cachorro c : lista) {
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
        List<Cachorro> lista = listarCachorros();
        Cachorro encontrou = null;

        for (Cachorro c : lista) {
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

    private void salvarListaNoArquivo(List<Cachorro> cachorros) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(arq));
            for (Cachorro c : cachorros) {
                bw.write(c.getNome() + "|" + c.getNascimento());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar lista: " + e.getMessage());
        }
    }
}
