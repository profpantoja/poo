package com.restaurante.controllers.endereco;

import com.restaurante.dao.EnderecoDAO;
import com.restaurante.model.Endereco;
import com.restaurante.view.EnderecoView;

import java.util.List;

/**
 * Controller responsável pela criação e listagem de endereços no sistema.
 * 
 * Esta classe permite que o usuário cadastre um novo endereço e o adicione à lista atual,
 * além de fornecer acesso à listagem completa dos endereços armazenados.
 * 
 * Utiliza {@link EnderecoView} para interagir com o usuário e {@link EnderecoDAO}
 * para persistência dos dados.
 */
public class CreateEnderecoController {

    /** Objeto de acesso a dados para endereços. */
    private EnderecoDAO dao = new EnderecoDAO();

    /** Interface de entrada e saída para o usuário. */
    private EnderecoView view = new EnderecoView();

    /**
     * Cria um novo endereço com base nas informações fornecidas pelo usuário.
     * 
     * O endereço é adicionado à lista local e também salvo no banco de dados.
     * 
     * @param listaEnderecos lista local de endereços onde o novo endereço será adicionado
     */
    public void criarEndereco(List<Endereco> listaEnderecos) {
        Endereco novo = view.capturarEndereco();
        listaEnderecos.add(novo);
        dao.salvarEndereco(novo);
        view.mostrarMensagem("Endereço criado com sucesso!");
    }

    /**
     * Retorna a lista de endereços cadastrados no sistema.
     * 
     * Este método permite acessar os endereços diretamente da base de dados.
     * 
     * @return uma lista de endereços cadastrados
     */
    public List<Endereco> listarEnderecos() {
        return dao.listarEnderecos();
    }
}
