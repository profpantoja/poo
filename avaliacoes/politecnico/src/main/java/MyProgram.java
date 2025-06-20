/**
* Importação de bibliotecas e classes
*/
import java.util.ArrayList;

import model.Aluno;
import model.Apontamento;
import model.Curso;
import model.Disciplina;
import model.Grade;
import model.Politecnico;
import model.Professor;

/**
* @author Melissa Jaquet
*/

public class MyProgram {
/**
* Método principal responsável por inicializar e executar a simulação do sistema educacional
*/
    public static void main(String[] args) {

        ArrayList<Curso> cursosPPorto = new ArrayList<Curso>();

        Curso licenciaturaCienciasEmpresariais = new Curso("Licenciatura em Ciências Empresariais (Pós-Laboral) ",
                "8601/2019 de 27 de setembro");
        Curso licenciaturaCienciasEmpresariaisPosLaboral = new Curso(
                "Licenciatura em Ciências Empresariais (Pós-Laboral)", "8601/2019 de 27 de setembro");
        Curso licenciaturaEngenhariaInfomatica = new Curso("Licenciatura em Engenharia Informática ",
                " 2067/2022 de 16 de fevereiro");
        Curso licenciaturaGesaoIndustrialLogistica = new Curso("Licenciatura em Gestão Industrial e Logística ",
                "  6732/2018 ");
        Curso licenciaturaSegurancaDoTrabalhoEAmbiente = new Curso("Licenciatura em Gestão Industrial e Logística ",
                "3205/2022");
        Curso licenciaturaSegurancaInformaticaEmRedesDeComputadores = new Curso(
                "Licenciatura em Segurança Informática em Redes de Computadores ", " 6064/2021");
        Curso licenciaturaSistemasDeInformacaoParaGestao = new Curso(
                "Licenciatura em Sistemas de Informação para a Gestão ", "9929/2020 de 14 de outubro");
        Curso licenciaturaSolicitadoria = new Curso("Licenciatura em Solicitadoria ", "7798/2022");
        Curso licenciaturaSolicitadoriaPosLaboral = new Curso(" Licenciatura em Solicitadoria (Pós-Laboral) ",
                "7798/2022 de 24 de junho");

        cursosPPorto.add(licenciaturaCienciasEmpresariais);
        cursosPPorto.add(licenciaturaCienciasEmpresariaisPosLaboral);
        cursosPPorto.add(licenciaturaEngenhariaInfomatica);
        cursosPPorto.add(licenciaturaGesaoIndustrialLogistica);
        cursosPPorto.add(licenciaturaSegurancaDoTrabalhoEAmbiente);
        cursosPPorto.add(licenciaturaSegurancaInformaticaEmRedesDeComputadores);
        cursosPPorto.add(licenciaturaSistemasDeInformacaoParaGestao);
        cursosPPorto.add(licenciaturaSolicitadoria);
        cursosPPorto.add(licenciaturaSolicitadoriaPosLaboral);

        ArrayList<Disciplina> disciplinasGrade = new ArrayList<Disciplina>();

        /* Primeiro Período */
        Disciplina algLin = new Disciplina("Álgebra Linear e Geometria Analítica", 1, 18 * 6);
        Disciplina fisicaAplicada = new Disciplina("Física Aplicada", 1, 18 * 5);
        Disciplina fundamentosProgramacao = new Disciplina("Fundamentos de Programação", 1, 18 * 7);
        Disciplina inroducaoSistComputacionais = new Disciplina("Introdução aos Sistemas Computacionais", 1, 18 * 5);
        Disciplina laboratorioProgramacao = new Disciplina("Laboratório de Programação", 1, 18 * 7);
        /* Segundo Período */
        Disciplina engSoftwareI = new Disciplina("Engenharia de Software I", 2, 18 * 7);
        Disciplina matComputacional = new Disciplina("Matemáica Computacional I ", 2, 18 * 6);
        Disciplina matDiscreta = new Disciplina("Matemática Discreta", 2, 18 * 6);
        Disciplina paradigmasProgramacao = new Disciplina("Paradigmas de Programação", 2, 18 * 7);
        Disciplina sistDigitaisArqComputadores = new Disciplina("Sistemas Digitais e Arquitetura de Computadores", 2,
                18 * 4);
        /* Terceiro Período */
        Disciplina engSoftwareII = new Disciplina("Engenharia de Software II", 3, 18 * 7);
        Disciplina estruturaDados = new Disciplina("Estruturas de Dados", 3, 18 * 7);
        Disciplina matCompII = new Disciplina("Matemática Computacional II", 3, 18 * 6);
        Disciplina processEsruturadoInfo = new Disciplina("Processamento Estruturado de Informação", 1, 18 * 5);
        Disciplina sistOperativos = new Disciplina("Sistemas Operativos", 3, 18 * 5);
        /* Quarto Período */
        Disciplina analiseAlgOtimizacao = new Disciplina("Análise Algorítmica e Otimização", 4, 18 * 6);
        Disciplina baseDadoDisciplina = new Disciplina("Bases de Dados", 4, 18 * 6);
        Disciplina gestaoProjetosInfo = new Disciplina("Gestão de Projetos Informáticos", 2, 18 * 6);
        Disciplina progWeb = new Disciplina("Programação em Ambiente Web", 4, 18 * 7);
        Disciplina redesComp = new Disciplina("Redes de Computadores", 4, 18 * 7);
        /* Quinto Período */
        Disciplina admSistInfo = new Disciplina("Administração de Sistemas Informáticos", 5, 18 * 5);
        Disciplina comopMovelUbiqua = new Disciplina("Computação Móvel e Ubíqua", 5, 18 * 6);
        Disciplina labDevSoftware = new Disciplina("Laboratório de Desenvolvimento de Software", 5, 18 * 7);
        Disciplina sistInfo = new Disciplina("Sistemas de Informação", 5, 18 * 6);
        Disciplina sistDistribuidos = new Disciplina("Sistemas Distribuídos", 5, 18 * 6);
        /* Sexto Período */
        Disciplina inteligenciaArtificial = new Disciplina("Inteligência Artificial", 6, 18 * 5);
        Disciplina projFinal = new Disciplina("Projeto Final", 6, 18 * 18);
        Disciplina sistInfoOrganizacional = new Disciplina("Sistemas de Informação Organizacionais", 6, 18 * 4);
        Disciplina nocoesGestao = new Disciplina("Noções de Gestão (opcional)", 6, 18 * 3);

        disciplinasGrade.add(algLin);
        disciplinasGrade.add(fisicaAplicada);
        disciplinasGrade.add(fundamentosProgramacao);
        disciplinasGrade.add(inroducaoSistComputacionais);
        disciplinasGrade.add(laboratorioProgramacao);
        disciplinasGrade.add(engSoftwareI);
        disciplinasGrade.add(matComputacional);
        disciplinasGrade.add(matDiscreta);
        disciplinasGrade.add(paradigmasProgramacao);
        disciplinasGrade.add(sistDigitaisArqComputadores);
        /* Cria os Pré-Requisitos e depois adiciona a disciplina na grade */
        engSoftwareII.setPreRequisitos(new ArrayList<Disciplina>());
        engSoftwareII.getPreRequisitos().add(engSoftwareI);
        disciplinasGrade.add(engSoftwareII);
        disciplinasGrade.add(estruturaDados);
        /* Cria os Pré-Requisitos e depois adiciona a disciplina na grade */
        matCompII.setPreRequisitos(new ArrayList<Disciplina>());
        matCompII.getPreRequisitos().add(matComputacional);
        disciplinasGrade.add(matCompII);
        disciplinasGrade.add(processEsruturadoInfo);
        disciplinasGrade.add(sistOperativos);
        disciplinasGrade.add(analiseAlgOtimizacao);
        /* Cria os Pré-Requisitos e depois adiciona a disciplina na grade */
        baseDadoDisciplina.setPreRequisitos(new ArrayList<Disciplina>());
        baseDadoDisciplina.getPreRequisitos().add(estruturaDados);
        disciplinasGrade.add(baseDadoDisciplina);
        disciplinasGrade.add(gestaoProjetosInfo);
        /* Cria os Pré-Requisitos e depois adiciona a disciplina na grade */
        progWeb.setPreRequisitos(new ArrayList<Disciplina>());
        progWeb.getPreRequisitos().add(fundamentosProgramacao);
        disciplinasGrade.add(progWeb);
        disciplinasGrade.add(redesComp);
        disciplinasGrade.add(admSistInfo);
        disciplinasGrade.add(comopMovelUbiqua);
        disciplinasGrade.add(labDevSoftware);
        disciplinasGrade.add(sistInfo);
        disciplinasGrade.add(sistDistribuidos);
        disciplinasGrade.add(inteligenciaArtificial);
        disciplinasGrade.add(projFinal);
        disciplinasGrade.add(sistInfoOrganizacional);
        disciplinasGrade.add(nocoesGestao);

        Grade gradeLicenciaturaEngenhariaInformatica = new Grade(2022, licenciaturaEngenhariaInfomatica,
                disciplinasGrade);
        Politecnico politecnicoDoPorto = new Politecnico("Politécnico do Porto", "https://www.estg.ipp.pt/",
                cursosPPorto);
        Professor professor = new Professor("Kadu", "Pantoja", "1234", 1, 1, politecnicoDoPorto);

        ArrayList<Apontamento> apontamentos = new ArrayList<Apontamento>();
        Aluno aluno = new Aluno("Julia", "Vita", "8979", 1651, gradeLicenciaturaEngenhariaInformatica, apontamentos);
        /* Cria os apontamentos no histórico do aluno */
        Apontamento apontamento1 = new Apontamento(8.0, "Aprovado", "2023-12-10", algLin);
        Apontamento apontamento2 = new Apontamento(8.5, "Aprovado", "2023-12-10", fisicaAplicada);
        Apontamento apontamento3 = new Apontamento(10.0, "Aprovado", "2023-12-10", fundamentosProgramacao);
        Apontamento apontamento4 = new Apontamento(10.0, "Aprovado", "2023-12-10", inroducaoSistComputacionais);
        Apontamento apontamento5 = new Apontamento(10.0, "Aprovado", "2023-12-10", laboratorioProgramacao);
        Apontamento apontamento6 = new Apontamento(9.5, "Aprovado", "2023-12-10", engSoftwareI);
        Apontamento apontamento7 = new Apontamento(8.0, "Aprovado", "2023-12-10", matComputacional);
        Apontamento apontamento8 = new Apontamento(8.0, "Aprovado", "2023-12-10", matDiscreta);
        Apontamento apontamento9 = new Apontamento(9.5, "Aprovado", "2023-12-10", paradigmasProgramacao);
        Apontamento apontamento10 = new Apontamento(10.0, "Aprovado", "2023-12-10", sistDigitaisArqComputadores);
        /*
         * Adiciona os apontamentos no ArrayList do Aluno. Perceba que o array já foi
         * adicionado no momento da chamada do construtor
         */
        apontamentos.add(apontamento1);
        apontamentos.add(apontamento2);
        apontamentos.add(apontamento3);
        apontamentos.add(apontamento4);
        apontamentos.add(apontamento5);
        apontamentos.add(apontamento6);
        apontamentos.add(apontamento7);
        apontamentos.add(apontamento8);
        apontamentos.add(apontamento9);
        apontamentos.add(apontamento10);

        aluno.imprimirPessoa();
        professor.imprimirPessoa();

        aluno.imprimirHistorico();
        System.out.println(aluno.estaIntegralizado());

        for (Disciplina d: aluno.getDisciplinasFaltantes()) {
            d.imprimirRequisitos();
        }

    }
}

