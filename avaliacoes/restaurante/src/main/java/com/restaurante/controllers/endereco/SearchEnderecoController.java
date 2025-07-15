package com.restaurante.controllers.endereco;

import com.restaurante.model.Endereco;
import com.restaurante.view.EnderecoView;

import java.util.List;

public class SearchEnderecoController {
    private EnderecoView view = new EnderecoView();

    public void listarEnderecos(List<Endereco> listaEnderecos) {
        view.mostrarListaEnderecos(listaEnderecos);
    }

    public void buscarPorCep(List<Endereco> listaEnderecos) {
        String cep = view.capturarCep();
        Endereco e = buscarPorCep(listaEnderecos, cep);
        view.mostrarEndereco(e);
    }

    public Endereco buscarPorCep(List<Endereco> listaEnderecos, String cep) {
        return listaEnderecos.stream()
                .filter(end -> end.getCep().equals(cep))
                .findFirst()
                .orElse(null);
    }
}