package model;

public class Prontuario {

    private String data; // declaração das variaveis
    private String comentario;
    private Veterinario veterinario;
    private Pet pet;

    public Prontuario() {

    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getComentario() {
        return comentario; // GETTERS E SETTERS
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Prontuario(String data, String comentario) { // construtor do prontuario
        this.data = data;
        this.comentario = comentario;
    }

    public void realizarConsulta(Veterinario veterinario, Pet pet) { // método para fazer a consulta
        this.veterinario = veterinario;
        this.pet = pet;
        System.out.println("Consulta realizada para " + pet.getNome() + " por " + veterinario.getNome());
    }

    public String getInfo() { // getinfo da prontuario
        return "Data: " + data + ", Comentario: " + comentario + "\nVeterinário: " + veterinario.getInfo() + "\nPet: "
                + pet.getInfo();
    }
}