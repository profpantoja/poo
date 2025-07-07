package dao;

import model.Team;
import java.io.*;
import java.util.*;

public class teamDAO {
    private static final String DB_PATH = "C:/Users/Carlos Eduardo/Desktop/newREPO/java-exercicios/avaliacoes/fluminense/src/main/java/db/teams.txt";

    public static void salvar(Team t) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(DB_PATH, true));
        bw.write(t.toString());
        bw.newLine();
        bw.close();
    }

    public static List<Team> listar() throws IOException {
        List<Team> lista = new ArrayList<>();
        File file = new File(DB_PATH);
        if (!file.exists()) return lista;

        BufferedReader br = new BufferedReader(new FileReader(file));
        String linha;
        while ((linha = br.readLine()) != null) {
            String[] partes = linha.split(",");
            if (partes.length == 2) {
                lista.add(new Team(partes[0], partes[1]));
            }
        }
        br.close();
        return lista;
    }

    public static boolean deletar(String nome, String tecnico) throws IOException {
        List<Team> lista = listar();
        boolean removido = lista.removeIf(t -> t.getNome().equals(nome) && t.getTecnico().equals(tecnico));

        if (removido) {
            BufferedWriter bw = new BufferedWriter(new FileWriter(DB_PATH));
            for (Team t : lista) {
                bw.write(t.toString());
                bw.newLine();
            }
            bw.close();
        }
        return removido;
    }
}
