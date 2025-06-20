/**
* Informa que a classe está no pacote model
*/
package model;

/**
* Importa a biblioteca ArrayList
*/
import java.util.ArrayList;

/**
* Representa uma disciplina no sistema contendo informações como nome, ch (carga horária), período e pré-requisitos
*/
public class Disciplina {

/**
* Nome da disciplina
*/
    private String nome;
/**
* Carga Horária em horas
*/
    private int ch;
/**
* Período onde a disciplina é aplicada
*/
    private int periodo;
/**
* Lista de disciplinas que são pré-requisitos para está disciplina
*/
    private ArrayList<Disciplina> preRequisitos;

/**
* Construtor da classe com nome, periodo e carga horária
* Inicializa a lista de pré-requisitos como vazia
* @param nome Nome da disciplina
* @param periodo Periodo da disciplina
* @param ch Carga horária
*/
    public Disciplina(String nome, int periodo, int ch) {
        this.nome = nome;
        this.periodo = periodo;
        this.ch = ch;
        this.preRequisitos = new ArrayList<Disciplina>();
    }

/**
* Construtor completo da classe Disciplina
* @param nome Nome da disciplina
* @param periodo Periodo da disciplina
* @param ch Carga horária
* @param preRequisitos Disciplina que é pré-requesito para cursar está disciplina 

*/
    public Disciplina(String nome, int ch, int periodo, ArrayList<Disciplina> preRequisitos) {
        this.nome = nome;
        this.ch = ch;
        this.periodo = periodo;
        this.preRequisitos = preRequisitos;
    }

/**
* Método que retorna o  nome da disciplina
* @return nome
*/
    public String getNome() {
        return nome;
    }

/**
* Método que define o nome da disciplina
* @param nome Nome da disciplina
*/
    public void setNome(String nome) {
        this.nome = nome;
    }

/**
* * Método que retorna a carga horária da disciplina
* @return ch
*/
    public int getCh() {
        return ch;
    }

/**
* * Método que define a carga horária da disciplina
* @param ch Carga horária da disciplina 
*/
    public void setCh(int ch) {
        this.ch = ch;
    }

/**
* * Método que retorna o  período da disciplina
* @return periodo
*/
    public int getPeriodo() {
        return periodo;
    }

/**
* * Método que define o periodo da disciplina
* @param periodo Periodo da disciplina
*/
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

/**
* * Método que retorna o pré-requisito da disciplina
* @return preRequisitos
*/
    public ArrayList<Disciplina> getPreRequisitos() {
        return preRequisitos;
    }

/**
* * Método que define o pré-requisito da disciplina
* @param preRequisitos Lista de pré-requisito da disciplina
*/
    public void setPreRequisitos(ArrayList<Disciplina> preRequisitos) {
        this.preRequisitos = preRequisitos;
    }

/**
* Método adiciona uma nova disciplina à lista de pré-requisitos
 * @param disciplina Disciplina a ser adicionada como pré-requisito
*/
    public void addPreReq(Disciplina disciplina) {
        this.preRequisitos.add(disciplina);
    }

/**
* Imprime as informações da disciplina e seus pré-requisitos
*/
    public void imprimirRequisitos() {
        System.out.println("Disciplina [Nome: " + this.nome + ", CH: " + this.ch + ", Periodo: " + this.periodo + "]");
        for (Disciplina prereq : preRequisitos) {
            System.out.println("Pré-requisitos:");
            prereq.imprimirRequisitos();
        }
    }

}

