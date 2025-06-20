/**
* Classe presente no pacote model
*/
package model;

/**
* Importação da biblioteca ArrayList
*/
import java.util.ArrayList;
/** 
* Importação da interface Conclusao
*/
import model.interfaces.Conclusao;

/**
* Representa um aluno que herda características da classe Pessoa e que implementa a interface Conclusao
*/
public class Aluno extends Pessoa implements Conclusao {

/**
* Numero de matricula do aluno
*/
   private int matricula;


/**
* Lista de apontamentos que representa o histórico acadêmico do aluno
*/
   private ArrayList<Apontamento> historico;


/**
* Grade escolar associada ao aluno
*/
   private Grade grade;



/**
* Construtor da classe aluno
* @param nome Nome do aluno
* @param apelido Apelido do aluno
* @param numeroFiscal Numero de identificação fiscal do aluno
* @param matricula Numero de matricula do aluno
* @param grade Grade associada ao aluno
* @param apontamentos Apontamenotos do histórico do aluno
*/
   public Aluno(String nome, String apelido, String numeroFiscal, int matricula, Grade grade, ArrayList<Apontamento> apontamentos) {
       super(nome, apelido, numeroFiscal);
       this.matricula = matricula;
       this.grade = grade;
       this.historico = apontamentos;
   }

/**
* Construtor com o histórico vazio
* @param Nome
* @param apelido Apelido do aluno
* @param numeroFiscal Numero de identificação fiscal do aluno
* @param matricula Numero de matricula do aluno
* @param grade Grade associada ao aluno
* @param historico Historico
*/
   public Aluno(String nome, String apelido, String numeroFiscal, int matricula, ArrayList<Apontamento> historico,
           Grade grade) {
       super(nome, apelido, numeroFiscal);
       this.matricula = matricula;
       this.historico = new ArrayList<Apontamento>();
       this.grade = grade;
   }

  /**
     * Método que retorna o número de matrícula do aluno.
     * @return matrícula
     */
   public int getMatricula() {
       return matricula;
   }

/**
* Método que define o número de matrícula do aluno
*@param matricula Número de matricula do aluno
*/
   public void setMatricula(int matricula) {
       this.matricula = matricula;
   }

/**
* Método que retorna os apontamentos do histórico escolar
*@return historico
*/
   public ArrayList<Apontamento> getHistorico() {
       return historico;
   }



/**
* Método que define um apontamento no histórico
* @param historico Lista de apontamentos
*/
   public void setHistorico(ArrayList<Apontamento> historico) {
       this.historico = historico;
   }



/**
* Método que retorna a grade associada ao aluno
* @return grade
*/
   public Grade getGrade() {
       return grade;
   }



/**
* Método que define a grade
* @param grade Grade associada ao aluno
*/
   public void setGrade(Grade grade) {
       this.grade = grade;
   }



/**
* Método que adiciona um apontamento ao histórico
@param apontamento Apontamento do histórico
*/
   public void addHistorico(Apontamento apontamento) {
       this.historico.add(apontamento);
   }



/**
* Método que imprime os dados do aluno, o histórico e sua grade
*/
   public void imprimirHistorico() {
       System.out.println("Aluno [Nome: " + getNome() + ", Apelido: " + getApelido() + ", Numero Fiscal: "
               + getNumeroFiscal() + ", Matricula: " + matricula + "]");
       System.out.println("----------- Grade -----------");
       this.grade.imprimirGrade(grade);
       System.out.println("----------- Histórico -----------");
       for (Apontamento historicos : historico) {
           historicos.imprimirRegistro();
       }
   }

    /**
     * Verifica se o aluno integralizou todas as disciplinas da grade
     * @return {@code true} se todas as disciplinas foram cursadas, caso contrário {@code false}.
     */


   @Override
   public boolean estaIntegralizado() {
       if (this.grade.getDisciplinas().size() > this.historico.size()) {
           return false;
       }



       int contador = 0;
       for (Apontamento apontamento : this.historico) {
           for (Disciplina disciplina : this.grade.getDisciplinas()) {
               if (disciplina.getNome() == apontamento.getDisciplina().getNome()) {
                   contador++;
               }
           }
       }



       if (contador >= this.getGrade().getDisciplinas().size()) {
           return true;
       }
       return false;
   }


/**
* Método que retorna a lista de disciplinas que ainda não foram cursadas pelo aluno
* @return disciplinasFaltantes
*/



   @Override
   public ArrayList<Disciplina> getDisciplinasFaltantes() {
       ArrayList<Disciplina> disciplinasFaltantes = new ArrayList<Disciplina>();



       for (Disciplina disciplina : this.grade.getDisciplinas()) {
           boolean cursou = false;



           for (Apontamento apontamento : this.historico) {
               if (apontamento.getDisciplina().getNome() == disciplina.getNome()) {
                   cursou = true;
               }
           }



           if (!cursou) {
               disciplinasFaltantes.add(disciplina);
           }
       }



       return disciplinasFaltantes;
   }



/**
* Método que imprime informações do aluno, como: Nome, apelido, número fiscal e matrícula
*/
   public void imprimirPessoa() {
       System.out.println("Aluno [Nome: " + getNome() + ", Apelido: " + getApelido() + ", NumeroFiscal: "
               + getNumeroFiscal() + ", Matricula: " + this.matricula + "]");
   }
}

