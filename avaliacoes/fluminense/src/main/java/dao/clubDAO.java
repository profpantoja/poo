package dao;

import model.Club;
import java.io.*;
import java.util.*;

public class clubDAO {

    private static final String DB_PATH = "C:/Users/Carlos Eduardo/Desktop/newREPO/java-exercicios/avaliacoes/fluminense/src/main/java/db/clubs.txt";

    public static void salvar(Club clube) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(DB_PATH, true));
        bw.write(clube.toString());
        bw.newLine();
        bw.close();
    }

    public static List<Club> listar() throws IOException {
        List<Club> lista = new ArrayList<>();
        File file = new File(DB_PATH);
        if (!file.exists()) return lista;

        BufferedReader br = new BufferedReader(new FileReader(file));
        String linha;
        while ((linha = br.readLine()) != null) {
            String[] partes = linha.split(",");
            if (partes.length == 2) {
                lista.add(new Club(partes[0], partes[1]));
            }
        }
        br.close();
        return lista;
    }

    public static boolean deletar(String nome, String cidade) throws IOException {
        List<Club> lista = listar();
        boolean removido = lista.removeIf(c -> c.getNome().equals(nome) && c.getCidade().equals(cidade));

        if (removido) {
            BufferedWriter bw = new BufferedWriter(new FileWriter(DB_PATH));
            for (Club c : lista) {
                bw.write(c.toString());
                bw.newLine();
            }
            bw.close();
        }
        return removido;
    }
}
