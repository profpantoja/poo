package com.engine;

import javafx.scene.canvas.GraphicsContext;

public class Protagonist extends Agent implements Power {
    private Bag bag;

    public Protagonist(int posX, int posY, int height, int width, int speed, javafx.scene.image.Image image, Bag bag) {
        super(posX, posY, height, width, speed, image);
        this.bag = new Bag();
    }

    public Bag getBag() { 
        return bag; 
    }

    public void setBag(Bag bag) { 
        this.bag = bag; 
    }

    @Override
    public void move(java.util.List<String> movements) {
        for (String movement : movements) {
            switch (movement) {
                case "UP":
                    posY -= speed;
                    break;
                case "DOWN":
                    posY += speed;
                    break;
                case "LEFT":
                    posX -= speed;
                    break;
                case "RIGHT":
                    posX += speed;
                    break;
            }
        }
    }

    @Override
    public void chase(int targetX, int targetY) {
        if (posX < targetX) {
            posX += speed;
        } else if (posX > targetX) {
            posX -= speed;
        }
        
        if (posY < targetY) {
            posY += speed;
        } else if (posY > targetY) {
            posY -= speed;
        }
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.drawImage(image, posX, posY, width, height);
    }

    @Override
    public void superKick() {
        System.out.println("Protagonista executou um super chute!");
    }
    
    @Override
    public void megaPunch() {
        System.out.println("Protagonista executou um mega soco!");
    }
    
    @Override
    public void fire() {
        System.out.println("Protagonista lançou fogo!");
    }

    

    
    
}
