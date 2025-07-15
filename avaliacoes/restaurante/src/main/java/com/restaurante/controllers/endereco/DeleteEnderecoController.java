package com.restaurante.controllers.endereco;

import com.restaurante.dao.EnderecoDAO;
import com.restaurante.model.Endereco;
import com.restaurante.view.EnderecoView;

import java.util.List;

/**
 * Controller responsável por excluir endereços do sistema com base no CEP.
 * 
 * Interage com o usuário por meio da {@link EnderecoView} para capturar o CEP
 * do endereço a ser removido e utiliza a {@link EnderecoDAO} para realizar a exclusão
 * tanto na lista local quanto na persistência (se aplicável).
 * 
 * Exibe mensagens informando se a exclusão foi realizada com sucesso ou se o endereço
 * não foi encontrado.
 * 
 */
public class DeleteEnderecoController {

    /** Objeto de acesso a dados para endereços. */
    private EnderecoDAO dao = new EnderecoDAO();

    /** Interface de entrada e saída para o usuário. */
    private EnderecoView view = new EnderecoView();

    /**
     * Exclui um endereço da lista com base no CEP informado pelo usuário.
     * 
     * O método busca o endereço na lista fornecida e, se encontrado,
     * o remove e informa o sucesso da operação. Caso contrário,
     * informa que o endereço não foi encontrado.
     * 
     * @param listaEnderecos lista de endereços disponíveis no sistema
     */
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
