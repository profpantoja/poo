package model;

public class Cliente extends Pessoa {
    private String telefone;

    public Cliente() {}

    public Cliente(int id, String nome, String cpf, String telefone) {
        super(id, nome, cpf);
        this.telefone = telefone;
    }


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
