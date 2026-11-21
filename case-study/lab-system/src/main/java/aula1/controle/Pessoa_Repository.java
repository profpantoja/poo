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

public class Pessoa_Repository implements Repository<Pessoa> {

    private String arquivoCsv = "Pessoas.csv";

    public Pessoa_Repository() {
    }

    public Pessoa_Repository(String arquivoCsv) {
        this.arquivoCsv = arquivoCsv;
    }

    public String getArquivoCsv() {
        return arquivoCsv;
    }

    public void setArquivoCsv(String arquivoCsv) {
        this.arquivoCsv = arquivoCsv;
    }

    @Override
    public void salvar(Pessoa p) {
        if (p == null) {
            System.out.println("Erro: Não é possível salvar uma pessoa nula.");
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoCsv, StandardCharsets.UTF_8, true))) {
            String linha = formatarLinhaCsv(p);
            bw.write(linha);
            bw.newLine();
            System.out.println("Pessoa salva no CSV: " + p.getNome());
        } catch (IOException e) {
            System.out.println("Erro ao salvar pessoa no CSV: " + e.getMessage());
        }
    }

    @Override
    public void alterar(Pessoa p) {
        if (p == null) {
            System.out.println("Erro: Não é possível alterar uma pessoa nula.");
            return;
        }

        List<Pessoa> lista = buscar();
        boolean alterado = false;

        for (int i = 0; i < lista.size(); i++) {
            Pessoa pessoaSalva = lista.get(i);

            boolean mesmoUser = pessoaSalva.getUser() != null && pessoaSalva.getUser().equalsIgnoreCase(p.getUser());
            boolean mesmoNome = pessoaSalva.getNome() != null && pessoaSalva.getNome().equalsIgnoreCase(p.getNome());

            if (mesmoUser || mesmoNome) {
                lista.set(i, p);
                alterado = true;
                System.out.println("Pessoa alterada no CSV: " + p.getNome());
                break;
            }
        }

        if (alterado) {
            reescreverArquivo(lista);
        } else {
            System.out.println("Pessoa não encontrada no CSV para alteração: " + p.getNome());
        }
    }

    @Override
    public void apagar(Pessoa p) {
        if (p == null) {
            System.out.println("Erro: Não é possível apagar uma pessoa nula.");
            return;
        }

        List<Pessoa> lista = buscar();
        boolean removido = lista.removeIf(item -> {
            boolean mesmoUser = item.getUser() != null && item.getUser().equalsIgnoreCase(p.getUser());
            boolean mesmoNome = item.getNome() != null && item.getNome().equalsIgnoreCase(p.getNome());
            return mesmoUser || mesmoNome;
        });

        if (removido) {
            reescreverArquivo(lista);
            System.out.println("Pessoa removida do CSV: " + p.getNome());
        } else {
            System.out.println("Pessoa não encontrada no CSV para remoção: " + p.getNome());
        }
    }

    @Override
    public List<Pessoa> buscar() {
        List<Pessoa> lista = new ArrayList<>();
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

                // garante que a linha contenha todos os campos esperados
                if (dados.length < 5) {
                    continue;
                }

                try {
                    String nome = dados[0];
                    String user = dados[1];
                    float altura = Float.parseFloat(dados[2]);
                    double peso = Double.parseDouble(dados[3]);
                    String dtNascimento = dados[4];

                    Pessoa p = new Pessoa(nome, user, altura);
                    p.setPeso(peso);
                    p.setDtNascimento(dtNascimento);

                    lista.add(p);
                } catch (NumberFormatException e) {
                    System.out.println("Linha corrompida ignorada no CSV: " + linha);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao buscar pessoas no CSV: " + e.getMessage());
        }

        return lista;
    }

    // Método auxiliar para formatar os dados de Pessoa para o padrão CSV
    private String formatarLinhaCsv(Pessoa p) {
        return p.getNome() + ";" + p.getUser() + ";" + p.getAltura() + ";" + p.getPeso() + ";" + p.getDtNascimento();
    }

    // Método auxiliar para regravar a lista completa no arquivo CSV
    private void reescreverArquivo(List<Pessoa> lista) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoCsv, StandardCharsets.UTF_8, false))) {
            for (Pessoa p : lista) {
                bw.write(formatarLinhaCsv(p));
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao regravar arquivo CSV: " + e.getMessage());
        }
    }
}
