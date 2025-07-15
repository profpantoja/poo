package com.gym;


/**
 * Representa um documento de identificação com tipo e conteúdo.
 * Exemplos de tipos podem ser CPF, RG, CNH, etc.
 */
public class Documento {

    /** Tipo do documento (ex: CPF, RG, CNH). */
    private TipoDoc tipo;

    /** Conteúdo do documento (ex: número do documento). */
    private String conteudo;

    /**
     * Construtor que cria um documento com tipo e conteúdo especificados.
     * 
     * @param tipo tipo do documento
     * @param conteudo conteúdo do documento
     */
    public Documento(TipoDoc tipo, String conteudo) {
        this.tipo = tipo;
        this.conteudo = conteudo;
    }

    /**
     * Obtém o tipo do documento.
     * 
     * @return tipo do documento
     */
    public TipoDoc getTipo() {
        return tipo;
    }

    /**
     * Define o tipo do documento.
     * 
     * @param tipo tipo do documento
     */
    public void setTipo(TipoDoc tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtém o conteúdo do documento.
     * 
     * @return conteúdo do documento
     */
    public String getConteudo() {
        return conteudo;
    }

    /**
     * Define o conteúdo do documento.
     * 
     * @param conteudo conteúdo do documento
     */
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}

