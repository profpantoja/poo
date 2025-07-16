package controllers;

import java.util.ArrayList;

import DAO.ItemDAO;
import models.Item;
import views.ItemScan;

public class ItemController {
    
    private ItemScan view;
    private ItemDAO itemDAO;

    public ItemController(
        ItemScan view,
        ItemDAO itemDAO
    ){
        setView(view);
        setItemDAO(itemDAO);
    }

    public void start() {

        ItemScan view = getView();
        ItemDAO itemDAO = getItemDAO();

        int opcao = 1;

        while(opcao != 0){
                        
            opcao = view.showMenu();
            
            switch(opcao){
                
                case 1:
                
                    Item item = view.getItemDetails();

                    itemDAO.add(item);           
                    
                    break;
                
                case 2:
                
                    ArrayList<Item> items = itemDAO.getAll();
                    view.showItems(items);
                    
                    break;
                        
                case 3:
                    
                    int id = view.getId();
                    
                    itemDAO.delete(id);
                    break;
            }
        }
    }      
    
    public static void main(String[] args) {
     
        ItemController itemController = new ItemController(new ItemScan(), new ItemDAO());
        itemController.start();
    }

    public ItemScan getView() {
        return this.view;
    }

    public void setView(ItemScan view) {
        this.view = view;
    }

    public ItemDAO getItemDAO() {
        return this.itemDAO;
    }

    public void setItemDAO(ItemDAO itemDAO) {
        this.itemDAO = itemDAO;
    }
}