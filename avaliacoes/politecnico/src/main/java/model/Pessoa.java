/**
* Informa que a classe está no pacote model
*/
package model;

/**
* Representa uma pessoa genérica do sistema, contendo informações básicas
* como nome, apelido e número fiscal
 * 
 * Esta classe é abstrata e deve ser estendida por classes concretas como {@code Aluno}.
 */
public abstract class Pessoa {

/**
* Nome da pessoa
*/
    private String nome;
/**
* Apelido da pessoa
*/
    private String apelido;
/**
* Número Fiscal da pessoa
*/
    private String numeroFiscal;

/**
* Construtor completo da classe Pessoa
*/
    public Pessoa(String nome, String apelido, String numeroFiscal) {
        this.nome = nome;
        this.apelido = apelido;
        this.numeroFiscal = numeroFiscal;
    }

/**
* Método que retorna nome da pessoa
* @return nome
*/
    public String getNome() {
        return nome;
    }

/**
* Método que define o nome da pessoa
* @param nome Novo nome da pessoa
*/
    public void setNome(String nome) {
        this.nome = nome;
    }

/**
* Método que retorna o apelido da pessoa
* @return apelido
*/
    public String getApelido() {
        return apelido;
    }

/**
* Método que define o apelido da pessoa
* @param apelido Novo apelido da pessoa
*/
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

/**
* * Método que retorna o número fiscal da pessoa
* @return numeroFiscal
*/
    public String getNumeroFiscal() {
        return numeroFiscal;
    }

/**
* Método que define o número fiscal da pessoa
* @param numeroFiscal Novo número fiscal da pessoa
*/
    public void setNumeroFiscal(String numeroFiscal) {
        this.numeroFiscal = numeroFiscal;
    }
    
/**
* Método abstrato para imprimir informações da pessoa
* Deve ser implementado pelas subclasses
*/
    public abstract void imprimirPessoa();

}