package com.engine;

import javafx.scene.canvas.GraphicsContext;

public class Enemy extends Agent {
    private Weapon weapon;

    public Enemy(int posX, int posY, int height, int width, int speed, javafx.scene.image.Image image, Weapon weapon) {
        super(posX, posY, height, width, speed, image);
        this.weapon = weapon;
    }

    public Weapon getWeapon() { 
        return weapon; 
    }
    
    public void setWeapon(Weapon weapon) { 
        this.weapon = weapon; 
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
    
}
