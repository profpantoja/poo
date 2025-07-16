package views;

import java.util.ArrayList;
import java.util.Scanner;

import models.Item;
import models.Produto;

public class ItemScan {
 
    public Scanner scan = new Scanner(System.in);
    
    public int showMenu(){


        System.out.println("Escolha a opção: ");
        System.out.println("0: Sair ");
        System.out.println("1: Criar");
        System.out.println("2: Ler");
        System.out.println("3: Deletar ");
        
        int opcao = Integer.parseInt(scan.nextLine());

        return opcao;
    }

    public Item getItemDetails(){

        System.out.println("Nome: ");
        String nome = scan.nextLine();

        System.out.println("Quantidade: ");
        int quantidade = Integer.parseInt(scan.nextLine());

        System.out.println("Valor: ");
        double valor = Double.parseDouble(scan.nextLine());

        System.out.println("IVA: ");
        float iva = Float.parseFloat(scan.nextLine());

        Produto produto = new Produto(
            nome,
            valor,
            iva
        );

        double valorComIva = valor * iva;
        return new Item(produto, quantidade, valor, valorComIva * quantidade);
    }

    public void showItems(ArrayList<Item> items){

        if (items.isEmpty()) {
            System.out.println("Nenhum item encontrado.");
            return;
        }

        for (Item item : items) {
            System.out.println("ID: " + item.getId());
            System.out.println("Nome: " + item.getProduto().getNome());
            System.out.println("Quantidade: " + item.getQuantidade());
            System.out.println("Valor: " + item.getValVenda());
            System.out.println("IVA: " + item.getProduto().getIva());
            System.out.println("Total: " + item.getTotal());
            System.out.println();
        }
    }

    public int getId(){
        System.out.println("ID: ");
        int id = Integer.parseInt(scan.nextLine());

        return id;
    }

}
