/**
* Informa que a classe está no pacote model
*/
package model;

/**
* Importa a biblioteca ArrayList
*/
import java.util.ArrayList;

/**
* Representa a classe grade no sistema escolar, contendo informações como: ano, carga horária total, disciplinas e curso
*/
public class Grade {
/**
* Ano da grade curricular
*/
    private int ano;
/**
* Carga horária total em horas
*/
    private int chTotal;
/**
* Lista de disciplinas da grade
*/
    private ArrayList<Disciplina> disciplinas;
/**
* Curso associado à grade
*/
    private Curso curso;

/**
* Construtor da classe sem a carga horária total
* @param ano Ano da grade em andamento
* @param curso Curso associado à grade
* @param disciplinas Lista de disciplinas da grade
*/
    public Grade(int ano, Curso curso, ArrayList<Disciplina> disciplinas) {
        this.ano = ano;
        this.curso = curso;
        this.disciplinas = disciplinas;
    }

/**
* Construtor completo da classe Grade 
* @param ano Ano da grade em andamento
* @param chTotal Carga horária total
* @param disciplinas Lista de disciplinas da grade
* @param curso Curso associado à grade
*/
    public Grade(int ano, int chTotal, ArrayList<Disciplina> disciplinas, Curso curso) {
        this.ano = ano;
        this.chTotal = chTotal;
        this.disciplinas = new ArrayList<Disciplina>();
        this.curso = curso;
    }

/**
* Método que retorna o ano da grade 
* @return ano Ano da grade
*/
    public int getAno() {
        return ano;
    }

/**
* Método que define o ano da grade
* @param ano Novo ano da grade
*/
    public void setAno(int ano) {
        this.ano = ano;
    }

/**
*  Método que retorna a carga horária total da grade 
* @return chTotal Carga horária total da grade
*/
    public int getChTotal() {
        return chTotal;
    }

/**
*  Método que define a carga horária da grade
* @param chTotal Nova carga horária total da grade
*/
    public void setChTotal(int chTotal) {
        this.chTotal = chTotal;
    }

/**
 * Método que retorna a disciplina da grade 
* @return disciplina Disciplina da grade
*/
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

/**
 * Método que define a disciplina da grade
* @param disciplina Nova disciplina da grade
*/
    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

/**
* Método que adiciona uma disciplina à lista de disciplinas
*@param disciplina Disciplina a ser adicionada
*/
    public void addDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

/**
* Método que retorna um curso da grade
* @return curso Curso da grade
*/
    public Curso getCurso() {
        return curso;
    }

/**
* Método que define um curso da grade
* @param curso Novo curso da grade
*/
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

/**
* Método para imprimir as informações da grade
*/
    public void imprimirGrade(Grade grade){
       System.out.println("Ano: " + ano + ", chTotal: " + chTotal);
       this.curso.imprimirInfo();
       for (Disciplina disciplina : disciplinas) {
        disciplina.imprimirRequisitos();
       }
    }
}

