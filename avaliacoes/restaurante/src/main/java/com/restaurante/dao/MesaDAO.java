package com.restaurante.dao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.restaurante.model.Mesa;

/**
 * Data Access Object (DAO) responsável pela persistência e manipulação dos dados das mesas.
 * 
 * Esta classe realiza operações de salvar, listar e deletar mesas em um arquivo de texto
 * denominado {@code mesas.txt}, armazenando as informações no formato delimitado por ponto e vírgula.
 * 
 * Operações suportadas:
 * <ul>
 *   <li>Salvar uma mesa (append no arquivo)</li>
 *   <li>Listar todas as mesas</li>
 *   <li>Deletar uma mesa pelo número e atualizar o arquivo</li>
 * </ul>
 * 
 * Exceções de I/O são propagadas para o chamador tratar.
 */
public class MesaDAO {

    /** Nome do arquivo usado para armazenar as mesas. */
    private static final String FILE_NAME = "mesas.txt";

    /**
     * Salva uma mesa no arquivo, adicionando ao final do arquivo existente.
     * 
     * O formato utilizado para armazenamento é "numero;local".
     * 
     * @param mesa a mesa a ser salva
     * @throws IOException caso ocorra erro na operação de escrita no arquivo
     */
    public void salvar(Mesa mesa) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(mesa.getNumero() + ";" + mesa.getLocal());
            writer.newLine();
        }
    }

    /**
     * Lista todas as mesas armazenadas no arquivo.
     * 
     * Realiza a leitura do arquivo, criando objetos {@link Mesa} para cada linha.
     * 
     * @return lista contendo todas as mesas encontradas no arquivo;
     *         lista vazia caso o arquivo não exista ou esteja vazio
     * @throws IOException caso ocorra erro na operação de leitura do arquivo
     */
    public List<Mesa> listar() throws IOException {
        List<Mesa> mesas = new ArrayList<>();
        File arquivo = new File(FILE_NAME);

        if (!arquivo.exists()) {
            return mesas;
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                mesas.add(new Mesa(dados[0], dados[1]));
            }
        }
        return mesas;
    }

    /**
     * Remove uma mesa do arquivo com base no número informado.
     * 
     * A operação recarrega todas as mesas, remove a mesa com o número especificado,
     * e reescreve o arquivo com as mesas restantes.
     * 
     * @param numero o número da mesa que deve ser removida
     * @throws IOException caso ocorra erro na operação de leitura ou escrita no arquivo
     */
    public void deletar(String numero) throws IOException {
        List<Mesa> mesas = listar();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Mesa m : mesas) {
                if (!m.getNumero().equals(numero)) {
                    writer.write(m.getNumero() + ";" + m.getLocal());
                    writer.newLine();
                }
            }
        }
    }
}
