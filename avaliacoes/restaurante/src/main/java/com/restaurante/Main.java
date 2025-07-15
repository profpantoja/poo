package com.restaurante;

import com.restaurante.controllers.cliente.*;
import com.restaurante.controllers.funcionario.*;
import com.restaurante.controllers.mesa.*;
import com.restaurante.controllers.produto.*;
import com.restaurante.controllers.endereco.*;
import com.restaurante.model.Endereco;

import java.util.List;
import java.util.Scanner;

/**
 * Classe principal da aplicação Restaurante.
 * 
 * Exibe um menu interativo no console para o usuário gerenciar Clientes, Funcionários, Mesas, Produtos e Endereços.
 * Utiliza controllers específicos para realizar operações de criação, listagem, busca e remoção.
 * Mantém uma lista compartilhada de endereços em memória para facilitar operações relacionadas a Endereço.
 * 
 * A aplicação encerra quando o usuário escolhe a opção 0.
 * 
 */
public class Main {

    /**
     * Ponto de entrada da aplicação.
     * Inicializa controllers, lista de endereços e controla o menu principal de opções.
     * 
     * @param args argumentos de linha de comando (não utilizados)
     */
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

        CreateEnderecoController createEndereco = new CreateEnderecoController();
        DeleteEnderecoController deleteEndereco = new DeleteEnderecoController();
        SearchEnderecoController searchEndereco = new SearchEnderecoController();

        // Carrega lista compartilhada de endereços
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

    /**
     * Menu de operações para a entidade Cliente.
     * 
     * @param scanner Scanner para entrada do usuário
     * @param c Controller de criação de cliente
     * @param d Controller de remoção de cliente
     * @param s Controller de busca/listagem de cliente
     * @param listaEnderecos Lista compartilhada de endereços para associar clientes
     */
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

    /**
     * Menu de operações para a entidade Funcionário.
     * 
     * @param scanner Scanner para entrada do usuário
     * @param c Controller de criação de funcionário
     * @param d Controller de remoção de funcionário
     * @param s Controller de busca/listagem de funcionário
     * @param listaEnderecos Lista compartilhada de endereços (não utilizada no menu atual, pode ser removida)
     */
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

    /**
     * Menu de operações para a entidade Mesa.
     * 
     * @param scanner Scanner para entrada do usuário
     * @param c Controller de criação de mesa
     * @param d Controller de remoção de mesa
     * @param s Controller de busca/listagem de mesa
     */
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

    /**
     * Menu de operações para a entidade Produto.
     * 
     * @param scanner Scanner para entrada do usuário
     * @param c Controller de criação de produto
     * @param d Controller de remoção de produto
     * @param s Controller de busca/listagem de produto
     */
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

    /**
     * Menu de operações para a entidade Endereço.
     * 
     * @param scanner Scanner para entrada do usuário
     * @param c Controller de criação de endereço
     * @param d Controller de remoção de endereço
     * @param s Controller de busca/listagem de endereço
     * @param listaEnderecos Lista compartilhada de endereços em memória
     */
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
            case 4 -> d.deletarEndereco(listaEnderecos);
            default -> System.out.println("Opção inválida.");
        }
    }
}
