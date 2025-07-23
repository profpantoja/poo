package view;

import controller.ApontamentoController;
import controller.DisciplinaController;
import model.Apontamento;
import model.Disciplina;

import java.util.List;
import java.util.Scanner;

public class ApontamentoScan {
    private static Scanner scanner = new Scanner(System.in);
    private static DisciplinaController disciplinaController = new DisciplinaController();
    private static ApontamentoController apontamentoController;

    public static void main(String[] args) {
        List<Disciplina> disciplinas = disciplinaController.listarDisciplinas();
        apontamentoController = new ApontamentoController(disciplinas);

        int opcao;
        do {
            System.out.println("\n--- Menu Apontamentos ---");
            System.out.println("1 - Listar apontamentos");
            System.out.println("2 - Cadastrar apontamento");
            System.out.println("3 - Deletar apontamento");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    listarApontamentos();
                    break;
                case 2:
                    cadastrarApontamento();
                    break;
                case 3:
                    deletarApontamento();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
    }

    private static void listarApontamentos() {
        List<Apontamento> apontamentos = apontamentoController.listarApontamentos();
        if (apontamentos.isEmpty()) {
            System.out.println("Nenhum apontamento registrado.");
            return;
        }
        int id = 1;
        for (Apontamento a : apontamentos) {
            System.out.println("ID: " + id++);
            a.imprimirRegistro();
            System.out.println();
        }
    }

    private static void cadastrarApontamento() {
        System.out.println("\n-- Cadastrar novo apontamento --");

        System.out.print("Nota: ");
        Double nota = Double.parseDouble(scanner.nextLine());

        System.out.print("Status: ");
        String status = scanner.nextLine();

        System.out.print("Data (ex: 2025-07-12): ");
        String data = scanner.nextLine();

        List<Disciplina> disciplinas = disciplinaController.listarDisciplinas();
        if (disciplinas.isEmpty()) {
            System.out.println("Não há disciplinas cadastradas para associar.");
            return;
        }

        System.out.println("Disciplinas disponíveis:");
        for (Disciplina d : disciplinas) {
            System.out.println("- " + d.getNome());
        }

        System.out.print("Nome da disciplina associada: ");
        String nomeDisc = scanner.nextLine();

        Disciplina disciplinaSelecionada = null;
        for (Disciplina d : disciplinas) {
            if (d.getNome().equalsIgnoreCase(nomeDisc)) {
                disciplinaSelecionada = d;
                break;
            }
        }

        if (disciplinaSelecionada == null) {
            System.out.println("Disciplina não encontrada.");
            return;
        }

        Apontamento apontamento = new Apontamento(nota, status, data, disciplinaSelecionada);
        boolean sucesso = apontamentoController.criarApontamento(apontamento);
        if (sucesso) {
            System.out.println("Apontamento cadastrado com sucesso!");
        } else {
            System.out.println("Erro ao cadastrar apontamento.");
        }
    }

    private static void deletarApontamento() {
        listarApontamentos();
        System.out.print("Informe o ID do apontamento para deletar: ");
        int id = Integer.parseInt(scanner.nextLine());

        boolean sucesso = apontamentoController.deletarApontamento(id);
        if (sucesso) {
            System.out.println("Apontamento deletado com sucesso!");
        } else {
            System.out.println("ID inválido ou erro ao deletar.");
        }
    }
}
