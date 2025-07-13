package dao;

import model.Monkey;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class MonkeyDAO {

    private static final String arquivo_Macaco = "avaliacoes/sonic/src/main/java/db/";

    public File create(Monkey monkey) {
        try {
            File file = new File(arquivo_Macaco + monkey.getName()+".txt");
            if (file.createNewFile()) {
                FileWriter writer = new FileWriter(file);
                writer.write("Nome:" + monkey.getName() + "\n");
                writer.write("Vida:" + monkey.getLife() + "\n");
                writer.write("Imagem:" + monkey.getImage() + "\n");
                writer.write("PosX:" + monkey.getX() + "\n");
                writer.write("PosY:" + monkey.getY() + "\n");
                writer.close();

                System.out.println("\nMacaco salvo: " + monkey.getName());
                return file;
            } else {
                System.out.println("\nMacaco já existe: " + monkey.getName());
            }

        } catch (Exception e) {
            System.out.println("\nErro ao salvar o macaco: " + e.getMessage());
        }
        return null;
    }

    public Monkey read(String monkeyName) {
        try {
            File file = new File(arquivo_Macaco + monkeyName + ".txt");

            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                String name = "", image = "";
                int life = 0, x = 0, y = 0;

                while ((line = reader.readLine()) != null) {
                    System.out.println(line);

                    if (line.startsWith("Nome:")) {
                        name = line.substring(5);
                    } else if (line.startsWith("Vida:")) {
                        life = Integer.parseInt(line.substring(5));
                    } else if (line.startsWith("Imagem:")) {
                        image = line.substring(7);
                    } else if (line.startsWith("PosX:")) {
                        x = Integer.parseInt(line.substring(5));
                    } else if (line.startsWith("PosY:")) {
                        y = Integer.parseInt(line.substring(5));
                    }
                }
                reader.close();

                return new Monkey(name, life, image, x, y);
            } else {
                System.out.println("Arquivo não encontrado: " + file.getName());
                return null;
            }

        } catch (Exception e) {
            System.out.println("Erro ao ler o macaco: " + e.getMessage());
            return null;
        }
    }


    public void delete(String filename) {
        try {
            File file = new File(arquivo_Macaco + filename + ".txt");
            if (file.exists()) {
                if (file.delete()) {
                    System.out.println("Macaco deletado: " + file.getName());
                } else {
                    System.out.println("Erro ao deletar o macaco: " + file.getName());
                }
            } else {
                System.out.println("Arquivo não encontrado: " + file.getName());
            }

        } catch (Exception e) {
            System.out.println("Erro ao deletar o macaco: " + e.getMessage());
        }
    }
}
