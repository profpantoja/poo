package com.gym;


/**
 * Representa um funcionário, que é uma extensão da classe Pessoa,
 * incluindo informações de contato, turno, salário, cargo, CTPS e endereço.
 */
public class Funcionario extends Pessoa {

    /** Telefone do funcionário. */
    private String telefone;

    /** Email do funcionário. */
    private String email;

    /** Turno de trabalho do funcionário. */
    private String turno;

    /** Salário do funcionário. */
    private String salario;

    /** Cargo ocupado pelo funcionário. */
    private String cargo;

    /** Carteira de Trabalho e Previdência Social (CTPS) do funcionário. */
    private String ctps;

    /** Endereço do funcionário. */
    private Endereco endereco;

    /**
     * Construtor que cria um funcionário com todos os atributos especificados.
     * 
     * @param nome nome do funcionário (herdado de Pessoa)
     * @param documento documento do funcionário (herdado de Pessoa)
     * @param telefone telefone de contato
     * @param email email de contato
     * @param turno turno de trabalho
     * @param salario salário
     * @param cargo cargo ocupado
     * @param ctps carteira de trabalho
     * @param endereco endereço residencial
     */
    public Funcionario(String nome, Documento documento, String telefone, String email,
                       String turno, String salario, String cargo, String ctps, Endereco endereco) {
        super(nome, documento);
        this.telefone = telefone;
        this.email = email;
        this.turno = turno;
        this.salario = salario;
        this.cargo = cargo;
        this.ctps = ctps;
        this.endereco = endereco;
    }

    /**
     * Obtém o telefone do funcionário.
     * @return telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o telefone do funcionário.
     * @param telefone telefone a ser definido
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Obtém o email do funcionário.
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o email do funcionário.
     * @param email email a ser definido
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtém o turno de trabalho do funcionário.
     * @return turno
     */
    public String getTurno() {
        return turno;
    }

    /**
     * Define o turno de trabalho do funcionário.
     * @param turno turno a ser definido
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }

    /**
     * Obtém o salário do funcionário.
     * @return salário
     */
    public String getSalario() {
        return salario;
    }

    /**
     * Define o salário do funcionário.
     * @param salario salário a ser definido
     */
    public void setSalario(String salario) {
        this.salario = salario;
    }

    /**
     * Obtém o cargo do funcionário.
     * @return cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Define o cargo do funcionário.
     * @param cargo cargo a ser definido
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Obtém a CTPS do funcionário.
     * @return CTPS
     */
    public String getCtps() {
        return ctps;
    }

    /**
     * Define a CTPS do funcionário.
     * @param ctps CTPS a ser definida
     */
    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    /**
     * Obtém o endereço do funcionário.
     * @return endereço
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço do funcionário.
     * @param endereco endereço a ser definido
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
