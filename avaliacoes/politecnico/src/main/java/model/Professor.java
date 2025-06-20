/**
* Informa que a classe se encontra no pacote model
*/
package model;

/**
* Representa uma classe professor que herda atributos da classe {@link Pessoa}
*/
public class Professor extends Pessoa {
/**
* Número identificador único do professor
*/
    private int id;
/**
* Salário do professor
*/
    private Double salario;
/**
* Contrato do professor
*/
    private int contrato;
/**
* Politécnico  associado ao professor
*/
    private Politecnico politecnico;

/**
* Construtor sem salário
* @param nome Nome do professor
* @param apelido Apelido do professor
* @param numeroFiscal Número fiscal do professor
* @param id Número de identificação do professor
* @param contrato Contrato do professor
*/
    public Professor(String nome, String apelido, String numeroFiscal, int id, int contrato, Politecnico politecnico) {
        super(nome, apelido, numeroFiscal);
        this.id = id;
        this.contrato = contrato;
        this.politecnico = politecnico;
    }

/**
* Construtor completo da classe Professor
* @param nome Nome do professor
* @param apelido Apelido do professor
* @param numeroFiscal Número fiscal do professor
* @param id Número de identificação do professor
* @param salario Salario do professor
* @param contrato Contrato do professor
*/
    public Professor(String nome, String apelido, String numeroFiscal, int id, Double salario, int contrato, Politecnico politecnico) {
        super(nome, apelido, numeroFiscal);
        this.id = id;
        this.salario = salario;
        this.contrato = contrato;
        this.politecnico = politecnico;
    }

/**
* Método que retorna o número de identificação do professor
* @return id
*/
    public int getId() {
        return id;
    }

/**
* Método que define o número de identificação do professor
* @param id Novo número de identificação do professor
*/
    public void setId(int id) {
        this.id = id;
    }

/**
* Método que retorna o salário do professor
* @return salario
*/
    public Double getSalario() {
        return salario;
    }

/**
* Método que define o salário do professor
* @param salario Novo salario do professor 
*/
    public void setSalario(Double salario) {
        this.salario = salario;
    }

/**
*  Método que retorna o contrato do professor
* @return contrato
*/
    public int getContrato() {
        return contrato;
    }

/**
* Método que define o contrato do professor
* @param contrato Novo contrato do professor 
*/
    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

/**
* Método que retorna o politécnico  do professor
* @return poltecnico
*/
    public Politecnico getPolitecnico() {
        return politecnico;
    }

/**
* Método que define o politécnico do professor
* @param politécnico Novo politécnico do professor 
*/
    public void setPolitecnico(Politecnico politecnico) {
        this.politecnico = politecnico;
    }

/**
* Método que imprime as informações do professor
*/
    public void imprimirPessoa(){
        System.out.println("Professor [Nome: " + getNome() + ", Apelido: " + getApelido() + ", NumeroFiscal: " + getNumeroFiscal() + ", ID: " + this.id + ", Salario: " + this.salario + "]");
    }
    
}