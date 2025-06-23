package com.engine;

import java.util.ArrayList;
import java.util.List;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Engine extends javafx.application.Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage theStage) {

            theStage.setTitle("Jogo de Agentes");
            Canvas canvas = new Canvas(800, 600);
            
            GraphicsContext gc = canvas.getGraphicsContext2D();
            
            Image background = new Image("background.png");
            Environment environment = new Environment(0, 0, 800, 600, background, gc);

            Image protagonistImage = new Image("protagonist.png");
            Protagonist protagonist = new Protagonist(100, 100, 50, 50, 5, protagonistImage, new Bag());
            environment.setProtagonist(protagonist);

            Item healthPotion = new Item("Poção de Vida", "Recupera 50 pontos de vida", new Image("potion.png"));
            Item sword = new Item("Espada Afiada", "Aumenta o dano em 20%", new Image("sword.png"));
            protagonist.getBag().addItem(healthPotion);
            protagonist.getBag().addItem(sword);

            List<Enemy> enemies = new ArrayList<>();

            Weapon bow = new Weapon("Arco Longo", 15, new Image("bow.png"));
            Enemy enemy1 = new Enemy(500, 100, 50, 50, 3, new Image("enemy.png"), bow);
            enemies.add(enemy1);

            Weapon axe = new Weapon("Machado Pesado", 25, new Image("axe.png"));
            Enemy enemy2 = new Enemy(500, 200, 50, 50, 2, new Image("enemy.png"), axe);
            enemies.add(enemy2);

            Weapon staff = new Weapon("Cajado Mágico", 20, new Image("staff.png"));
            Enemy enemy3 = new Enemy(500, 300, 50, 50, 4, new Image("enemy.png"), staff);
            enemies.add(enemy3);

            Weapon dagger = new Weapon("Adaga Venenosa", 18, new Image("dagger.png"));
            Enemy enemy4 = new Enemy(500, 400, 50, 50, 5, new Image("enemy.png"), dagger);
            enemies.add(enemy4);
            
            environment.setAgents(enemies);

            protagonist.superKick();
            protagonist.megaPunch();
            protagonist.fire();
            new AnimationTimer() {
                @Override
                public void handle(long now) {
                    environment.clearEnvironment();
                    environment.drawBackground();
                    environment.drawAgents();
                    environment.checkBorders();
                }
            }.start();
            
            theStage.show();
    }
}