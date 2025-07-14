package model;

import java.util.ArrayList;
import java.util.List; //importações para o arraylist funcionar

public class Tutor extends Pessoa { // é herdeiro da classe pessoa

    private List<Pet> pets; // declara a Lista de pets

    public Tutor(String nome, String apelido) { // construtor da classe tutor
        super(nome, apelido);
        this.pets = new ArrayList<>();
    }

    public void adotar(Pet pet) { // método para adotar o pet, adcionando o pet á lista
        pets.add(pet); // do tutor. Funciona como o setter da Lista pets
    }

    public List<Pet> getPets() { // Getter da lista pets
        return pets;
    }

    @Override // dá um override para sobrecarregar o getInfo da pessoa
    public String getInfo() {
        String info = super.getInfo() + "\nPets: "; // armazena as informacoes numa variavel info, para depois imprimir
                                                    // // ela
        for (Pet pet : pets) { // um loop para armazenar todos os pets que o tutor venha a ter, para imprimir
                               // depois
            info += pet.getInfo() + "; ";
        }
        return info; // imprime a variavel info 
    }

}