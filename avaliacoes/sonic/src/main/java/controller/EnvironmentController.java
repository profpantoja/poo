package controller;

import model.Environment;

import java.io.File;
import java.util.Scanner;

import dao.EnvironmentDAO;

public class EnvironmentController {
    private Environment environment;

    private EnvironmentDAO dao;


    public EnvironmentController() {
        this.dao = new EnvironmentDAO();
    }

    
    public void readEnvironment(String name) {
        Environment loadedEnvironment = dao.read(name);
        if (loadedEnvironment != null) {
            System.out.println("Ambiente carregado: " + environment.getName());
            this.environment = loadedEnvironment;
        }
    }

    public File createEnvironment() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do ambiente: ");
        String name = sc.nextLine();

        System.out.print("Digite o nome da imagem: ");
        String image = sc.nextLine();

        System.out.print("Digite a largura (width): ");
        int width = sc.nextInt();

        System.out.print("Digite a altura (height): ");
        int height = sc.nextInt();

        System.out.print("Digite o score inicial: ");
        int score = sc.nextInt();

        System.out.print("Digite o tempo inicial: ");
        double time = sc.nextDouble();

        System.out.print("Digite a quantidade inicial de rings: ");
        int qtdRings = sc.nextInt();

        Environment environment = new Environment(name, image, width, height, score, time, qtdRings);

        File file = dao.create(environment);

        return file;
    }

    public void deleteEnvironment(String file) {
        dao.delete(file);
    }
}
