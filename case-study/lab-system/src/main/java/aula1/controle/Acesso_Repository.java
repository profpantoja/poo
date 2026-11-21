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

public class Acesso_Repository implements Repository<Acesso> {

    private String arquivoCsv = "Acessos.csv";

    public Acesso_Repository() {
    }

    public Acesso_Repository(String arquivoCsv) {
        this.arquivoCsv = arquivoCsv;
    }

    public String getArquivoCsv() {
        return arquivoCsv;
    }

    public void setArquivoCsv(String arquivoCsv) {
        this.arquivoCsv = arquivoCsv;
    }

    @Override
    public void salvar(Acesso acesso) {
        if (acesso == null) {
            System.out.println("Erro: Não é possível salvar um acesso nulo.");
            return;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoCsv, StandardCharsets.UTF_8, true))) {
            bw.write(formatarLinhaCsv(acesso));
            bw.newLine();
            System.out.println("Acesso salvo no CSV para: " + (acesso.getPessoa() != null ? acesso.getPessoa().getUser() : "Desconhecido"));
        } catch (IOException e) {
            System.out.println("Erro ao salvar acesso no CSV: " + e.getMessage());
        }
    }

    @Override
    public void alterar(Acesso acesso) {
        if (acesso == null) {
            System.out.println("Erro: Não é possível alterar um acesso nulo.");
            return;
        }

        List<Acesso> lista = buscar();
        boolean alterado = false;

        for (int i = 0; i < lista.size(); i++) {
            Acesso aSalvo = lista.get(i);
            boolean mesmaEntrada = aSalvo.getDtEntrada() != null && aSalvo.getDtEntrada().equals(acesso.getDtEntrada());
            boolean mesmaPessoa = (aSalvo.getPessoa() != null && acesso.getPessoa() != null)
                    && aSalvo.getPessoa().getUser() != null && aSalvo.getPessoa().getUser().equalsIgnoreCase(acesso.getPessoa().getUser());

            if (mesmaEntrada && mesmaPessoa) {
                lista.set(i, acesso);
                alterado = true;
                System.out.println("Acesso alterado no CSV.");
                break;
            }
        }

        if (alterado) {
            reescreverArquivo(lista);
        } else {
            System.out.println("Acesso não encontrado no CSV para alteração.");
        }
    }

    @Override
    public void apagar(Acesso acesso) {
        if (acesso == null) {
            System.out.println("Erro: Não é possível apagar um acesso nulo.");
            return;
        }

        List<Acesso> lista = buscar();
        boolean removido = lista.removeIf(item -> {
            boolean mesmaEntrada = item.getDtEntrada() != null && item.getDtEntrada().equals(acesso.getDtEntrada());
            boolean mesmaPessoa = (item.getPessoa() != null && acesso.getPessoa() != null)
                    && item.getPessoa().getUser() != null && item.getPessoa().getUser().equalsIgnoreCase(acesso.getPessoa().getUser());
            return mesmaEntrada && mesmaPessoa;
        });

        if (removido) {
            reescreverArquivo(lista);
            System.out.println("Acesso removido do CSV.");
        } else {
            System.out.println("Acesso não encontrado no CSV para remoção.");
        }
    }

    @Override
    public List<Acesso> buscar() {
        List<Acesso> lista = new ArrayList<>();
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
                if (dados.length < 2) {
                    continue;
                }

                String dtEntrada = dados[0];
                String dtSaida = dados.length > 1 ? dados[1] : "";
                String userPessoa = dados.length > 2 ? dados[2] : "";

                // Reconstrói a pessoa associada
                Pessoa p = new Pessoa(userPessoa, userPessoa, 0.0f);
                Acesso a = new Acesso(dtEntrada, p);
                a.setDtSaida(dtSaida);

                lista.add(a);
            }
        } catch (IOException e) {
            System.out.println("Erro ao buscar acessos no CSV: " + e.getMessage());
        }

        return lista;
    }

    private String formatarLinhaCsv(Acesso a) {
        String dtEntrada = a.getDtEntrada() != null ? a.getDtEntrada() : "";
        String dtSaida = a.getDtSaida() != null ? a.getDtSaida() : "";
        String user = (a.getPessoa() != null && a.getPessoa().getUser() != null) ? a.getPessoa().getUser() : "";
        return dtEntrada + ";" + dtSaida + ";" + user;
    }

    private void reescreverArquivo(List<Acesso> lista) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoCsv, StandardCharsets.UTF_8, false))) {
            for (Acesso a : lista) {
                bw.write(formatarLinhaCsv(a));
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao regravar arquivo CSV: " + e.getMessage());
        }
    }
}
