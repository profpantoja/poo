package view;

import controller.DisciplinaController;
import model.Disciplina;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DisciplinaScan {
    private static DisciplinaController controller = new DisciplinaController();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n=== Menu Disciplina ===");
            System.out.println("1 - Listar disciplinas");
            System.out.println("2 - Cadastrar disciplina");
            System.out.println("3 - Atualizar disciplina");
            System.out.println("4 - Deletar disciplina");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    listarDisciplinas();
                    break;
                case 2:
                    cadastrarDisciplina();
                    break;
                case 3:
                    atualizarDisciplina();
                    break;
                case 4:
                    deletarDisciplina();
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

    private static void listarDisciplinas() {
        List<Disciplina> disciplinas = controller.listarDisciplinas();
        if (disciplinas.isEmpty()) {
            System.out.println("Nenhuma disciplina cadastrada.");
            return;
        }
        for (Disciplina d : disciplinas) {
            d.imprimirRequisitos();
            System.out.println();
        }
    }

    private static void cadastrarDisciplina() {
        System.out.println("\n-- Cadastrar nova disciplina --");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Período: ");
        int periodo = Integer.parseInt(scanner.nextLine());

        System.out.print("Carga Horária: ");
        int ch = Integer.parseInt(scanner.nextLine());

        System.out.print("Pré-requisitos (separados por vírgula, vazio se não tiver): ");
        String preReqInput = scanner.nextLine();

        List<Disciplina> preReqs = pegarPreRequisitos(preReqInput);

        Disciplina nova = new Disciplina(nome, periodo, ch);
        for (Disciplina pre : preReqs) {
            nova.addPreReq(pre);
        }

        boolean sucesso = controller.criarDisciplina(nova);
        if (sucesso) {
            System.out.println("Disciplina cadastrada com sucesso!");
        } else {
            System.out.println("Erro: disciplina já existe.");
        }
    }

    private static void atualizarDisciplina() {
        System.out.println("\n-- Atualizar disciplina existente --");
        System.out.print("Nome da disciplina a atualizar: ");
        String nome = scanner.nextLine();

        Disciplina existente = controller.buscarDisciplina(nome);
        if (existente == null) {
            System.out.println("Disciplina não encontrada.");
            return;
        }

        System.out.println("Deixe vazio para manter o valor atual.");

        System.out.print("Novo nome (" + existente.getNome() + "): ");
        String novoNome = scanner.nextLine();
        if (novoNome != null && !novoNome.trim().isEmpty()) {
            existente.setNome(novoNome);
        }

        System.out.print("Novo período (" + existente.getPeriodo() + "): ");
        String novoPeriodoStr = scanner.nextLine();
        if (novoPeriodoStr != null && !novoPeriodoStr.trim().isEmpty()) {
            int novoPeriodo = Integer.parseInt(novoPeriodoStr);
            existente.setPeriodo(novoPeriodo);
        }

        System.out.print("Nova carga horária (" + existente.getCh() + "): ");
        String novaChStr = scanner.nextLine();
        if (novaChStr != null && !novaChStr.trim().isEmpty()) {
            int novaCh = Integer.parseInt(novaChStr);
            existente.setCh(novaCh);
        }

        System.out.print("Novos pré-requisitos (separados por vírgula, vazio para manter): ");
        String preReqInput = scanner.nextLine();
        if (preReqInput != null && !preReqInput.trim().isEmpty()) {
            List<Disciplina> preReqs = pegarPreRequisitos(preReqInput);
            existente.setPreRequisitos(new ArrayList<Disciplina>());
            for (Disciplina pre : preReqs) {
                existente.addPreReq(pre);
            }
        }

        boolean sucesso = controller.atualizarDisciplina(existente);
        if (sucesso) {
            System.out.println("Disciplina atualizada com sucesso!");
        } else {
            System.out.println("Erro ao atualizar disciplina.");
        }
    }

    private static void deletarDisciplina() {
        System.out.println("\n-- Deletar disciplina --");
        System.out.print("Nome da disciplina a deletar: ");
        String nome = scanner.nextLine();

        boolean sucesso = controller.deletarDisciplina(nome);
        if (sucesso) {
            System.out.println("Disciplina deletada com sucesso!");
        } else {
            System.out.println("Disciplina não encontrada.");
        }
    }

    private static List<Disciplina> pegarPreRequisitos(String entrada) {
        List<Disciplina> preReqs = new ArrayList<>();
        if (entrada == null || entrada.trim().isEmpty()) {
            return preReqs;
        }

        String[] nomes = entrada.split(",");
        List<Disciplina> todas = controller.listarDisciplinas();

        for (String nome : nomes) {
            nome = nome.trim();
            for (Disciplina d : todas) {
                if (d.getNome().equalsIgnoreCase(nome)) {
                    preReqs.add(d);
                    break;
                }
            }
        }

        return preReqs;
    }
}
