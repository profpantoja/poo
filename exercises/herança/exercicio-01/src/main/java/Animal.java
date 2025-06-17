/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marco
 */
public class Animal {

    private int vida;
    private float peso;
    private float altura;
    private boolean dormindo = false;

    public Animal(
        int vida,
        float peso,
        float altura
    ){
        setAltura(altura);
        setPeso(peso);
        setVida(vida);
    }

    public void dormir(){
        if(!dormindo){
            setVida(getVida() + 1);
            System.out.println("Dormindo!");
        }
    }

    public void acordar(){
        if(dormindo)
            System.out.println("Acordando!");
    }

    public void morrer(){
        if(getVida() <= 0){
            System.out.println("O animal acabou morrendo!");
        }
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }


}
