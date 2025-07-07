package dao;

import model.Player;
import java.io.*;
import java.util.*;

public class playerDAO {
    private static final String DB_PATH = "C:/Users/Carlos Eduardo/Desktop/newREPO/java-exercicios/avaliacoes/fluminense/src/main/java/db/players.txt";

    public static void salvar(Player p) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(DB_PATH, true));
        bw.write(p.toString());
        bw.newLine();
        bw.close();
    }

    public static List<Player> listar() throws IOException {
        List<Player> lista = new ArrayList<>();
        File file = new File(DB_PATH);
        if (!file.exists()) return lista;

        BufferedReader br = new BufferedReader(new FileReader(file));
        String linha;
        while ((linha = br.readLine()) != null) {
            String[] partes = linha.split(",");
            if (partes.length == 2) {
                lista.add(new Player(partes[0], partes[1]));
            }
        }
        br.close();
        return lista;
    }

    public static boolean deletar(String nome, String posicao) throws IOException {
        List<Player> lista = listar();
        boolean removido = lista.removeIf(p -> p.getNome().equals(nome) && p.getPosicao().equals(posicao));

        if (removido) {
            BufferedWriter bw = new BufferedWriter(new FileWriter(DB_PATH));
            for (Player p : lista) {
                bw.write(p.toString());
                bw.newLine();
            }
            bw.close();
        }
        return removido;
    }
}
