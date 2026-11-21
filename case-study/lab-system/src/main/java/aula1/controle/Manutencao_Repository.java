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

public class Manutencao_Repository implements Repository<Manutencao> {

    private String arquivoCsv = "Manutencoes.csv";

    public Manutencao_Repository() {
    }

    public Manutencao_Repository(String arquivoCsv) {
        this.arquivoCsv = arquivoCsv;
    }

    public String getArquivoCsv() {
        return arquivoCsv;
    }

    public void setArquivoCsv(String arquivoCsv) {
        this.arquivoCsv = arquivoCsv;
    }

    @Override
    public void salvar(Manutencao m) {
        if (m == null) {
            System.out.println("Erro: Não é possível salvar uma manutenção nula.");
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoCsv, StandardCharsets.UTF_8, true))) {
            bw.write(formatarLinhaCsv(m));
            bw.newLine();
            System.out.println("Manutenção salva no CSV: OS " + m.getOs());
        } catch (IOException e) {
            System.out.println("Erro ao salvar manutenção no CSV: " + e.getMessage());
        }
    }

    @Override
    public void alterar(Manutencao m) {
        if (m == null) {
            System.out.println("Erro: Não é possível alterar uma manutenção nula.");
            return;
        }

        List<Manutencao> lista = buscar();
        boolean alterado = false;

        for (int i = 0; i < lista.size(); i++) {
            Manutencao mSalva = lista.get(i);
            if (mSalva.getOs() != null && mSalva.getOs().equalsIgnoreCase(m.getOs())) {
                lista.set(i, m);
                alterado = true;
                System.out.println("Manutenção alterada no CSV: OS " + m.getOs());
                break;
            }
        }

        if (alterado) {
            reescreverArquivo(lista);
        } else {
            System.out.println("Manutenção não encontrada no CSV para alteração: OS " + m.getOs());
        }
    }

    @Override
    public void apagar(Manutencao m) {
        if (m == null) {
            System.out.println("Erro: Não é possível apagar uma manutenção nula.");
            return;
        }

        List<Manutencao> lista = buscar();
        boolean removido = lista.removeIf(item -> 
            item.getOs() != null && item.getOs().equalsIgnoreCase(m.getOs())
        );

        if (removido) {
            reescreverArquivo(lista);
            System.out.println("Manutenção removida do CSV: OS " + m.getOs());
        } else {
            System.out.println("Manutenção não encontrada no CSV para remoção: OS " + m.getOs());
        }
    }

    @Override
    public List<Manutencao> buscar() {
        List<Manutencao> lista = new ArrayList<>();
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
                if (dados.length < 4) {
                    continue;
                }

                String os = dados[0];
                String tipo = dados[1];
                String desc = dados[2];
                String dtManutencao = dados[3];

                Manutencao m = new Manutencao(os, tipo, desc, dtManutencao);
                lista.add(m);
            }
        } catch (IOException e) {
            System.out.println("Erro ao buscar manutenções no CSV: " + e.getMessage());
        }

        return lista;
    }

    private String formatarLinhaCsv(Manutencao m) {
        return m.getOs() + ";" + m.getTipo() + ";" + m.getDesc() + ";" + m.getDtManutencao();
    }

    private void reescreverArquivo(List<Manutencao> lista) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoCsv, StandardCharsets.UTF_8, false))) {
            for (Manutencao m : lista) {
                bw.write(formatarLinhaCsv(m));
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao regravar arquivo CSV: " + e.getMessage());
        }
    }
}
