package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Tails;

public class TailsDAO {
    private static final String arquivo_Tails = "avaliacoes/sonic/src/main/java/db/tails.txt";

    public void salvarTails(Tails tails) {
        try (BufferedWriter writerTails = new BufferedWriter(new FileWriter(arquivo_Tails, true))) {
            writerTails.write(tailsToString(tails));
            writerTails.newLine();
        } catch (IOException e) {
            System.err.println("Erro ao salvar: " + e.getMessage());
        }
    }

    public List<Tails> listarTails() {
        List<Tails> os_tails = new ArrayList<>();
        File arquivo_tails = new File(arquivo_Tails);

        if (!arquivo_tails.exists()) {
            return os_tails;
        }

        try (BufferedReader readerTails = new BufferedReader(new FileReader(arquivo_Tails))) {
            String linha;
            while ((linha = readerTails.readLine()) != null) {
                Tails tails = stringToTails(linha);
                if (tails != null) {
                    os_tails.add(tails);
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler: " + e.getMessage());
        }

        return os_tails;
    }

    public boolean deletarTails(String nome) {
        List<Tails> os_tails = listarTails();
        boolean remover = false;

        for (java.util.Iterator<Tails> iterator = os_tails.iterator(); iterator.hasNext();) {
            Tails t = iterator.next();
            if (t.getName().equalsIgnoreCase(nome)) {
                iterator.remove();
                remover = true;
                break;
            }
        }

        if (remover) {
            try (BufferedWriter writerTails = new BufferedWriter(new FileWriter(arquivo_Tails))) {
                for (Tails t : os_tails) {
                    writerTails.write(tailsToString(t));
                    writerTails.newLine();
                }
                return true;
            } catch (IOException e) {
                System.err.println("Erro ao deletar: " + e.getMessage());
            }
        }
        return false;
    }

    private String tailsToString(Tails tails) {
        return tails.getName() + ";" + tails.getLife() + ";" + tails.getImage() + ";" + 
               tails.getX() + ";" + tails.getY();
    }

     private Tails stringToTails(String linha) {
        String[] dados = linha.split(";");
        if (dados.length == 5) {
            String nome = dados[0];
            int vida = Integer.parseInt(dados[1]);
            String image = dados[2];
            int x = Integer.parseInt(dados[3]);
            int y = Integer.parseInt(dados[4]);
            
            Tails tails = new Tails(nome, vida, image, x, y);
            return tails;
        }
        return null;
    }
}
