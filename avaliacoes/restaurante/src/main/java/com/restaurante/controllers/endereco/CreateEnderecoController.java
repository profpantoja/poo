package com.restaurante.controllers.endereco;

import com.restaurante.dao.EnderecoDAO;
import com.restaurante.model.Endereco;
import com.restaurante.view.EnderecoView;

import java.util.List;

public class CreateEnderecoController {
    private EnderecoDAO dao = new EnderecoDAO();
    private EnderecoView view = new EnderecoView();

    public void criarEndereco(List<Endereco> listaEnderecos) {
        Endereco novo = view.capturarEndereco();
        listaEnderecos.add(novo);
        dao.salvarEndereco(novo);
        view.mostrarMensagem("Endereço criado com sucesso!");
    }

    // 🔧 MÉTODO PÚBLICO NOVO
    public List<Endereco> listarEnderecos() {
        return dao.listarEnderecos();
    }
}
