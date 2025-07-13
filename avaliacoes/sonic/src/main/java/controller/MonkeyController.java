package controller;

import model.Monkey;
import model.Direction;
import dao.MonkeyDAO;

import java.io.File;
import java.util.Scanner;

public class MonkeyController {

    private Monkey monkey;

    private MonkeyDAO dao;


    public MonkeyController() {
        this.dao = new MonkeyDAO();
    }


    public void move(Direction direction) {
        if (direction.equals(Direction.UP)) {
        }

        monkey.mover(direction);

        String dirText = "";
        switch (direction) {
            case FRONT:
                dirText = "Frente";
                break;
            case BACK:
                dirText = "Trás";
                break;
            case UP:
                dirText = "Cima";
                break;
            case DOWN:
                dirText = "Baixo";
                break;
        }
    }


    public File createMonkey() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do macaco: ");
        String name = sc.nextLine();

        System.out.print("Digite a vida do macaco: ");
        int life = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Digite a imagem do macaco: ");
        String image = sc.nextLine();

        System.out.print("Digite a posição X do macaco: ");
        int x = sc.nextInt();

        System.out.print("Digite a posição Y do macaco: ");
        int y = sc.nextInt();
        sc.nextLine();

        this.monkey = new Monkey(name, life, image, x, y);

        dao.create(monkey);
        return dao.create(monkey);
    }
    
    public void readMonkey(String name) {
        Monkey loadedMonkey = dao.read(name);
        if (loadedMonkey != null) {
            System.out.println("Macaco carregado: " + monkey.getName());
            this.monkey = loadedMonkey;
        }
    }

    public void deleteMonkey(String file) {
        dao.delete(file);
    }
}
