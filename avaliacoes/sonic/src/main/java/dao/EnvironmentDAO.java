package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import model.Environment;

public class EnvironmentDAO {

    public File create(Environment environment) {
        try {
            File file = new File(environment.getName() + ".txt");
            if (file.createNewFile()) {
                FileWriter writer = new FileWriter(file);
                writer.write("Name:" + environment.getName() + "\n");
                writer.write("Image:" + environment.getImage() + "\n");
                writer.write("Width:" + environment.getwidth() + "\n");
                writer.write("Height:" + environment.getheight() + "\n");
                writer.write("Score:" + environment.getScore() + "\n");
                writer.write("Time:" + environment.getTime() + "\n");
                writer.write("QTD Rings:" + environment.getQtdRings() + "\n");

                writer.close();
                System.out.println("\nAmbiente salvo com sucesso: " + environment.getName());
                return file;
            } else {
                System.out.println("\nAmbiente já existe: " + environment.getName());
            }

        } catch (Exception e) {
            System.out.println("\nErro ao salvar o ambiente: " + e.getMessage());
        }
        return null;
    }

    public Environment read(String environmentName) {
        try {
            File file = new File(environmentName + ".txt");

            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                String name = "", image = "";
                int width = 0, height = 0, score = 0, qtdRings = 0;
                double time = 0;

                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                    if (line.startsWith("Name:")) {
                        name = line.substring(5);
                    } else if (line.startsWith("Image:")) {
                        image = line.substring(6);
                    } else if (line.startsWith("Width:")) {
                        width = Integer.parseInt(line.substring(6));
                    } else if (line.startsWith("Height:")) {
                        height = Integer.parseInt(line.substring(7));
                    } else if (line.startsWith("Score:")) {
                        score = Integer.parseInt(line.substring(6));
                    } else if (line.startsWith("Time:")) {
                        time = Double.parseDouble(line.substring(5));
                    } else if (line.startsWith("QTD Rings:")) {
                        qtdRings = Integer.parseInt(line.substring(10));
                    }
                }
                reader.close();

                return new Environment(name, image, width, height, score, time, qtdRings);
            } else {
                System.out.println("Arquivo não encontrado: " + file.getName());
            }

        } catch (Exception e) {
            System.out.println("Erro ao ler o ambiente: " + e.getMessage());
        }
        return null;
    }

    public void delete(String filename) {
        try {
            File file = new File(filename + ".txt");
            if (file.exists()) {
                if (file.delete()) {
                    System.out.println("Ambiente deletado: " + file.getName());
                } else {
                    System.out.println("Erro ao deletar o ambiente: " + file.getName());
                }
            } else {
                System.out.println("Arquivo não encontrado: " + file.getName());
            }

        } catch (Exception e) {
            System.out.println("Erro ao deletar o ambiente: " + e.getMessage());
        }
    }
}