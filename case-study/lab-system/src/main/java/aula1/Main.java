package aula1;

import java.util.ArrayList;

import aula1.controle.Acesso;
import aula1.controle.Acesso_Repository;
import aula1.controle.Lab;
import aula1.controle.Lab_Repository;
import aula1.controle.Manutencao;
import aula1.controle.Manutencao_Repository;
import aula1.controle.Material;
import aula1.controle.Material_Repository;
import aula1.controle.Pessoa;
import aula1.controle.Pessoa_Repository;
import aula1.controle.Tecnico;
import aula1.controle.Tecnico_Repository;

public class Main {

    public static void main(String[] args) {

        // Criando uma pessoa
        Tecnico pessoa = new Tecnico("Malu", "crfmarialu", 1.69f, "REG-1234");

        // Usando getters
        System.out.println("Usuário criado: " + pessoa.getUser());
        pessoa.exibirFuncao();

        // Usando setters
        pessoa.setDtNascimento("06/03/2005");
        pessoa.setPeso(63.0f);

        // Criando um laboratório
        Lab labj203 = new Lab("203", "Laboratório para a disciplina de POO.", "J");
        System.out.println("Adicionando materiais ao laboratório " + labj203.getArea() + labj203.getCod());

        // Criando materiais para o laboratório
        ArrayList<Material> materiais = labj203.getMateriais();

        Material m1 = new Material("CAD1", "Cadeira giratória", "Escritório");
        Material m2 = new Material("MES1", "Mesa de madeira", "Escritório");
        Material m3 = new Material("CAN1", "Caneta marcadora", "Cor Azul");

        materiais.add(m1);
        materiais.add(m2);
        materiais.add(m3);

        for (Material material : labj203.getMateriais()) {
            System.out.println("Nome: " + material.getNome());
        }

        // Criando um acesso para a pessoa
        // Acesso não tem uma data de fim definida, após o fim do código a data de saída
        // será definida
        Acesso acesso1 = new Acesso("13/09/2026", pessoa);

        boolean loginValido = pessoa.autenticar("crfmarialu");
        System.out.println("Login válido? " + loginValido);

        // usando Get
        System.out.println("Acesso do usuário " + pessoa.getUser() + " liberado!");

        // Criando uma manutenção
        Manutencao manutencao = new Manutencao(
                "Reparo de computador",
                "Preventiva",
                "Reparo em um dos equipamentos do laboratório j203",
                "19/09/2026");

        // Testando métodos de Técnico
        pessoa.registrarManutencao(manutencao);
        pessoa.registrarManutencao(manutencao, "Troca de pasta térmica e limpeza de cooler.");

        // Usando sobrecarga de método para registrar a saída
        acesso1.registrarSaida("19/09/2026 01:00");
        System.out.println("Saída registrada para: " + acesso1.getDtSaida());

        System.out.println("\n========== TESTES DOS REPOSITÓRIOS CSV ==========");

        // Repositório de Pessoas
        Pessoa_Repository repoPessoa = new Pessoa_Repository();
        repoPessoa.salvar(pessoa);

        Pessoa aluno = new Pessoa("João", "cageyBarley", 1.81f);
        aluno.setPeso(70.0);
        aluno.setDtNascimento("06/10/2004");
        repoPessoa.salvar(aluno);

        // Repositório de Técnicos
        Tecnico_Repository repoTecnico = new Tecnico_Repository();
        repoTecnico.salvar(pessoa);

        // Repositório de Laboratórios
        Lab_Repository repoLab = new Lab_Repository();
        repoLab.salvar(labj203);

        // Repositório de Materiais
        Material_Repository repoMaterial = new Material_Repository();
        repoMaterial.salvar(m1);
        repoMaterial.salvar(m2);
        repoMaterial.salvar(m3);

        // Repositório de Manutenções
        Manutencao_Repository repoManutencao = new Manutencao_Repository();
        repoManutencao.salvar(manutencao);

        // Repositório de Acessos
        Acesso_Repository repoAcesso = new Acesso_Repository();
        repoAcesso.salvar(acesso1);

        System.out.println("\n--- Consultando dados nos CSVs ---");
        System.out.println("Labs cadastrados: " + repoLab.buscar().size());
        System.out.println("Materiais cadastrados: " + repoMaterial.buscar().size());
        System.out.println("Manutenções cadastradas: " + repoManutencao.buscar().size());
        System.out.println("Acessos cadastrados: " + repoAcesso.buscar().size());
    }
}
