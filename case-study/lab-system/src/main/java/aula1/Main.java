package aula1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import aula1.controle.Acesso;
import aula1.controle.Lab;
import aula1.controle.Manutencao;
import aula1.controle.Material;
import aula1.controle.Pessoa;
import aula1.repository.AcessoRepository;
import aula1.repository.LabRepository;
import aula1.repository.ManutencaoRepository;
import aula1.repository.MaterialRepository;
import aula1.repository.PessoaRepository;

public class Main {

    public static void main(String[] args) throws IOException {

        // Criando uma pessoa
        Pessoa pessoa = new Pessoa("henrique", "henrique", 1.58f);

        // Usando getters
        System.out.println("Usuário criado: " + pessoa.getUser());

        // Usando setters
        pessoa.setDtNascimento("02/01/2004");
        pessoa.setPeso(65.0);

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
        // Acesso não tem uma data de fim definida, após o fim do código a data de saída será definida
        Acesso acesso1 = new Acesso("13/09/2026", pessoa);

        // Criando uma manutenção
        Manutencao manutencao = new Manutencao(
                "Reparo de computador",
                "Preventiva",
                "Reparo em um dos equipamentos do laboratório j203",
                "19/09/2026");

        Path dados = Files.createTempDirectory("lab-system-");
        new PessoaRepository(dados).salvar(pessoa);
        new LabRepository(dados).salvar(labj203);
        MaterialRepository materialRepository = new MaterialRepository(dados);
        for (Material material : materiais) {
            materialRepository.salvar(material);
        }
        new AcessoRepository(dados).salvar(acesso1);
        new ManutencaoRepository(dados).salvar(manutencao);

        System.out.println("Arquivos CSV gerados em " + dados.toAbsolutePath());
    }
}
