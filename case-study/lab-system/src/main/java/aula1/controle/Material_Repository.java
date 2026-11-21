package aula1.controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Material_Repository implements Repository<Material> {

    private String arquivoCsv = "Materiais.csv";

    public Material_Repository() {
    }

    public Material_Repository(String arquivoCsv) {
        this.arquivoCsv = arquivoCsv;
    }

    public String getArquivoCsv() {
        return arquivoCsv;
    }

    public void setArquivoCsv(String arquivoCsv) {
        this.arquivoCsv = arquivoCsv;
    }

    @Override
    public void salvar(Material material) {
        if (material == null) {
            System.out.println("Erro: Não é possível salvar um material nulo.");
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoCsv, StandardCharsets.UTF_8, true))) {
            bw.write(formatarLinhaCsv(material));
            bw.newLine();
            System.out.println("Material salvo no CSV: " + material.getNome());
        } catch (IOException e) {
            System.out.println("Erro ao salvar material no CSV: " + e.getMessage());
        }
    }

    @Override
    public void alterar(Material material) {
        if (material == null) {
            System.out.println("Erro: Não é possível alterar um material nulo.");
            return;
        }

        List<Material> lista = buscar();
        boolean alterado = false;

        for (int i = 0; i < lista.size(); i++) {
            Material materialSalvo = lista.get(i);
            if (materialSalvo.getCod() != null && materialSalvo.getCod().equalsIgnoreCase(material.getCod())) {
                lista.set(i, material);
                alterado = true;
                System.out.println("Material alterado no CSV: " + material.getNome());
                break;
            }
        }

        if (alterado) {
            reescreverArquivo(lista);
        } else {
            System.out.println("Material não encontrado no CSV para alteração: " + material.getCod());
        }
    }

    @Override
    public void apagar(Material material) {
        if (material == null) {
            System.out.println("Erro: Não é possível apagar um material nulo.");
            return;
        }

        List<Material> lista = buscar();
        boolean removido = lista.removeIf(item -> 
            item.getCod() != null && item.getCod().equalsIgnoreCase(material.getCod())
        );

        if (removido) {
            reescreverArquivo(lista);
            System.out.println("Material removido do CSV: " + material.getNome());
        } else {
            System.out.println("Material não encontrado no CSV para remoção: " + material.getCod());
        }
    }

    @Override
    public List<Material> buscar() {
        List<Material> lista = new ArrayList<>();
        File arquivo = new File(arquivoCsv);

        if (!arquivo.exists()) {
            return lista;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(arquivoCsv, StandardCharsets.UTF_8))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                if (linha.trim().isEmpty()) {
                    continue;
                }

                String[] dados = linha.split(";");
                if (dados.length < 3) {
                    continue;
                }

                String cod = dados[0];
                String nome = dados[1];
                String tipo = dados[2];

                Material m = new Material(cod, nome, tipo);

                if (dados.length > 3) m.setDesc(dados[3]);
                if (dados.length > 4) m.setPrevManu(dados[4]);
                if (dados.length > 5) m.setStatus(dados[5]);

                lista.add(m);
            }
        } catch (IOException e) {
            System.out.println("Erro ao buscar materiais no CSV: " + e.getMessage());
        }

        return lista;
    }

    private String formatarLinhaCsv(Material m) {
        String desc = m.getDesc() != null ? m.getDesc() : "";
        String prevManu = m.getPrevManu() != null ? m.getPrevManu() : "";
        String status = m.getStatus() != null ? m.getStatus() : "";
        return m.getCod() + ";" + m.getNome() + ";" + m.getTipo() + ";" + desc + ";" + prevManu + ";" + status;
    }

    private void reescreverArquivo(List<Material> lista) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoCsv, StandardCharsets.UTF_8, false))) {
            for (Material m : lista) {
                bw.write(formatarLinhaCsv(m));
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao regravar arquivo CSV: " + e.getMessage());
        }
    }
}
