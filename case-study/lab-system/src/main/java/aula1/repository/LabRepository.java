package aula1.repository;

import aula1.controle.Lab;
import aula1.controle.Material;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LabRepository implements Repository<Lab> {

    private final ArquivoCsv arquivo;

    public LabRepository() {
        this(ArquivoCsv.DIRETORIO_PADRAO);
    }

    public LabRepository(Path diretorio) {
        arquivo = new ArquivoCsv(diretorio.resolve("labs.csv"),
                List.of("area", "cod", "desc", "materiais"), 2);
    }

    @Override
    public void salvar(Lab lab) throws IOException {
        arquivo.salvar(paraCampos(lab));
    }

    @Override
    public void alterar(Lab lab) throws IOException {
        arquivo.alterar(paraCampos(lab));
    }

    @Override
    public void apagar(Lab lab) throws IOException {
        arquivo.apagar(Arrays.asList(lab.getArea(), lab.getCod()));
    }

    @Override
    public List<Lab> buscar() throws IOException {
        List<Lab> labs = new ArrayList<>();
        for (List<String> campos : arquivo.buscar()) {
            Lab lab = new Lab(campos.get(1), campos.get(2), campos.get(0));
            lab.setMateriais(lerMateriais(campos.get(3)));
            labs.add(lab);
        }
        return labs;
    }

    private static List<String> paraCampos(Lab lab) {
        return Arrays.asList(lab.getArea(), lab.getCod(), lab.getDesc(), escreverMateriais(lab.getMateriais()));
    }

    private static String escreverMateriais(List<Material> materiais) {
        if (materiais == null) {
            return null;
        }
        List<List<String>> registros = new ArrayList<>();
        for (Material material : materiais) {
            registros.add(material == null ? Collections.singletonList(null) : MaterialRepository.paraCampos(material));
        }
        return Csv.escrever(registros);
    }

    private static ArrayList<Material> lerMateriais(String texto) throws IOException {
        if (texto == null) {
            return null;
        }
        ArrayList<Material> materiais = new ArrayList<>();
        for (List<String> campos : Csv.ler(texto)) {
            if (campos.size() == 1 && campos.get(0) == null) {
                materiais.add(null);
            } else {
                materiais.add(MaterialRepository.deCampos(campos));
            }
        }
        return materiais;
    }
}
