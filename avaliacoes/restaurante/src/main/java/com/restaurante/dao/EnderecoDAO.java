package com.restaurante.dao;

import com.restaurante.model.Endereco;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object (DAO) responsável pela persistência e manipulação de dados de endereços.
 * 
 * Esta classe realiza operações de salvar, listar e deletar endereços em um arquivo de texto
 * denominado {@code enderecos.txt}, armazenando as informações no formato delimitado por ponto e vírgula.
 * 
 * Trata exceções de E/S exibindo mensagens no console.
 *
 */
public class EnderecoDAO {

    /** Nome do arquivo usado para armazenar os endereços. */
    private static final String ARQUIVO = "enderecos.txt";

    /**
     * Salva um endereço no arquivo, adicionando ao final do arquivo existente.
     * 
     * O endereço é formatado como "tipo;numero;cep" para armazenamento.
     * 
     * @param endereco o endereço a ser salvo
     */
    public void salvarEndereco(Endereco endereco) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO, true))) {
            writer.write(formatarEndereco(endereco));
            writer.newLine();
            System.out.println("Endereço salvo no arquivo com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar endereço no arquivo: " + e.getMessage());
        }
    }

    /**
     * Formata os dados do endereço para o formato de texto que será salvo no arquivo.
     * 
     * @param e o endereço a ser formatado
     * @return string formatada contendo tipo, número e CEP separados por ponto e vírgula
     */
    private String formatarEndereco(Endereco e) {
        return e.getTipo() + ";" + e.getNumero() + ";" + e.getCep();
    }

    /**
     * Lista todos os endereços armazenados no arquivo.
     * 
     * Realiza a leitura do arquivo, cria objetos {@link Endereco} e os adiciona a uma lista.
     * 
     * @return lista contendo todos os endereços encontrados no arquivo;
     *         lista vazia caso o arquivo não exista ou esteja vazio
     */
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
            // Arquivo não existe ainda, não é considerado erro
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo de endereços: " + e.getMessage());
        }
        return lista;
    }

    /**
     * Remove um endereço da lista com base no CEP e atualiza o arquivo com a lista atualizada.
     * 
     * @param lista lista de endereços em memória
     * @param cep o CEP do endereço que deve ser removido
     * @return {@code true} se algum endereço foi removido; {@code false} caso contrário
     */
    public boolean deletarEnderecoPorCep(List<Endereco> lista, String cep) {
        boolean removido = lista.removeIf(e -> e.getCep().equals(cep));
        if (removido) {
            salvarListaAtualizada(lista);
        }
        return removido;
    }

    /**
     * Salva a lista atualizada de endereços no arquivo, sobrescrevendo o conteúdo existente.
     * 
     * @param lista a lista atualizada de endereços
     */
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
