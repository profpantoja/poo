package com.gym;

/**
 * Representa uma pessoa genérica no sistema, com nome e documento de identificação.
 * 
 * Essa classe pode ser utilizada como superclasse para entidades que representam pessoas,
 * como funcionários, alunos, treinadores, entre outros.
 */
public class Pessoa {

    /** Nome completo da pessoa. */
    private String nome;

    /** Documento de identificação da pessoa (CPF, RG, CNH, etc). */
    private Documento documento;

    /**
     * Construtor que inicializa uma nova pessoa com nome e documento.
     * 
     * @param nome Nome completo da pessoa.
     * @param documento Documento de identificação da pessoa.
     */
    public Pessoa(String nome, Documento documento) {
        this.nome = nome;
        this.documento = documento;
    }

    /**
     * Obtém o nome da pessoa.
     * 
     * @return Nome completo da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da pessoa.
     * 
     * @param nome Novo nome para a pessoa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o documento de identificação da pessoa.
     * 
     * @return Documento da pessoa.
     */
    public Documento getDocumento() {
        return documento;
    }

    /**
     * Define o documento de identificação da pessoa.
     * 
     * @param documento Novo documento da pessoa.
     */
    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

}

