package aula1.controle;

import java.util.Objects;
import java.util.UUID;

public class Acesso {

    private final UUID id;
    private String dtEntrada;
    private String dtSaida;
    private Pessoa pessoa;

    public Acesso(String dtEntrada, Pessoa pessoa) {
        this(UUID.randomUUID(), dtEntrada, pessoa);
    }

    public Acesso(UUID id, String dtEntrada, Pessoa pessoa) {
        this.id = Objects.requireNonNull(id);
        this.dtEntrada = dtEntrada;
        this.pessoa = pessoa;
    }

    public UUID getId() {
        return id;
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

}
