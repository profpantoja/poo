package com.restaurante.model;

import java.util.List;

/**
 * Representa um funcionário do restaurante, que é uma especialização de {@link Pessoa}.
 * 
 * Além dos atributos herdados de Pessoa (nome, cpf, endereço),
 * o funcionário possui carteira de trabalho (CTP), cargo e uma lista de mesas que ele atende.
 * 
 * @see Pessoa
 * 
 */
public class Funcionario extends Pessoa {
    
    /** Número da Carteira de Trabalho e Previdência Social do funcionário. */
    private String ctp;
    
    /** Cargo ocupado pelo funcionário. */
    private String cargo;
    
    /** Lista de mesas atribuídas ao funcionário. */
    private List<Mesa> mesas;

    /**
     * Construtor para criar um funcionário com nome, CPF, endereço, CTP, cargo e lista de mesas.
     * 
     * @param nome nome do funcionário
     * @param cpf CPF do funcionário
     * @param endereco endereço do funcionário
     * @param ctp número da carteira de trabalho
     * @param cargo cargo do funcionário
     * @param mesas lista de mesas que o funcionário atende
     */
    public Funcionario(String nome, String cpf, Endereco endereco, String ctp, String cargo, List<Mesa> mesas) {
        super(nome, cpf, endereco);
        this.ctp = ctp;
        this.cargo = cargo;
        this.mesas = mesas;
    }

    /**
     * Obtém o número da carteira de trabalho do funcionário.
     * 
     * @return número da CTP
     */
    public String getCtp() {
        return ctp;
    }

    /**
     * Define o número da carteira de trabalho do funcionário.
     * 
     * @param ctp novo número da CTP
     */
    public void setCtp(String ctp) {
        this.ctp = ctp;
    }

    /**
     * Obtém o cargo do funcionário.
     * 
     * @return cargo do funcionário
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Define o cargo do funcionário.
     * 
     * @param cargo novo cargo do funcionário
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Obtém a lista de mesas que o funcionário atende.
     * 
     * @return lista de mesas
     */
    public List<Mesa> getMesas() {
        return mesas;
    }

    /**
     * Define a lista de mesas que o funcionário atende.
     * 
     * @param mesas nova lista de mesas
     */
    public void setMesas(List<Mesa> mesas) {
        this.mesas = mesas;
    }
}
