package com.restaurante;

import com.restaurante.controllers.cliente.*;
import com.restaurante.controllers.funcionario.*;
import com.restaurante.controllers.mesa.*;
import com.restaurante.controllers.produto.*;
import com.restaurante.controllers.endereco.*;
import com.restaurante.model.Endereco;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instancia controllers
        CreateClienteController createCliente = new CreateClienteController();
        DeleteClienteController deleteCliente = new DeleteClienteController();
        SearchClienteController searchCliente = new SearchClienteController();

        CreateFuncionarioController createFuncionario = new CreateFuncionarioController();
        DeleteFuncionarioController deleteFuncionario = new DeleteFuncionarioController();
        SearchFuncionarioController searchFuncionario = new SearchFuncionarioController();

        CreateMesaController createMesa = new CreateMesaController();
        DeleteMesaController deleteMesa = new DeleteMesaController();
        SearchMesaController searchMesa = new SearchMesaController();

        CreateProdutoController createProduto = new CreateProdutoController();
        DeleteProdutoController deleteProduto = new DeleteProdutoController();
        SearchProdutoController searchProduto = new SearchProdutoController();

        // Controllers endereço
        CreateEnderecoController createEndereco = new CreateEnderecoController();
        DeleteEnderecoController deleteEndereco = new DeleteEnderecoController();
        SearchEnderecoController searchEndereco = new SearchEnderecoController();

        // Carrega lista de endereços do arquivo para usar em memória (lista compartilhada)
       List<Endereco> listaEnderecos = createEndereco.listarEnderecos();

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Cliente");
            System.out.println("2. Funcionário");
            System.out.println("3. Mesa");
            System.out.println("4. Produto");
            System.out.println("5. Endereço");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 -> menuCliente(scanner, createCliente, deleteCliente, searchCliente, listaEnderecos);
                case 2 -> menuFuncionario(scanner, createFuncionario, deleteFuncionario, searchFuncionario, listaEnderecos);
                case 3 -> menuMesa(scanner, createMesa, deleteMesa, searchMesa);
                case 4 -> menuProduto(scanner, createProduto, deleteProduto, searchProduto);
                case 5 -> menuEndereco(scanner, createEndereco, deleteEndereco, searchEndereco, listaEnderecos);
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }

    private static void menuCliente(Scanner scanner,
                                    CreateClienteController c,
                                    DeleteClienteController d,
                                    SearchClienteController s,
                                    List<Endereco> listaEnderecos) {
        System.out.println("\n--- CLIENTE ---");
        System.out.println("1. Cadastrar");
        System.out.println("2. Listar");
        System.out.println("3. Remover");
        System.out.print("Escolha: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {
            case 1 -> c.executar(listaEnderecos);
            case 2 -> s.executar();
            case 3 -> d.executar();
            default -> System.out.println("Opção inválida.");
        }
    }

    private static void menuFuncionario(Scanner scanner,
                                        CreateFuncionarioController c,
                                        DeleteFuncionarioController d,
                                        SearchFuncionarioController s,
                                        List<Endereco> listaEnderecos) {
        System.out.println("\n--- FUNCIONÁRIO ---");
        System.out.println("1. Cadastrar");
        System.out.println("2. Listar");
        System.out.println("3. Remover");
        System.out.print("Escolha: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {
            case 1 -> c.executar();
             case 2 -> s.executar();
            case 3 -> d.executar();
            default -> System.out.println("Opção inválida.");
        }
    }

    private static void menuMesa(Scanner scanner,
                                 CreateMesaController c,
                                 DeleteMesaController d,
                                 SearchMesaController s) {
        System.out.println("\n--- MESA ---");
        System.out.println("1. Adicionar");
        System.out.println("2. Listar");
        System.out.println("3. Remover");
        System.out.print("Escolha: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        try {
            switch (opcao) {
                case 1 -> c.adicionarMesa();
                case 2 -> s.listarMesas();
                case 3 -> d.removerMesa();
                default -> System.out.println("Opção inválida.");
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void menuProduto(Scanner scanner,
                                    CreateProdutoController c,
                                    DeleteProdutoController d,
                                    SearchProdutoController s) {
        System.out.println("\n--- PRODUTO ---");
        System.out.println("1. Adicionar");
        System.out.println("2. Listar");
        System.out.println("3. Remover");
        System.out.print("Escolha: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        try {
            switch (opcao) {
                case 1 -> c.adicionarProduto();
                case 2 -> s.listarProdutos();
                case 3 -> d.removerProduto();
                default -> System.out.println("Opção inválida.");
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void menuEndereco(Scanner scanner,
                                     CreateEnderecoController c,
                                     DeleteEnderecoController d,
                                     SearchEnderecoController s,
                                     List<Endereco> listaEnderecos) {
        System.out.println("\n--- ENDEREÇO ---");
        System.out.println("1. Cadastrar");
        System.out.println("2. Listar");
        System.out.println("3. Buscar por CEP");
        System.out.println("4. Remover");
        System.out.print("Escolha: ");
        int opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {
            case 1 -> c.criarEndereco(listaEnderecos);
            case 2 -> {
                if (listaEnderecos.isEmpty()) {
                    System.out.println("Nenhum endereço cadastrado.");
                } else {
                    System.out.println("Lista de Endereços:");
                    for (Endereco e : listaEnderecos) {
                        System.out.printf("%s, %d, CEP: %s%n", e.getTipo(), e.getNumero(), e.getCep());
                    }
                }
            }
            case 3 -> {
                System.out.print("Digite o CEP para busca: ");
                String cep = scanner.nextLine();
                Endereco endereco = s.buscarPorCep(listaEnderecos, cep);
                if (endereco != null) {
                    System.out.printf("Endereço encontrado: %s, %d, CEP: %s%n",
                            endereco.getTipo(), endereco.getNumero(), endereco.getCep());
                } else {
                    System.out.println("Endereço não encontrado.");
                }
            }
            case 4 -> {
                d.deletarEndereco(listaEnderecos);
            }
            default -> System.out.println("Opção inválida.");
        }
    }
}
