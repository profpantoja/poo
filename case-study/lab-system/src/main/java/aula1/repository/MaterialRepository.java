package aula1.repository;

import aula1.controle.Material;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaterialRepository implements Repository<Material> {

    private static final List<String> CABECALHO = List.of("cod", "nome", "tipo", "desc", "prevManu", "status");

    private final ArquivoCsv arquivo;

    public MaterialRepository() {
        this(ArquivoCsv.DIRETORIO_PADRAO);
    }

    public MaterialRepository(Path diretorio) {
        arquivo = new ArquivoCsv(diretorio.resolve("materiais.csv"), CABECALHO, 1);
    }

    @Override
    public void salvar(Material material) throws IOException {
        arquivo.salvar(paraCampos(material));
    }

    @Override
    public void alterar(Material material) throws IOException {
        arquivo.alterar(paraCampos(material));
    }

    @Override
    public void apagar(Material material) throws IOException {
        arquivo.apagar(Collections.singletonList(material.getCod()));
    }

    @Override
    public List<Material> buscar() throws IOException {
        List<Material> materiais = new ArrayList<>();
        for (List<String> campos : arquivo.buscar()) {
            materiais.add(deCampos(campos));
        }
        return materiais;
    }

    static List<String> paraCampos(Material material) {
        return Arrays.asList(material.getCod(), material.getNome(), material.getTipo(),
                material.getDesc(), material.getPrevManu(), material.getStatus());
    }

    static Material deCampos(List<String> campos) throws IOException {
        if (campos.size() != CABECALHO.size()) {
            throw new IOException("Quantidade de campos inválida no registro de material.");
        }
        Material material = new Material(campos.get(0), campos.get(1), campos.get(2));
        material.setDesc(campos.get(3));
        material.setPrevManu(campos.get(4));
        material.setStatus(campos.get(5));
        return material;
    }
}
