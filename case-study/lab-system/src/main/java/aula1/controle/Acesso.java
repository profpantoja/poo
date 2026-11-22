package aula1.controle;

public class Acesso {

    private String dtEntrada;
    private String dtSaida;
    private Pessoa pessoa;

    public Acesso(String dtEntrada, Pessoa pessoa) {
        this.dtEntrada = dtEntrada;
        this.pessoa = pessoa;
    }

    public String getDtEntrada() {
        return dtEntrada;
    }

    public String getDtSaida() {
        return dtSaida;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setDtEntrada(String dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    public void setDtSaida(String dtSaida) {
        this.dtSaida = dtSaida;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    // Sobrecarga de métodos
    public void registrarSaida(String dataHoraSaida) {
        this.dtSaida = dataHoraSaida;
    }

    public void registrarSaida() {
        this.dtSaida = "Saída registrada automaticamente pelo sistema";
    }
}

// Os atributos foram declarados como private e os métodos de aceso (getters e setter) como public. Isso mostra um bom entendimento prático sobre a visibilidade de atributos e métodos e encapsulamento.

// O construtor Acesso(String dtEntrada, Pessoa pessoa) recebe os parâmetros corretamente e usa a palavra-chave this para diferenciar as variáveis da própria classe dos parâmetros recebidos

// A declaração do pacote aula1.controle e a estrutura da classe e dos objetos estão nos padrões corretos da linguagem

// Usar string para armazenar datas é perfeitamente aceitável e comum nessa fase inicial de aprendizado sobre variáveis. mas o correto para manipulação de tempo em java é o LocalDate
