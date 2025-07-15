package com.restaurante.controllers.endereco;

import com.restaurante.model.Endereco;
import com.restaurante.view.EnderecoView;

import java.util.List;

/**
 * Controller responsável por listar e buscar endereços cadastrados no sistema.
 * 
 * Esta classe permite ao usuário visualizar todos os endereços disponíveis ou
 * realizar buscas específicas por CEP. A exibição dos dados é feita por meio
 * da {@link EnderecoView}.
 * 
 * Também disponibiliza um método público para busca direta por CEP, útil para
 */
public class SearchEnderecoController {

    /** Interface de entrada e saída para o usuário. */
    private EnderecoView view = new EnderecoView();

    /**
     * Lista todos os endereços fornecidos na lista.
     * 
     * Utiliza a view para exibir a lista completa.
     * 
     * @param listaEnderecos lista de endereços a serem exibidos
     */
    public void listarEnderecos(List<Endereco> listaEnderecos) {
        view.mostrarListaEnderecos(listaEnderecos);
    }

    /**
     * Solicita ao usuário um CEP, busca o endereço correspondente
     * na lista fornecida e exibe o resultado.
     * 
     * Caso o CEP não seja encontrado, exibe uma mensagem com valor nulo.
     * 
     * @param listaEnderecos lista de endereços onde será feita a busca
     */
    public void buscarPorCep(List<Endereco> listaEnderecos) {
        String cep = view.capturarCep();
        Endereco e = buscarPorCep(listaEnderecos, cep);
        view.mostrarEndereco(e);
    }

    /**
     * Busca diretamente por um endereço com o CEP especificado.
     * 
     * Este método pode ser utilizado por outros controllers para reutilização da lógica.
     * 
     * @param listaEnderecos lista de endereços onde será realizada a busca
     * @param cep o CEP a ser pesquisado
     * @return o endereço correspondente ao CEP ou {@code null} se não for encontrado
     */
    public Endereco buscarPorCep(List<Endereco> listaEnderecos, String cep) {
        return listaEnderecos.stream()
                .filter(end -> end.getCep().equals(cep))
                .findFirst()
                .orElse(null);
    }
}
