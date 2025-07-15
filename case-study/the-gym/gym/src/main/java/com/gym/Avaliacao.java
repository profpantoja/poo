package com.gym;


/**
 * Representa uma avaliação física realizada para um aluno,
 * contendo dados como gênero, data, altura, peso, IMC, doenças e o treinador avaliador.
 */
public class Avaliacao {

    /** Gênero do aluno avaliado (ex: 'f' para feminino, 'm' para masculino). */
    private char genero;

    /** Data em que a avaliação foi realizada. */
    private String data;

    /** Altura do aluno em metros. */
    private float altura;

    /** Peso do aluno em quilogramas. */
    private float peso;

    /** Índice de Massa Corporal calculado. */
    private float imc;

    /** Informações sobre doenças do aluno, se houver. */
    private String doencas;

    /** Aluno avaliado. */
    private Aluno aluno;

    /** Treinador responsável pela avaliação. */
    private Treinador avaliador;

    /**
     * Construtor para criar uma avaliação com os dados fornecidos.
     * Calcula automaticamente o IMC baseado na altura e peso.
     * 
     * @param genero gênero do aluno ('f' ou 'm')
     * @param data data da avaliação
     * @param altura altura em metros
     * @param peso peso em kg
     * @param doencas doenças do aluno, se houver
     * @param aluno objeto Aluno avaliado
     * @param avaliador treinador que realizou a avaliação
     */
    public Avaliacao(char genero, String data, float altura, float peso, String doencas, Aluno aluno,
                     Treinador avaliador) {
        this.genero = genero;
        this.data = data;
        this.altura = altura;
        this.peso = peso;
        this.doencas = doencas;
        this.aluno = aluno;
        this.avaliador = avaliador;
        calcularImc();
    }

    /**
     * Calcula o Índice de Massa Corporal (IMC) baseado no peso e altura.
     * Fórmula: peso / (altura * altura)
     */
    void calcularImc() {
        imc = peso / (altura * altura);
    }

    /**
     * Retorna o gênero em forma textual.
     * 
     * @return "Feminino" se gênero for 'f', caso contrário "Masculino"
     */
    String mostrarGenero() {
        if (genero == 'f')  {
            return "Feminino";
        } else {
            return "Masculino";
        }
    }

    /**
     * Obtém o gênero do aluno.
     * 
     * @return caractere representando o gênero ('f' ou 'm')
     */
    public char getGenero() {
        return genero;
    }

    /**
     * Define o gênero do aluno.
     * 
     * @param genero caractere representando o gênero ('f' ou 'm')
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * Obtém a data da avaliação.
     * 
     * @return data da avaliação no formato String
     */
    public String getData() {
        return data;
    }

    /**
     * Define a data da avaliação.
     * 
     * @param data data da avaliação no formato String
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Obtém a altura do aluno em metros.
     * 
     * @return altura em metros
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Define a altura do aluno em metros.
     * 
     * @param altura altura em metros
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Obtém o peso do aluno em quilogramas.
     * 
     * @return peso em kg
     */
    public float getPeso() {
        return peso;
    }

    /**
     * Define o peso do aluno em quilogramas.
     * 
     * @param peso peso em kg
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * Obtém o Índice de Massa Corporal (IMC) calculado.
     * 
     * @return valor do IMC
     */
    public float getImc() {
        return imc;
    }

    /**
     * Define o valor do Índice de Massa Corporal (IMC).
     * 
     * @param imc valor do IMC
     */
    public void setImc(float imc) {
        this.imc = imc;
    }

    /**
     * Obtém as informações sobre doenças do aluno.
     * 
     * @return descrição das doenças
     */
    public String getDoencas() {
        return doencas;
    }

    /**
     * Define as informações sobre doenças do aluno.
     * 
     * @param doencas descrição das doenças
     */
    public void setDoencas(String doencas) {
        this.doencas = doencas;
    }

    /**
     * Obtém o aluno avaliado.
     * 
     * @return objeto Aluno
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * Define o aluno avaliado.
     * 
     * @param aluno objeto Aluno
     */
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    /**
     * Obtém o treinador responsável pela avaliação.
     * 
     * @return objeto Treinador
     */
    public Treinador getAvaliador() {
        return avaliador;
    }

    /**
     * Define o treinador responsável pela avaliação.
     * 
     * @param avaliador objeto Treinador
     */
    public void setAvaliador(Treinador avaliador) {
        this.avaliador = avaliador;
    }
}
