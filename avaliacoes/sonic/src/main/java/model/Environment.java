package model;

import java.util.ArrayList;

public class Environment {
    private String name;
    private String image;

    private int width;
    private int height;

    private int score;
    private double time;
    private int qtdRings;

    private ArrayList<Character> characters = new ArrayList<>();
    private ArrayList<Object> objects = new ArrayList<>();


    public Environment(String name, String image, int width, int height, int score, double time,
            int qtdRings) {
        this.name = name;
        this.image = image;
        this.width = width;
        this.height = height;
        this.score = score;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getwidth() {
        return width;
    }

    public void setwidth(int width) {
        this.width = width;
    }

    public int getheight() {
        return height;
    }

    public void setheight(int height) {
        this.height = height;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }

    public ArrayList<Object> getObjects() {
        return objects;
    }

    public void setObjects(ArrayList<Object> objects) {

        for(Object objeto : objects){
            if(objeto.getTipo().equals(TipoObjeto.RING)){
                this.qtdRings+=1;
            }
        }

        this.objects = objects;
    }

    public void colidiu(Sonic sonic, Tails tails,Character monkey){
        
        //todo mundo aqui é um quadrado 5x5

        //sonic colidiu com tails = nada acontece
        if(((tails.getX() == sonic.getX() || tails.getX() == sonic.getX() + 5) || (tails.getX() > sonic.getX() && tails.getX() < sonic.getX() + 5))){
            if(((tails.getY() == sonic.getY() || tails.getY() == sonic.getY() + 5) || (tails.getY() > sonic.getY() && tails.getY() < sonic.getY() + 5))){
                System.out.println("Sonic e Tails Colidiram, Nada aconteceu");
            }
        }


        //sonic colidiu com ring
        for(Object objeto : objects){
            if(objeto.getTipo().equals(TipoObjeto.RING)){
                if(((objeto.getX() == sonic.getX() || objeto.getX() == sonic.getX() + 5) || (objeto.getX() > sonic.getX() && objeto.getX() < sonic.getX() + 5))){
                    if(((objeto.getY() == sonic.getY() || objeto.getY() == sonic.getY() + 5) || (objeto.getY() > sonic.getY() && objeto.getY() < sonic.getY() + 5))){
                        System.out.println("Sonic coletou uma moeda");
                        this.qtdRings -= 1;
                    }
                }
            }
        }

        //tails colidiu com uma moeda = nada acontece
        for(Object objeto : objects){
            if(objeto.getTipo().equals(TipoObjeto.RING)){
                if(((objeto.getX() == tails.getX() || objeto.getX() == tails.getX() + 5) || (objeto.getX() > tails.getX() && objeto.getX() < tails.getX() + 5))){
                    if(((objeto.getY() == tails.getY() || objeto.getY() == tails.getY() + 5) || (objeto.getY() > tails.getY() && objeto.getY() < tails.getY() + 5))){
                        System.out.println("Tails Colidiu com uma moeda, mas nada aconteceu");
                    }
                }
            }
        }

        //monkey colidiu com o sonic
        if(((monkey.getX() == sonic.getX() || monkey.getX() == sonic.getX() + 5) || (monkey.getX() > sonic.getX() && monkey.getX() < sonic.getX() + 5))){
            if(((monkey.getY() == sonic.getY() || monkey.getY() == sonic.getY() + 5) || (monkey.getY() > sonic.getY() && monkey.getY() < sonic.getY() + 5))){
                    if(sonic.isEstapulando()){
                        System.out.println("Sonic matou monkey");
                    }
                    else{
                        System.out.println("Sonic Morreu e perdeu uma vida");
                        sonic.setLife(sonic.getLife() - 1);
                    }
            }
        }            
        
    }


    public void showCharacters(){
        for(Character character :  characters){
            System.out.println("Character: " + character.getName() + " | Position: " + character.getCoordinates());
        }
    }

    public void showObjects(){
        for(Object object :  objects){
            System.out.println("Object: " + object.getName() + " | Position: " + object.getCoordinates());
        }
    }

    public void showPanel(){
        System.out.println("______________________\n\n" + "Level: " + this.name + " | Score: " + this.score + " | Time: " + this.time + " | Rings: " + this.qtdRings + "\n______________________");
    }
   
    // adicionado para realizar o teste dos personagens com as moedas
    public int getQtdRings() {
        return qtdRings;
    }
}
