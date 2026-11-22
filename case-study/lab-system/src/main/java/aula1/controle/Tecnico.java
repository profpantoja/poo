package aula1.controle;

public class Tecnico extends Pessoa implements Autenticavel {

    private String registroProfissional;

    public Tecnico(String nome, String user, float altura, String registroProfissional) {
        super(nome, user, altura); // chama o construtor da classe Pessoa
        this.registroProfissional = registroProfissional;
    }

    // Sobrescrita de método (Polimorfismo)
    @Override
    public void exibirFuncao() {
        System.out.println("Sou o técnico " + getNome() + ", responsável pelas manutenções do laboratório.");
    }

    // Cumprindo a regra da Interface
    @Override
    public boolean autenticar(String userDigitado) {
        // .equals valida se o user confere, comparando-os
        return getUser().equals(userDigitado);
    }

    // Sobrecarga de métodos: dois métodos com o mesmo nome, e comportamentos
    // diferentes
    public void registrarManutencao(Manutencao m) {
        System.out.println(getNome() + " registrou a manutenção: " + m.getOs());
    }

    public void registrarManutencao(Manutencao m, String observacaoExtra) {
        System.out.println(getNome() + " registrou a manutenção: " + m.getOs() + " | OBS: " + observacaoExtra);
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

}
