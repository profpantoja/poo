package com.restaurante.model;

public class Mesa {
    private String numero;
    private String local;

    public Mesa(String numero, String local) {
        this.numero = numero;
        this.local = local;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}