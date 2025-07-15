package com.restaurante.controllers.endereco;

import com.restaurante.dao.EnderecoDAO;
import com.restaurante.model.Endereco;
import com.restaurante.view.EnderecoView;

import java.util.List;

public class DeleteEnderecoController {
    private EnderecoDAO dao = new EnderecoDAO();
    private EnderecoView view = new EnderecoView();

   public void deletarEndereco(List<Endereco> listaEnderecos) {
    String cep = view.capturarCep();
    boolean removido = dao.deletarEnderecoPorCep(listaEnderecos, cep);
    if (removido) {
        view.mostrarMensagem("Endereço removido com sucesso.");
    } else {
        view.mostrarMensagem("Endereço não encontrado.");
    }
}

}
