package gestao;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Produto> produto;
    private Restaurante restaurante;

    public Menu(ArrayList<Produto> p1, Restaurante restaurante) {
        this.produto = p1;
        this.restaurante = restaurante;
    }

    public ArrayList<Produto> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList<Produto> produto) {
        this.produto = produto;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public void show(){
        for (Produto produtos : produto){
            System.out.println("\n[-] Item: " + produtos.getNome() + " | R$" + produtos.getValProd() * 1.23);
        }
    }
}