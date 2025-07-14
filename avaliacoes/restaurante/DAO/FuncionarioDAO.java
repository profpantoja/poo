package prova.pantoja.DAO;

import prova.pantoja.Models.Funcionario;
import prova.pantoja.Models.Endereco;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {
    private static final String ARQUIVO = "funcionarios.txt";

    public void salvarFuncionarios(List<Funcionario> funcionarios) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO))) {
            for (Funcionario f : funcionarios) {
                writer.write(f.getNome() + "," +
                             f.getNumContribuinte() + "," +
                             f.getEndereco().getTipo() + "," +
                             f.getEndereco().getCep() + "," +
                             f.getEndereco().getNumero() + "," +
                             f.getCtp() + "," +
                             f.getCargo());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar funcionários: " + e.getMessage());
        }
    }

    public List<Funcionario> carregarFuncionarios() {
        List<Funcionario> funcionarios = new ArrayList<>();
        File file = new File(ARQUIVO);

        if (!file.exists()) return funcionarios;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                Endereco endereco = new Endereco(dados[2], dados[3], Integer.parseInt(dados[4]));
                funcionarios.add(new Funcionario(dados[0], dados[1], endereco, dados[5], dados[6]));
            }
        } catch (IOException e) {
            System.err.println("Erro ao carregar funcionários: " + e.getMessage());
        }
        return funcionarios;
    }
}