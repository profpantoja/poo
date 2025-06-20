/**
* Informa que a classe está no pacote model
*/
package model;

/**
* Representa um curso em um sistema contendo informações como nome e portaria
*/
public class Curso {

/**
* Nome do curso
*/
    private String nome;

/**
* Portaria do curso
*/
    private String portaria;

/**
* Construtor completo da classe Curso
* @param nome
* @param portaria
*/
    public Curso(String nome, String portaria) {
        this.nome = nome;
        this.portaria = portaria;
    }

/**
* Método que retorna o nome do curso
* @return nome
*/
    public String getNome() {
        return nome;
    }

/**
* Método que define o nome do curso
* @param nome
*/
    public void setNome(String nome) {
        this.nome = nome;
    }

/**
* Método que retorna a portaria do curso
* @return portaria
*/
    public String getPortaria() {
        return portaria;
    }

/**
* Método que define a portaria do curso
* @return portaria
*/
    public void setPortaria(String portaria) {
        this.portaria = portaria;
    }

/**
* Método que imprime as informações do curso
*/
    public void imprimirInfo(){
        System.out.println("Curso [Nome: " + nome + " Portaria: " + portaria + "]");
    }
}

