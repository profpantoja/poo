package model;

public class Veterinario extends Pessoa { // herdeiro da classe pessoa

    private String crv; // declara o crv

    public Veterinario(String nome, String apelido) {
        super(nome, apelido);
    }

    public Veterinario(String nome, String apelido, String crv) {
        super(nome, apelido);
        this.crv = crv;
    }

    public String getCrv() {
        return crv; // getter do crv
    }

    public void setCrv(String crv) {
        this.crv = crv; // setter do crv
    }

    @Override // possui o override para sobrescrever o getinfo da classe Pessoa
    public String getInfo() { // getinfo do veterinario
        return super.getInfo() + ", CRV: " + crv;
    }
}