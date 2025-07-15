package com.restaurante.dao;

import com.restaurante.model.Cliente;
import com.restaurante.model.Endereco;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteDAO {
    private static final String ARQUIVO = "clientes.txt";

    // Salva cliente com endereço serializado
    public void salvar(Cliente cliente) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARQUIVO, true))) {
            String enderecoStr = "";
            Endereco e = cliente.getEndereco();
            if (e != null) {
                // formato: tipo,numero,cep
                enderecoStr = e.getTipo() + "," + e.getNumero() + "," + e.getCep();
            }
            writer.println(cliente.getNome() + ";" +
                           cliente.getCpf() + ";" +
                           cliente.getNumFid() + ";" +
                           enderecoStr);
        } catch (IOException ex) {
            System.out.println("Erro ao salvar cliente: " + ex.getMessage());
        }
    }

    // Lista clientes desserializando endereço
    public List<Cliente> listar() {
        List<Cliente> clientes = new ArrayList<>();
        File file = new File(ARQUIVO);

        if (!file.exists()) {
            return clientes;
        }

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] partes = linha.split(";", 4);
                if (partes.length >= 3) {
                    String nome = partes[0];
                    String cpf = partes[1];
                    int numFid = Integer.parseInt(partes[2]);

                    Endereco endereco = null;
                    if (partes.length == 4 && !partes[3].isEmpty()) {
                        String[] dadosEndereco = partes[3].split(",");
                        if (dadosEndereco.length == 3) {
                            String tipo = dadosEndereco[0];
                            int numero = Integer.parseInt(dadosEndereco[1]);
                            String cep = dadosEndereco[2];
                            endereco = new Endereco(tipo, cep, numero);
                        }
                    }

                    clientes.add(new Cliente(nome, cpf, endereco, numFid));
                }
            }
        } catch (IOException ex) {
            System.out.println("Erro ao ler clientes: " + ex.getMessage());
        }

        return clientes;
    }

    // Remove cliente pelo CPF
    public boolean remover(String cpf) {
        List<Cliente> clientes = listar();
        boolean removido = clientes.removeIf(c -> c.getCpf().equals(cpf));

        if (removido) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(ARQUIVO))) {
                for (Cliente c : clientes) {
                    String enderecoStr = "";
                    Endereco e = c.getEndereco();
                    if (e != null) {
                        enderecoStr = e.getTipo() + "," + e.getNumero() + "," + e.getCep();
                    }
                    writer.println(c.getNome() + ";" +
                                   c.getCpf() + ";" +
                                   c.getNumFid() + ";" +
                                   enderecoStr);
                }
            } catch (IOException ex) {
                System.out.println("Erro ao reescrever arquivo: " + ex.getMessage());
            }
        }

        return removido;
    }
}
