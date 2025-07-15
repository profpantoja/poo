package com.gym;


/**
 * Representa um endereço com CEP, bairro, rua e número.
 */
public class Endereco {

    /** Código de Endereçamento Postal (CEP). */
    private String cep;

    /** Bairro do endereço. */
    private String bairro;

    /** Nome da rua. */
    private String rua;

    /** Número do imóvel na rua. */
    private int numero;

    /**
     * Construtor para criar um endereço com todos os dados especificados.
     * 
     * @param cep código postal do endereço
     * @param bairro bairro do endereço
     * @param rua nome da rua
     * @param numero número do imóvel
     */
    public Endereco(String cep, String bairro, String rua, int numero) {
        this.cep = cep;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    /**
     * Obtém o CEP do endereço.
     * 
     * @return o CEP
     */
    public String getCep() {
        return cep;
    }

    /**
     * Define o CEP do endereço.
     * 
     * @param cep o CEP a ser definido
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * Obtém o bairro do endereço.
     * 
     * @return o bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Define o bairro do endereço.
     * 
     * @param bairro o bairro a ser definido
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * Obtém o nome da rua do endereço.
     * 
     * @return a rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * Define o nome da rua do endereço.
     * 
     * @param rua a rua a ser definida
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * Obtém o número do imóvel.
     * 
     * @return o número do imóvel
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Define o número do imóvel.
     * 
     * @param numero o número a ser definido
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
}

