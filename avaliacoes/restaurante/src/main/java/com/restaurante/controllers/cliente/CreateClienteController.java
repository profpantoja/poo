package com.restaurante.controllers.cliente;

import com.restaurante.dao.ClienteDAO;
import com.restaurante.dao.EnderecoDAO;
import com.restaurante.model.Cliente;
import com.restaurante.model.Endereco;
import com.restaurante.view.ClienteView;
import com.restaurante.controllers.endereco.SearchEnderecoController;

import java.util.List;
import java.util.Scanner;

/**
 * Controller responsável por lidar com a criação de clientes no sistema.
 * 
 * Esta classe realiza a captura de dados do cliente através da view,
 * permite a seleção ou criação de um endereço, associa o endereço ao cliente
 * e persiste os dados utilizando os DAOs.
 * 
 * Funciona em conjunto com a camada de visualização ({@link ClienteView}),
 * os modelos {@link Cliente} e {@link Endereco}, e os DAOs correspondentes.
 */
public class CreateClienteController {

    /** Interface de entrada e saída para o usuário. */
    private ClienteView view = new ClienteView();

    /** Objeto de acesso a dados para clientes. */
    private ClienteDAO dao = new ClienteDAO();

    /** Objeto de acesso a dados para endereços. */
    private EnderecoDAO enderecoDAO = new EnderecoDAO();

    /** Controlador de busca de endereços por CEP. */
    private SearchEnderecoController searchEndereco = new SearchEnderecoController();

    /** Lista de endereços disponíveis no sistema. */
    private List<Endereco> enderecos;

    /**
     * Executa o fluxo completo de cadastro de um novo cliente.
     * 
     * O método captura os dados do cliente, solicita ao usuário que selecione ou
     * cadastre um endereço, associa o endereço ao cliente e salva o cliente no sistema.
     * 
     * @param enderecos lista de endereços existentes no sistema
     */
    public void executar(List<Endereco> enderecos) {
        this.enderecos = enderecos;

        Cliente cliente = view.capturarCliente();
        Endereco endereco = buscarOuCriarEndereco();
        cliente.setEndereco(endereco);

        dao.salvar(cliente);
        view.mostrarMensagem("Cliente cadastrado com sucesso!");
    }

    /**
     * Permite ao usuário buscar um endereço existente ou cadastrar um novo.
     * 
     * O método pergunta ao usuário se ele deseja usar um endereço já existente
     * (com base no CEP) ou cadastrar um novo endereço preenchendo os dados manualmente.
     * 
     * @return o endereço selecionado ou recém-cadastrado
     */
    private Endereco buscarOuCriarEndereco() {
        Scanner scanner = view.getScanner();
        System.out.println("Deseja:");
        System.out.println("1. Escolher um endereço existente");
        System.out.println("2. Cadastrar novo endereço");
        System.out.print("Opção: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        if (opcao == 1) {
            System.out.print("Digite o CEP do endereço: ");
            String cep = scanner.nextLine();
            return searchEndereco.buscarPorCep(enderecos, cep);
        }

        // Criar novo
        System.out.print("Tipo (Rua, Av...): ");
        String tipo = scanner.nextLine();
        System.out.print("Número: ");
        int numero = Integer.parseInt(scanner.nextLine());
        System.out.print("CEP: ");
        String cep = scanner.nextLine();

        Endereco novo = new Endereco(tipo, cep, numero);
        enderecoDAO.salvarEndereco(novo);
        enderecos.add(novo);
        return novo;
    }
}
