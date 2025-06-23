package com.engine;

import javafx.scene.image.Image;
import javafx.scene.canvas.GraphicsContext;
import java.util.List;

public abstract class Agent {
    protected int posX;
    protected int posY;
    protected int height;
    protected int width;
    protected int speed;
    protected Image image;

    public Agent(int posX, int posY, int height, int width, int speed, Image image) {
        this.posX = posX;
        this.posY = posY;
        this.height = height;
        this.width = width;
        this.speed = speed;
        this.image = image;
    }

    public int getPosX() { return posX; }
    public void setPosX(int posX) { this.posX = posX; }
    
    public int getPosY() { return posY; }
    public void setPosY(int posY) { this.posY = posY; }
    
    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }
    
    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }
    
    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }
    
    public Image getImage() { return image; }
    public void setImage(Image image) { this.image = image; }

    public abstract void move(List<String> movements);
    public abstract void chase(int targetX, int targetY);
    public abstract void draw(GraphicsContext gc);
}