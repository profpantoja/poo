package com.restaurante.dao;

import com.restaurante.model.Endereco;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EnderecoDAO {
    private static final String ARQUIVO = "enderecos.txt";

    public void salvarEndereco(Endereco endereco) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO, true))) {
            writer.write(formatarEndereco(endereco));
            writer.newLine();
            System.out.println("Endereço salvo no arquivo com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar endereço no arquivo: " + e.getMessage());
        }
    }

    private String formatarEndereco(Endereco e) {
        return e.getTipo() + ";" + e.getNumero() + ";" + e.getCep();
    }

    public List<Endereco> listarEnderecos() {
        List<Endereco> lista = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 3) {
                    String tipo = partes[0];
                    int numero = Integer.parseInt(partes[1]);
                    String cep = partes[2];
                    lista.add(new Endereco(tipo, cep, numero));
                }
            }
        } catch (FileNotFoundException e) {
            // Arquivo não existe ainda, tudo bem
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo de endereços: " + e.getMessage());
        }
        return lista;
    }

    public boolean deletarEnderecoPorCep(List<Endereco> lista, String cep) {
        boolean removido = lista.removeIf(e -> e.getCep().equals(cep));
        if (removido) {
            salvarListaAtualizada(lista);
        }
        return removido;
    }

    private void salvarListaAtualizada(List<Endereco> lista) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO, false))) {
            for (Endereco e : lista) {
                writer.write(formatarEndereco(e));
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo atualizado: " + e.getMessage());
        }
    }
}
