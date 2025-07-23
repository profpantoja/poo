package dao;

import model.Disciplina;

import java.io.*;
import java.util.*;

public class DisciplinaDAO {
    private final String caminhoArquivo = "avaliacoes/politecnico/db/disciplina.txt";
    private Map<String, Disciplina> disciplinasMap;

    public DisciplinaDAO() {
        disciplinasMap = new HashMap<>();
        try {
            carregarDisciplinas();
        } catch (IOException e) {
            System.err.println("Erro ao carregar disciplinas: " + e.getMessage());
        }
    }

    private void carregarDisciplinas() throws IOException {
        disciplinasMap.clear();

        File arquivo = new File(caminhoArquivo);
        if (!arquivo.exists()) {
            arquivo.getParentFile().mkdirs();
            arquivo.createNewFile();
            return;
        }

        List<String> linhas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                linhas.add(linha);
            }
        }

        for (String linha : linhas) {
            String[] parts = linha.split(";");
            if (parts.length < 3) continue;

            String nome = parts[0];
            int periodo = Integer.parseInt(parts[1]);
            int ch = Integer.parseInt(parts[2]);

            Disciplina d = new Disciplina(nome, periodo, ch);
            disciplinasMap.put(nome, d);
        }

        for (String linha : linhas) {
            String[] parts = linha.split(";");
            String nome = parts[0];
            Disciplina d = disciplinasMap.get(nome);

            if (parts.length > 3 && !parts[3].isEmpty()) {
                String[] preReqs = parts[3].split(",");
                for (String preReqNome : preReqs) {
                    Disciplina preReq = disciplinasMap.get(preReqNome.trim());
                    if (preReq != null) {
                        d.addPreReq(preReq);
                    }
                }
            }
        }
    }

    private void salvarTodas() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (Disciplina d : disciplinasMap.values()) {
                StringBuilder sb = new StringBuilder();
                sb.append(d.getNome()).append(";");
                sb.append(d.getPeriodo()).append(";");
                sb.append(d.getCh()).append(";");
                List<Disciplina> preReqs = d.getPreRequisitos();
                for (int i = 0; i < preReqs.size(); i++) {
                    sb.append(preReqs.get(i).getNome());
                    if (i < preReqs.size() - 1) sb.append(",");
                }
                bw.write(sb.toString());
                bw.newLine();
            }
        }
    }

    public boolean create(Disciplina disciplina) throws IOException {
        if (disciplinasMap.containsKey(disciplina.getNome())) {
            return false;
        }
        disciplinasMap.put(disciplina.getNome(), disciplina);
        salvarTodas();
        return true;
    }

    public List<Disciplina> readAll() {
        return new ArrayList<>(disciplinasMap.values());
    }

    public Disciplina readByName(String nome) {
        return disciplinasMap.get(nome);
    }

    public boolean update(Disciplina disciplina) throws IOException {
        if (!disciplinasMap.containsKey(disciplina.getNome())) {
            return false;
        }
        disciplinasMap.put(disciplina.getNome(), disciplina);
        salvarTodas();
        return true;
    }

    public boolean delete(String nome) throws IOException {
        if (!disciplinasMap.containsKey(nome)) {
            return false;
        }
        disciplinasMap.remove(nome);

        for (Disciplina d : disciplinasMap.values()) {
            d.getPreRequisitos().removeIf(pre -> pre.getNome().equalsIgnoreCase(nome));
        }

        salvarTodas();
        return true;
    }
}
