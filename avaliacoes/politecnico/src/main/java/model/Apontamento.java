/**
* Informa que a classe está no pacote model
*/
package model;

/**
* Representa um apontamento no sistema contendo nota, status, data e disciplina
*/
public class Apontamento {
/**
* Nota de avaliação
*/
    private Double nota;
/**
* Status do apontamento
*/
    private String status;
/**
* Data do apontamento
*/
    private String data;
/**
* Disciplina associada ao apontamento
*/
    private Disciplina disciplina;

/**
* Construtor completo da classe Apontamento
* @param nota Nota do apontamento
* @param status Status do apontamento
* @param data Data do apontamento
* @param disciplina Disciplina associada ao apontamento
*/
    public Apontamento(Double nota, String status, String data, Disciplina disciplina) {
        this.nota = nota;
        this.status = status;
        this.data = data;
        this.disciplina = disciplina;
    }

/**
* Método que retorna a nota do apontamento
* @return nota
*/
    public Double getNota() {
        return nota;
    }

/**
* Método que define a nota do apontamento
* @param nota
*/
    public void setNota(Double nota) {
        this.nota = nota;
    }

/**
* Método que retorna o status do apontamento
* @return status
*/
    public String getStatus() {
        return status;
    }

/**
* Método que define o status do apontamento
* @param status
*/
    public void setStatus(String status) {
        this.status = status;
    }

/**
* Método que retorna a data do apontamento
* @return data
*/
    public String getData() {
        return data;
    }

/**
* Método que define a data do apontamento
* @param data
*/
    public void setData(String data) {
        this.data = data;
    }

/**
* Método que retorna a disciplina do apontamento
* @return disciplina
*/
    public Disciplina getDisciplina() {
        return disciplina;
    }

/**
* Método que define a disciplina do apontamento
* @param disciplina
*/
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

/**
* Método que imprime as informações sobre o histórico escolar, incluindo a nota, o status e a data de um apontamento
*/
    public void imprimirRegistro(){
        this.disciplina.imprimirRequisitos();
        System.out.println("Nota: " + nota + " Status: " + status + " Data: " + data);
    }
}

