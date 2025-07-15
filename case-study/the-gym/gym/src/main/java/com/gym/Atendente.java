package com.gym;


/**
 * Representa um atendente, que é um tipo específico de funcionário,
 * possuindo um número de guichê associado.
 */
public class Atendente extends Funcionario {

    /** Número do guichê do atendente. */
    private int guiche;

    /**
     * Construtor para criar um atendente com todas as informações necessárias,
     * incluindo os dados herdados da classe Funcionário e o número do guichê.
     *
     * @param nome nome do atendente
     * @param documento documento do atendente
     * @param telefone telefone do atendente
     * @param email e-mail do atendente
     * @param turno turno de trabalho do atendente
     * @param salario salário do atendente
     * @param cargo cargo do atendente
     * @param ctps carteira de trabalho do atendente
     * @param endereco endereço do atendente
     * @param guiche número do guichê do atendente
     */
    public Atendente(String nome, Documento documento, String telefone, String email,
                     String turno, String salario, String cargo, String ctps, Endereco endereco, int guiche) {
        super(nome, documento, telefone, email, turno, salario, cargo, ctps, endereco);
        this.guiche = guiche;
    }

    /**
     * Obtém o número do guichê do atendente.
     * 
     * @return número do guichê
     */
    public int getGuiche() {
        return guiche;
    }

    /**
     * Define o número do guichê do atendente.
     * 
     * @param guiche novo número do guichê
     */
    public void setGuiche(int guiche) {
        this.guiche = guiche;
    }
}

