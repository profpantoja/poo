package com.restaurante.model;

import java.util.List;

public class Funcionario extends Pessoa{
    private String ctp;
    private String cargo;
    private List<Mesa> mesas;

    public Funcionario(String nome, String cpf,Endereco endereco, String ctp, String cargo, List<Mesa> mesas) {
        super(nome, cpf, endereco);
        this.ctp = ctp;
        this.cargo = cargo;
        this.mesas = mesas;
    }

    public String getCtp() {
        return ctp;
    }

    public void setCtp(String ctp) {
        this.ctp = ctp;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public List<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(List<Mesa> mesas) {
        this.mesas = mesas;
    }
}
