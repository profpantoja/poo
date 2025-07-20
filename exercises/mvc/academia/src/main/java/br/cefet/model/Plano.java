package br.cefet.model;

import java.util.List;
import java.util.ArrayList;

public class Plano {
    private String nome, dtvencimento, formpag;
    private float valor;
    private static List<Plano> planos = new ArrayList<>();
    private EPlano tipo; // Enum para os tipos de plano

    // Construtor Padrão
    public Plano() {
        // Inicialização padrão
    }

    // Construtor Parametrizado
    public Plano(EPlano tipo, String nome, String dtvencimento, String formpag, float valor) {
        this.tipo = tipo;
        this.nome = nome;
        this.dtvencimento = dtvencimento;
        this.formpag = formpag;
        this.valor = valor;
    }

    // Getters
    public EPlano getTipo() {
        return tipo;
    }
    public String getNome() {
        return nome;
    }
    public String getDtvencimento() {
        return dtvencimento;
    }
    public String getFormpag() {
        return formpag;
    }
    public float getValor() {
        return valor;
    }
    public static List<Plano> getPlanos() {
        return planos;
    }

    // Setters
    public void setTipo(EPlano tipo) {
        this.tipo = tipo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDtvencimento(String dtvencimento) {
        this.dtvencimento = dtvencimento;
    }
    public void setFormpag(String formpag) {
        this.formpag = formpag;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public static void setPlanos(List<Plano> lista) {
        planos = lista;
    }
}
