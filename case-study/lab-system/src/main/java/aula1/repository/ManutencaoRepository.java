package aula1.repository;

import aula1.controle.Manutencao;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ManutencaoRepository implements Repository<Manutencao> {

    private final ArquivoCsv arquivo;

    public ManutencaoRepository() {
        this(ArquivoCsv.DIRETORIO_PADRAO);
    }

    public ManutencaoRepository(Path diretorio) {
        arquivo = new ArquivoCsv(diretorio.resolve("manutencoes.csv"),
                List.of("os", "tipo", "desc", "dtManutencao"), 1);
    }

    @Override
    public void salvar(Manutencao manutencao) throws IOException {
        arquivo.salvar(paraCampos(manutencao));
    }

    @Override
    public void alterar(Manutencao manutencao) throws IOException {
        arquivo.alterar(paraCampos(manutencao));
    }

    @Override
    public void apagar(Manutencao manutencao) throws IOException {
        arquivo.apagar(Collections.singletonList(manutencao.getOs()));
    }

    @Override
    public List<Manutencao> buscar() throws IOException {
        return arquivo.buscar().stream().map(ManutencaoRepository::deCampos).toList();
    }

    private static List<String> paraCampos(Manutencao manutencao) {
        return Arrays.asList(manutencao.getOs(), manutencao.getTipo(), manutencao.getDesc(),
                manutencao.getDtManutencao());
    }

    private static Manutencao deCampos(List<String> campos) {
        return new Manutencao(campos.get(0), campos.get(1), campos.get(2), campos.get(3));
    }
}
