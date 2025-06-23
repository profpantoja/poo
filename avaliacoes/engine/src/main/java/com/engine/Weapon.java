package com.engine;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Weapon {
    private String name;
    private int dano;
    private Image image;
    
    public Weapon(String name, int dano, Image image) {
        this.name = name;
        this.dano = dano;
        this.image = image;
    }

    public String getName() { 
        return name; 
    }

    public void setName(String name) { 
        this.name = name; 
    }
    
    public int getDano() { 
        return dano; 
    }

    public void setDano(int dano) { 
        this.dano = dano; 
    }
    
    public void draw(GraphicsContext gc, double x, double y) {
        gc.drawImage(null, x, y, 30, 30);
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
