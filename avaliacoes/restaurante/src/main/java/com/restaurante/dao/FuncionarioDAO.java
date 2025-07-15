package com.restaurante.dao;

import com.restaurante.model.Funcionario;
import com.restaurante.model.Mesa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object (DAO) responsável pela persistência e manipulação de dados dos funcionários.
 * 
 * Esta classe realiza operações de salvar, listar e remover funcionários
 * em um arquivo de texto denominado {@code funcionarios.txt}.
 * 
 * Os funcionários são armazenados com suas mesas associadas serializadas em formato texto.
 * 
 * Os dados das mesas são serializados como "numero,local" separados por pipe "|".
 * 
 * Exibe mensagens no console em caso de erros de I/O.
 * 
 */
public class FuncionarioDAO {

    /** Nome do arquivo usado para armazenar os dados dos funcionários. */
    private static final String ARQUIVO = "funcionarios.txt";

    /**
     * Salva um funcionário no arquivo, adicionando ao final.
     * 
     * Serializa a lista de mesas associadas ao funcionário no formato
     * "numero,local|numero,local|...".
     * 
     * @param funcionario o funcionário a ser salvo
     */
    public void salvar(Funcionario funcionario) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARQUIVO, true))) {
            StringBuilder sbMesas = new StringBuilder();
            if (funcionario.getMesas() != null) {
                for (int i = 0; i < funcionario.getMesas().size(); i++) {
                    Mesa m = funcionario.getMesas().get(i);
                    sbMesas.append(m.getNumero()).append(",").append(m.getLocal());
                    if (i < funcionario.getMesas().size() - 1) {
                        sbMesas.append("|");
                    }
                }
            }
            writer.println(funcionario.getNome() + ";" +
                           funcionario.getCpf() + ";" +
                           funcionario.getCtp() + ";" +
                           funcionario.getCargo() + ";" +
                           sbMesas.toString());
        } catch (IOException e) {
            System.out.println("Erro ao salvar funcionário: " + e.getMessage());
        }
    }

    /**
     * Lista todos os funcionários armazenados no arquivo.
     * 
     * Desserializa as informações dos funcionários e suas mesas para objetos correspondentes.
     * 
     * @return lista com todos os funcionários encontrados no arquivo;
     *         lista vazia se o arquivo não existir ou estiver vazio
     */
    public List<Funcionario> listar() {
        List<Funcionario> funcionarios = new ArrayList<>();
        File file = new File(ARQUIVO);

        if (!file.exists()) {
            return funcionarios;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(";", 5);
                if (partes.length >= 5) {
                    String nome = partes[0];
                    String cpf = partes[1];
                    String ctp = partes[2];
                    String cargo = partes[3];
                    String mesasStr = partes[4];

                    List<Mesa> mesas = new ArrayList<>();
                    if (!mesasStr.isEmpty()) {
                        String[] mesasArray = mesasStr.split("\\|");
                        for (String mesaDados : mesasArray) {
                            String[] dados = mesaDados.split(",");
                            if (dados.length == 2) {
                                mesas.add(new Mesa(dados[0], dados[1]));
                            }
                        }
                    }
                    funcionarios.add(new Funcionario(nome, cpf, null, ctp, cargo, mesas));
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler funcionários: " + e.getMessage());
        }

        return funcionarios;
    }

    /**
     * Remove um funcionário do arquivo com base no CPF informado.
     * 
     * Recarrega todos os funcionários, remove o funcionário com o CPF especificado
     * e reescreve o arquivo com os dados atualizados.
     * 
     * @param cpf o CPF do funcionário a ser removido
     * @return {@code true} se um funcionário foi removido; {@code false} caso contrário
     */
    public boolean remover(String cpf) {
        List<Funcionario> funcionarios = listar();
        boolean removido = funcionarios.removeIf(f -> f.getCpf().equals(cpf));

        if (removido) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(ARQUIVO))) {
                for (Funcionario f : funcionarios) {
                    StringBuilder sbMesas = new StringBuilder();
                    if (f.getMesas() != null) {
                        for (int i = 0; i < f.getMesas().size(); i++) {
                            Mesa m = f.getMesas().get(i);
                            sbMesas.append(m.getNumero()).append(",").append(m.getLocal());
                            if (i < f.getMesas().size() - 1) {
                                sbMesas.append("|");
                            }
                        }
                    }
                    writer.println(f.getNome() + ";" +
                                   f.getCpf() + ";" +
                                   f.getCtp() + ";" +
                                   f.getCargo() + ";" +
                                   sbMesas.toString());
                }
            } catch (IOException e) {
                System.out.println("Erro ao reescrever arquivo: " + e.getMessage());
            }
        }

        return removido;
    }
}
