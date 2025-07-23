package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import model.Politecnico;
import model.Professor;

public class ProfessorDAO {
    private final String arquivo = "src/db/professor.txt";

    public ProfessorDAO() {
        File dir = new File("db");
        if (!dir.exists()) dir.mkdirs();
    }

    public void create(Professor p) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true))) {
            bw.write(p.getNome() + ";" + p.getApelido() + ";" + p.getNumeroFiscal() + ";" + p.getId() + ";" + p.getContrato() + ";" + p.getPolitecnico().getNome());
            bw.newLine();
            System.out.println("Professor salvo.");
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public ArrayList<Professor> read() {
        ArrayList<Professor> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                if (dados.length == 6) {
                    String nome = dados[0];
                    String apelido = dados[1];
                    String numeroFiscal = dados[2];
                    int id = Integer.parseInt(dados[3]);
                    int contrato = Integer.parseInt(dados[4]);
                    String nomePolitecnico = dados[5];

                    Politecnico politecnico = new Politecnico(nomePolitecnico);
                    Professor p = new Professor(nome, apelido, numeroFiscal, id, contrato, politecnico);
                    lista.add(p);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler professores: " + e.getMessage());
        }
        return lista;
    }

    public void delete(int id) {
        ArrayList<Professor> lista = read();
        boolean removido = false;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                lista.remove(i);
                removido = true;
                break;
            }
        }

        if (!removido) {
            System.out.println("Professor com ID " + id + " não encontrado.");
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {
            for (Professor p : lista) {
                bw.write(p.getNome() + ";" + p.getApelido() + ";" + p.getNumeroFiscal() + ";" +
                         p.getId() + ";" + p.getContrato() + ";" + p.getPolitecnico().getNome());
                bw.newLine();
            }
            System.out.println("Professor removido com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao deletar professor: " + e.getMessage());
        }
    }
}
