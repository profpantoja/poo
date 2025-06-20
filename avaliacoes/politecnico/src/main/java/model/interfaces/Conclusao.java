package model.interfaces;

import java.util.ArrayList;

import model.Disciplina;

/**
 * Interface que verifica a conclusão de um curso ou grade curricular
 */
public interface Conclusao {

/**
     * Verifica se todas as disciplinas obrigatórias foram concluidas
     *
     * @return {@code true} se o curso estiver integralizado, {@code false} caso contrário
     */
    public boolean estaIntegralizado();

    /**
     * Retorna uma lista com as disciplinas que o aluno ainda não concluiu
     */
    public ArrayList<Disciplina> getDisciplinasFaltantes();

}
