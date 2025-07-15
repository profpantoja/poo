package com.restaurante.model;

/**
 * Representa uma pessoa genérica com nome, CPF e endereço.
 * 
 * Esta classe serve como base para outras classes que representam
 * tipos específicos de pessoas, como Cliente e Funcionario.
 *
 */
public class Pessoa {
    
    /** Nome da pessoa. */
    private String nome;
    
    /** CPF da pessoa. */
    private String cpf;
    
    /** Endereço da pessoa. */
    private Endereco endereco;

    /**
     * Construtor para criar uma pessoa com nome, CPF e endereço.
     * 
     * @param nome nome da pessoa
     * @param cpf CPF da pessoa
     * @param endereco endereço da pessoa
     */
    public Pessoa(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    /**
     * Obtém o nome da pessoa.
     * 
     * @return nome da pessoa
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da pessoa.
     * 
     * @param nome novo nome da pessoa
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o CPF da pessoa.
     * 
     * @return CPF da pessoa
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF da pessoa.
     * 
     * @param cpf novo CPF da pessoa
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Obtém o endereço da pessoa.
     * 
     * @return endereço da pessoa
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço da pessoa.
     * 
     * @param endereco novo endereço da pessoa
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
