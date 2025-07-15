package com.gym;


import java.util.ArrayList;
import java.util.List;

/**
 * Classe principal para executar um exemplo do sistema de academia.
 * 
 * Esta classe cria objetos representando as entidades principais do sistema:
 * alunos, treinadores, atendentes, planos, avaliações e assinaturas.
 * 
 * Inicialmente, são criados endereços e documentos para os usuários.
 * Em seguida, são criados os contatos, planos, e as entidades propriamente ditas.
 * 
 * Após a criação, os dados são exibidos no console, demonstrando as informações
 * armazenadas para cada tipo de entidade.
 * 
 * Essa classe serve como ponto de entrada para testes e demonstração do sistema.
 */
public class Main {
    /**
     * Método principal que inicializa os dados de exemplo e exibe as informações no console.
     * 
     * @param args argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        // Criação dos endereços de alunos, treinadores e atendentes
        Endereco enderecoAluno1 = new Endereco("22290-000", "Botafogo", "Rua Mercurio", 123);
        Endereco enderecoAluno2 = new Endereco("23000-100", "Copacabana", "Rua Atlântica", 321);
        Endereco enderecoTreinador1 = new Endereco("21860-147", "Benfica", "Rua Marte", 112);
        Endereco enderecoTreinador2 = new Endereco("20350-050", "Maria da Graça", "Rua Jupiter", 223);
        Endereco enderecoAtendente1 = new Endereco("22040-117", "Centro", "Rua Vênus", 456);
        Endereco enderecoAtendente2 = new Endereco("23040-020", "Jacarepagua", "Rua Terra", 789);

        // Criação dos documentos
        Documento docAluno1 = new Documento(TipoDoc.CPF, "123.456.789-00");
        Documento docAluno2 = new Documento(TipoDoc.CPF, "987.654.321-00");
        Documento docTreinador1 = new Documento(TipoDoc.RG, "MG-12.345.678");
        Documento docTreinador2 = new Documento(TipoDoc.RG, "ES-15.345.879");
        Documento docAtendente1 = new Documento(TipoDoc.CNH, "RJ-98.765.432");
        Documento docAtendente2 = new Documento(TipoDoc.CNH, "SP-10.765.289");

        // Criação das listas de contatos para os alunos
        List<Contato> contatosAluno1 = new ArrayList<>();
        contatosAluno1.add(new Contato(TipoContato.EMAIL, "maria@email.com"));
        contatosAluno1.add(new Contato(TipoContato.TELEFONE, "(21)98913-8865"));
        contatosAluno1.add(new Contato(TipoContato.INSTAGRAM, "mariasilvaa"));

        List<Contato> contatosAluno2 = new ArrayList<>();
        contatosAluno2.add(new Contato(TipoContato.EMAIL, "joao@email.com"));
        contatosAluno2.add(new Contato(TipoContato.TELEFONE, "(21)98773-8887"));
        contatosAluno2.add(new Contato(TipoContato.INSTAGRAM, "joaopedroo"));

        // Criação dos planos de assinatura
        Plano plano1 = new Plano("Mensal", 150.0f, "10/07/2025", "01/07/2025", "Cartão");
        Plano plano2 = new Plano("Anual", 1200.0f, "01/01/2025", "31/12/2025", "Dinheiro");

        // Criação dos alunos
        Aluno aluno1 = new Aluno(12345, "Maria Silva", docAluno1, "10/05/1995", "maria@email.com", enderecoAluno1, plano1, contatosAluno1);
        Aluno aluno2 = new Aluno(54321, "João Pedro", docAluno2, "15/08/1990", "joao@email.com", enderecoAluno2, plano2, contatosAluno2);

        // Criação dos treinadores
        Treinador treinador1 = new Treinador("Carlos Souza", docTreinador1, "(21)98888-8888", "carlos@email.com", "Manhã", "3000.00", "Treinador", "12345", enderecoTreinador1, "CREF123456");
        Treinador treinador2 = new Treinador("Mariana Lima", docTreinador2, "(21)97777-5555", "mariana@email.com", "Noite", "3200.00", "Treinadora", "67890", enderecoTreinador2, "CREF654321");

        // Criação dos atendentes
        Atendente atendente1 = new Atendente("Ana Paula", docAtendente1, "(21)97777-7777", "ana@email.com", "Tarde", "2000.00", "Atendente", "54321", enderecoAtendente1, 5);
        Atendente atendente2 = new Atendente("Lucas Silva", docAtendente2, "(21)96666-6666", "lucas@email.com", "Manhã", "2100.00", "Atendente", "98765", enderecoAtendente2, 7);

        // Criação das avaliações físicas dos alunos
        Avaliacao avaliacao1 = new Avaliacao('f', "01/07/2025", 1.65f, 60f, "Nenhuma", aluno1, treinador1);
        Avaliacao avaliacao2 = new Avaliacao('m', "05/07/2025", 1.80f, 85f, "Hipertensão", aluno2, treinador2);

        // Criação das assinaturas dos alunos
        Assinatura assinatura1 = new Assinatura(plano1, aluno1, "01/07/2025", "31/07/2025");
        Assinatura assinatura2 = new Assinatura(plano2, aluno2, "01/01/2025", "31/12/2025");

        // Listas para manipulação
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);

        List<Avaliacao> avaliacoes = new ArrayList<>();
        avaliacoes.add(avaliacao1);
        avaliacoes.add(avaliacao2);

        List<Assinatura> assinaturas = new ArrayList<>();
        assinaturas.add(assinatura1);
        assinaturas.add(assinatura2);

        List<Treinador> treinadores = new ArrayList<>();
        treinadores.add(treinador1);
        treinadores.add(treinador2);

        List<Atendente> atendentes = new ArrayList<>();
        atendentes.add(atendente1);
        atendentes.add(atendente2);

        // Impressão dos dados dos alunos, avaliações e assinaturas
        for (int i = 0; i < alunos.size(); i++) {
            Aluno a = alunos.get(i);
            Avaliacao av = avaliacoes.get(i);
            Assinatura as = assinaturas.get(i);
            System.out.println("\n=== DADOS DO ALUNO " + (i + 1) + " ===");
            System.out.println("Nome: " + a.getNome());
            System.out.println("Matrícula: " + a.getMatricula());
            System.out.println("Documento: " + a.getDocumento().getTipo() + " - " + a.getDocumento().getConteudo());
            System.out.println("Data de Nascimento: " + a.getDataNasc());
            System.out.println("Email: " + a.getEmail());
            System.out.println("Endereço: " + a.getEndereco().getRua() + ", " + a.getEndereco().getNumero() + " - " + a.getEndereco().getBairro());
            System.out.println("Plano: " + a.getPlano().getTipo() + ", Valor: R$ " + a.getPlano().getValor());
            System.out.println("Contatos:");
            for (Contato c : a.getContatos()) {
                System.out.println("  " + c.getTipo() + ": " + c.getConteudo());
            }
            System.out.println("\n=== AVALIAÇÃO DO ALUNO " + (i + 1) + " ===");
            System.out.println("Data: " + av.getData());
            System.out.println("Altura: " + av.getAltura() + " m");
            System.out.println("Peso: " + av.getPeso() + " kg");
            System.out.println("IMC: " + String.format("%.2f", av.getImc()));
            System.out.println("Gênero: " + av.mostrarGenero());
            System.out.println("Doenças: " + av.getDoencas());
            System.out.println("\n=== ASSINATURA DO ALUNO " + (i + 1) + " ===");
            System.out.println("Plano: " + as.getPlano().getTipo());
            System.out.println("Data do Contrato: " + as.getDataContrato());
            System.out.println("Data Final: " + as.getDataFinal());
        }

        // Impressão dos dados dos treinadores
        for (int i = 0; i < treinadores.size(); i++) {
            Treinador t = treinadores.get(i);
            System.out.println("\n=== DADOS DO TREINADOR " + (i + 1) + " ===");
            System.out.println("Nome: " + t.getNome());
            System.out.println("Documento: " + t.getDocumento().getTipo() + " - " + t.getDocumento().getConteudo());
            System.out.println("Telefone: " + t.getTelefone());
            System.out.println("Email: " + t.getEmail());
            System.out.println("Turno: " + t.getTurno());
            System.out.println("Salário: R$ " + t.getSalario());
            System.out.println("Cargo: " + t.getCargo());
            System.out.println("CREF: " + t.getCref());
        }

        // Impressão dos dados dos atendentes
        for (int i = 0; i < atendentes.size(); i++) {
            Atendente a = atendentes.get(i);
            System.out.println("\n=== DADOS DO ATENDENTE " + (i + 1) + " ===");
            System.out.println("Nome: " + a.getNome());
            System.out.println("Documento: " + a.getDocumento().getTipo() + " - " + a.getDocumento().getConteudo());
            System.out.println("Telefone: " + a.getTelefone());
            System.out.println("Email: " + a.getEmail());
            System.out.println("Turno: " + a.getTurno());
            System.out.println("Salário: R$ " + a.getSalario());
            System.out.println("Cargo: " + a.getCargo());
            System.out.println("Guichê: " + a.getGuiche());
        }
    }
}
