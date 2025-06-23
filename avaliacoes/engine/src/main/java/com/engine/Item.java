package com.engine;

import javafx.scene.image.Image;

public class Item {
    private String name;
    private String descricao;
    private Image image;

    public Item(String name, String descricao, Image image) {
        this.name = name;
        this.descricao = descricao;
        this.image = image;
    }

    public String getName() { 
        return name; 
    }

    public void setName(String name) { 
        this.name = name; 
    }
    
    public String getDescricao() { 
        return descricao; 
    }

    public void setDescricao(String descricao) { 
        this.descricao = descricao; 
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
