package com.restaurante.dao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.restaurante.model.Mesa;

public class MesaDAO {
    private static final String FILE_NAME = "mesas.txt";

    public void salvar(Mesa mesa) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(mesa.getNumero() + ";" + mesa.getLocal());
            writer.newLine();
        }
    }

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
