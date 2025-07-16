package DAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Mesa;
import models.Funcionario;
import models.Item;


public class MesaDao {
    
    public String path = System.getProperty("user.dir") + "\\java-exercicios\\avaliacoes\\restaurante\\src\\main\\java\\db\\mesa.txt";
    public ArrayList<Mesa> mesas = new ArrayList<Mesa>();
    

    public void add (Mesa mesa){
        
        int id = this.getNextId();
        
        ArrayList<Mesa> mesas = (ArrayList<Mesa>) getAll();

        
        try (BufferedWriter db = new BufferedWriter(new FileWriter(path, false))) {
            
            mesa.setId(id);
            mesas.add(mesa);

            for(Mesa iMesa : mesas){
                db.write(iMesa.getId() + "," + iMesa.getNum() + "," + iMesa.getLocal());
                db.newLine();
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

     public List<Mesa> getAll(){
        
        ArrayList<Mesa> mesas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            
            String line;
            
            while((line = reader.readLine()) != null){
                
                String[] parts = line.split(",");

                int id = Integer.parseInt(parts[0]);
                String num = parts[1];
                String local = parts[2];

                Mesa mesa = new Mesa(num, local);

                mesa.setId(id);
                mesas.add(mesa);

            }
        } catch(FileNotFoundException e){
            // File does not exist (it's okay)
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return mesas;
    }

    public boolean delete(int id){

        ArrayList<Mesa> mesas = (ArrayList<Mesa>) getAll();

        boolean removed = mesas.removeIf(mesa -> mesa.getId() == id);

        if(removed){

            try(BufferedWriter db = new BufferedWriter(new FileWriter(path, false))){

                for(Mesa mesa : mesas){
                    db.write(mesa.getId() + "," + mesa.getNum() + "," + mesa.getLocal());
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
        ArrayList<Mesa> mesas = (ArrayList<Mesa>) getAll();

        for (Mesa i : mesas ) {
            if (i.getId() > maxId) {
                maxId = i.getId();
            }
        }

        return maxId + 1;
    }
}