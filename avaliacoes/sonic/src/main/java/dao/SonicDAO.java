package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.Sonic;


public class SonicDAO {
    private static final String arquivo_Sonic = "avaliacoes/sonic/src/main/java/db/sonic.txt";

    public void salvarSonic(Sonic sonic) {
        try (BufferedWriter writerSonic = new BufferedWriter(new FileWriter(arquivo_Sonic, true))) {
            writerSonic.write(sonicToString(sonic));
            writerSonic.newLine();
        } catch (IOException e) {
            System.err.println("Erro ao salvar: " + e.getMessage());
        }
    }

    public List<Sonic> listarSonic() {
        List<Sonic> sonics = new ArrayList<>();
        File arquivo_sonic = new File(arquivo_Sonic);

        if (!arquivo_sonic.exists()) {
            return sonics;
        }

        try (BufferedReader readerSonic = new BufferedReader(new FileReader(arquivo_Sonic))) {
            String linha;
            while ((linha = readerSonic.readLine()) != null) {
                Sonic sonic = stringToSonic(linha);
                if (sonic != null) {
                    sonics.add(sonic);
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler: " + e.getMessage());
        }

        return sonics;
    }

    public boolean deletarSonic(String name) {
        List<Sonic> sonics = listarSonic();
        boolean remover = false;

        for (java.util.Iterator<Sonic> iterator = sonics.iterator(); iterator.hasNext();) {
            Sonic s = iterator.next();
            if (s.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                remover = true;
                break;
            }
        }

        if (remover) {
            try (BufferedWriter writerSonic = new BufferedWriter(new FileWriter(arquivo_Sonic))) {
                for (Sonic s : sonics) {
                    writerSonic.write(sonicToString(s));
                    writerSonic.newLine();
                }
                return true;
            } catch (IOException e) {
                System.err.println("Erro ao deletar: " + e.getMessage());
            }
        }
        return false;
    }

    private String sonicToString(Sonic sonic) {
        return sonic.getName() + ";" + sonic.getLife() + ";" + sonic.getImage() + ";" + 
               sonic.getX() + ";" + sonic.getY() + ";" + sonic.isEstapulando();
    }

     private Sonic stringToSonic(String linha) {
        String[] dados = linha.split(";");
        if (dados.length == 6) {
            String name = dados[0];
            int life = Integer.parseInt(dados[1]);
            String image = dados[2];
            int x = Integer.parseInt(dados[3]);
            int y = Integer.parseInt(dados[4]);
            boolean estaPulando = Boolean.parseBoolean(dados[5]);
            
            Sonic sonic = new Sonic(name, life, image, x, y);
            sonic.setEstapulando(estaPulando);
            return sonic;
        }
        return null;
    }
}
