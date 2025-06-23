package com.engine;

import javafx.scene.image.Image;
import javafx.scene.canvas.GraphicsContext;
import java.util.List;
import java.util.ArrayList;

public class Environment {
    private int posX;
    private int posY;
    private int height;
    private int width;
    private Image image;
    private GraphicsContext gc;
    private Protagonist protagonist;
    private List<Enemy> agents;

    public Environment(int posX, int posY, int height, int width, Image image, GraphicsContext gc) {
        this.posX = posX;
        this.posY = posY;
        this.height = height;
        this.width = width;
        this.image = image;
        this.gc = gc;
        this.agents = new ArrayList<>();
    }

    public int getPosX() { return posX; }
    public void setPosX(int posX) { this.posX = posX; }
    
    public int getPosY() { return posY; }
    public void setPosY(int posY) { this.posY = posY; }
    
    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }
    
    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }
    
    public Image getImage() { return image; }
    public void setImage(Image image) { this.image = image; }
    
    public GraphicsContext getGc() { return gc; }
    public void setGc(GraphicsContext gc) { this.gc = gc; }
    
    public Protagonist getProtagonist() { return protagonist; }
    public void setProtagonist(Protagonist protagonist) { this.protagonist = protagonist; }
    
    public List<Enemy> getAgents() { return agents; }
    public void setAgents(List<Enemy> agents) { this.agents = agents; }

    public void printStatusPanel(Agent agent) {
        System.out.println("Status do Agente: Posição X=" + agent.getPosX() + ", Y=" + agent.getPosY());
    }
    
    public void drawBackground() {
        gc.drawImage(image, posX, posY, width, height);
    }
    
    public void drawAgents() {
        protagonist.draw(gc);
        for (Enemy enemy : agents) {
            enemy.draw(gc);
        }
    }
    
    public void clearEnvironment() {
        gc.clearRect(posX, posY, width, height);
    }
    
    public void checkBorders() {
        for (Enemy enemy : agents) {
            if (enemy.getPosX() < 0) enemy.setPosX(0);
            if (enemy.getPosY() < 0) enemy.setPosY(0);
            if (enemy.getPosX() > width) enemy.setPosX(width);
            if (enemy.getPosY() > height) enemy.setPosY(height);
        }
    }
}
