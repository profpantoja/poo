package com.restaurante.controllers.cliente;

import com.restaurante.dao.ClienteDAO;
import com.restaurante.dao.EnderecoDAO;
import com.restaurante.model.Cliente;
import com.restaurante.model.Endereco;
import com.restaurante.view.ClienteView;
import com.restaurante.controllers.endereco.SearchEnderecoController;

import java.util.List;
import java.util.Scanner;

public class CreateClienteController {
    private ClienteView view = new ClienteView();
    private ClienteDAO dao = new ClienteDAO();
    private EnderecoDAO enderecoDAO = new EnderecoDAO();
    private SearchEnderecoController searchEndereco = new SearchEnderecoController();
    private List<Endereco> enderecos;

    public void executar(List<Endereco> enderecos) {
        this.enderecos = enderecos;

        Cliente cliente = view.capturarCliente();
        Endereco endereco = buscarOuCriarEndereco();
        cliente.setEndereco(endereco);

        dao.salvar(cliente);
        view.mostrarMensagem("Cliente cadastrado com sucesso!");
    }

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
