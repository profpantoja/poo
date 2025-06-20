/**
* Informa que a classe está no pacote model
*/
package model;

/**
* Importa a biblioteca ArrayList
*/
import java.util.ArrayList;

/**
* Representa uma instituição
*/
public class Politecnico {
/**
* Nome da instituição
*/
    private String nome;
/**
* URL do site
*/
    private String url;
/**
* Lista de cursos do Politecnico
*/
    private ArrayList<Curso> cursos;
    
/**
* Construtor completo da classe
* @param nome Nome da instituição
* @param url URL do site do Politécnico
* @param  cursos Lista de cursos oferecidos 
*/
    public Politecnico(String nome, String url, ArrayList<Curso> cursos) {
        this.nome = nome;
        this.url = url;
        this.cursos = new ArrayList<Curso>();
    }

/**
* Método que retorna o nome da instituição
* @return nome
*/
    public String getNome() {
        return nome;
    }

/**
* Método que define o nome da instituição
*@param nome Novo nome da instituição
*/
    public void setNome(String nome) {
        this.nome = nome;
    }

/**
* Método que retorna a URL da instituição
* @return url
*/
    public String getUrl() {
        return url;
    }

/**
* Método que define a URL da instituição
*@param url Nova URL da instituição
*/
    public void setUrl(String url) {
        this.url = url;
    }

/**
* Método que retorna a lista de cursos da instituição
* @return cursos
*/
    public ArrayList<Curso> getCursos() {
        return cursos;
    }

/**
* Método que define a lista de cursos da instituição
*@param cursos Nova lista de cursos da instituição
*/
    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
    
/**
* Método que imprime as informações do politecnico e dos cursos
*/
    public void imprimirCursos(){
        System.out.println("Politecnico [Nome: " + nome + ", URL: " + url + "]");
        for (Curso cursin : cursos) {
            cursin.imprimirInfo();
        }
    }
}

