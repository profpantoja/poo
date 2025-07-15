package com.gym;

/**
 * Representa uma assinatura que vincula um aluno a um plano,
 * com datas de início e término do contrato.
 */
public class Assinatura {
    
    /** Plano associado à assinatura. */
    private Plano plano;
    
    /** Aluno associado à assinatura. */
    private Aluno aluno;
    
    /** Data de início do contrato no formato String. */
    private String dataContrato;
    
    /** Data final do contrato no formato String. */
    private String dataFinal;

    /**
     * Construtor para criar uma assinatura com todos os atributos.
     * 
     * @param plano plano associado à assinatura
     * @param aluno aluno vinculado à assinatura
     * @param dataContrato data de início do contrato
     * @param dataFinal data de término do contrato
     */
    public Assinatura(Plano plano, Aluno aluno, String dataContrato, String dataFinal) {
        this.plano = plano;
        this.aluno = aluno;
        this.dataContrato = dataContrato;
        this.dataFinal = dataFinal;
    }

    /**
     * Obtém o plano associado à assinatura.
     * 
     * @return plano da assinatura
     */
    public Plano getPlano() {
        return plano;
    }

    /**
     * Define o plano associado à assinatura.
     * 
     * @param plano novo plano da assinatura
     */
    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    /**
     * Obtém o aluno associado à assinatura.
     * 
     * @return aluno da assinatura
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * Define o aluno associado à assinatura.
     * 
     * @param aluno novo aluno da assinatura
     */
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    /**
     * Obtém a data de início do contrato.
     * 
     * @return data de início do contrato
     */
    public String getDataContrato() {
        return dataContrato;
    }

    /**
     * Define a data de início do contrato.
     * 
     * @param dataContrato nova data de início
     */
    public void setDataContrato(String dataContrato) {
        this.dataContrato = dataContrato;
    }

    /**
     * Obtém a data final do contrato.
     * 
     * @return data final do contrato
     */
    public String getDataFinal() {
        return dataFinal;
    }

    /**
     * Define a data final do contrato.
     * 
     * @param dataFinal nova data final
     */
    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }
}

