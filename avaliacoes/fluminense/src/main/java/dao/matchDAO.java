package dao;

import model.Match;
import java.io.*;
import java.util.*;

public class matchDAO {
    private static final String DB_PATH = "C:/Users/Carlos Eduardo/Desktop/newREPO/java-exercicios/avaliacoes/fluminense/src/main/java/db/matches.txt";

    public static void salvar(Match m) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(DB_PATH, true));
        bw.write(m.toString());
        bw.newLine();
        bw.close();
    }

    public static List<Match> listar() throws IOException {
        List<Match> lista = new ArrayList<>();
        File file = new File(DB_PATH);
        if (!file.exists()) return lista;

        BufferedReader br = new BufferedReader(new FileReader(file));
        String linha;
        while ((linha = br.readLine()) != null) {
            String[] partes = linha.split(",");
            if (partes.length == 3) {
                lista.add(new Match(partes[0], partes[1], partes[2]));
            }
        }
        br.close();
        return lista;
    }

    public static boolean deletar(String teamA, String teamB, String data) throws IOException {
        List<Match> lista = listar();
        boolean removido = lista.removeIf(m -> m.getTeamA().equals(teamA) && m.getTeamB().equals(teamB) && m.getData().equals(data));

        if (removido) {
            BufferedWriter bw = new BufferedWriter(new FileWriter(DB_PATH));
            for (Match m : lista) {
                bw.write(m.toString());
                bw.newLine();
            }
            bw.close();
        }
        return removido;
    }
}
