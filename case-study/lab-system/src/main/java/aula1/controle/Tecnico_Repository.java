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

public class Tecnico_Repository implements Repository<Tecnico> {

    private String arquivoCsv = "Tecnicos.csv";

    public Tecnico_Repository() {
    }

    public Tecnico_Repository(String arquivoCsv) {
        this.arquivoCsv = arquivoCsv;
    }

    public String getArquivoCsv() {
        return arquivoCsv;
    }

    public void setArquivoCsv(String arquivoCsv) {
        this.arquivoCsv = arquivoCsv;
    }

    @Override
    public void salvar(Tecnico t) {
        if (t == null) {
            System.out.println("Erro: Não é possível salvar um técnico nulo.");
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoCsv, StandardCharsets.UTF_8, true))) {
            bw.write(formatarLinhaCsv(t));
            bw.newLine();
            System.out.println("Técnico salvo no CSV: " + t.getNome());
        } catch (IOException e) {
            System.out.println("Erro ao salvar técnico no CSV: " + e.getMessage());
        }
    }

    @Override
    public void alterar(Tecnico t) {
        if (t == null) {
            System.out.println("Erro: Não é possível alterar um técnico nulo.");
            return;
        }

        List<Tecnico> lista = buscar();
        boolean alterado = false;

        for (int i = 0; i < lista.size(); i++) {
            Tecnico tSalvo = lista.get(i);
            boolean mesmoUser = tSalvo.getUser() != null && tSalvo.getUser().equalsIgnoreCase(t.getUser());
            boolean mesmoNome = tSalvo.getNome() != null && tSalvo.getNome().equalsIgnoreCase(t.getNome());

            if (mesmoUser || mesmoNome) {
                lista.set(i, t);
                alterado = true;
                System.out.println("Técnico alterado no CSV: " + t.getNome());
                break;
            }
        }

        if (alterado) {
            reescreverArquivo(lista);
        } else {
            System.out.println("Técnico não encontrado no CSV para alteração: " + t.getNome());
        }
    }

    @Override
    public void apagar(Tecnico t) {
        if (t == null) {
            System.out.println("Erro: Não é possível apagar um técnico nulo.");
            return;
        }

        List<Tecnico> lista = buscar();
        boolean removido = lista.removeIf(item -> {
            boolean mesmoUser = item.getUser() != null && item.getUser().equalsIgnoreCase(t.getUser());
            boolean mesmoNome = item.getNome() != null && item.getNome().equalsIgnoreCase(t.getNome());
            return mesmoUser || mesmoNome;
        });

        if (removido) {
            reescreverArquivo(lista);
            System.out.println("Técnico removido do CSV: " + t.getNome());
        } else {
            System.out.println("Técnico não encontrado no CSV para remoção: " + t.getNome());
        }
    }

    @Override
    public List<Tecnico> buscar() {
        List<Tecnico> lista = new ArrayList<>();
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
                if (dados.length < 6) {
                    continue;
                }

                try {
                    String nome = dados[0];
                    String user = dados[1];
                    float altura = Float.parseFloat(dados[2]);
                    double peso = Double.parseDouble(dados[3]);
                    String dtNascimento = dados[4];
                    String registroProfissional = dados[5];

                    Tecnico t = new Tecnico(nome, user, altura, registroProfissional);
                    t.setPeso(peso);
                    t.setDtNascimento(dtNascimento);

                    lista.add(t);
                } catch (NumberFormatException e) {
                    System.out.println("Aviso: Linha corrompida ignorada no CSV de técnicos: " + linha);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao buscar técnicos no CSV: " + e.getMessage());
        }

        return lista;
    }

    private String formatarLinhaCsv(Tecnico t) {
        return t.getNome() + ";" + t.getUser() + ";" + t.getAltura() + ";" + t.getPeso() + ";" 
                + t.getDtNascimento() + ";" + (t.getRegistroProfissional() != null ? t.getRegistroProfissional() : "");
    }

    private void reescreverArquivo(List<Tecnico> lista) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoCsv, StandardCharsets.UTF_8, false))) {
            for (Tecnico t : lista) {
                bw.write(formatarLinhaCsv(t));
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao regravar arquivo CSV: " + e.getMessage());
        }
    }
}
