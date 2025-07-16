package controllers;

import java.util.List;

import DAO.FuncionarioDAO;
import models.Funcionario;

public class FuncionarioController {
 
    
    private Funcionario funcionario;
    private FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    public void creatFuncionario(String nome, String cpf, String cargo, String ctps){

        Funcionario funcionario = new Funcionario(nome, cpf, cargo, ctps);

        funcionarioDAO.add(funcionario);
    }

    public List<Funcionario> readFuncionarios(){
        return funcionarioDAO.getAll();
    }

    public boolean deleteFuncionario(int id){

        if(id < 0){
            throw new IllegalArgumentException("ID não pode ser negativo");
        }
        
        return funcionarioDAO.delete(id);
    }

}