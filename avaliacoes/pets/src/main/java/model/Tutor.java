package model;

import java.util.ArrayList;
import java.util.List;

public class Tutor extends Pessoa {
    private List<Pet> pets;

    public Tutor(String nome, String apelido) {
        super(nome, apelido);
        this.pets = new ArrayList<>();
    }

    public void adotar(Pet pet) {
        pets.add(pet);
    }

    public List<Pet> getPets() {
        return pets;
    }

    @Override
    public String getInfo() {
        String info = "Tutor: " + getNome() + " (" + getApelido() + ")";
        if (!pets.isEmpty()) {
            info += "\n  Pets:";
            for (Pet pet : pets) {
                info += "\n  - " + pet.getInfo();
            }
        }
        return info;
    }
}
