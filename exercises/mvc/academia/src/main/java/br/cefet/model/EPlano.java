package br.cefet.model;

public enum EPlano {
    BLACK("Black"),
    STANDART("Standart"),
    BASIC("Basic");

    private String tipoPlano;

    EPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    public String getTipoPlano() {
        return tipoPlano;
    }
    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }
}
