package com.restaurante.model;

/**
 * Representa um cliente do restaurante, que é uma especialização de {@link Pessoa}.
 * 
 * Além dos atributos herdados de Pessoa (nome, cpf, endereço),
 * o cliente possui um número de fidelidade.
 * 
 * @see Pessoa
 */
public class Cliente extends Pessoa {
    
    /** Número de fidelidade do cliente. */
    private int numFid;

    /**
     * Construtor para criar um cliente com nome, CPF, endereço e número de fidelidade.
     * 
     * @param nome nome do cliente
     * @param cpf CPF do cliente
     * @param endereco endereço do cliente
     * @param numFid número de fidelidade do cliente
     */
    public Cliente(String nome, String cpf, Endereco endereco, int numFid) {
        super(nome, cpf, endereco);
        this.numFid = numFid;
    }

    /**
     * Obtém o número de fidelidade do cliente.
     * 
     * @return número de fidelidade
     */
    public int getNumFid() {
        return numFid;
    }

    /**
     * Define o número de fidelidade do cliente.
     * 
     * @param numFid novo número de fidelidade
     */
    public void setNumFid(int numFid) {
        this.numFid = numFid;
    }
}
