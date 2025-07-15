package com.gym;


/**
 * Representa um treinador, que é um tipo especializado de funcionário.
 * 
 * Esta classe estende a classe {@link Funcionario} e adiciona o atributo
 * {@code cref}, que é o registro profissional do treinador.
 */
public class Treinador extends Funcionario {

    /** Registro profissional do treinador (CREF). */
    private String cref;

    /**
     * Construtor para criar um treinador com seus dados completos.
     * 
     * @param nome     Nome do treinador
     * @param documento Documento pessoal do treinador
     * @param telefone Telefone de contato
     * @param email    Email de contato
     * @param turno    Turno de trabalho
     * @param salario  Salário do treinador
     * @param cargo    Cargo ocupado
     * @param ctps     Carteira de Trabalho e Previdência Social
     * @param endereco Endereço residencial
     * @param cref     Registro profissional do treinador (CREF)
     */
    public Treinador(String nome, Documento documento, String telefone, String email,
                     String turno, String salario, String cargo, String ctps, Endereco endereco, String cref) {
        super(nome, documento, telefone, email, turno, salario, cargo, ctps, endereco);
        this.cref = cref;
    }

    /**
     * Obtém o registro profissional (CREF) do treinador.
     * 
     * @return o número do CREF
     */
    public String getCref() {
        return cref;
    }

    /**
     * Define o registro profissional (CREF) do treinador.
     * 
     * @param cref o número do CREF a ser definido
     */
    public void setCref(String cref) {
        this.cref = cref;
    }
}

