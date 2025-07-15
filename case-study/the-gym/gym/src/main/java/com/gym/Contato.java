package com.gym;


/**
 * Representa um contato de uma pessoa ou entidade, contendo o tipo do contato e o conteúdo.
 * Exemplo de tipos podem ser telefone, email, celular, etc.
 */
public class Contato {

    /** Tipo do contato (ex: telefone, email, etc). */
    private TipoContato tipo;

    /** Conteúdo do contato (ex: número de telefone, endereço de email). */
    private String conteudo;

    /**
     * Construtor que cria um contato com o tipo e o conteúdo especificados.
     * 
     * @param tipo tipo do contato (ex: telefone, email)
     * @param conteudo conteúdo do contato (ex: número ou endereço)
     */
    public Contato(TipoContato tipo, String conteudo) {
        this.tipo = tipo;
        this.conteudo = conteudo;
    }

    /**
     * Obtém o tipo do contato.
     * 
     * @return tipo do contato
     */
    public TipoContato getTipo() {
        return tipo;
    }

    /**
     * Define o tipo do contato.
     * 
     * @param tipo tipo do contato
     */
    public void setTipo(TipoContato tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtém o conteúdo do contato.
     * 
     * @return conteúdo do contato
     */
    public String getConteudo() {
        return conteudo;
    }

    /**
     * Define o conteúdo do contato.
     * 
     * @param conteudo conteúdo do contato
     */
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}
