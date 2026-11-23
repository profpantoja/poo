package aula1.repository;

import aula1.controle.Pessoa;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PessoaRepository implements Repository<Pessoa> {

    private final ArquivoCsv arquivo;

    public PessoaRepository() {
        this(ArquivoCsv.DIRETORIO_PADRAO);
    }

    public PessoaRepository(Path diretorio) {
        arquivo = new ArquivoCsv(diretorio.resolve("pessoas.csv"),
                List.of("user", "nome", "altura", "peso", "dtNascimento"), 1);
    }

    @Override
    public void salvar(Pessoa pessoa) throws IOException {
        arquivo.salvar(paraCampos(pessoa));
    }

    @Override
    public void alterar(Pessoa pessoa) throws IOException {
        arquivo.alterar(paraCampos(pessoa));
    }

    @Override
    public void apagar(Pessoa pessoa) throws IOException {
        arquivo.apagar(Collections.singletonList(pessoa.getUser()));
    }

    @Override
    public List<Pessoa> buscar() throws IOException {
        return arquivo.buscar().stream().map(PessoaRepository::deCampos).toList();
    }

    static List<String> paraCampos(Pessoa pessoa) {
        return Arrays.asList(pessoa.getUser(), pessoa.getNome(), Float.toString(pessoa.getAltura()),
                Double.toString(pessoa.getPeso()), pessoa.getDtNascimento());
    }

    static Pessoa deCampos(List<String> campos) {
        Pessoa pessoa = new Pessoa(campos.get(1), campos.get(0), Float.parseFloat(campos.get(2)));
        pessoa.setPeso(Double.parseDouble(campos.get(3)));
        pessoa.setDtNascimento(campos.get(4));
        return pessoa;
    }
}
