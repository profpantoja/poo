package aula1.repository;

import aula1.controle.Acesso;
import aula1.controle.Pessoa;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class AcessoRepository implements Repository<Acesso> {

    private final ArquivoCsv arquivo;

    public AcessoRepository() {
        this(ArquivoCsv.DIRETORIO_PADRAO);
    }

    public AcessoRepository(Path diretorio) {
        arquivo = new ArquivoCsv(diretorio.resolve("acessos.csv"),
                List.of("id", "dtEntrada", "dtSaida", "pessoaUser", "pessoaNome", "pessoaAltura",
                        "pessoaPeso", "pessoaDtNascimento"), 1);
    }

    @Override
    public void salvar(Acesso acesso) throws IOException {
        arquivo.salvar(paraCampos(acesso));
    }

    @Override
    public void alterar(Acesso acesso) throws IOException {
        arquivo.alterar(paraCampos(acesso));
    }

    @Override
    public void apagar(Acesso acesso) throws IOException {
        arquivo.apagar(List.of(acesso.getId().toString()));
    }

    @Override
    public List<Acesso> buscar() throws IOException {
        return arquivo.buscar().stream().map(AcessoRepository::deCampos).toList();
    }

    private static List<String> paraCampos(Acesso acesso) {
        List<String> campos = new ArrayList<>(Arrays.asList(acesso.getId().toString(),
                acesso.getDtEntrada(), acesso.getDtSaida()));
        Pessoa pessoa = acesso.getPessoa();
        campos.addAll(pessoa == null ? Collections.nCopies(5, null) : PessoaRepository.paraCampos(pessoa));
        return campos;
    }

    private static Acesso deCampos(List<String> campos) {
        List<String> camposPessoa = campos.subList(3, campos.size());
        Pessoa pessoa = camposPessoa.stream().allMatch(Objects::isNull) ? null : PessoaRepository.deCampos(camposPessoa);
        Acesso acesso = new Acesso(UUID.fromString(campos.get(0)), campos.get(1), pessoa);
        acesso.setDtSaida(campos.get(2));
        return acesso;
    }
}
