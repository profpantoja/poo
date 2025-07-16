package DAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import models.Mesa;
import models.Produto;

public class ProdutoDao {
    
    public String path = System.getProperty("user.dir") + "\\java-exercicios\\avaliacoes\\restaurante\\src\\main\\java\\db\\produto.txt";
    public ArrayList<Produto> produtos = new ArrayList<Produto>();
    

 public void add (Produto produto){
        
        int id = this.getNextId();
        
        ArrayList<Produto> produtos = (ArrayList<Produto>) getAll();

        
        try (BufferedWriter db = new BufferedWriter(new FileWriter(path, false))) {
            
            produto.setId(id);
            produtos.add(produto);

            for(Produto iProduto : produtos){
                db.write(iProduto.getId() + "," + iProduto.getNome() + "," + iProduto.getValProduto() + "," + iProduto.getIva() + ","  + iProduto.getPrecoComIva());
                db.newLine();
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

     public List<Produto> getAll(){
        
        ArrayList<Produto> produtos = new ArrayList<Produto>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            
            String line;
            
            while((line = reader.readLine()) != null){
                
                String[] parts = line.split(",");

                int id = Integer.parseInt(parts[0]);
                String nome = parts[1];
                double val = Double.parseDouble(parts[2]);
                float iva = Float.parseFloat(parts[3]);

                Produto produto = new Produto(nome, val, iva);

                produto.setId(id);
                produtos.add(produto);

            }
        } catch(FileNotFoundException e){
            // File does not exist (it's okay)
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return produtos;
    }

    public boolean delete(int id){

        ArrayList<Produto> produtos = (ArrayList<Produto>) getAll();

        boolean removed = produtos.removeIf(produto -> produto.getId() == id);

        if(removed){

            try(BufferedWriter db = new BufferedWriter(new FileWriter(path, false))){

                for(Produto produto : produtos){
                    db.write(produto.getId() + "," + produto.getNome() + "," + produto.getValProduto() + "," + produto.getIva() + ","  + produto.getPrecoComIva());
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
        ArrayList<Produto> produtos = (ArrayList<Produto>) getAll();

        for (Produto produto : produtos ) {
            if (produto.getId() > maxId) {
                maxId = produto.getId();
            }
        }

        return maxId + 1;
    }
}