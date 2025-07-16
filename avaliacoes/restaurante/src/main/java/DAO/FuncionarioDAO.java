package DAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import models.Funcionario;

public class FuncionarioDAO {
 
    public String path = System.getProperty("user.dir") + "\\avaliacoes\\restaurante\\src\\main\\java\\db\\funcionario.txt";
    

    public void add (Funcionario funcionario){
        
        int id = this.getNextId();
        
        ArrayList<Funcionario> funcionarios = (ArrayList<Funcionario>) getAll();

        
        try (BufferedWriter db = new BufferedWriter(new FileWriter(path, false))) {
            
            funcionario.setId(id);
            funcionarios.add(funcionario);

            for(Funcionario func : funcionarios){
                db.write(func.getId() + "," + func.getNome() + "," + func.getCpf() + "," + func.getCargo() + "," + func.getCtps());
                db.newLine();
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    public List<Funcionario> getAll(){
        
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            
            String line;
            
            while((line = reader.readLine()) != null){
                
                String[] parts = line.split(",");

                int id = Integer.parseInt(parts[0]);
                String nome = parts[1];
                String cpf = parts[2];
                String cargo = parts[3];
                String ctps = parts[4];

                Funcionario funcionario = new Funcionario(nome, cpf, cargo, ctps);

                funcionario.setId(id);
                funcionarios.add(funcionario);

            }
        } catch(FileNotFoundException e){
            // File does not exist (it's okay)
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return funcionarios;
    }

    public boolean delete(int id){

        ArrayList<Funcionario> funcionarios = (ArrayList<Funcionario>) getAll();

        boolean removed = funcionarios.removeIf(funcionario -> funcionario.getId() == id);

        if(removed){

            try(BufferedWriter db = new BufferedWriter(new FileWriter(path, false))){

                for(Funcionario funcionario : funcionarios){
                    db.write(funcionario.getId() + "," + funcionario.getNome() + "," + funcionario.getCpf() + "," + funcionario.getCargo() + "," + funcionario.getCtps());
                    db.newLine();
                }
            }catch(Exception e){
                System.err.println(e.getMessage());

            }finally{
                return true;
            }
        }else{
            return false;
        }
    }

    private int getNextId() {

        int maxId = 0;
        ArrayList<Funcionario> funcionarios = (ArrayList<Funcionario>) getAll();

        for (Funcionario i : funcionarios ) {
            if (i.getId() > maxId) {
                maxId = i.getId();
            }
        }

        return maxId + 1;
    }

}