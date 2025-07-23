package dao;

import model.Apontamento;
import model.Disciplina;

import java.io.*;
import java.util.*;

public class ApontamentoDAO {
    private final String caminhoArquivo = "avaliacoes/politecnico/db/apontamento.txt";
    private Map<Integer, Apontamento> apontamentosMap;
    private List<Disciplina> disciplinas; // para relacionar

    public ApontamentoDAO(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
        apontamentosMap = new HashMap<>();
        try {
            carregarApontamentos();
        } catch (IOException e) {
            System.err.println("Erro ao carregar apontamentos: " + e.getMessage());
        }
    }

    private void carregarApontamentos() throws IOException {
        apontamentosMap.clear();

        File arquivo = new File(caminhoArquivo);
        if (!arquivo.exists()) {
            arquivo.getParentFile().mkdirs();
            arquivo.createNewFile();
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            int id = 1; // chave simples incremental para controle interno
            while ((linha = br.readLine()) != null) {
                String[] parts = linha.split(";");
                if (parts.length < 4) continue;

                Double nota = Double.parseDouble(parts[0]);
                String status = parts[1];
                String data = parts[2];
                String nomeDisc = parts[3];

                Disciplina disc = null;
                for (Disciplina d : disciplinas) {
                    if (d.getNome().equalsIgnoreCase(nomeDisc)) {
                        disc = d;
                        break;
                    }
                }

                Apontamento a = new Apontamento(nota, status, data, disc);
                apontamentosMap.put(id++, a);
            }
        }
    }

    private void salvarTodos() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (Apontamento a : apontamentosMap.values()) {
                StringBuilder sb = new StringBuilder();
                sb.append(a.getNota() != null ? a.getNota() : "").append(";");
                sb.append(a.getStatus() != null ? a.getStatus() : "").append(";");
                sb.append(a.getData() != null ? a.getData() : "").append(";");
                sb.append(a.getDisciplina() != null ? a.getDisciplina().getNome() : "");
                bw.write(sb.toString());
                bw.newLine();
            }
        }
    }

    // CREATE
    public boolean create(Apontamento apontamento) throws IOException {
        int id = apontamentosMap.isEmpty() ? 1 : Collections.max(apontamentosMap.keySet()) + 1;
        apontamentosMap.put(id, apontamento);
        salvarTodos();
        return true;
    }

    public List<Apontamento> readAll() {
        return new ArrayList<>(apontamentosMap.values());
    }

    public Apontamento readById(int id) {
        return apontamentosMap.get(id);
    }

    public boolean update(int id, Apontamento apontamento) throws IOException {
        if (!apontamentosMap.containsKey(id)) {
            return false;
        }
        apontamentosMap.put(id, apontamento);
        salvarTodos();
        return true;
    }

    public boolean delete(int id) throws IOException {
        if (!apontamentosMap.containsKey(id)) {
            return false;
        }
        apontamentosMap.remove(id);
        salvarTodos();
        return true;
    }
}
