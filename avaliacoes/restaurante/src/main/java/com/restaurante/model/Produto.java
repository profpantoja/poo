package com.restaurante.model;

/**
 * Representa um produto do restaurante, com nome, valor base,
 * percentual de lucro e valor do IVA (Imposto sobre Valor Agregado).
 * 
 * O valor do produto pode ser ajustado com base no lucro e no IVA.
 */
public class Produto {
    
    /** Nome do produto. */
    private String nome;
    
    /** Valor base do produto (antes de impostos e lucro). */
    private float valorProd;

    /** Percentual de lucro aplicado sobre o valor base (ex: 5%). */
    private int lucro = 5;
    
    /** Valor do IVA aplicado sobre o valor base (ex: 1.23 corresponde a 23%). */
    private float iva = 1.23f;

    /**
     * Construtor para criar produto com nome e valor base.
     * Usa valores padrão para lucro (5%) e IVA (1.23).
     * 
     * @param nome nome do produto
     * @param valorProd valor base do produto
     */
    public Produto(String nome, float valorProd) {
        this.nome = nome;
        this.valorProd = valorProd;
    }

    /**
     * Construtor completo para criar produto com todos os parâmetros.
     * 
     * @param nome nome do produto
     * @param valorProd valor base do produto
     * @param lucro percentual de lucro aplicado
     * @param iva valor do IVA aplicado
     */
    public Produto(String nome, float valorProd, int lucro, float iva) {
        this.nome = nome;
        this.valorProd = valorProd;
        this.lucro = lucro;
        this.iva = iva;
    }

    /**
     * Obtém o nome do produto.
     * 
     * @return nome do produto
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do produto.
     * 
     * @param nome novo nome do produto
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o valor base do produto.
     * 
     * @return valor base do produto
     */
    public float getValorProd() {
        return valorProd;
    }

    /**
     * Define o valor base do produto.
     * 
     * @param valorProd novo valor base do produto
     */
    public void setValorProd(float valorProd) {
        this.valorProd = valorProd;
    }

    /**
     * Obtém o valor do IVA aplicado ao produto.
     * 
     * @return valor do IVA
     */
    public float getIva() {
        return iva;
    }

    /**
     * Define o valor do IVA aplicado ao produto.
     * 
     * @param iva novo valor do IVA
     */
    public void setIva(float iva) {
        this.iva = iva;
    }

    /**
     * Obtém o percentual de lucro aplicado ao produto.
     * 
     * @return percentual de lucro
     */
    public int getLucro() {
        return lucro;
    }

    /**
     * Define o percentual de lucro aplicado ao produto.
     * 
     * @param lucro novo percentual de lucro
     */
    public void setLucro(int lucro) {
        this.lucro = lucro;
    }
}
