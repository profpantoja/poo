package com.gym;


import java.util.List;

/**
 * Representa um aluno com dados pessoais, planos, endereço,
 * contatos e documentos associados.
 */
public class Aluno {
    
    /** Matrícula do aluno. */
    private int matricula;
    
    /** Nome completo do aluno. */
    private String nome;
    
    /** Data de nascimento do aluno no formato String. */
    private String dataNasc;
    
    /** Email do aluno. */
    private String email;
    
    /** Plano associado ao aluno. */
    private Plano plano;
    
    /** Endereço residencial do aluno. */
    private Endereco endereco;
    
    /** Lista de contatos do aluno (telefone, celular, etc). */
    private List<Contato> contatos;
    
    /** Documento do aluno (RG, CPF, etc). */
    private Documento documento;

    /**
     * Construtor para criar um objeto Aluno com todos os atributos.
     * 
     * @param matricula matrícula do aluno
     * @param nome nome completo do aluno
     * @param documento documento do aluno
     * @param dataNasc data de nascimento do aluno
     * @param email email do aluno
     * @param endereco endereço residencial do aluno
     * @param plano plano associado ao aluno
     * @param contatos lista de contatos do aluno
     */
    public Aluno(int matricula, String nome, Documento documento, String dataNasc, String email, Endereco endereco,
                 Plano plano, List<Contato> contatos) {
        this.matricula = matricula;
        this.nome = nome;
        this.documento = documento;
        this.dataNasc = dataNasc;
        this.email = email;
        this.endereco = endereco;
        this.plano = plano;
        this.contatos = contatos;
    }

    /**
     * Obtém a matrícula do aluno.
     * 
     * @return matrícula do aluno
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * Define a matrícula do aluno.
     * 
     * @param matricula nova matrícula
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * Obtém o nome completo do aluno.
     * 
     * @return nome do aluno
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome completo do aluno.
     * 
     * @param nome novo nome do aluno
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a data de nascimento do aluno.
     * 
     * @return data de nascimento do aluno
     */
    public String getDataNasc() {
        return dataNasc;
    }

    /**
     * Define a data de nascimento do aluno.
     * 
     * @param dataNasc nova data de nascimento
     */
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    /**
     * Obtém o email do aluno.
     * 
     * @return email do aluno
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o email do aluno.
     * 
     * @param email novo email do aluno
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtém o plano associado ao aluno.
     * 
     * @return plano do aluno
     */
    public Plano getPlano() {
        return plano;
    }

    /**
     * Define o plano associado ao aluno.
     * 
     * @param plano novo plano do aluno
     */
    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    /**
     * Obtém o endereço residencial do aluno.
     * 
     * @return endereço do aluno
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço residencial do aluno.
     * 
     * @param endereco novo endereço do aluno
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * Obtém a lista de contatos do aluno.
     * 
     * @return lista de contatos
     */
    public List<Contato> getContatos() {
        return contatos;
    }

    /**
     * Define a lista de contatos do aluno.
     * 
     * @param contatos nova lista de contatos
     */
    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    /**
     * Obtém o documento do aluno.
     * 
     * @return documento do aluno
     */
    public Documento getDocumento() {
        return documento;
    }

    /**
     * Define o documento do aluno.
     * 
     * @param documento novo documento do aluno
     */
    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
}
