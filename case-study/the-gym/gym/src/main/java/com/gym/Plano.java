package com.gym;

/**
 * Representa um plano de matrícula ou assinatura para um aluno.
 * Contém informações sobre tipo do plano, valor, datas importantes e forma de pagamento.
 */
public class Plano {

    /** Tipo do plano (ex: Mensal, Anual). */
    private String tipo;

    /** Valor do plano. */
    private float valor;

    /** Data de vencimento do plano. */
    private String dataVencimento;

    /** Data da matrícula do aluno no plano. */
    private String dataMatricula;

    /** Forma de pagamento utilizada (ex: Cartão, Dinheiro). */
    private String formaPagamento;

    /**
     * Construtor que inicializa o plano com seus dados principais.
     * 
     * @param tipo Tipo do plano.
     * @param valor Valor do plano.
     * @param dataVencimento Data de vencimento do plano.
     * @param dataMatricula Data da matrícula do aluno no plano.
     * @param formaPagamento Forma de pagamento utilizada.
     */
    public Plano(String tipo, float valor, String dataVencimento, String dataMatricula, String formaPagamento) {
        this.tipo = tipo;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.dataMatricula = dataMatricula;
        this.formaPagamento = formaPagamento;
    }

    /**
     * Obtém o tipo do plano.
     * 
     * @return Tipo do plano.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o tipo do plano.
     * 
     * @param tipo Novo tipo do plano.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtém o valor do plano.
     * 
     * @return Valor do plano.
     */
    public float getValor() {
        return valor;
    }

    /**
     * Define o valor do plano.
     * 
     * @param valor Novo valor do plano.
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * Obtém a data de vencimento do plano.
     * 
     * @return Data de vencimento do plano.
     */
    public String getDataVencimento() {
        return dataVencimento;
    }

    /**
     * Define a data de vencimento do plano.
     * 
     * @param dataVencimento Nova data de vencimento.
     */
    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    /**
     * Obtém a data de matrícula do aluno no plano.
     * 
     * @return Data de matrícula.
     */
    public String getDataMatricula() {
        return dataMatricula;
    }

    /**
     * Define a data de matrícula do aluno no plano.
     * 
     * @param dataMatricula Nova data de matrícula.
     */
    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    /**
     * Obtém a forma de pagamento utilizada no plano.
     * 
     * @return Forma de pagamento.
     */
    public String getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * Define a forma de pagamento do plano.
     * 
     * @param formaPagamento Nova forma de pagamento.
     */
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}

