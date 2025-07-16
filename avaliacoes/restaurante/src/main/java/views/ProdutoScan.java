package views;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.ProdutoController;
import models.Produto;

public class ProdutoScan {

    public Scanner scan = new Scanner(System.in);
    private ProdutoController controller = new ProdutoController();

    public void start(){

        int opcao;

        do{

            opcao = showMenu();

            switch(opcao){

                case 1:
                    
                    getProdutoDetails();
                    System.out.println("Produto criado com sucesso");
                break;

                case 2:
                    ArrayList<Produto> produtos = (ArrayList<Produto>) controller.readProdutos();
                    showProdutos(produtos);
                break;

                case 3:

                    int id = getId();
                    boolean removed = controller.deleteProduto(id);

                    if(removed){
                        System.out.println("Produto removido com sucesso");
                    }
                break;

                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao != 0);

        System.out.println("Saindo do fluxo de produtos...");
    }

    public static void main(String[] args) {
        ProdutoScan view = new ProdutoScan();
        view.start();
    }


    public int showMenu(){
        System.out.println("Escolha a opção: ");
        System.out.println("0: Sair ");
        System.out.println("1: Criar");
        System.out.println("2: Ler");
        System.out.println("3: Deletar ");

        int opcao = 10;

        try{
            opcao = Integer.parseInt(scan.nextLine());

        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }

        return opcao;
    }

    public void getProdutoDetails(){

        System.out.println("Nome: ");
        String nome = scan.nextLine();

        System.out.println("Valor do produto: ");
        double val = Double.parseDouble(scan.nextLine());

        System.out.println("IVA: ");
        float iva = Float.parseFloat(scan.nextLine());


        controller.createProduto(nome, val, iva);
    }

    public void showProdutos(ArrayList<Produto> produtos){

        if (produtos.isEmpty()) {
            System.out.println("Nenhum item encontrado.");
            return;
        }

        for (Produto produto : produtos) {
            System.out.println("ID: " + produto.getId());
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Valor: " + produto.getValProduto());
            System.out.println("IVA: " + produto.getIva());
            System.out.println("Valor com IVA: " + produto.getPrecoComIva());
            System.out.println();
        }
    }

    public int getId(){
        System.out.println("ID: ");
        int id = Integer.parseInt(scan.nextLine());
        return id;
    }

}