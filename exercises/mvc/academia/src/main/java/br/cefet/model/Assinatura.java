package br.cefet.model;

public class Assinatura {
    private String dataInicio;
    private String dataFim;
    private String formaPagamento;
    private float valorMensalidade;
    private Plano plano;
    private Aluno aluno; 
    
    public Assinatura(Aluno aluno, Plano plano, String dataInicio, String dataFim, String formaPagamento, 
    float valorMensalidade) {
        this.aluno = aluno;
        this.plano = plano;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.formaPagamento = formaPagamento;
        this.valorMensalidade = valorMensalidade;
    }

    public Aluno getAluno(){
        return aluno;
    }
    
    public void setAluno(Aluno aluno){
        this.aluno = aluno;
    }
    
    public Plano getPlano(){
        return plano;
    }

    public void setPlano(Plano plano){
        this.plano = plano;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public float getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(float valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }
}
