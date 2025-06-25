import java.util.ArrayList;

import interfaces.Force;

public class Jedi extends Pessoa implements Force {

    private String titulo = "Jedi";
    private ArrayList<Weapon> weapons;

    public Jedi() {
        super();
        this.weapons = new ArrayList<Weapon>();
    }

    public Jedi(String nome, String sobrenome) {
        super(nome, sobrenome);
        this.weapons = new ArrayList<Weapon>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }

    @Override
    public void mindControl() {
        System.out.println("[Jedi]: Do what I wish");
    
    }

    @Override
    public void farseeing() {
        System.out.println("[Jedi]: Visão amplificada");
    }

    @Override
    public void telepath() {
        System.out.println("[Jedi]: Telepatia ativada");
    }

    @Override
    public void levitation() {
        System.out.println("[Jedi]: Levitação ativada");
    }

    public void patience() {

    }

    public void imprime() {
        System.out.println(super.getNome() + " " + super.getSobrenome());
        System.out.println("Titulo: " + titulo);
    }

}