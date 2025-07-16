package DAO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import models.Item;
import models.Produto;


public class ItemDAO {
    
    public String path = System.getProperty("user.dir") + "\\avaliacoes\\restaurante\\src\\main\\java\\db\\item.txt";
    
    public void add(Item item){
        
        int id = this.getNextId();

        try{
            ArrayList<Item> items = getAll();

            try (BufferedWriter db = new BufferedWriter(new FileWriter(path, false))) {
                item.setId(id);
                items.add(item);
                
                for(Item itemX : items){
                    
                    db.write(itemX.getId() + "," + itemX.getProduto().getNome() + "," + itemX.getQuantidade() + "," + itemX.getValVenda() + "," + itemX.getProduto().getIva() + ","+ itemX.getTotal());
                    db.newLine();
                }
            }

        }catch(Exception e){

            System.err.println(e.getMessage());
        }
    }
    
    private int getNextId() {

        int maxId = 0;
        ArrayList<Item> items = getAll();

        for (Item i : items ) {
            if (i.getId() > maxId) {
                maxId = i.getId();
            }
        }

        return maxId + 1;
    }

    public ArrayList<Item> getAll(){
        
        ArrayList<Item> items = new ArrayList<Item>();

        try {
            
            try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                String line;
                
                while((line = reader.readLine()) != null){
                    
                    String[] parts = line.split(",");
                    
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    int quantity = Integer.parseInt(parts[2]);
                    double price = Double.parseDouble(parts[3]);
                    float iva = Float.parseFloat(parts[4]);
                    double total = Double.parseDouble(parts[5]);
                    
                    Produto product = new Produto(name, price, iva);
                    
                    Item item = new Item(product, quantity, price, total);
                    
                    item.setId(id);
                    
                    items.add(item);
                }
            }

        }catch(FileNotFoundException e){

            // File does not exist (it's okay)

        } catch (Exception e){
            System.err.println(e.getMessage());
        }
        
        return items;
    }
    
    public void delete(int id){
    
        
        ArrayList<Item> items = getAll();
        
        boolean removed = items.removeIf(i -> i.getId() == id);
        
        if(removed){
            
            try {

                try (BufferedWriter db = new BufferedWriter(new FileWriter(path, false))) {
                    for(Item itemX : items){
                        
                        db.write(itemX.getId() + "," + itemX.getProduto().getNome() + "," + itemX.getQuantidade() + "," + itemX.getValVenda() + "," + itemX.getProduto().getIva() + ","+ itemX.getTotal());
                        db.newLine();
                    }
                }

            }catch (Exception e){
                System.err.println(e.getMessage());
            }

        } 
    }

    public String getPath() {
        return path;
    }
    

}
