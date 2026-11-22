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

public class Lab_Repository implements Repository<Lab> {

    private String arquivoCsv = "Labs.csv";

    public Lab_Repository() {
    }

    public Lab_Repository(String arquivoCsv) {
        this.arquivoCsv = arquivoCsv;
    }

    public String getArquivoCsv() {
        return arquivoCsv;
    }

    public void setArquivoCsv(String arquivoCsv) {
        this.arquivoCsv = arquivoCsv;
    }

    @Override
    public void salvar(Lab lab) {
        if (lab == null) {
            System.out.println("Erro: Não é possível salvar um laboratório nulo.");
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoCsv, StandardCharsets.UTF_8, true))) {
            bw.write(formatarLinhaCsv(lab));
            bw.newLine();
            System.out.println("Laboratório salvo no CSV: " + lab.getCod());
        } catch (IOException e) {
            System.out.println("Erro ao salvar laboratório no CSV: " + e.getMessage());
        }
    }

    @Override
    public void alterar(Lab lab) {
        if (lab == null) {
            System.out.println("Erro: Não é possível alterar um laboratório nulo.");
            return;
        }

        List<Lab> lista = buscar();
        boolean alterado = false;

        for (int i = 0; i < lista.size(); i++) {
            Lab labSalvo = lista.get(i);
            if (labSalvo.getCod() != null && labSalvo.getCod().equalsIgnoreCase(lab.getCod())) {
                lista.set(i, lab);
                alterado = true;
                System.out.println("Laboratório alterado no CSV: " + lab.getCod());
                break;
            }
        }

        if (alterado) {
            reescreverArquivo(lista);
        } else {
            System.out.println("Laboratório não encontrado no CSV para alteração: " + lab.getCod());
        }
    }

    @Override
    public void apagar(Lab lab) {
        if (lab == null) {
            System.out.println("Erro: Não é possível apagar um laboratório nulo.");
            return;
        }

        List<Lab> lista = buscar();
        boolean removido = lista.removeIf(item -> 
            item.getCod() != null && item.getCod().equalsIgnoreCase(lab.getCod())
        );

        if (removido) {
            reescreverArquivo(lista);
            System.out.println("Laboratório removido do CSV: " + lab.getCod());
        } else {
            System.out.println("Laboratório não encontrado no CSV para remoção: " + lab.getCod());
        }
    }

    @Override
    public List<Lab> buscar() {
        List<Lab> lista = new ArrayList<>();
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
                String desc = dados[1];
                String area = dados[2];

                Lab lab = new Lab(cod, desc, area);
                lista.add(lab);
            }
        } catch (IOException e) {
            System.out.println("Erro ao buscar laboratórios no CSV: " + e.getMessage());
        }

        return lista;
    }

    private String formatarLinhaCsv(Lab lab) {
        return lab.getCod() + ";" + lab.getDesc() + ";" + lab.getArea();
    }

    private void reescreverArquivo(List<Lab> lista) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoCsv, StandardCharsets.UTF_8, false))) {
            for (Lab lab : lista) {
                bw.write(formatarLinhaCsv(lab));
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao regravar arquivo CSV: " + e.getMessage());
        }
    }
}
