package com.restaurante.model;

/**
 * Representa uma mesa do restaurante, identificada por número e localização.
 * 
 * Esta classe encapsula os atributos básicos de uma mesa,
 * incluindo seu número identificador e o local onde está posicionada.
 */
public class Mesa {
    
    /** Número identificador da mesa. */
    private String numero;
    
    /** Localização da mesa no restaurante. */
    private String local;

    /**
     * Construtor para criar uma mesa com número e local definidos.
     * 
     * @param numero número identificador da mesa
     * @param local localização da mesa
     */
    public Mesa(String numero, String local) {
        this.numero = numero;
        this.local = local;
    }

    /**
     * Obtém o número da mesa.
     * 
     * @return número da mesa
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define o número da mesa.
     * 
     * @param numero novo número da mesa
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Obtém a localização da mesa.
     * 
     * @return local da mesa
     */
    public String getLocal() {
        return local;
    }

    /**
     * Define a localização da mesa.
     * 
     * @param local nova localização da mesa
     */
    public void setLocal(String local) {
        this.local = local;
    }
}
