package com.restaurante.model;

/**
 * Representa um endereço com tipo, CEP e número.
 * 
 * Exemplo de tipo: "Rua", "Avenida", etc.
 * 
 * Contém métodos para obter e modificar seus atributos,
 * além de um método para retornar uma descrição simples do endereço.
 *
 */
public class Endereco {
    
    /** Tipo do endereço (ex: Rua, Avenida). */
    private String tipo;
    
    /** Código de Endereçamento Postal (CEP). */
    private String cep;
    
    /** Número do endereço. */
    private int numero;

    /**
     * Construtor para criar um endereço.
     * 
     * @param tipo tipo do endereço (ex: Rua, Avenida)
     * @param cep CEP do endereço
     * @param numero número do endereço
     */
    public Endereco(String tipo, String cep, int numero) {
        this.tipo = tipo;
        this.cep = cep;
        this.numero = numero;
    }

    /** 
     * Obtém o tipo do endereço.
     * @return tipo do endereço
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o tipo do endereço.
     * @param tipo novo tipo do endereço
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtém o CEP do endereço.
     * @return CEP do endereço
     */
    public String getCep() {
        return cep;
    }

    /**
     * Define o CEP do endereço.
     * @param cep novo CEP do endereço
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * Obtém o número do endereço.
     * @return número do endereço
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Define o número do endereço.
     * @param numero novo número do endereço
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Retorna uma descrição simples do endereço no formato "tipo, número".
     * 
     * @return descrição do endereço
     */
    public String getEndereco() {
        return this.tipo + ", " + this.numero;
    }
}
