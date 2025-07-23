package view;

import controller.AlunoController;
import controller.ApontamentoController;
import controller.CursoController;
import controller.DisciplinaController;
import controller.GradeController;
import controller.ProfessorController;
import model.Aluno;
import model.Apontamento;
import model.Curso;
import model.Disciplina;
import model.Grade;
import model.Professor;

public class AllObjectsScan {
    public AllObjectsScan() {}

    public void createCurso(Curso c) {
        CursoController controller = new CursoController();
        controller.createCurso(c);
    }

    public void createGrade(Grade g) {
        GradeController controller = new GradeController();
        controller.createGrade(g);
    }

    public void createDisciplina(Disciplina d) {
        DisciplinaController controller = new DisciplinaController();
        controller.createDisciplina(d);
    }

    public void createApontamento(Apontamento ap) {
        ApontamentoController controller = new ApontamentoController();
        controller.createApontamento(ap);
    }

    public void createProfessor(Professor p) {
        ProfessorController controller = new ProfessorController();
        controller.createProfessor(p);
    }

    public void createAluno(Aluno a) {
        AlunoController controller = new AlunoController();
        controller.createAluno(a);
    }
}
